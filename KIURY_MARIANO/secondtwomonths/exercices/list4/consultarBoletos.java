package exercices.list4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class consultarBoletos {

    public static void consultarLinha(String digitable) {
        try {

            
            URL url = new URI("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize").toURL();

            
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\r\n" +
                    "  \"barCode\": {\r\n" +
                    "    \"type\": 0,\r\n" +
                    "    \"digitable\": " +
                    "\"" +digitable+ "\"\r\n" +
                    "  }\r\n" +
                    "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJFZUJEVjczWGluWklDTUl2ellSSTV5WDRaWDY0cHJjcG9lSnpqbzBubmxiT3NTdkl3cG8wOFZjVUFxb0g4OE9RWHljSEhPWkdIb0ZGYXlqMm55b2ZuVG14cHZGcjg3cWVHQ2VqQVh4alUyRFpzeTZnWDJrcHdTNEpxWlZyUEJQblNFdlRRR3BZZkRhdjhudCtPcUE1VUdYUDFtMWN2UlFSTnhhQXBnN1NJaFJBUnhsN0ZIUnE0Zm5RYVJXWitkQ0JLaHNCczdQcW0ra0xDaDBaQ0EwNEJOZkZxWXptcVUrMlB2UFdIREdpallNbUtvcFlDcmtCc1NPWmNLVnpLR3k3bFRPeHZLK1ZuOVJEeVVxYkJxQmFOTUlNb1VMYmNSR21WWUludi9ua1BwdDFLSjJiVi9oK0pyWGJJTjMrdW0za1JpZkFOd09idWdyV1RkV2F0a1RmS1RrQzQzTFZrb0o1RzcyR01oZUhuWUZCM2JIYUZzYTk4MFE1TkkrOW5oRjdSM2tUUjJyWEUwL0JwV0xJVHU0Q09VY1pITEJUVGJIeENzSlRPcFlFYUcwaVI2bFVScG5GN2xKN1ZUaDIzdnF0VlJmRjVZRFJWYTlYV0FxOEdDcEIwMk10bkNyYkE0b3c5RnR5czQzV3hBWXd6OVlIdkxKK1gvZlhuY2hrRUo3MVZMbndWNFE2eWFLelNqa1oyMHd6TDAzS3Y3aGorTE91RjNVOUFNRlZobi8waVROUERPdWhnbndUUXdVdktCa0YzNTdMTDhHbWx6eVQxVktVSkliTGV3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMjU3ZGZlNGE2N2RiNGYxMWI4MDYiLCJleHAiOjE3MTkyNjI4NDMsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.TfrsDYPaXOFnECeIv_CeHPZYQahUhIf38_fpYT-iLrQ");
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

            JOptionPane.showMessageDialog(
                            null,
                            response.toString(),
                            null,
                            0);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}