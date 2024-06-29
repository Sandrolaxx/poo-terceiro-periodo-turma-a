package EDUARDO_JOSE_SKURA_CZERNIAK.segundobi.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class ExemploHttp {

    public static void main(String[] args) {

        // try{
        
        // URL url = new URL ("https://economia.awesomeapi.com.br/json/last/USD");

        // HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // connection.setRequestMethod("GET");

        // BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        // StringBuilder response = new StringBuilder();
        // String line;
        // while ((line = reader.readLine()) != null) {
        //     response.append(line);
        // }

        // reader.close();
        // connection.disconnect();

        // JOptionPane.showMessageDialog(null, response, "Cotação", 0);

        // } catch (Exception e) {
        //     e.printStackTrace();
        // }


    }

    public static String getJsonData() {
        try{
        
            URL url = new URL ("https://poo-exam.vercel.app/api");
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    
                    String json = "{\r\n" + //
                                    "\"name\": \"Eduardo Jose\",\r\n" + //
                                    "\"ra\": \"77721\",\r\n" + //
                                    "}";

                    connection.setRequestMethod("GET");
                    connection.setRequestProperty("Content-Type", "application/json");
                    connection.setRequestProperty("Accept", "application/json");
                    connection.setDoOutput(true);

                    try (OutputStream os = connection.getOutputStream()) {
                        byte[] input = json.getBytes(StandardCharsets.UTF_8);

                        os.write (input, 0, input.length);

                    }
                    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    StringBuilder response = new StringBuilder();
                    String line;

                    while ((line = reader.readLine()) != null){
                        response.append(line);
                    }

                    reader.close();
                    connection.disconnect();
                    
                    System.out.println(response.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
        return null;
    }
    
}
