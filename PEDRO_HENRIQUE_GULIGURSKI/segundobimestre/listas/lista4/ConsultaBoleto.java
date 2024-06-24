package listas.lista4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JOptionPane;

public class ConsultaBoleto {
    public static void main(String[] args) {
        try {
            // Lê a linha digitável do usuário (simulação)
            String linhaDigitavel = JOptionPane.showInputDialog("Informe a linha digitável:");

            // URL da API de consulta de boletos
            URL url = new URL("https://developers.celcoin.com.br/api/v1/consulta-boleto?linhaDigitavel=" + linhaDigitavel);

            // Abre conexão HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            // Verifica o código de resposta
            if (connection.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + connection.getResponseCode());
            }

            // Lê a resposta da API
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (connection.getInputStream())));

            // Constrói a resposta
            StringBuilder response = new StringBuilder();
            String output;
            while ((output = br.readLine()) != null) {
                response.append(output);
            }

            // Fecha conexão
            connection.disconnect();

            // Exibe a resposta em um JOptionPane
            JOptionPane.showMessageDialog(null, "Detalhes do Boleto:\n\n" + response.toString(), "Consulta de Boleto", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
