package GABRIEL_FAVERO_HELLER.segundobi.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;

public class Post {
    
    // public static void main(String[] args) {
    //     registroTestemunho();
    // }

    public void registroTestemunho() {

        String imageURL = JOptionPane.showInputDialog(null, "Insira o URL da imagem!");

        if (imageURL != null) {
            JOptionPane.showMessageDialog(null, "URL inserida com sucesso!", "Resposta",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Erro, URL não inserida!", "Resposta",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        String description = JOptionPane.showInputDialog(null, "Insira a descrição!");

        if (description != null) {
            JOptionPane.showMessageDialog(null, "Descrição inserida com sucesso!", "Resposta",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Erro, descrição não inserida!", "Resposta",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        String ra = JOptionPane.showInputDialog(null, "Insira o seu RA!");

        if (ra != null) {
            JOptionPane.showMessageDialog(null, "RA inserido com sucesso!", "Resposta",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Erro, RA não inserido!", "Resposta",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        try {
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\r\n" +
            "  \"imageUrl\": \"" + imageURL + "\",\r\n" +
            "  \"description\": " + "\"" + description + "\",\r\n" +
            "  \"ra\": \"" + ra + "\"\r" +
            "\n" +
            "}";;

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
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

            JOptionPane.showMessageDialog(null, "Sucesso!", "Resposta", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Resposta", JOptionPane.ERROR_MESSAGE);
        }
    }
}
