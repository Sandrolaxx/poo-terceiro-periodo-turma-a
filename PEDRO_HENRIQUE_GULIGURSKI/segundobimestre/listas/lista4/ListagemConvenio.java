package listas.lista4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ListagemConvenio {
    public static void main(String[] args) {
        System.out.println(getConvenio(1));
    }

    public static String getConvenio(Integer type) {
        try {
            String token = JOptionPane.showInputDialog("Informe o token:");
            
            URL url;
            if (type==0) {
                url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions?Type=NACIONAL");
            } else if (type==1) {
                url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions?Type=ESTADUAL"); 
            } else {
                url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");
            }
            
            // Abre conexão HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer " + token);
            connection.setDoOutput(true);

            if (connection.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + connection.getResponseCode());
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            connection.disconnect();

            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       
    public static String convenioFormatado(String response) {
        String jsonString = response;

        jsonString = jsonString.replaceAll("\\s+", "")
                               .replaceAll(",]", "]");

        StringBuilder message = new StringBuilder();
        message.append("Lista de Convênios:\n\n");

        Pattern pattern = Pattern.compile("\\{(.*?)\\}");
        Matcher matcher = pattern.matcher(jsonString);

        JTextArea textArea = new JTextArea(20, 50); 
        textArea.setEditable(false);
        textArea.setText(message.toString());

        JScrollPane scrollPane = new JScrollPane(textArea);

        while (matcher.find()) {
            String convenantStr = matcher.group();

            String[] fields = convenantStr.split(",");
            String nome = "";
            String tipo = "";
            String estado = "";
            String horario = "";

            for (String field : fields) {
                if (field.contains("Nomeconvenant")) {
                    nome = field.split(":")[1].replaceAll("\"", "");
                } else if (field.contains("Tipoconvenant")) {
                    tipo = field.split(":")[1].replaceAll("\"", "");
                } else if (field.contains("statesconvenant")) {
                    estado = field.split(":")[1].replaceAll("\"", "");
                } else if (field.contains("timeLimit")) {
                    horario = field.split(":")[1].replaceAll("\"", "");
                }
            }

            message.append("Nome: ").append(nome).append("\n");
            message.append("Tipo: ").append(tipo).append("\n");
            message.append("Estado: ").append(estado).append("\n");
            message.append("Horário limite: ").append(horario).append("\n");
            message.append("----------------------------------\n");
        }

        textArea.setText(message.toString());

        // Exibindo a mensagem em um JOptionPane com JScrollPane
        JOptionPane.showMessageDialog(null, scrollPane, "Convênios", JOptionPane.INFORMATION_MESSAGE);
        return null;
    }
}
