package MATEUS_MASSUCATTO_DUARTE.segundobimestre.prova;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        while (true) {
            String[] options = {"Listagem dos alunos", "Criar registro de testemunho"};
            int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if (choice == 0) {
                listarAlunos();
            } else if (choice == 1) {
                criarRegistroTestemunho();
            } else {
                break;
            }
        }
    }

    private static void listarAlunos() {
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/students");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                JOptionPane.showMessageDialog(null, response.toString(), "Alunos", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao listar alunos", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void criarRegistroTestemunho() {
        String fotoURL = JOptionPane.showInputDialog("Insira a URL de sua foto:");
        String alunoRA = JOptionPane.showInputDialog("Insira o seu RA de aluno");
        String testemunho = JOptionPane.showInputDialog("Insira seu testemunho");
        if (fotoURL != null && !fotoURL.trim().isEmpty()) {
            try {
                URL url = new URL("https://poo-exam.vercel.app/api/testimonial" + fotoURL + alunoRA + testemunho);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json");
                conn.setDoOutput(true);

                //var jsonInputString = "{\"Dados\":\"" + fotoURL + alunoRA + testemunho + "\"}"; 
                String jsonInputString = "{\r\n" + //
                                                "  \"URL\": \"" + fotoURL + "\",\r\n" + //
                                                "  \"RA\": \"" + alunoRA + "\",\r\n" + //
                                                "  \"Testemunho\": \"" + testemunho + "\",\r\n" + //
                                                "}";
                
                try (OutputStream os = conn.getOutputStream()) {
                    byte[] input = jsonInputString.getBytes("utf-8");
                    os.write(input, 0, input.length);
                }

                int responseCode = conn.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    String inputLine;
                    StringBuilder response = new StringBuilder();

                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();

                    JOptionPane.showMessageDialog(null, response.toString(), "Resultado da criação de testemunho", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao criar testemunho", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro :(", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}