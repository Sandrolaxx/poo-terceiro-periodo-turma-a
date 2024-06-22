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
            connection.setRequestProperty("Authorization", "Bearer  eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJIWlVsR3pJQWozRDkyU3F2ZXpyNW1ROXl4dDRlUmFkQmtzb0JOUVpaMzhDZldodmlxa3QxQ3JsbUUwb3gyWWlXYnFMTXNQTTVkbHBYMk9EVUx2ck5kb2tlbXBSaWtaRjRTWXFhUE0vSVdrR2MvNVIwc05UbFNhQzZES3JKblFxR3JpZ3lzM1pscWhwT2ZwUTh0dEV4TWt1ZEFnaVNHeW14bkgrdysrWTNLR3pGVHFIcGJVS0JwLzN6bTRuaXgybWdUVTc4UTUweFpJcXJWQThlWXl3RmVnK0RSeGoyaVlEUzdkSEZrWHdzMDdpZ1d5MzR6S05sWWNBd1Z3TElkYXRLSklicEVReE04Z1hJMFpQblQvV2NHUlBISitZVTY2akRGeHpCZk9HdG0ydktJNDZ0Q2JhemZ1NDhkUFJzTzhpQ013OGdvODBxc0ZRaXdZUzE3VStqb1JSRHZudUhNYkk4MTFFYVNaUmpkOUgxa2JtL0VBZWFSZ240Qk9TNW82TzMxTFFxelJ0citzNzlCNGdUUENmVGlhYmlmbHYwc1VKU3FWalFUUFdFd0NuN0t4K3pQck11MWFlWStBcXR2L1RXVFR3VTE2M3hNaSt5QzNIdlkzbWxMdlowZHN6TWZWRHE0dUZacnB0aHdjMnZ2dlJNTmtyNUxRK2k3T0dQaSt4aEE1MGh5TnNoS3FkWklwYkVUamdHbjRyL0RJcXcxTGNpTUo3bDc1bEt1WFFLVWJnRjR6RTFJeWVHUzg0MFBvM1IwQmEwbzVibkJsa254czkrY2dpQ3RnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMjcxZmNmYTE3ZDQxNGUxMGI1MjciLCJleHAiOjE3MTg2NzUyMzQsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.HPFcjnF4uMxLjgHhmiog_4jLElQF95ogUjpM0jsxPNU");
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
