package segundo_bimestre.API;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class QRCodeSample {
    public static void main(String[] args) {

    }

         public static void genQRCode(String token, Double amount) {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static");

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
                                "  }, ";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer  eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJ0cTE2a0ljWXY0bE5hUnlkVytXRXN1VktBenpRZnZRWEwrbHhXcHIvU1BoK0dIdURyRldIMW90NFBySi83Q0VZbHdCcXVZc3QvY3piNldyL2tHdlQvSW5Zb0RoeHVaZUpqRUtTTlpQL3BvanV0d3dES254V0xwcENhZDQ2eTNONDNTVUxKaTR2NkV5UUxKMlVhOUhLT3JmZ0NOSTRGSjNSc21nQjdJNjNSTWdoWmNtc2xuL3BZN1JjV3F1RTA2TjFrQTg5MDFENkthT0lCS2JaTFBEbE5JODRocldzVDR2bisvR3VNa0xXbzBWZWUwYnhzYWJ6SmJBTEV0TksxSWxxTmVHelRtaXJOTWI3dG1xZ0l2L0NEY3lkSnJGVnFtZUlkU1BoQTdtTkJkcFNFV2NXb1BHb3dmSlFud0w3K1VIbmp0OWJzMFhpV20zVmtyUCtzTmFSOHlDZ2xsemxYTGxBcUUrNzBNUGxXUnJPUUcrRGVLUUZWY2RkM2lBKytjeVBpcHFSdE9SODZLNUxBUDc1M0tsT01HNlN2MWwzOEZsaTVTcXZBVnlwQlVzeDdwU2tpVk92aW90VjBsazBwUGgvdHg2QjFLQjdXaWpmTXQ1L3FNYkREN0EyRE02djFqVk8xdURvY2JCeEUyY2lkenE1SkVCc3ZUaFlRS1dBRUZBK29wMXZxV1JkUVZibWFXTExBTlJQM09ZMFFweTlGZTF0dnZicWhGYkZkeW0yQTJ6Y0FuTFA3aFB2V3IrcWp0S0lRbzBwV3VwZFczWWpRZzcvWEMvTDd3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiYmJhZGRlNGJhYmI0NGJmY2IwMWMiLCJleHAiOjE3MTg2NzQwOTksImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.-1Hxiu8MrEvFHEEUcclP0y02cktNZqUkXdaqj4qu1kg");
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
    

