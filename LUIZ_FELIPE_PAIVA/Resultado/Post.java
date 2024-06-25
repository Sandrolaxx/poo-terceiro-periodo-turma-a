package Resultado;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;

public class Post {
    public static void main(String[] args) {
        String resultado = gerBoleto();
        if (resultado != null) {
            // Mostrar apenas os primeiros 200 caracteres
            String exibirResultado = resultado.length() > 200 ? resultado.substring(0, 200) + "..." : resultado;
            JOptionPane.showMessageDialog(null, exibirResultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static String gerBoleto() {
        try {
            // Solicita ao usuário que insira o valor da linha digitável
            String linhaDigitavel = JOptionPane.showInputDialog("Digite o valor da linha digitável:");

             // Verifica se a linha digitável tem 47 caracteres
             if (linhaDigitavel.length() != 47) {
                JOptionPane.showMessageDialog(null, "Linha digitável inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
                return null;
            }

            // URL alvo da request NÃO MUDA
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

            // Criando conexão HTTP para a URL especificada NÃO MUDA
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Dados do json NÃO MUDA, somente o JSON a passar
            String json = "{\n" +
                          "  \"barCode\": {\n" +
                          "    \"type\": 0,\n" +
                          "    \"digitable\": \"" + linhaDigitavel + "\"\n" +
                          "  }\n" +
                          "}\n";

            // Dados das Headers da nossa request e configs. NÃO MUDAM, sem autorização remover os /r
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJqaC9sL2tVMTBuZDRQWGh4ckpyMUJDRzBlRENsWGIwNWh6ZTRoN05ibEFha3d2WTFmd2ZnTjVlWExZTW1BS0d5cGdwL091QTJ4djVxVFFOcFZCZEs1cTN6REtHdFNQSjNkZjhRK2UrYndvNUFnM0doT2NWdUp4YUhENkVUUjFUSXBvWGxIMG1WelBJNGtuWWpmVmJVNVBlZWNiV3dnTVdOdUQ0MGNyTm9JTHUraVNiV1NTdW9LYVlRb1BkSHlLMzFmZVdOa0JpSnhRQ3FUenY0UWlleklQQkc2ck93YWJVakgyUVJrcGs1R1R3YkRLSS81Uk5YLzIvUVl3dnVzTzRKamF5aWpCSVVZSkEwTXNaVzZvbG1PUFU2Y2tBaUNhQ2x4ZW1zSlYwYnJLWVl6V09pQkJ5eVdQWU9ISFdBSG5EMDVEZzlwWGpJNTRLTmNoT3pYUFI2RmZISzBBeUZ2Z2JsMERIbGx2S3VXOTFXaU5RUzkwem9MNXpVMkZDeE5NTUlQM2tlalltdVBtZnpYNHdNTCtrVllpOTBRY1B0eFQ1bU5US1B1RmRkVkJVNUcra0xvQXd3YW83VHRlQmNUZEVITFlkZkZSdklvUVBTSUNHb0w4Wm5UYW4yNkV6ckVUb2g2UzZFUmxYQkZVWmZDSjA1QnFGRDZZcGVQek1ZVVlOejN5djhvU2sxQ3VFdlJFa1hvTXRsa1BFR1dyeTc3TGNOZ2pQQVVhVzY4SlVCdjJkQVFtUERnUHNQYXV5TnBwMXlPakRpS0tUKzN5bkZOdTlmN2xSenBnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNGM2NmM5YjQ0OWVkNGE2NTgzMDEiLCJleHAiOjE3MTkyNDI3NzIsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.fcte6Z9RXhgXZYAZP2bhSz88FoPimPt0gRypDaD0jIA");

            // Configuração de envio de JSON
            connection.setDoOutput(true);

            // Escrevendo JSON na request
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Lendo retorno JSON da request
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
            e.printStackTrace();
            return null;
        }
    }
}
