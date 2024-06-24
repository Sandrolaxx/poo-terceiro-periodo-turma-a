package training;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class examplePost {

    public static void main(String[] args) {
        genQRCode(null, 200d);
    }

    public static void genQRCode(String token, Double amount) {
        try {

            // DEFINE A URL DA REQUISIÇÃO
            URL url = new URI("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize").toURL();

            // CLASSE AUXILIAR PARA REALIZAR REQUEST HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String digitable = JOptionPane.showInputDialog(
                null,
                "Informe a linha digitável do boleto:",
                "Linha digitável",
                JOptionPane.QUESTION_MESSAGE);
            
            // Dados do json -- Caso seu VS code não idente utilizar
            // https://www.javaescaper.com
            String json = "{\r\n" +
                    "  \"barCode\": {\r\n" +
                    "    \"type\": 0,\r\n" +
                    "    \"digitable\": " +
                    "\"" +digitable+ "\"\r\n" +
                    "  }\r\n" +
                    "}";

            // REALIZA A CONFIGURAÇÃO DA REQUEST
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJ0T010WUd1QjVWajdrU0hJaS92bzF5NHFpT25TaWRrdTdUTks2MGZ6NE1yY0RFalg5QkcwZkxHL3dPWlArQkN3cjZjZG9pWjBlZnZKMTZLa2tTeklWRXZsL3c4UHZkdDBpT21TU0R3S3ErRWV4amNmTUorMWZnenJUV3VSdUlxYmF5M0RFZ29OTFkzUXdkSVh5U0U1dERtWVJJQ3k1am1aQ3lJNHVLRmt2eEVXT3FiTjVoTjFrWkJ4QUxvck1TdnZqdHRCSWgrWlRXOFd3Q3lXRGlVRXhwb0pGM202VjltZHQwZlVNcFp6Ymc2WXRNKzYvbGFwZ0tzbUJYY3YwYTJOeDZuQnJ3ZXF4cnBodkl5am5tVDRJc1ZRbjd6RUZ3bERZcVkzamxJUzducTdiWVdmVXBzeUVYZWIyMkp2YWpiSllWWXZRbmZoRzFZMm1wOXlMYTNuSVBoSnJwNlczUTlCZDNOdEQzb0xJSFhMd3RWNXp4UE5MaVhQY3lFUWV2L2hzY0RvWGd4Ym5WeWJjU3FiQzQ0eUZtcGdIbEI2OHc2OE42TWFLd3lZS0ZEbmk3Wi9JREE1eEQzYURZZys4d2FNanJzYWlabVdnVHVWSzVnWmJsUWpXZ1Jvb3R3emErWnJFcHVmT0EyQ1RuR0d5Rk93b01Kb3J4akVHN2xoak15Y2ZIYXIzUnJGNitMcUJhalcwN09zcjNyajNlaDRUQTNlS3IzQXZtOE5YaDJ5elM0N3kzbzZDdHFHZEtaZnRRbFF2MVVIQVlZL2NRM2ZQbVl2QUdjSmRnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZWM5ZmI1NTEzNWYwNDcwZGFhNDIiLCJleHAiOjE3MTkyNjAyNjksImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.iIUg5b383iJvQY0tsETJhqgajODu38RRSl6XwvvKvLk");
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