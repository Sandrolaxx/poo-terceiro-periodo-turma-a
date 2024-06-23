package EexemplosAula;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Requisicoes {
    
    public static void main(String[] args) {
        genQRCode(null, null);
    }

    public static void genQRCode(String token, Double amount) {
        try {
            //define a url da requisição
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Dados do json
            String json = "{\r\n" + //
                                "  \"key\": \"testepix@celcoin.com.br\",\r\n" + //
                                "  \"amount\": 10.55,\r\n" + //
                                "  \"transactionIdentification\": \"testqrcodestaticcelcoin\",\r\n" + //
                                "  \"merchant\": {\r\n" + //
                                "    \"postalCode\": \"01201005\",\r\n" + //
                                "    \"city\": \"Barueri\",\r\n" + //
                                "    \"merchantCategoryCode\": 0,\r\n" + //
                                "    \"name\": \"Celcoin\"\r\n" + //
                                "  },\r\n" + //
                                "  \"tags\": [\r\n" + //
                                "    \"string\"\r\n" + //
                                "  ],\r\n" + //
                                "  \"additionalInformation\": \"Referente ao custo de...\",\r\n" + //
                                "  \"withdrawal\": false\r\n" + //
                                "}";

            //realiza a config da requisicao
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJDNFl0dzV1OEt5Uy8ySGtPQ0Y0bHdyQ21LZHBmL3lRSDZqbFJxSTFYMjNRNXJ4cGJJUmpJZmZ3Z3AyWjdHOStYVW5BUzZsNW4zR3RBL1FFK2NIeE4rVEtqVnVSU0c4QlhLcU5QNWdMcG5ueUpmWHNYbzMxQ3JHU05kTzc2OGhaQUwybkMxaEsrL1BpZDBTdHU3ZTJpTlVKdm5RMWs4U1ZtbjZMZXYvVXdvT1VsYmxKYnhwNFYvQmRPWHNKOVl1NGFBRzJzT2gvMDlpNnF1bzVzNEJ1a3gwMC9UajhYNVp0L213OWp3N0VmUG1WTFFkclBZL283RnhtbXJzSGJGYTVPRnVZWGEzV09RblFIRmxwb1RhdDVIZmxyeHdQSXQzbElROFNKQlZJMldXa2Q2emhBekY2LzY3eWJDZGowbWFLVWd2aGhTRC9UaE8zRzduYzBya2FCaEZzSVRvWHNldXNoKzYvcjlGVStiR3RNdDYzYkNqeGpUYndKZ0t6eWoyUE1OWTNraGhPcTc3dVQxc2V4T050K25FV3RSdy9lYkpnVHlDcmVuYkVmbkFWVEdEd25xK3ZBZFhELzhTTmlGRzRzcmVYVDJOMkVMempOREpDMFR2M3dsT01EeGFCSGxCOXo2bTNNUTZQL0Zmd3F5bjJZSFZiL1RnVFBWY0M2dTVuRnM3elhYdnNSRytUaU96ekZlUzdDSkRwcmdZUjFINEIrRWU1TS83czJJYXV5U3N3Mzh2Y1RzR1lUZkwza2NWTUErMXZ3R3hMVi90d1BpUS8vRm9pUVJnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNTA5OWUxOTViOWQyNDU0MjlhYzkiLCJleHAiOjE3MTg2NzU5MDAsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.pWOuIg5J-1UCBsjnIZ61HAejsiVqXxxK_v6BNPoJdHg"); // se api for aberta  nao precisa disso
            connection.setDoOutput(true);

            //adiciona JSON a Request (nao muda)
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }
            //realiza a leitura dos dados
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
