package segundobi.lista4.exercicioLista4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        exibirOpcoes();
    }

    public static void exibirOpcoes() {
        String[] opcoes = {"Listar Convênios", "Consultar Boleto", "Sair"};
        int escolha = JOptionPane.showOptionDialog(null, 
                "Escolha uma opção:", 
                "Menu Principal", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
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
            case 2:
                encerrarPrograma();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                exibirOpcoes();
        }
    }

    public static void listarConvenios() {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJCUHpHRE5KcjA1TytnVEkvcXRQR0RDZWFDNDhGRzhoWldJc1pvakpYcXVqYTR0SnFPeWYwOGc5ZWExVm4zWFZacUZMQ3lGVTBwL1pZR2lkRERNSTNTSmt5dTV0eHhwaG1YNU55c3J3aGdKU0pFWHdITnY3VE9RcFFWQmRqR3dGNHVUYlY3c1BacHk4Ym5UV3hwSTZnWjEvb2tNeHlrTmk1K0o0dTN0QlZlZmJEMmt5TnFsbThxd05qaFl4Q3RnOUpkVGtwWmtDc3djTXpvbS9GWkFIRXpnd01FTENJMS95S0hFUHNvbCtlOG1qMGVlQURsTThTUTdPR2VCRDdPQm9VNUd6c3FJUHY1OHo3UXNYREJhUFFEV2w0SmZwK1E1UXpKNFhrc0dDQXplSS84WWlnRnh2VjkxMGJzV2pQQ2FGamM3Vm1nY3l4TFUzN21jT21jSjhTaWJZamY4OUZQYkpqNnE2Zk9JK254dm10VVV2dUF4SGtKcTMycHEreUFkUnY2WVNwY0YwVlRQKzZtcjBXUUMvQjBYbmU1UjFJeW5KMjkzMVBOTlp3enk0dllXdW5zdUlyTXkzamxzN0FlTUNmRVludDdySTFyMmJNVFdLR3dGV1hDU2lQSTVpTnFabERzTk1JQnN0YlJ0TU1McExRZnFRSzJaY1dvQlVIdWZoZ1U0Y1NTRTQ4MlJFNVExVWpSdHlscHJuSDNoZjFsb2xLaTg3RXVnR2k3eUM2TkU3OTlpc1RYOWZWSWJ3aWtGWE9RUFpEdmlGSGhtbVpCVjdpdFpZWUNBPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZjUxZGFiMDgzMjg0NDU4N2JjNmUiLCJleHAiOjE3MTkyMDQyNjgsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.ihEKqQkCHRz_da3IkEAJvp_4NHFzJ0tZLMbsz9ixhWs");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            exibirMensagem("Convênios listados com sucesso:", response.toString());
        } catch (Exception e) {
            exibirErro(e);
        }
    }

    public static void consultarBoleto() {
        String linhaDigitavel = JOptionPane.showInputDialog(null, "Insira o código do boleto:");
        if (linhaDigitavel != null && !linhaDigitavel.isEmpty()) {
            try {
                URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                String json = "{\r\n" +
                        "  \"barCode\": {\r\n" +
                        "    \"type\": 0,\r\n" +
                        "    \"digitable\": \"" + linhaDigitavel + "\"\r\n" +
                        "  }\r\n" +
                        "}";

                connection.setRequestMethod("POST");
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setRequestProperty("Accept", "application/json");
                connection.setRequestProperty("Authorization",
                        "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJCUHpHRE5KcjA1TytnVEkvcXRQR0RDZWFDNDhGRzhoWldJc1pvakpYcXVqYTR0SnFPeWYwOGc5ZWExVm4zWFZacUZMQ3lGVTBwL1pZR2lkRERNSTNTSmt5dTV0eHhwaG1YNU55c3J3aGdKU0pFWHdITnY3VE9RcFFWQmRqR3dGNHVUYlY3c1BacHk4Ym5UV3hwSTZnWjEvb2tNeHlrTmk1K0o0dTN0QlZlZmJEMmt5TnFsbThxd05qaFl4Q3RnOUpkVGtwWmtDc3djTXpvbS9GWkFIRXpnd01FTENJMS95S0hFUHNvbCtlOG1qMGVlQURsTThTUTdPR2VCRDdPQm9VNUd6c3FJUHY1OHo3UXNYREJhUFFEV2w0SmZwK1E1UXpKNFhrc0dDQXplSS84WWlnRnh2VjkxMGJzV2pQQ2FGamM3Vm1nY3l4TFUzN21jT21jSjhTaWJZamY4OUZQYkpqNnE2Zk9JK254dm10VVV2dUF4SGtKcTMycHEreUFkUnY2WVNwY0YwVlRQKzZtcjBXUUMvQjBYbmU1UjFJeW5KMjkzMVBOTlp3enk0dllXdW5zdUlyTXkzamxzN0FlTUNmRVludDdySTFyMmJNVFdLR3dGV1hDU2lQSTVpTnFabERzTk1JQnN0YlJ0TU1McExRZnFRSzJaY1dvQlVIdWZoZ1U0Y1NTRTQ4MlJFNVExVWpSdHlscHJuSDNoZjFsb2xLaTg3RXVnR2k3eUM2TkU3OTlpc1RYOWZWSWJ3aWtGWE9RUFpEdmlGSGhtbVpCVjdpdFpZWUNBPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZjUxZGFiMDgzMjg0NDU4N2JjNmUiLCJleHAiOjE3MTkyMDQyNjgsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.ihEKqQkCHRz_da3IkEAJvp_4NHFzJ0tZLMbsz9ixhWs");

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

                exibirMensagem("Consulta de boleto realizada com sucesso:", response.toString());

            } catch (Exception e) {
                exibirErro(e);
            }
        } else {
            exibirMensagem("Operação cancelada.", "Você não inseriu um código de boleto válido.");
        }
    }

    public static void encerrarPrograma() {
        JOptionPane.showMessageDialog(null, "Encerrando o programa. Até logo!");
        System.exit(0);
    }

    public static void exibirMensagem(String titulo, String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void exibirErro(Exception e) {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro:\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
