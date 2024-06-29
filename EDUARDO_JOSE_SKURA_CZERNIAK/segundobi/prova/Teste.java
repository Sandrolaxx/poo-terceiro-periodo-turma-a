package segundobi.provas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) throws IOException {

        while (true) {
            String[] options = { //Menu
                "Listagem de Alunos",
                "Criar Registro de Testemunho",
                "Sair"
            };

            int escolha = JOptionPane.showOptionDialog(
                null,
                "Testemunho dos alunos, dê o seu feedback",
                "Menu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
            );

            if (escolha == 0) {
                listagemDeAlunos();
            } else if (escolha == 1) {
                registroDeTestemunho();
            } else {
                break; // Fecha o menu
            }
        }
    }

    private static void listagemDeAlunos() throws IOException {
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            String jsonResponse = response.toString();
            displayStudentData(jsonResponse);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private static void displayStudentData(String jsonResponse) {
        try {


            // Mapa que irá armazenar a chave:valor do json
            Map<String, Object> jsonData = new HashMap<>();


            // Exibindo os dados da moeda
            StringBuilder sb = new StringBuilder();
            sb.append("Dados do Aluno");
            sb.append("\nNome: ").append(jsonData.get("name"));
            sb.append("\nRA: ").append(jsonData.get("ra"));

            JFrame frame = new JFrame("Informações do Aluno");
            JOptionPane.showMessageDialog(frame, sb.toString(), "Dados do Aluno", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private static void registroDeTestemunho() {
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\r\n" + //
                    "\"imageUrl\": \"https://avatars.githubusercontent.com/u/141479551?v=4\",\r\n" + //
                    "\"description\": \"socorro\",\r\n" + //
                    "\"ra\": \"77721\",\r\n" + //
                    "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            JOptionPane.showMessageDialog(null, "Registro de testemunho criado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
