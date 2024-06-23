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

        String[] opcoes = {"Listar Convênios", "Consultar Boleto", "Sair"};
        int escolha = JOptionPane.showOptionDialog(null, 
        "Escolha uma opção:", 
        "Opções", 
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
                System.exit(0);
                break;
        }
    }

    public static void listarConvenios() {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJhenBNK29rTnRISEVRbUQ5OHQyV1oxVlVRcG4zKzNmYVJwa3NqbzFtUDBwanRvOEYvd1VTS0lNSmJ2cVcrU25qeUlHZnFUR3plTGxSaFgwQ3o1TkxDUmdCQ1hJc0djWkJpMThqbWNZM0VnbkRWd0xmRlVVNFlEZ2ZYWmFFUGdsdENLVmV0cGE0YlREaXNMSlVVQitydjN5clhKaTJoS1o2K3owd1VROThvSG4rdmplcXNBM1d5b2p6WnRtVU9xbTQ2Y09nbDhETE4yTjdKQTBxOWRWM3ZTUWpIa0VQUEg3c0luUmZLQ3ZLVWZSeUx6UjkyZTA2TWJBLzNUVDBUcSttbkRSdWlYNThCYlRkSjNZZmRCbDA5TFUycWxBTVJmWHJxQ09PK004cmUrdWovenFnM29UdlF0YWxSRkdrTERvQTk5TVR2dWxJSDNqcU01NXRvRm5TU3MxQ3FyR05qQkJjSkRZN0syMGJqSE8ySWZJUEhuekVDWHdFb2p6dHlyM1o1MWN4OGJyQVhWNnFwakFsM3huQTRwOEhUQ2tZWVZrelcxOHlONDJ4dzFXaTQ4NW04MXRta1Z1d2NoQUc5TFFtbEw0cWtlcnhiRlJiZEkyYksvb1dWT0w5UVdFYVVqKzR2WXJ2U1NkUXp0dzZiN1V3QUN3QWdVQ0RDbUtXeExsVGE2WjhOVGc2UkROaXJaR25GM3U5OEFHSFV3cW9qRW92c3dNbVJkeXlmQnFqZmgyRklKc282WWxTaXpBVjE2eEU2NXRYSFhYRUpQSkUwY0JDMkpiMkhBPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZTBkNjI5YTU0NGIzNDE1ZDhlNGQiLCJleHAiOjE3MTkxODI3MDAsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.yqYUzCgtGYkjXNpggCkLxTO1e8TSynCmT-eHpzNPGx0");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            connection.disconnect();

            System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void consultarBoleto() {

        String linhaDigitavel = JOptionPane.showInputDialog(null, "Insira o código do boleto!");
        // Linha Digitável: 23793381286008301352856000063307789840000150000
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\r\n" +
                    "  \"barCode\": {\r\n" +
                    "    \"type\": 0,\r\n" +
                    "    \"digitable\": " +
                    "\"" + linhaDigitavel + "\"\r\n" +
                    "  }\r\n" +
                    "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJhenBNK29rTnRISEVRbUQ5OHQyV1oxVlVRcG4zKzNmYVJwa3NqbzFtUDBwanRvOEYvd1VTS0lNSmJ2cVcrU25qeUlHZnFUR3plTGxSaFgwQ3o1TkxDUmdCQ1hJc0djWkJpMThqbWNZM0VnbkRWd0xmRlVVNFlEZ2ZYWmFFUGdsdENLVmV0cGE0YlREaXNMSlVVQitydjN5clhKaTJoS1o2K3owd1VROThvSG4rdmplcXNBM1d5b2p6WnRtVU9xbTQ2Y09nbDhETE4yTjdKQTBxOWRWM3ZTUWpIa0VQUEg3c0luUmZLQ3ZLVWZSeUx6UjkyZTA2TWJBLzNUVDBUcSttbkRSdWlYNThCYlRkSjNZZmRCbDA5TFUycWxBTVJmWHJxQ09PK004cmUrdWovenFnM29UdlF0YWxSRkdrTERvQTk5TVR2dWxJSDNqcU01NXRvRm5TU3MxQ3FyR05qQkJjSkRZN0syMGJqSE8ySWZJUEhuekVDWHdFb2p6dHlyM1o1MWN4OGJyQVhWNnFwakFsM3huQTRwOEhUQ2tZWVZrelcxOHlONDJ4dzFXaTQ4NW04MXRta1Z1d2NoQUc5TFFtbEw0cWtlcnhiRlJiZEkyYksvb1dWT0w5UVdFYVVqKzR2WXJ2U1NkUXp0dzZiN1V3QUN3QWdVQ0RDbUtXeExsVGE2WjhOVGc2UkROaXJaR25GM3U5OEFHSFV3cW9qRW92c3dNbVJkeXlmQnFqZmgyRklKc282WWxTaXpBVjE2eEU2NXRYSFhYRUpQSkUwY0JDMkpiMkhBPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZTBkNjI5YTU0NGIzNDE1ZDhlNGQiLCJleHAiOjE3MTkxODI3MDAsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.yqYUzCgtGYkjXNpggCkLxTO1e8TSynCmT-eHpzNPGx0");
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

            JOptionPane.showMessageDialog(null, response.toString());

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
