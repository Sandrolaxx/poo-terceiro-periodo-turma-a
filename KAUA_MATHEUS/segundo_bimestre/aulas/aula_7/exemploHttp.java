import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JOptionPane;

public class exemploHttp{
    public static void main(String[] args) throws Exception {
        
        URL url = new URL("https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata/Moedas?$top=100&$format=json&$select=tipoMoeda");

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

        JOptionPane.showMessageDialog(null, response, "Cotação Valores", 0);
        System.exit(0);

    }
}