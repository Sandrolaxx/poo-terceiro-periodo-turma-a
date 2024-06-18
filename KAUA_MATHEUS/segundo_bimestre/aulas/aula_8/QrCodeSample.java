package aulas.aula_8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.net.URL;

/**
 * QrCodeSample
 */
public class QrCodeSample {
    
    public static void genQRCode(String token, Double amount) {
        try {
            // URL da Requisição (Site de onde vai ser tirada as requisição)
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static");

            // Conector da url
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Dados do json (Uma série de dados que serão enviadas)
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

            // Métodos que devem ser feitos (Basicamente os campos que precisam ser preenchidos)]
            // Método enviado
            connection.setRequestMethod("POST");

            // Tipo que será feito request (JSON)
            connection.setRequestProperty("Content-Type", "application/json");

            // Especifica um dos formatos aceitados
            connection.setRequestProperty("Accept", "application/json");

            // Authorization (Permissão para requerir os dados - Autentificação)
            connection.setRequestProperty("Authorization", token);
            connection.setDoOutput(true);

            // Adiciona JSON a request
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Recebe os pacotes tcp/ip e lê os mesmos
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            // Essa é uma classe não imutável, semelhante a String (serve para criar aquela String gigante)
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {

                // Cria a String de JSON
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