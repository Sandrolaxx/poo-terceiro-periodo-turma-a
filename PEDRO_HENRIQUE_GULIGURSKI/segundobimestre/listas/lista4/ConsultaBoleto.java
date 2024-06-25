package listas.lista4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ConsultaBoleto {
    public static void main(String[] args) {
        consultarBoleto();
    }

    public static void consultarBoleto() {
        try {
            String token = JOptionPane.showInputDialog("Informe o token:");
            String linhaDigitavel = JOptionPane.showInputDialog("Informe a linha digitável:");

            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        
            String json = "{\r\n" + //
                                "    \"externalTerminal\": \"Terminal de identificação externa do sistema do cliente, Ex: CPF\",\r\n" + //
                                "    \"externalNSU\": 0,\r\n" + //
                                "\t\t\"barCode\": {\r\n" + //
                                "        \"type\": 2,\r\n" + //
                                "        \"digitable\": \""+linhaDigitavel+"\",\r\n" + //
                                "        \"barCode\": \"\"\r\n" + //
                                "    }\r\n" + //
                                "}";
        
            connection.setRequestMethod("POST");
            connection.setRequestProperty("accept", "application/json");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer " + token);
            connection.setDoOutput(true);

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            if (connection.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + connection.getResponseCode());
            }

            String respo = response.toString();
            connection.disconnect();
            JTextArea textArea = new JTextArea(20, 50);
            textArea.setText(respo);
            textArea.setEditable(false); 
            JScrollPane scrollPane = new JScrollPane(textArea);
            JOptionPane.showMessageDialog(null, scrollPane, "JSON Completo", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
