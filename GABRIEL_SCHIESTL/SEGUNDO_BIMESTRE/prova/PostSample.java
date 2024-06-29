package GABRIEL_SCHIESTL.SEGUNDO_BIMESTRE.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class PostSample {

    public void createTestimonial() {

        String photoURL = (String) JOptionPane.showInputDialog(null,
                "Qual a URL da sua foto?");

        String register = (String) JOptionPane.showInputDialog(null,
                "Qual o seu RA?");

        String testimonial = (String) JOptionPane.showInputDialog(null,
                "Qual o seu testemunho?");

        try {
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\r\n" + //
                    "  \"imageUrl\": \"" + photoURL + "\",\r\n"
                    + //
                    "  \"description\": \"" + testimonial + "\",\r\n"
                    + //
                    "  \"ra\": \"" + register + "\"\r\n" + //
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

            JOptionPane.showMessageDialog(null, "Sucesso ao cadastrar testemunho",
                    "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            throw new CustomException(e);
        }
    }
}
