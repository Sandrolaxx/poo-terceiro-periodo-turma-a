package TestesGetPost;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    private static final String TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiIvcGlRK1pYUHZaeFRsMmh2NGdYd1ZTeTJOb2dvRnR1NFh6aWNBTVpWTGlPaWhFRFBTdVRQQnpUbzJzYXpvejFQek9UUTFVSlJoSmhGR3k2RGFHZ2xsMnlkcitsS3p0dEZIZmVwb3pZQ2phdFczdVdjeHhRdUU3NzVKQUIwL3lTZlNZZHlRa1lwMnc1VUpHR2FtclVHbTZNWXFiMzZHeHc4cjUwL0E0MjFhRTN4K2d1eDhlSTJ4RStNcVV4TEYxVVVxbVp6UXlkOTJrRmhRbk5kSlVTSzkyV3JuVGx2V3VqQmxHWWZHejE1THA5MmJiUHdSODB0bkF5ekZ6MnNDZEo5azRBQUUvTE5JaTRnT0N2dStTYzhyY2ExQ1VrWXhKZXdLNDJDN0k4QjJjMitpUzYxdDlwc2hERnMrbjB5aVQ4Q3VHWmxlQnZoWlplOFlNT3d1SVFadVU5eDU4Nk5icS9PTGR3WnFGeDFWSXJPWnRjSlpqTEdqckZSNXdLNy9RaUJSQ1pNSXFGQWlrY2RrbGtoQ09KeVhCRUpjcVQ1RUdlNUloMVp1RWxmc1F3dzlLc2svZzVGNVU5QmwzV3NFUXExM29WTUVmM2tzc1hCT3FGU01sYzZiOHVmSzRXbHlaUC9TMzBXZmRYMUNEOE5sd0pZUm0vbVkzV3duZlJrNXVpNTNQeDBoRjdjeE8rYmlIQk1DRHNjT3Q4b3ZTY080eS9EeVYzakpKNlJuR0libWdkYUNEejlUU29GOTZLZmNEK1lXTGt3ZEVRRG9QSkJDRmtycXNpdDhRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiOGU4NDIxNmNlNDhiNDA3NmI3NGIiLCJleHAiOjE3MTkxODEzOTIsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.CEuo3WkqaRMIvlzr4ft1V1CAJ8cvx7b7jseUdf1bKZc"; //token real gerado pelo insomnia

    public static void main(String[] args) {
        while (true) {
            String[] options = {"Listar Convênios", "Consultar Boleto"};
            int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if (choice == 0) {
                listarConvenios();
            } else if (choice == 1) {
                consultarBoleto();
            } else {
                break;
            }
        }
    }

    private static void listarConvenios() {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + TOKEN);

            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                JOptionPane.showMessageDialog(null, response.toString(), "Convênios", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao listar convênios", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void consultarBoleto() {
        String linhaDigitavel = JOptionPane.showInputDialog("Digite a linha digitável do boleto:");
        if (linhaDigitavel != null && !linhaDigitavel.trim().isEmpty()) {
            try {
                URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize" + linhaDigitavel);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Authorization", "Bearer " + TOKEN);
                conn.setRequestProperty("Content-Type", "application/json");
                conn.setDoOutput(true);

                String jsonInputString = "{\"barcode\":\"" + linhaDigitavel + "\"}"; // constroi uma string JSON a partir da entrada do usuario
                try (OutputStream os = conn.getOutputStream()) {
                    byte[] input = jsonInputString.getBytes("utf-8");
                    os.write(input, 0, input.length);
                }

                int responseCode = conn.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    String inputLine;
                    StringBuilder response = new StringBuilder();

                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();

                    JOptionPane.showMessageDialog(null, response.toString(), "Resultado da Consulta", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao consultar boleto", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Linha digitável inválida", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}


