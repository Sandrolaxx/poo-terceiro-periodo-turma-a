package segundobi.testes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import javax.swing.JOptionPane;

import segundobi.aulas.aula8.RegexSample.JsonUtils;

public class testeapi {

    public static void main(String[] args) {

        String[] opcoes = { "Listar Convenios", "Consultar boletos", "Sair" };

        int escolha = JOptionPane.showOptionDialog(null,
                "Escolha uma das opções abaixo:",
                "Titulo",
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

            gerarBoleto();
                break;

            default:
                break;
        }
    }

    public static void listarConvenios() {
        try {
            // URL alvo da request
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

            // criando conexão HTTP para a URL especificada
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // config método da requisição(GET)
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJyTFFiWisyakY3WnpSVDRLb1JEMEh4bnBQcjNEeU45UW94SGV6aElJYU1Bd0NCR1BGY1ZZQnRWT1Zmd2wya1kvYU92NXU1bWlLSm9qY0xEVFVvUVVNaWJzNVhEYXp5K05ITi9LWEFhSG8xYnVlcnU2WU9EUFpFZ3ZoZ2FpRDU0NTc1U3pXbkdHYmxNWUloNFVENFN3LzZDcWMvTzRlQmljVGhWaCt0V0NJaDU2V25OSFNrajU1L1ZaNmdCbGtXUlY4c3JsYnp5ZFZOVWlhZ0NVdk5OWWxVdFBmRDdLdm5KS04yVEhqUzZhZGY1QWRYdFl1YWEwVHpPNGZqT3EvT0laKytqMXJYYVNzaDdSMnJ1dDZFamJzT0w5UVEwbDBwZnVQMWVFK29KL2dtK0t2dUUvTFBJZDQ0SGpnZTl5azg0c0RZOTFWUG41OUppSlpwd2FrTVNJUEJ1WTBPV3RkbGtCT0RITFB1QWRJN3pHREQvMEhkajhiQlJFWmMzcG8rMjdMQThsMlAzdHdKVTE0NFBlaHNMaTRxZHI2dk5HYy9EYlhGVmc0S1AzY1JJTHZLZTVuZmc2UW1FR244R1RBUm51SnhqYkhuc251cG1yRE1LUlE3QVQ0NmRla1JCQnN2WDFtOFh5L0ZSUlFpNTdTUnVpRWVQYXlxYWx0RHh6RklkUnJKYXh2Mi85d2NxVEFRdWE3dm80L1JHRmxud2g2OHNxTWxvMnA1SmhSZVMzR3NCNDBSVnpWZlFFc2JwZTY4UjA5dXVCQ3NwekpQaFJ0SnYvakNxcFF3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZDBiOTU2YTVhMDU3NGQ2MTgxNjEiLCJleHAiOjE3MTkxNzg0NzksImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.P_40-vhVYX4RClJYbpzAIED90MytDwrgHCXIMnoav2w");

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

    public static void gerarBoleto() {

        String digitavel = JOptionPane.showInputDialog("Coloque o codigo abaixo");

        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Dados do json
            String json = "\t{\r\n" + //
                    "\t\t\"barCode\": {\r\n" + //
                    "\t\t\t\"type\": 0,\r\n" + //
                    "\t\t\t\"digitable\": \"" + digitavel + "\"\r\n" + //
                    "\t\t}\r\n" + //
                    "\t}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJNcUM1QXFjQW5McWlNNFp6MWhNUVNtbmpnSUhkdDd0aUxFTi9nK3RjNm0wN0VLcGp3aVpaVzYvSVB2TUt3Mk1LS05NaUJxY05iUGkrc1h0Qk9EdUJSQlp6QkxHM2NZSUZKZXh3YVF0NU5hQ2JzMHQvUkJsNVd1UDBTUitPbVZGd3k5MlNIMDF1c1lxQzlMWUIybUlzWVBlYTMyL2NFVUVKdHVDc29XOVpwcGE5MzBGcFpXekJ3WXFVWDRxcUlkUmhNRFlzMzhZNFVFM2JVdzdnODJTYlExdnFoS1U0Q0ZtdVFtc2FhVVMzd242QitZRUx0eVNYRjBYckU2cG9adEIxUnZLVisvRFdqckhmck9pZHlmQ0tCcUpYaWlsc0h4NnpiUWF3N0h0NVJGZ2tHL3p5eHNJMGlrRGFpR3M2eTVsU2dPaEZ3VU5EYmh4MXhHQkxsTElMMktUdU15MllicWNCTm5WM1l5cytJRG91UDBoaXMxYTNhekRCUnNScmV2KytDb0ppZzgrVGw3MzJkNnl3cDEvYmcxbFRBcmpFTVJ4OFQ0di94RURUSm1sOXRrYmlwU0tSZXp6c2p6bjhyd2lFTmt6ODZsWW5uOGJrUldTekFlSzkzWlk4T1NqakgzcjVPR2Q0RjkvZHBjVDQxM3hCQU9GTlFkSlAzZFhpdllBcjF0NnJYTlVaRGVKd0FiaVN0NW5SeGtHc2FxMHFabEllNkc5TUxqRzRUa0xBc3E1c0YzcGZLcWNVTHY3NkhSbktvZmQ3c3p1ZXlzeGRGQ0ZvNjE1ZFNRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNmRkZTZhMmJhNWY1NDBkNWE4MWEiLCJleHAiOjE3MTkxNzkyODgsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.sHqLu4IJBQTYEbHDooBL8TXuRhTT56nQBgYY0DGdXLU");
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

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
