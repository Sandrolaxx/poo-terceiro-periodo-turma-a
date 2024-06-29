
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import javax.swing.JOptionPane;

public class Post {

    public static void PostATV(String token) {
        try {
            @SuppressWarnings("deprecation")
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String digitable = JOptionPane.showInputDialog("Digite codigo de barras:");
            // Dados do json
            String json = "{\n" + 
            "  \"barCode\": {\n" + 
            "    \"type\": 0,\n" + 
            "    \"digitable\": \""+ digitable +"\"\n" + 
            "  }\n" + 
            "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer " + token);
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

             Map<String, Object> result = Tratar_Json.srtToMap(response.toString());


            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, Object> entry : result.entrySet()) {
                sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
            }
    
            JOptionPane.showMessageDialog(null, sb.toString(), "JSON Result", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();


        }
    }
}

