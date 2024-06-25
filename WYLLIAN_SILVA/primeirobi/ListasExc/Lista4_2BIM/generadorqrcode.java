package primeirobi.ListasExc.Lista4_2BIM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class generadorqrcode {

    public static void genQRCode (String token, Double amount) {
        genQRCode(null, null);
        
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Dados do json NA PROVA JSON VAI AQUI
            String json = "\"key\": \"testepix@celcoin.com.br\",\n" + //
                                "  \"amount\": 10.55,\n" + //
                                "  \"transactionIdentification\": \"testqrcodestaticcelcoin\",\n" + //
                                "  \"merchant\": {\n" + //
                                "    \"postalCode\": \"01201005\",\n" + //
                                "    \"city\": \"Barueri\",\n" + //
                                "    \"merchantCategoryCode\": 0,\n" + //
                                "    \"name\": \"Celcoin\"\n" + //
                                "  },\n" + //
                                "  \"tags\": [\n" + //
                                "    \"string\"\n" + //
                                "  ],\n" + //
                                "  \"additionalInformation\": \"Referente ao custo de...\",\n" + //
                                "  \"withdrawal\": false";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", token);
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

            System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

