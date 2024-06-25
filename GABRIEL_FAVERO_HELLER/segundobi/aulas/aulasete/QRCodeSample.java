package segundobi.aulas.aulasete;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class QRCodeSample {

    public static void main(String[] args) {
        genQRCode();
    }

    public static void genQRCode() {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Dados do json
            String json = "{\r\n  \"key\": \"testepix@celcoin.com.br\",\r\n  \"amount\": 10.55,\r\n  \"transactionIdentification\": \"testqrcodestaticcelcoin\",\r\n  \"merchant\": {\r\n    \"postalCode\": \"01201005\",\r\n    \"city\": \"Barueri\",\r\n    \"merchantCategoryCode\": 0,\r\n    \"name\": \"Celcoin\"\r\n  },\r\n  \"tags\": [\r\n    \"string\"\r\n  ],\r\n  \"additionalInformation\": \"Referente ao custo de...\",\r\n  \"withdrawal\": false\r\n}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJKZ3pBMGdSZ3pMU2VqckRMbzNiZG83UEIyNmxIOXdyWjh3YzRnV1BaZHVlT05md083TjdSenh3c0ZubXRwbkNZUXdBdnZCWU9scEh5eHhwMFdJRUJpSTRja1BCRUJJR1Z2ZHdSd1pBQ2dmOVRnR25LZlJDL3Q0V1I0K0Ftcm5idnQwNkJNNyt4bDFCd2YwZTE5aGhBeE9zVzVmd0RHOFNPYjRDTnlQUGpRSm5qSWd6czMrYVZid05QOGZDTjJBYkV0QTJzby9DN3lQZmNuc0JpQmhkMURTanpDSXNaMU41YWVRSldUWG55NzkvZUFwOE9aQ0dFUGRidElnSi9URTlqU3lmRjlxL1Q3YTM1bnNTcTN6SVliMGEvNlhBUFVEcDVlSzZWU3NRcG4yak1vdWdOQ2hjczQrREpwVE5xVzBwQzBMYVliZUNNWERwbk5qWWhnNlpnUDRCSkFqU09CNW1qTmFyLzdJRzRWTndSZmM0a0x3OXlzOVRlNWJFVVduUWZuSDdxcnlsT1VLMHlPck03bXBXcTBYQzhpS05OZ0owYzhvL2hBZUlCT20xOFdIM2NsOGtTWXZMbmZtQ0dubUdnNnJkajh2cHpRWkg3emw5L21vUlF5QjFhVmFWRFFxOXd3ZVdzSG81UE5FQXFwTjQ1UGx1YmlxWWU3K0Nld2FmU3E4eWl4MENvaTZBYkNxWjJVTTlMb3dtd1VmaEZSN2pUU1IvaDkzbVdkZkhzbDlYbGhQdjh5VUV3a1hIRzVENmFSYXZ5c3cyRzJvaEJsQk5EWFJQUERRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiM2E2Njk5ZTVhYTU2NDQ4NjllNTgiLCJleHAiOjE3MTg2NzYwMDEsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.alE3ev4g7FbqzaqzjN6fLdaJevVMDSD9v-uFLT3E8zM");
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