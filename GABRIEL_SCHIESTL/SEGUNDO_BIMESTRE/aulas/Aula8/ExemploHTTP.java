package SEGUNDO_BIMESTRE.aulas.Aula8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExemploHTTP {

    public static String getJsonData() {
        try {
            URL url = new URL("https://economia.awesomeapi.com.br/json/last/USD");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

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
            return null;
        }
    }

}
