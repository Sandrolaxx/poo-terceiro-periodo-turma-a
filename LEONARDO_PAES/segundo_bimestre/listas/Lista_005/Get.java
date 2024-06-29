import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import javax.swing.JOptionPane;

public class Get {

    public static String getJsonData(String token) {
        try {
            //URL alvo da request
            @SuppressWarnings("deprecation")
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions?Type=NACIONAL&UF=SP");

            //criando conexão HTTP para a URL especificada
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            //config método da requisição(GET)
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer " + token);

            //lendo response
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            //fechando a conexão
            connection.disconnect();

            Map<String, Object> result = Tratar_Json.srtToMap(response.toString());


            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, Object> entry : result.entrySet()) {
                sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
            }
    
            JOptionPane.showMessageDialog(null, sb.toString(), "JSON Result", JOptionPane.INFORMATION_MESSAGE);

            return response.toString();
        
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }
}

