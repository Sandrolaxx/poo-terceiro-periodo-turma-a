package CLEITON_MARTINS.segundobi.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Post 
{
    public static void main(String[] args) {
        System.out.println(genQRCode(null, 20d));
    }

    public static String genQRCode(String token, Double amount) {
        try {
            
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\r\n" + //
                                "  \"imageUrl\": \"https://avatars.githubusercontent.com/u/161392160?v=4\",\r\n" + //
                                "  \"description\": \"imagine um testemunho aqui.\",\r\n" + //
                                "  \"ra\": \"10051\"\r\n" + //
                                "}";

            System.out.println("Enviado com sucesso!");
            
            connection.setRequestMethod("POST");
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

            return response.toString();

        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }
}
