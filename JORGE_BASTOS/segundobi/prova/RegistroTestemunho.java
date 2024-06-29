package JORGE_BASTOS.segundobi.prova;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class RegistroTestemunho {

    public void registrar(String imageUrl, String description, String ra) {
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            String json = "{\r\n" +
                    "  \"imageUrl\": \"" + imageUrl + "\",\r\n" +
                    "  \"description\": \"" + description + "\",\r\n" +
                    "  \"ra\": \"" + ra + "\"\r\n" +
                    "}";

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
            JOptionPane.showMessageDialog(null, "Testemunho criado: " + response.toString());
        } catch (Exception e) {
            showErrorModal(e.getMessage());
        }
    }

    private void showErrorModal(String errorMessage) {
        JOptionPane.showMessageDialog(null, "Erro na comunicação com a API: " + errorMessage, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
