package segundobimestre.listas.Lista04Pt2;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class AplicacaoConvenios {

    public static void main(String[] args) {
        while (true) {
            String[] options = {"Listar Convênios", "Consultar Boleto", "Sair"};
            int choice = JOptionPane.showOptionDialog(
                    null,
                    "Selecione uma opção:",
                    "Menu",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            switch (choice) {
                case 0:
                    listarConvenios();
                    break;
                case 1:
                    consultarBoleto();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    public static void listarConvenios() {
        try {
            String jsonData = getJsonData();
            if (jsonData != null) {
                String formattedData = formatarTexto(jsonData, 40);
                JOptionPane.showMessageDialog(null, formattedData, "Convênios", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao buscar convênios.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar convênios.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void consultarBoleto() {
        String linhaDigitavel = JOptionPane.showInputDialog("Digite a linha digitável do boleto:");
        if (linhaDigitavel != null && !linhaDigitavel.isEmpty()) {
            try {
                String resultado = consultarBoletoExterno(linhaDigitavel);
                String formattedData = formatarTexto(resultado, 40);
                JOptionPane.showMessageDialog(null, formattedData, "Consulta de Boleto", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao consultar boleto.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Linha digitável não informada.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static String getJsonData() {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJNNE1sRW1rVXZnL3ZOUzUzMzBya2ZCZVZ1VkVWVlBnN1pYT3B6RUZtRmZUMVIyZU9XeDhHVWFDcXYzQTBvaDBUWmtKZnV0Z0hyZFpHYzRwYTZoYzlCVFM3TjBuUjNhRVk3aXk4MldVMkcrakJwMlh4c3kwekg5UVl4Z1B1VVlac2JEQVJ0TGVzS3l4aVVjVDZqS0VzWWc3bmNMT0pCK1JWZE8yTmRQa3dGbklOT3FSRnVNc3AwN2tVc2kwMWZKTmEvNlBMNFI0U016dVNYRTJtRUQ1aTFBclV1cjVtUnYwU2tuT0g5V1dOd3pwcGsrSUVmbG14MFIvTk9VRU9yNzF6N3hSdTRnYXVHemZkcHFXQmdOTEt0andaNW1RcG1VTmgrNE00c3k3VExLOXdYVHJIeStFV1VUWjZ0UW5JckNjT2ppa0RZU29kVXFNSUJtWmFHVEt1bVRPNlpFS3kzbDd4blVYSzMxWVo4Z0N2b254ZUt6d0Q0QkFleUJYcUZhdkhpTk5xV0Y4b0pXZyszeVVmcEVSYmFsMHJwYWpXbS85Nkd2RExDWEhKS2RIL3Z0dFBVZE1pZXZnUnN5bkJrcDg3VUFyNHFLOXhyTmlmZ1lqUW5LZExLZnE1bHNGRDQrNlpnYmFGMG9GQ0dnKzFXMXp0eUNRQVVVNHZnL3Axb3VxcGd3bHpBM296RE4xRGY4ZDFTSVN1SURnanF1akE2akZZQmFHeUVYcHcwWHk4T1VxQ0NhNDhiZEhpNUFQMGN4Y1g2V0dVMVRZQXVzUnVCWVBIWmo2bFJnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNmJjODZmZmIxZjg5NGMxMzk2ZjIiLCJleHAiOjE3MTkyNTYzODMsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.PDxsv1brqpLdXSYEWz0WDx3p4z6lpI8Xe0l6gIEPtLA");
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

    public static String consultarBoletoExterno(String linhaDigitavel) {
            try {
                URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");
    
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    
                String json = "{\r\n  \"barCode\": {\r\n    \"type\": 0,\r\n    \"digitable\": \"23793381286008301352856000063307789840000150000\"\r\n  }\r\n}";
    
                connection.setRequestMethod("POST");
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJNNE1sRW1rVXZnL3ZOUzUzMzBya2ZCZVZ1VkVWVlBnN1pYT3B6RUZtRmZUMVIyZU9XeDhHVWFDcXYzQTBvaDBUWmtKZnV0Z0hyZFpHYzRwYTZoYzlCVFM3TjBuUjNhRVk3aXk4MldVMkcrakJwMlh4c3kwekg5UVl4Z1B1VVlac2JEQVJ0TGVzS3l4aVVjVDZqS0VzWWc3bmNMT0pCK1JWZE8yTmRQa3dGbklOT3FSRnVNc3AwN2tVc2kwMWZKTmEvNlBMNFI0U016dVNYRTJtRUQ1aTFBclV1cjVtUnYwU2tuT0g5V1dOd3pwcGsrSUVmbG14MFIvTk9VRU9yNzF6N3hSdTRnYXVHemZkcHFXQmdOTEt0andaNW1RcG1VTmgrNE00c3k3VExLOXdYVHJIeStFV1VUWjZ0UW5JckNjT2ppa0RZU29kVXFNSUJtWmFHVEt1bVRPNlpFS3kzbDd4blVYSzMxWVo4Z0N2b254ZUt6d0Q0QkFleUJYcUZhdkhpTk5xV0Y4b0pXZyszeVVmcEVSYmFsMHJwYWpXbS85Nkd2RExDWEhKS2RIL3Z0dFBVZE1pZXZnUnN5bkJrcDg3VUFyNHFLOXhyTmlmZ1lqUW5LZExLZnE1bHNGRDQrNlpnYmFGMG9GQ0dnKzFXMXp0eUNRQVVVNHZnL3Axb3VxcGd3bHpBM296RE4xRGY4ZDFTSVN1SURnanF1akE2akZZQmFHeUVYcHcwWHk4T1VxQ0NhNDhiZEhpNUFQMGN4Y1g2V0dVMVRZQXVzUnVCWVBIWmo2bFJnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNmJjODZmZmIxZjg5NGMxMzk2ZjIiLCJleHAiOjE3MTkyNTYzODMsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.PDxsv1brqpLdXSYEWz0WDx3p4z6lpI8Xe0l6gIEPtLA");
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

                String formattedData = formatarTexto(response.toString(), 40);
                return formattedData;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

    public static String formatarTexto(String texto, int caracteresPorLinha) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index < texto.length()) {
            sb.append(texto.substring(index, Math.min(index + caracteresPorLinha, texto.length())));
            sb.append("\n");
            index += caracteresPorLinha;
        }
        return sb.toString();
    }
}
