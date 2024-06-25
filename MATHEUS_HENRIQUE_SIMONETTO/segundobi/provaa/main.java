package segundobi.provaa;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class main {
    private static final String BASE_URL = "https://poo-exam.vercel.app/api";

    public static void main(String[] args) {
        while (true) {
            String[] options = {"Listar Alunos", "Criar Testemunho", "Sair"};
            int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    listStudents();
                    break;
                case 1:
                    createTestimonial();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    // é
            }
        }
    }

    private static void listStudents() {
        try {
            URL url = new URL(BASE_URL + "/students");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            int responseCode = conn.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = reader.readLine()) != null) {
                    response.append(inputLine);
                }
                reader.close();

                JOptionPane.showMessageDialog(null, response.toString(), "Lista de Alunos", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao buscar alunos! Código de resposta: " + responseCode, "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de comunicação: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void createTestimonial() {
        String imageUrl = JOptionPane.showInputDialog("Insira a URL da imagem:");
        String ra = JOptionPane.showInputDialog("Insira o RA do aluno:");
        String description = JOptionPane.showInputDialog("Insira o texto do testemunho:");

        try {
            URL url = new URL(BASE_URL + "/testimonial");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/json; utf-8");
            conn.setRequestProperty("Accept", "application/json");
            String jsonInputString = String.format("{\"imageUrl\": \"%s\", \"ra\": \"%s\", \"description\": \"%s\"}", 
                                                   imageUrl, ra, description);

            System.out.println("JSON Enviado: " + jsonInputString);

            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            int responseCode = conn.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_CREATED) {
                JOptionPane.showMessageDialog(null, "Testemunho criado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
                StringBuilder response = new StringBuilder();
                String inputLine;
                while ((inputLine = reader.readLine()) != null) {
                    response.append(inputLine);
                }
                reader.close();
                JOptionPane.showMessageDialog(null, "Falha ao criar testemunho! Código de resposta: " + responseCode + ", Resposta: " + response.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
                System.out.println("Resposta do Erro: " + response.toString());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de comunicação: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}
