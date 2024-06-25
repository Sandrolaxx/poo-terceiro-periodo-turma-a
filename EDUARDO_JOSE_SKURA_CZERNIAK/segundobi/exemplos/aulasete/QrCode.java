package segundobi.exemplos.aulasete;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class QrCode {
    
    public static void main(String[] args) {

    }
        
            public static void genQRCode(String token, Double amount) {
        try {
            //Definição de URL da Requisição
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static");

            //Classe Auxiliar - Realização de Request HTTP
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

            //Configuração de Request
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJmbTgyOVFELzlTdkoyQk9Db3NiRmRwMFkvcHl2OEcxOFp5RU1aNzZHTkdSZllVN3VWK0xrUVIvSlpCSFRCcjBxenFCSzNCMlB4andMYm8ycU5nVkVKQ0NtcFFxays3Z2I5d3lDRWVIN21RaHcyMWtTWHdiUGorekR0NUVFL3l4d2swckhxZk1hTlM1N2hEbVJZK1l5cFNsOUVnWHlRMGhvZFA0c3dpU1VxN1EyNFd3cWJqQTF6VnBNZXNnVHcxcXNKOXdwK3lsTHRZcFlYaUo4QldNWVM2SjRoSzl2WWwzLzkxbU9MQTJmYXZNNjU5UXhjMEUzWlgyL3ZiSTVyQllPV3F6RmVPVzJZSi80bkdKdjBob2xERWZYeWYrWFRpQlBYcmQrL0l2TDE5c0MwczBWUWYxUyt0ZGphNHlZM2Y2dE9UWTZ4MktSdlFJOEVuT2xqdXFhUlZsYS8ydlJVVkdncTI1eEpmeTVxZlB2dmZOSk1HSWxVSlhYOFRsU09TU1RsdjZtaWNxYll0cnU5SzhNWkhhUTlrQ3lXMEdWSTY2RVFhdXRRZTFkdzNPdlJZNlFldENocVVNKytDelQ2ZFB1aFhENGVBNnF0cDg1SjBsRUR1bjZ3dlJQQ3c1aVRPTS9YeUVlSkFnM2NoNyttZWFyanhqb25CTFRxYlN3Rm9CNDR5M2ViMTNrQ3pMRWZweTAzWEVNMktCZ0M4NU15UDZLTnZyYTJucG43NXpWVi9SNEZNWXdSTFgxUEIxMi9FdkVYNjIybnl6RE1lenc3TjB2YXdiTENnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNGI3ZGMxYTdmYzYzNDc3ZGFjMzkiLCJleHAiOjE3MTg2NzUyMzksImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.x7eHFAA41TYfhD_0HTI4PA_gTfHfDR0CUvhqbTftmDA");
            connection.setDoOutput(true);

            //Adiciona json ao Request
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            //Leitura de Dados
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

