package SEGUNDO_BIMESTRE.aulas.Aula8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class Post {
    public static void main(String[] args) {
        genQRCode(
                "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJtMGNmN0p1RU82VTBVSTBNWWNqZWt6a2FmN3MyRzFnWVkxbDZQcStNMmhrRWJVLzdrMW14QXp4bEFLWkhHYU1MZGYzQ25jczFaRmpaUmN0NkhkbmVQNUh5M2xRNTlMUkt5L3dhQXRoYi9XeGFscHN5WURKTElXSUE2dUxaTTV1RlhsdFBDWDdjRHRhREJyZENHZ0NtTWl0eWJPU3ZmTitZYk5GWjRIck5sZElTYWhXQ2M2MU8xZVZFNFAvdlhnRTRsSHAzTWRYbTRPMnRPYnEyL2hWNnZWSytKYzNCOThOa3ZreDJNVis1TjZxT0lQSmtJV0tocmlkNlU3ZU1TdlN4QU96Wis4N2tXcXFabUVpQUFSb2Z3MWp0S0tiWFc1ZUF3N0VFZFV5eGF6TnJJQk5xUVErckIyU2FUTGVhajJ2U0g3UE9EQllUWHJPd1h2NHZwRmtQbytDcGN6cnpPZDZyZFk5cVAvMVlBNkEyNmQ0L1VxRDJxcVlpVjRORDFVcDNOZFZ1cU9kbjZQbnZuTlpYTXhaU1VMdmlsQ0lJSFdkYmlrM2JZK0pZWFp5NmJMNXd4aEVuL0tFODJxRnFhYU53NThVSnIzR2xMdWZrc2JLUUFPUk90UGU0RkZqNVlVRDBVUU9vZVlnZFpEREhxRDRxTVVPd05GalBDbkZwY3pLb1o3dFFBWDFDNElQb1UyNEJmN3FJK0Y3c1doWjM1d1dVVzZ0NzNGNE9pQUt1aUpxcy9Ib3IySzY2UHAxcHg4YTc3elBUVUtjSDY3NWZwUHJwUlBaREN3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZTBkNjhjMmI3MzRiNGNmNDhjYTciLCJleHAiOjE3MTg2NzM4MDUsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.xhWrkIUT2_MeSH4NzzoGbf2fsFcuTs3MMGf08oyn0c4");
    }

    public static void genQRCode(String token) {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
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
                    //"  \"nome\": " + nome + "\r\n" + //
                    "}";


            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer " + token);
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
