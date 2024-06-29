package LEONARDO_LIOGI_SHIRATSU.SegundoBi.prova;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class prova {

    private static final String LISTA_ALUNOS_URL = "https://poo-exam.vercel.app/api/students";
    private static final String CREATE_TESTIMONIAL_URL = "https://poo-exam.vercel.app/api/testimonial";

    public static void main(String[] args) {
        while (true) {
            String[] options = {"Listar alunos", "Criar Testemunho", "Sair"};
            int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    listarAlunos();
                    break;
                case 1:
                    criarTestemunho();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saindo da aplicação.", "Sair", JOptionPane.INFORMATION_MESSAGE);
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }

    private static void listarAlunos() {
        try {
            URL url = new URL(LISTA_ALUNOS_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-Type", "application/json");

            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                JOptionPane.showMessageDialog(null, response.toString(), "Lista de Alunos", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao listar alunos. Código de resposta: " + responseCode, "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar alunos: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private static void criarTestemunho() {
        String urlFoto = JOptionPane.showInputDialog(null, "Digite a URL da foto:");
        if (urlFoto == null || urlFoto.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "URL da foto não pode ser vazia.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String raAluno = JOptionPane.showInputDialog(null, "Digite o RA do aluno:");
        if (raAluno == null || raAluno.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "RA do aluno não pode ser vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String textoTestemunho = JOptionPane.showInputDialog(null, "Digite o texto do testemunho:");
        if (textoTestemunho == null || textoTestemunho.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Texto do testemunho não pode ser vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String jsonInputString = String.format(
                    "{{\r\n" + //
                                                "  \"imageUrl\": \"urlFoto\",\r\n" + //
                                                "  \"description\": \"textoTestemunho\",\r\n" + //
                                                "  \"ra\": \"10650\"\r\n" + //
                                                "}}"

            );

            URL url = new URL(CREATE_TESTIMONIAL_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json; utf-8");
            conn.setRequestProperty("Accept", "application/json");
            conn.setDoOutput(true);

            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_CREATED) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                JOptionPane.showMessageDialog(null, "Testemunho criado com sucesso: " + response.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao criar testemunho. Código de resposta: " + responseCode, "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar testemunho: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}
