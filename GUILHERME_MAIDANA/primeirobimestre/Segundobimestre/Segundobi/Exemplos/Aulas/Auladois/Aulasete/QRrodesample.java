package primeirobimestre.Segundobimestre.Segundobi.Exemplos.Aulas.Auladois.Aulasete;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class QRrodesample {

    public static void main(String[] args) {
        genQRCode(null, 20d);
    }

    public static void genQRCode(String token, Double amount) {
        try {
            // DEFINE A URL DA REQUISIÇÃO
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static");

            // CLASSE AUXILIAR PARA REALIZAR REQUEST HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Dados do json -- Caso seu VS code não idente utilizar https://www.javaescaper.com
            String json = "{\r\n  \"key\": \"testepix@celcoin.com.br\",\r\n  \"amount\": 2.00,\r\n  \"transactionIdentification\": \"testqrcodestaticcelcoin\",\r\n  \"merchant\": {\r\n    \"postalCode\": \"01201005\",\r\n    \"city\": \"Barueri\",\r\n    \"merchantCategoryCode\": 0,\r\n    \"name\": \"Celcoin\"\r\n  }\r\n}";

            // REALIZA A CONFIGURAÇÃO DA REQUEST
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer  eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiI0akhBWjlSVnJwamhydldQQ1ZhSGwvQmJLMXBleUFXYzJrdUNnOFJRSnQ5Z1gxK2Z2ZXVkaG9JWnlnMWo1TzViR1JYeW1pcHB5ekU5d0ZhRlpqUEJIT21oZDB4dDN0czZkY0RlNjhCM1hlNVZpTHBFNkpIWEpkSG5VV0pKTVBxaHNkYWxBRFRyblNJNHhJK1ArUzNaYlo0WjBoa1BtS3RYVVJ4WTFWMzE3Vk8rT25yT0dnYXgyMSt2R1cwRFA1MTBGWjNyU0dDRVh2RWc0RmoxSmNuWm0xaFpKRCtZbFhHdG5tUmNCUWZJRVc1K3N0S0tvdi9BWXNVRUFMOUhVS3I2T1lMdkQrYS8yQU83eVR4bkZYV3hNRXVIZy80MThBSEwzVkdIQ2VzS0tNSWFtQm5JeXpybmswK0NkOXpMVmY1NTFmZVJKUnc3SThIZnRVNVljZTI3d1cvNGU4ZkdNaTAvYzczeVppV0pZczd3R1RLS0MvVWpENWhHMVdrY01RbmVYUFZGVVRqQ3hnUi9QM3o2VDlKd2w4YmVZc3JzZHRxS1lUSG1zRngwS2JiQnZkY0ZDTjBnRkZqMGx0ZHdlRTJFTlBFQStVUGNIZUYrMU9ZRmpXc3dlTFI5Q2htWTM3ZThsUTlKVExpYTVhZENpRjlHMkJzVVptTUMzRjBQWkZ4ZlFNK0xqRU8vRjcvY0h0UU84NktkWCt5TjFSZDc3Z1FCT2NIdXBlcmViNnpTQ1R0YW1ZRVVTcUh1eS81OGU3aDFNYkRhOWd2U2JUdFJvdmplSTRHRGhBPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiYTk5ZjcxNzgxMDZkNGQxMzhhYzMiLCJleHAiOjE3MTg5MTYxODQsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.XtZF8rvBMEwHedSDiym4Cwafhi8tAhUqK0Cu7rrKNSY");
            connection.setDoOutput(true);

            // ADICIONA O JSON A REQUEST
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);

                os.write(input, 0, input.length);
            }

            // REALIZA A LEITURA DOS DADOS
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