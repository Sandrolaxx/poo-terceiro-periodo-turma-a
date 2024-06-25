package aulas.aula8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class QRCodeSample {
    public static void main(String[] args) {
        System.out.println(genQRCode(null, 20d));
    }

    public static String genQRCode(String token, Double amount) {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static");
            
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Dados do Json
            String json = "{\n" + //
                                "  \"merchant\": {\n" + //
                                "    \"merchantCategoryCode\": \"5651\",\n" + //
                                "    \"postalCode\": \"85803450\",\n" + //
                                "    \"city\": \"Cascavel\",\n" + //
                                "    \"name\": \"Pedro\"\n" + //
                                "  },\n" + //
                                "  \"key\": \"testepix@celcoin.com.br\",\n" + //
                                "  \"amount\": 20\n" + //
                                "}";
        
            // Dados da Headers da nossa requisição e configuração
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJiU0NlZ0h2cXkwZ29TSW43STRYdWZhRFV6UjRSQlpFMWh0a01jMXJjRVVNaTFmMVJjb3Vjd2U3S3JiK3NndXBmc0xqeUtGbHl1L1ZZMGJiZnJZakpqVEM1R2xHMFc2NDJHQ0ljL3JiWjR0YXpScTRIaVpyY2xtU1VrOTVtZzVzZk9RTTFRZFdiZDhZVVk5VFROSUtoYUswSDN0UzBTT25kK0JGZGZKRHlhY0RDMmVjNkpDdDh4RW9PUTF0Znk2c2YvczdMRitLd0hNdW5rMGUxUERHN0FIa1ZDcXRac21hVlJBa2Y3RDJIdUtYZi9HMUhOejlJRm9BcWxpdkNYZkZXcjZsTEZKV0FrQmlHQVNlR1UrZjRJQ0U4QnI2M3JlOUVybWFWaWVaeUFUQjRCRWhUbFBWcllUV20ra1c3OG9oZGdnVGx4M1F0TnJpVFp4V01zWGNVNC9SbE1qdDBlWktKTS9md0JXbjdjeU0rVjh0WFpyaGdhNDlJNUlMa3hqRk1Edm9JU2JpUjkxWTgwWmQ0MTRidVJCMzFmMkNReTNpQ3FwcEsvRExvZk4rQW9RdEFTczYyK1lJaVpDcFlSK1BLd0tVOXNVYTVoZzFraFpRMFpxRGpoZ1ZyNVVaZGZRbVg2bXlJYjVqaU5lRDgxditoR1VIcG1RZmk2MXpTQmxOWHk1SitaQ0dlNGFENUdGd3FISUExUURJL3NnMDBvMjlqNzFJNDBuMG9FNGpLbzhEZzRwR3BEeDkzQ1l3VCtkeXVWN2ZBa2I1L1hGNDRNYzZRcmVwM1dBPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiN2UzZGYzZTIyZDkyNGM3Mzk1MjUiLCJleHAiOjE3MTkyNTI3ODQsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.Gg55Qzt3uE8xg428WFGF9fR3-631R6fcrE92h218CEQ");
            connection.setDoOutput(true); // Significa que vai enviar um JSON no Body

            // Escrevendo o JSON na requisição
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Lendo o retorno JSON da requisição e atribuindo em uma String
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
