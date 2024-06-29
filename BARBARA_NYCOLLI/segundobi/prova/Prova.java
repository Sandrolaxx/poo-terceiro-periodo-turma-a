package BARBARA_NYCOLLI.segundobi.prova;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;


public class Prova {

    private static final String BASE_URL =  "https://poo-exam.vercel.app/api";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Prova app = new Prova();
            app.createAndShowGUI();
        });
    }

        
    private void createAndShowGUI() {
        JFrame frame = new JFrame("Swift Testemunhos - Apenas para fãs da loirinha!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JLabel welcomeLabel = new JLabel("Bem-vindo ao Swift Testemunhos", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Serif", Font.BOLD, 20));
        frame.add(welcomeLabel, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10));

        JButton listButton = new JButton("Listagem dos Swifties");
        listButton.addActionListener(e -> listAlunos(frame));

        JButton createButton = new JButton("Criar Testemunho - Speak Now");
        createButton.addActionListener(e -> createTestemunho(frame));

        JButton exitButton = new JButton("Sair - End Game");
        exitButton.addActionListener(e -> System.exit(0));

        panel.add(listButton);
        panel.add(createButton);
        panel.add(exitButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }


    private void listAlunos(JFrame parentFrame) {
        try {
            List<Aluno> alunos = fetchAlunosExternamente();
            if (alunos.isEmpty()) {
                showMessage(parentFrame, "Não foi encontrado nenhum Swiftie", "Lista de todos os Swifties");
            } else {
                StringBuilder message = new StringBuilder("Lista dos Swifties:\n");
                for (Aluno aluno : alunos) {
                    message.append(aluno).append("\n");
                }
                showMessage(parentFrame, message.toString(), "Listagem dos Swifties");
            }
        } catch (Exception e) {
            showError(parentFrame, "Erro ao buscar dados dos Swifties: " + e.getMessage());
        }
    }

    
    private List<Aluno> fetchAlunosExternamente() throws Exception {
        List<Aluno> alunos = new ArrayList<>();
        URL url = new URL(BASE_URL + "/students");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        int responseCode = conn.getResponseCode();
        if (responseCode == 200) {
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            JSONArray jsonArray = new JSONArray(response.toString());
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String ra = jsonObject.getString("ra");
                String nome = jsonObject.getString("name");
                alunos.add(new Aluno(ra, nome));
            }
        } else {
            throw new Exception("Ocorreu uma falha de comunicação com o servidor: " + responseCode);
        }

        return alunos;
    }

    // TESTEMUNHOOOO, não está funcionando o link!!
    private void createTestemunho(JFrame parentFrame) {
        JPanel panel = new JPanel(new GridLayout(4, 2));

        JTextField fotoUrlField = new JTextField();
        JTextField raField = new JTextField();
        JTextField textoField = new JTextField();

        panel.add(new JLabel("URL da Foto:"));
        panel.add(fotoUrlField);
        panel.add(new JLabel("RA do Swiftie:"));
        panel.add(raField);
        panel.add(new JLabel("Texto de Testemunho:"));
        panel.add(textoField);

        int result = JOptionPane.showConfirmDialog(parentFrame, panel, "Criar Testemunho - Speak Now", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            try {
                String fotoUrl = fotoUrlField.getText();
                String ra = raField.getText();
                String texto = textoField.getText();

                Testemunho testemunho = new Testemunho(fotoUrl, ra, texto);
                saveTestemunho(testemunho);

                showMessage(parentFrame, "Testemunho do Speak Now criado!!!", "Criar Testemunho - Speak Now");
            } catch (Exception e) {
                showError(parentFrame, "Não deu certo, tente novamente: " + e.getMessage());
            }
        }
    }

    // Método para salvar testemunho
    private void saveTestemunho(Testemunho testemunho) throws Exception {
        URL url = new URL(BASE_URL + "/testimonial");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json; utf-8");
        conn.setDoOutput(true);

        JSONObject jsonInput = new JSONObject();
        jsonInput.put("photo", testemunho.getFotoUrl());
        jsonInput.put("ra", testemunho.getRa());
        jsonInput.put("text", testemunho.getTexto());

        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonInput.toString().getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        int responseCode = conn.getResponseCode();
        if (responseCode != 201) {
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            throw new Exception("Falha na comunicação com o servidor: " + response.toString());
        }
    }

    
    private void showMessage(JFrame parentFrame, String message, String title) {
        JOptionPane.showMessageDialog(parentFrame, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    
    private void showError(JFrame parentFrame, String message) {
        JOptionPane.showMessageDialog(parentFrame, message, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}


class Aluno {
    private String ra;
    private String nome;

    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "RA: " + ra + ", Nome: " + nome;
    }
}


class Testemunho {
    private String fotoUrl;
    private String ra;
    private String texto;

    public Testemunho(String fotoUrl, String ra, String texto) {
        this.fotoUrl = fotoUrl;
        this.ra = ra;
        this.texto = texto;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public String getRa() {
        return ra;
    }

    public String getTexto() {
        return texto;
    }
    //resultado do código
    @Override
    public String toString() {
        return "Foto URL: " + fotoUrl + ", RA: " + ra + ", Testemunho: " + texto;
    }
}
