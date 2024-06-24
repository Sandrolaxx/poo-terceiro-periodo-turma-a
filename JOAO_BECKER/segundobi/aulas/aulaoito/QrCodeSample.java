package segundobi.aulas.aulaoito;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class QrCodeSample {

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
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJFcThuN2JoSENJZ00zeUxtcCtCVUpRbElXWFlhMEFtL3g5WlFmZlE0cG9iSmVCVlYrOVRyb29XSE5LUUViNlF5WGxpb3NNWDRDUFlRellSQjI3SEpqRlhMajkwZ1JTUjNqYjh0MmU2UiszUmpSNDJKQ3dWM1kzTDQ1R3JoeUhqT0ZzZENmZmRpODJTa1JuU3JrQi9Xd1N6b0hPaXljL0lhc0lJL0tNNlREYzBZNjh3K0lzODJySE0zL2dUSGpBYXRvTjNqTmFubHZhRE5yRTFXdVd5ZkRuV2R0Q3B5dGpIa285ZVd1VFoxZkFEZXJNZm5WYkNTb0ttTDY5TnBzR2crVk9wODBWM2lGN0twZytuTzZ3bVUxNGZXQ0JJMEhoRmwvcFJPNXV3TFZ0MWNFMlNNekRaMzh4VHdKNXVmdHlYT0pRaC91RytkRlFJTmVRa2pDSEZmQzRIb0JoRVAyN3pvM3NxWVB4dmtDclp2SWNGeWNONFVHdkZLSDJpcFdXR0VVQm92eGNMQkR5Q0JSY3pWc1dncEY1VWNBU2NhUU5VMmpYbUd5Ky92MzE5Zi9NRVBYSnFhOTlwY1psNFZhNksxbFVNMUhyTUYyTEF2WWNGYUprYnlDUk9HRnpNRGhtWXpVcjJFOHNFNmVoK3QrYjFOUkxwWEtMbS9jZHp1MEIvdmdvUFhIMG4wc0xVQmZhYUt3NDdBSEw1eHMzSWpMV0xEYlVjcEJrZ25CNWVEVmRyN1hnbUpnbEkyZGNsWHo2UXE5dWFXTXkzVTNMYU9GcmZ2MnlybmRRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiYjY2NGY2YWNiZjRhNDZkOGI3N2EiLCJleHAiOjE3MTkyMDA2MDIsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.DIyVXXojy6uE0ByxRYEJR6apjdjbg-OUC8YOfj0rVJw");
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
