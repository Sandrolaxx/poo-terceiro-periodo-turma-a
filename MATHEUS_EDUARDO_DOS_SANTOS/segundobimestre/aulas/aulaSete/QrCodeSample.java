package segundobimestre.aulas.aulaSete;
//POST!!!!!
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class QrCodeSample {

    public static void main(String[] args) {
        System.out.println(genQRCode(null, 20d));
    }

    public static String genQRCode(String token, Double amount) {
        try {
            // DEFINE A URL DA REQUISIÇÃO
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static");

            // CLASSE AUXILIAR PARA REALIZAR REQUEST HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Dados do json -- Caso seu VS code não idente utilizar https://www.javaescaper.com
            String json = "{\r\n" + //
                                "  \"key\": \"testepix@celcoin.com.br\",\r\n" + //
                                "  \"amount\": 10.55,\r\n" + //
                                "  \"merchant\": {\r\n" + //
                                "    \"postalCode\": \"01201005\",\r\n" + //
                                "    \"city\": \"Barueri\",\r\n" + //
                                "    \"merchantCategoryCode\": 0,\r\n" + //
                                "    \"name\": \"Celcoin\"\r\n" + //
                                "  }\r\n" + //
                                "\r\n" + //
                                "}";

            // REALIZA A CONFIGURAÇÃO DA REQUEST
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer  eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJtZTUwcjF6K2xtMXM3ME5BZFB6TU1DZDFlNzlTY1dGWmhJeS9XclhxNUdrb0QyVXpncU1ZWnU1R0RMU2tRMjN2Y2tGczc5K0hpRUx4QlJTOHhXVkU2RGJrMVJZcW5WMGdMaGFXYzVKZkZKaFI3UTRkc2RxNVBnaEIxNzA5NjZ2SXFmckdzNE1BV3pScEU3RHJ5K0JaK3JGcnVJc2dXaUl0R0c2RWh2QnlicVVWcldHYzRQR1VXY0dDbEtucldnY0crN3ZxUHZBNnhXUlVkdkI1TkhMNDJPVmRzQzRPTlpVR0VFbnNkWG92UHpXZU1yRlZhS0dpbnY2aFNIeXdjQW9OMVNqSEErblpWZENjM09FVWRFMExTRWk5NUxiMmVHL1NxbHFreFBvYUFhMGhaUDBIcVhSYk1aTVkvMURBRUhMdVBaRXdyV2hYL0JMdmVMMnA5bjNGY1NSSFZUaVBjQkhnb0VSSldqODQ0NzgvSFJSRjBLV3MzQk1EVzBtOHA4dzh3MU8zU3hCV0lrM2FrdmZzclU0Q3hMMEdVTkhaWUZaR1RSajJudE44bjRINEZNOGtnR2JhTC9ycWVBc1dMNVI1TmVnUXBUdzlBUUNHQUhHZVgyYmk2MGU0UitOZDVXb0JDNllhNzFsM0I2RkR6NEF0YitoWXRxRnpkVWJSMmZJM3pXVnc5akNFd2s4UEQxZGlwRU9uQkw0ZjZBTUQ3bnhlb3E1Vzd3SVlvMVpIVHV4TlJkUTd6Z05SbFBuN3ZNQURsK3dtbUZkd0xMZVMvN0JubjdlSHpnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNzY2OTdhYjlkNTg5NGE1ZjgzNTMiLCJleHAiOjE3MTkyNTAxNjYsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.hhHTeT9GK-97VOGNKy7eS1hl8D5nOABZd8dAueEGjRk");
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

            //String com json
            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }

}