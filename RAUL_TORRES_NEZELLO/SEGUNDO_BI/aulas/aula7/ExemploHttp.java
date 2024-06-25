package SEGUNDO_BI.aulas.aula7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class ExemploHttp {
    
    public static void main(String[] args) {
        
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

            JOptionPane.showMessageDialog(null, response, "Cotação USD/BRL", JOptionPane.ERROR_MESSAGE);
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

