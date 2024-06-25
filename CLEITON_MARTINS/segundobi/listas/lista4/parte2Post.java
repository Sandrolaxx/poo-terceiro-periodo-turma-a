import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class parte2Post {
    public static void main(String[] args) {
        System.out.println(genQRCode(null, 20d));
    }

    public static String genQRCode(String token, Double amount) {
        try {

            URL url = new URL("https://sandbox.openfiance.celcoin.dev/pix/v1/brcode/static");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            String linhaDigitavel = "23793381286008301352856000063307789840000150000";

            String json = "\"{\\n" + //
                                "\" + //\r\n" + //
                                "\" \\*key\\*: \\*testepix@celcoin.com.br\\*,\\n" + //
                                "\" + //\r\n" + //
                                "\" \\*amount\\*:2.55,\\n" + //
                                "\" + //\r\n" + //
                                "\" \\*merchant\\*:" + linhaDigitavel + "{\\n" + //
                                "\" + //\r\n" + //
                                "\"   \\*postalCode\\*: \\*01201005\\*, \\n" + //
                                "\" + //\r\n" + //
                                "\"   \\*city\\*: \\Barueri\\*,\\n" + //
                                "\" + //\r\n" + //
                                "\"   \\*merchantCategoryCode\\*: 0,\\n" + //
                                "\" + //\r\n" + //
                                "\"   \\*name\\*: \\*Celcoin\\*\\n" + //
                                "\" + //\r\n" + //
                                "\" }\\n" + //
                                "\" + //\r\n" + //
                                "\"}\";";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer ");
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
