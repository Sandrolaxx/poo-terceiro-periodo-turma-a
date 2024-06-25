package SEGUNDO_BIMESTRE.aulas.Aula7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JOptionPane;

public class ExemploHTTP {

    public static void main(String[] args) {

        try {
            URL url = new URL("https://economia.awesomeapi.com.br/json/last/EUR");

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

            JOptionPane.showMessageDialog(null, response, "Cotacao dolar/real", 1);

        } catch (Exception e) {
            System.out.println("Erro ao criar URL: " + e.getMessage());
        }
    }

}
