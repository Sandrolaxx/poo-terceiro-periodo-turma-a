import javax.swing.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    private static final String CONVENIOS_URL ="https://sandbox.openfinance.celcoin.dev/v5/token";
    private static final String CONSULTA_BOLETOS_URL = "https://sandbox.celcoin.com.br/api/v5/personal/bill-payments/validate-line";
    private static final String AUTH_TOKEN = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXNlcGUuY2VsY29pbmFwaS52NSIsImh0dHA6Ly9zY2hlbWFzLnhtbHNvYXAub3JnL3dzLzIwMDUvMDUvaWRlbnRpdHkvY2xhaW1zL25hbWUiOiJ0ZXN0ZSIsInRlbmFudF91c2VyIjoiVmFFelB2cHd5K2M0NGRlWENqZVJDVSV5YzhCZldHZ1RFb1NIeFp3VURoaVZrQ3JJMGpwZGNUN3pFN1RRNmU5ZnhJWWxNZGlNZk5EbmN5ZkV2enlwVE0vY2xuQnkwYzZDajR1TStuY055RExJNm5WT2lGcUxuM2xWSTE0MmtScUVIVlNaZ01uRml3VUZyS1VITmJOMTFKdTVveFhzOEp0aHpxVmI5SkttWFhnVnRYYUVXQnJlRUVVS2NWdFV5NzlLbmhsMFB3N1hyZzUzZ3VGTE83MDFFS0Jsa0FOQjAxSUQzTXpXWjQxZXVwR1VSbFAxSEhyUzBmOVloaU94cm50VEFjVkI3T3ZaVldrKzFuQkdKeDMxM014SGp5bnZ0b1VKRURnNjlYTjRpTXNGRElIRzkwWmhzK1N6UzdCdUVRTlE0OUxQZ2wzYTZ1c1BEckg4M3VZSXVyM3grWTV2OUZ0UlRxZ2FxTGtOdk5iYTk4SllsVXMwaWE4aHN3TFNBQzNIYSs0am5HYUJ3emZsUDV5Y0lEMDVhTmVNVXhJMEFyRlc1aE53bmhNZmZ0WW1GRlRZVVJiRGd5L1RwSklkaUZJNXFZVndiZXo4cjBkQ1hHeXd3b1duTDhUQXViSXBuc1Z4RWwrVERuQnQ0SnU5S0U2Y1FkYm1BRFdrU1lqVy9XRy9LbCs2ZlVmV2ZCZkhrZittTDR2ak14YzhmRldiSDZ3WDlINE5GdmtucjBJMFA0TEF0dWpqaHpoc3FoK2dyU2UwbE00WVh6M3FQMi9sNThzUituZGhBPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiYTgzYTc4Y2Q4MjJhNDYwM2JmYjYiLCJleHAiOjE3MTkyNTk4NzUsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.BZ9hMCVmxK34v4e1WBbHjnzhy_vCEdCnaDnVnUo3I_g";

    public static void main(String[] args) {
        String[] options = {"Listar Convênios", "Consultar Boleto"};

        while (true) {
            int choice = JOptionPane.showOptionDialog(null, "Selecione uma opção", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    listarConvenios();
                    break;
                case 1:
                    consultarBoleto();
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    private static void listarConvenios() {
        try {
            String response = sendGetRequest(CONVENIOS_URL);
            JOptionPane.showMessageDialog(null, response, "Convênios", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar convênios: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void consultarBoleto() {
        String linhaDigitavel = JOptionPane.showInputDialog("Digite a linha digitável do boleto:");
        if (linhaDigitavel == null || linhaDigitavel.isEmpty()) {
            return;
        }

        try {
            String response = sendPostRequest(CONSULTA_BOLETOS_URL, linhaDigitavel);
            JOptionPane.showMessageDialog(null, response, "Consulta de Boleto", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar boleto: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static String sendGetRequest(String urlString) throws Exception {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Authorization", AUTH_TOKEN);
        connection.setRequestProperty("Content-Type", "application/json");

        int responseCode = connection.getResponseCode();
        if (responseCode == 200) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response.toString();
        } else {
            throw new Exception("Falha na requisição: " + responseCode);
        }
    }

    private static String sendPostRequest(String urlString, String linhaDigitavel) throws Exception {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Authorization", AUTH_TOKEN);
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

        String jsonInputString = "{\"digitableLine\": \"" + linhaDigitavel + "\"}";

        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response.toString();
        } else {
            throw new Exception("Falha na requisição: " + responseCode);
        }
    }
}
