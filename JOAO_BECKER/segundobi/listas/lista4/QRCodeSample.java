package segundobi.listas.lista4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class QRCodeSample {
    public static void main(String[] args) {
        genQRCode(null,20d);
    }
    public static void genQRCode(String token , Double amount){
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\r\n" + //
                                "\t\"key\": \"testepix@celcoin.com.br\",\r\n" + //
                                "\t\"amount\": 2.55,\r\n" + //
                                "\t\"merchant\":{\r\n" + //
                                "\t\t\"postalcode\": \"01201005\",\r\n" + //
                                "\t\t\"city\": \"Barueri\",\r\n" + //
                                "\t\t\"merchantCategoryCode\": 0,\r\n" + //
                                "\t\t\"Name\": \"Celcoin\"\r\n" + //
                                "\t}\r\n" + //
                                "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type","application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJFcThuN2JoSENJZ00zeUxtcCtCVUpRbElXWFlhMEFtL3g5WlFmZlE0cG9iSmVCVlYrOVRyb29XSE5LUUViNlF5WGxpb3NNWDRDUFlRellSQjI3SEpqRlhMajkwZ1JTUjNqYjh0MmU2UiszUmpSNDJKQ3dWM1kzTDQ1R3JoeUhqT0ZzZENmZmRpODJTa1JuU3JrQi9Xd1N6b0hPaXljL0lhc0lJL0tNNlREYzBZNjh3K0lzODJySE0zL2dUSGpBYXRvTjNqTmFubHZhRE5yRTFXdVd5ZkRuV2R0Q3B5dGpIa285ZVd1VFoxZkFEZXJNZm5WYkNTb0ttTDY5TnBzR2crVk9wODBWM2lGN0twZytuTzZ3bVUxNGZXQ0JJMEhoRmwvcFJPNXV3TFZ0MWNFMlNNekRaMzh4VHdKNXVmdHlYT0pRaC91RytkRlFJTmVRa2pDSEZmQzRIb0JoRVAyN3pvM3NxWVB4dmtDclp2SWNGeWNONFVHdkZLSDJpcFdXR0VVQm92eGNMQkR5Q0JSY3pWc1dncEY1VWNBU2NhUU5VMmpYbUd5Ky92MzE5Zi9NRVBYSnFhOTlwY1psNFZhNksxbFVNMUhyTUYyTEF2WWNGYUprYnlDUk9HRnpNRGhtWXpVcjJFOHNFNmVoK3QrYjFOUkxwWEtMbS9jZHp1MEIvdmdvUFhIMG4wc0xVQmZhYUt3NDdBSEw1eHMzSWpMV0xEYlVjcEJrZ25CNWVEVmRyN1hnbUpnbEkyZGNsWHo2UXE5dWFXTXkzVTNMYU9GcmZ2MnlybmRRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiYjY2NGY2YWNiZjRhNDZkOGI3N2EiLCJleHAiOjE3MTkyMDA2MDIsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.DIyVXXojy6uE0ByxRYEJR6apjdjbg-OUC8YOfj0rVJw");
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
