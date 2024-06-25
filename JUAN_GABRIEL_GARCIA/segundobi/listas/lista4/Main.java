package segundobi.listas.lista4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String[] opcoes = { "Listar convênios", "Consultar boleto" };

        int escolha = JOptionPane.showOptionDialog(null,
                "Escolha uma opção:",
                "Título",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.DEFAULT_OPTION,
                null,
                opcoes,
                opcoes[0]);

        switch (escolha) {
            case 0:

            listarConvenios();
                break;

            case 1:

            consultarBoleto();
                break;
            default:
                break;
        }
    }

    // GET
    public static void listarConvenios() {
        try {
            // URL alvo da request
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

            // criando conexão HTTP para a URL especificada
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // config método da requisição(GET)
            connection.setRequestMethod("GET");
            connection.setRequestProperty("authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJkUUNUMW9DTDBxZGJIR2xWcXhLd0hkcXhiZDlDQ01wYjg3UTRvSjJ6eUlDblVRNWJmQXdRUHFZc0tCb3ZEQVBzTG9iU1Yxa3BiSm9DUWF0U0k0Ull5QW1pVFJ1WkZhb3JzRWRZY3VOYnRKaEg0bFQ4MjRQdVdzS3ZPb2wySFJnSVhjMVo3bXhJOTlEeCs3N3MrakJnbDFjc3FOQXoyazNLUDJMY1JybDRRYjd3OWtudmppVXFPbGo2KzRFeTNlNTdiQ3BtN3Vyc3QwRnoxUENhbVNZVE00ZG0xZWY3TXJXZEE5YUpJbXcxY1lTU1JRaWkxTS9HL1MrWVZBWUd2SWR5Qmt5WW5DRzFYODNqSG82QTNOaDRtUC8xMlBFOXgySzY3OTdvcmNmTGpGWVJLalRwRGtHZVQxM1F2MFlSZHlQUUZ0RFdiR2NOeHdCV1F6NmhjQ0V6dWllMFdzVWZHa29CeEQ1TlJsMiszZG14S0cxZWl0eUJFYkZhZjQzYVRmZFlqdE5KT3k3NmU2NGM3UWo5bTJMME93K3J0UjljTnE2Q2NqZ0haRXJpanh5ekl0cm9yMncrUHowZXYzQ1hTYVlSZStVdytueHk5MXJHZ0ZRNk1RcXZBOHFlanJ5NVZPbDh2di9FTmhSL3k5RVNpc0lxWVNCOVpmZ29RRDJCazY2b08yQWdLZ3Qwc0JmNVIyakVkVDdvNmpLNmVJRmkwQ0lmbm5kQzYwbnVJU2lKQXpmNTF5Zy9FN1dwd3lHcWlwR1N5ZmhrUGxjNkNoaldlWkR1ZlJUSzV3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiOTQ0NDlhMTMxMWY3NGQ4Mzk1YmQiLCJleHAiOjE3MTg5MjgzNTIsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.fckdBfAsGx5KRi_qMkrnNFe7Y_Bx1mbMJR2_p8E0Kpw");

            // lendo response
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            // fechando a conexão
            connection.disconnect();

            System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    
    // POST
    public static void consultarBoleto() {

        try {

            String linhaDigitavel = JOptionPane.showInputDialog("Informe o código do boleto:");

            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Dados do json
            String json = "{\r\n" + //
                    "  \"barCode\": {\r\n" + //
                    "    \"type\": 0,\r\n" + //
                    "    \"digitable\": \""+ linhaDigitavel + "\"\r\n" + //
                    "  }\r\n" + //
                    "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJkUUNUMW9DTDBxZGJIR2xWcXhLd0hkcXhiZDlDQ01wYjg3UTRvSjJ6eUlDblVRNWJmQXdRUHFZc0tCb3ZEQVBzTG9iU1Yxa3BiSm9DUWF0U0k0Ull5QW1pVFJ1WkZhb3JzRWRZY3VOYnRKaEg0bFQ4MjRQdVdzS3ZPb2wySFJnSVhjMVo3bXhJOTlEeCs3N3MrakJnbDFjc3FOQXoyazNLUDJMY1JybDRRYjd3OWtudmppVXFPbGo2KzRFeTNlNTdiQ3BtN3Vyc3QwRnoxUENhbVNZVE00ZG0xZWY3TXJXZEE5YUpJbXcxY1lTU1JRaWkxTS9HL1MrWVZBWUd2SWR5Qmt5WW5DRzFYODNqSG82QTNOaDRtUC8xMlBFOXgySzY3OTdvcmNmTGpGWVJLalRwRGtHZVQxM1F2MFlSZHlQUUZ0RFdiR2NOeHdCV1F6NmhjQ0V6dWllMFdzVWZHa29CeEQ1TlJsMiszZG14S0cxZWl0eUJFYkZhZjQzYVRmZFlqdE5KT3k3NmU2NGM3UWo5bTJMME93K3J0UjljTnE2Q2NqZ0haRXJpanh5ekl0cm9yMncrUHowZXYzQ1hTYVlSZStVdytueHk5MXJHZ0ZRNk1RcXZBOHFlanJ5NVZPbDh2di9FTmhSL3k5RVNpc0lxWVNCOVpmZ29RRDJCazY2b08yQWdLZ3Qwc0JmNVIyakVkVDdvNmpLNmVJRmkwQ0lmbm5kQzYwbnVJU2lKQXpmNTF5Zy9FN1dwd3lHcWlwR1N5ZmhrUGxjNkNoaldlWkR1ZlJUSzV3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiOTQ0NDlhMTMxMWY3NGQ4Mzk1YmQiLCJleHAiOjE3MTg5MjgzNTIsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.fckdBfAsGx5KRi_qMkrnNFe7Y_Bx1mbMJR2_p8E0Kpw");
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

            connection.disconnect();



            JOptionPane.showMessageDialog(null,
             response.toString());

            // System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
