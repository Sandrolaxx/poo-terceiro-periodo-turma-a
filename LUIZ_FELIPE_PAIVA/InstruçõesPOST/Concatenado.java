package InstruçõesPOST;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Concatenado {
    public static void main(String[] args) {
        System.out.println(genQRCode(null, 20d));
    }

    public static String genQRCode(String token, Double amount) {
        try {
            //URL alvo da request NÃO MUDA
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static");

            //criando conexão HTTP para a URL especificada NÃO MUDA
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            //Informação que não é estruturada dentro do codigo, informação para o usuario passar.
            //Nesse caso a linhadigitavel é a consulta de Boleto do usuario.
            String linhaDigitavel = "23793381286008301352856000063307789840000150000";

            // Dados do json NÃO MUDA, somente o JSON a passar, exemplo concatenando a string digitavel que foi criada, REMOVE OS /R
            //Exemplo usado é do qrcode do Pix nesse caso
            String json = " {\n" + //
                                "  \"key\": \"testepix@celcoin.com.br\",\n" + //
                                "  \"amount\": 10.55,\n" + //
                                "  \"merchant\":"+ linhaDigitavel+ "{\n" + //
                                "    \"postalCode\": \"01201005\",\n" + //
                                "    \"city\": \"Barueri\",\n" + //
                                "    \"merchantCategoryCode\": 0,\n" + //
                                "    \"name\": \"Celcoin\"\n" + //
                                "  }\n" + //
                                "}";

            // Dados da Headers da nossa request e configs. NÃO MUDAM, sem autorização remover os /r
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJuaXh6RndEUGlIQnY5dlhzNHJsYnpRNkZrV2hpOUFXa3V1NFhGNGQ1b2lsSERBY2htRWM0eTVEMEZzcktFUHZUeXo1SnlxOFY4bTRVbVpwWUVsaXczSnVKNTNqL2xLT2kyV1lEVnpweGtYT0ZzMGdBMkg3OUIwZTgrSFVtT1J1VlEvZlBGcVRoNk9yNU5JcGc0ZTJCUGFoMjhDM2l4cUs5Y09Ka2U2TXFCb0Z2VUw0WE05QnBMbDFCWUJhRlBEVkJLeldHU0JuNlMvbnFaeGs1cEVMTVZianRUSDQrajR1d245R2dSSmxUczgxZi90cnR4czViVWdybDRXOFJsbFZObE93SFNvb2R3RmlmRFJOVVBkRkZ6ODJLQy81VWFiSG9hWlQ1R1d5cmYrS3F0MlJJdTJ5cGNKcTlsQ1llZVprNnhualgxZVR5czVnaVE4dGVvVzFCNUFOUXdFSXZhaXV6ZzFOdCs5ZXppZGM3VnNaWldrZEhYOEhvbEd1QUw1SFprZ2hwQUY1dlNlaFpsblpHTlFheU9BZS9JVEZFK3QxZ3c5ak1rcWlsZktPOTk4SmxlSTQyU2JZMXpYamJvL2JLenhtVVpnZExJbjFxNDFJVmQ3QXZuQkk0ZDBHWnQ3cEtBSDdDSk50VkpzSmVhNXllNFIzMmxLNlRLbXJoeUlZM3RJSFZ6UkFqRWlXZi9CMzRhd0VzU2FheW52bDUvOEg2WTVSR01WSi9NSGRNYVZ3Znp4RTBwVTZzN3ZQeEdxbWdTVFJHL3RNVzQvMXBMTW4wMm50TXdnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNTY1NWJjMGQzMGM4NDhlYThiYTkiLCJleHAiOjE3MTkyMzQ3NDUsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.iTupYU9CqNOr8S15M-waRiN1yS0HQ3oDIR8krOkNdQo");
            //Tem json vai o codigo abaixo
            connection.setDoOutput(true);

            // Escrevendo JSON na request provavelmente não muda
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Lendo retorno JSON da request e atribuindo em uma String, ler a resposta da API caso ela tenha
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
