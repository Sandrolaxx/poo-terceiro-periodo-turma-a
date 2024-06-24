package SEGUNDO_BIMESTRE.ListaAtividades.Lista4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        List<String> opcoes = List.of("OPÇÃO 1", "OPÇÃO 2");

        try {
            String opcao = (String) JOptionPane.showInputDialog(null,
                    "OPÇÃO 1 - LISTA DE CONVENIO\nOPÇÃO 2 - CONSULTA DE BOLETO",
                    "ESCOLHA UMA DAS OPÇÕES",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes.toArray(),
                    opcoes.toArray()[0]);

            switch (opcao) {
                case "OPÇÃO 1":
                    JOptionPane.showMessageDialog(null, "VOCÊ ESCOLHEU A OPÇÃO 1");
                    getConvenios();
                    break;

                case "OPÇÃO 2":
                    JOptionPane.showMessageDialog(null, "VOCÊ ESCOLHEU A OPÇÃO 2");
                    String consultarBoleto = JOptionPane.showInputDialog("O QUE DESEJA CONSULTAR ?");
                    getBoleto(consultarBoleto);
                    break;

            }
        } catch (Exception e) {

        }

    }

    protected static void getConvenios() {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJGS0xEdEkzSCt5WmZOWVFyQ3hHMjF6eGhFckpveDR0MVJJMHBUQlZUWTF4WnkxSGl3b3FxV2J5Rm5kdjI3aTdSRVYrZWZTYkUwL0lUaTZQaU5PUUh6bFVHckpRL1IwT21YWHZOY3NFYWlSL0VkbGl3VFJJR3o0a0lKQ0RyZmpLSHdhVlNOU0xucmEzYSt3TndwbGswN2prNHNkbUFobGx5Y2haUkpkeUtZRlZsWXIwSXVjV2NjNGhjS1hYYWdGQ3ArWTQzZEVESGR5cmZGNlUzZmhkdFZDc2RRTnphd3hHdzNMT1lMK3R0dEx4S05VU1VQN0tHMUJTa0gzOU9PSTZxck9rMGQ3VlVtK1QvbEErQmxlR2h6V0plUG5tTmRsZnZEV0hGVWJrek1YL3VJLytxMDhOcHZDRGR3UmFXWjFzNDdmcmloYWU0TkNCdWg1Tkgvd2FsbXJHYTVFMDlzS09xNE4rdDN5eGdLOENDalRzYTZENU5OMGNWY3k4ZmlSUXY2TFhkTlJZZWVSWlU3Tk1pS1I2SmR6VTFBQjIwaTUyVjJ2NFYwVVhYUloxRE4rOHk1TnFLNnI2bDVQODd3VVc1eGxhb3FSZllRdEVxZzN4YmtsYTFRQzBjTnhoZWZWN0VGaEhSYUk1Q1I0Tm5HRGxvS3pVbjhJU0RLQ3ZUME5aRy9IaHNCcS92b1piVDZKd3R6V0JFWjA5VjA0SGtWelFxNUZnekhESmdEMUQxYkUwWkwwSDFUMkJZQmVYbGx4NUdkR0MwekhUdFNQTGR2RGYxOEZWaFhRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZWJhYWQwYWI4MTNmNGI3ZGIwZDgiLCJleHAiOjE3MTkyNjI5MjYsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.YkYtIQjAn7k7VsblqqcVG9bYE0r_J67a9yACP5YYAFQ");
            connection.setDoOutput(true);

            int respostaConvenio = connection.getResponseCode();
            System.out.println(connection.getContent());

            if (respostaConvenio == HttpURLConnection.HTTP_OK) {
                System.out.println("Requisição OK");

                try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))){
                    StringBuilder resposta = new StringBuilder();
                    String linhaResposta;
                    while ((linhaResposta = br.readLine()) != null) {
                        resposta.append(linhaResposta.trim());
                    }
                    System.out.println("Resposta: " + resposta.toString());
                }

                
            }
        } catch (Exception e) {

        }

    }

    protected static void getBoleto(String linhaDigitavel) {
        try {
            // URL para a qual a requisição será enviada
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

            // Cria a conexão
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJGS0xEdEkzSCt5WmZOWVFyQ3hHMjF6eGhFckpveDR0MVJJMHBUQlZUWTF4WnkxSGl3b3FxV2J5Rm5kdjI3aTdSRVYrZWZTYkUwL0lUaTZQaU5PUUh6bFVHckpRL1IwT21YWHZOY3NFYWlSL0VkbGl3VFJJR3o0a0lKQ0RyZmpLSHdhVlNOU0xucmEzYSt3TndwbGswN2prNHNkbUFobGx5Y2haUkpkeUtZRlZsWXIwSXVjV2NjNGhjS1hYYWdGQ3ArWTQzZEVESGR5cmZGNlUzZmhkdFZDc2RRTnphd3hHdzNMT1lMK3R0dEx4S05VU1VQN0tHMUJTa0gzOU9PSTZxck9rMGQ3VlVtK1QvbEErQmxlR2h6V0plUG5tTmRsZnZEV0hGVWJrek1YL3VJLytxMDhOcHZDRGR3UmFXWjFzNDdmcmloYWU0TkNCdWg1Tkgvd2FsbXJHYTVFMDlzS09xNE4rdDN5eGdLOENDalRzYTZENU5OMGNWY3k4ZmlSUXY2TFhkTlJZZWVSWlU3Tk1pS1I2SmR6VTFBQjIwaTUyVjJ2NFYwVVhYUloxRE4rOHk1TnFLNnI2bDVQODd3VVc1eGxhb3FSZllRdEVxZzN4YmtsYTFRQzBjTnhoZWZWN0VGaEhSYUk1Q1I0Tm5HRGxvS3pVbjhJU0RLQ3ZUME5aRy9IaHNCcS92b1piVDZKd3R6V0JFWjA5VjA0SGtWelFxNUZnekhESmdEMUQxYkUwWkwwSDFUMkJZQmVYbGx4NUdkR0MwekhUdFNQTGR2RGYxOEZWaFhRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZWJhYWQwYWI4MTNmNGI3ZGIwZDgiLCJleHAiOjE3MTkyNjI5MjYsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.YkYtIQjAn7k7VsblqqcVG9bYE0r_J67a9yACP5YYAFQ");
            connection.setDoOutput(true);

            // JSON a ser enviado no corpo da requisição
            String jsonInputString = "{\n" +
                    "  \"barCode\": {\n" +
                    "    \"type\": 0,\n" +
                    "    \"digitable\": \"" + linhaDigitavel + "\"\n" +
                    "  }\n" +
                    "}";

            // Envia o JSON
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Verifica a resposta
            int responseCode = connection.getResponseCode();
            System.out.println(connection.getContent());
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("Requisição enviada com sucesso.");
                try (BufferedReader br = new BufferedReader(
                        new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
                    StringBuilder response = new StringBuilder();
                    String responseLine;
                    while ((responseLine = br.readLine()) != null) {
                        response.append(responseLine.trim());
                    }
                    JOptionPane.showMessageDialog( null,"Resposta: " + response.toString());

                }
            } else {
                System.out.println("Erro na requisição: " + responseCode);
            }

        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}
