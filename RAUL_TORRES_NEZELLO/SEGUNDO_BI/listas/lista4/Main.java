package SEGUNDO_BI.listas.lista4;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;


import javax.swing.JOptionPane;


public class Main {
    @SuppressWarnings("deprecation")


    public static void main(String[] args) {


        List<String> opcoes = List.of("Listagem de convênios","Consulta de Boletos");


        String opcao = (String)JOptionPane.showInputDialog(null,
                                "Escolha uma opção",
                        "Lista 4",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opcoes.toArray(),
                        opcoes.toArray()[0]);
       
        if(opcao.equals("Listagem de convênios")){
            try {


                URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");


                HttpURLConnection connection = (HttpURLConnection) url.openConnection();


                connection.setRequestMethod("GET");
                connection.setRequestProperty("Accept", "application/json");
                connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJpZXNid29CSWpyUHlRSnA5anZ5WlJHaUg0d3Y3STc1TzE2Wnkyd21QOEhsSFY0UlZiSGJkTktOTzlvUldBekxDOWZ3N1QvaHN6c1RKc2hzckFxaWtJQm5xNC9JRTREQVVZOWVmdlc0b0lOcFNpVEFKSmcwcWNUd1lLMDRna0ozbTcwNUlYZCtidDBvZXV5Q3BnbklUc1RGM01rcmhibnBxRWlBRFJUTHFiaHNrTVRVY3VTVTZmMjcyUU5NQXpNQis3Y1pSWlFOZEVqaTQrZXdyckNiYWVkb0RJaFdNckJzQXQ2Z3lkOGY1UjJ1dXJIbG1wYzFVZWxZMDBqMU4zbC9IbUdIMDI1ajQvRG0vU2tYcnFMVFZQU0xnQkxkTmtUa0FYK0trZkZ4dzBjRkkwZDAyUko3bmhCcTZ6bVpEaW90K3RLVkE2Z1FQSWlDQ1JMaDE3YTdnb3YyM0l5ZjluVEtjc1lUbjlJSHRjVnkzeTArcTlHbk5pL21HRDU4ZmlLUGZ1MjZOdlF3N0tic2ptLy9McHFNekU1cnp3VXpDQlNhWTlBeEZBR1hBWThVS0g0SzlJZ2R2SnpRQWZRek5ucTN1ck4xZlBNWTl5QTZQK3ZhYkxLeXh3Mjc0Q3MxSmQrR1VFTys0UE4wdWxSYXoyU2lnaWJ2VTR4NVA5L092aEJhMmVYRS9NY1lNa2dNcC9pdE9KV2FrMzcvMHhyZjRmVlR5SFUwV0dyRmo1WGtxL2RoaWkrNlhTK3hJZWV5a0dOWDZvVVY1KzlGbWVFVVpXVC9IVndUT0x3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZWFkOTQ2NzFmNDIxNGY1MDk0ZWUiLCJleHAiOjE3MTkyNzU0MTQsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.j3HaqhcD5PEK9zP6M4uRpmh6rzpS35XssuM_M01f1TU");


               
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;


                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
   
                reader.close();
   
                connection.disconnect();
                // String formattedResponse = addLineBreaks(response.toString(), 40);
                JOptionPane.showMessageDialog(null, response.toString(), "Lista de Convênios", JOptionPane.INFORMATION_MESSAGE);


            } catch (Exception e) {


            }
        }
        if (opcao.equals("Consulta de Boletos")) {
            try {


                URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();


                connection.setRequestMethod("POST");
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setRequestProperty("Accept", "application/json");
                connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJpZXNid29CSWpyUHlRSnA5anZ5WlJHaUg0d3Y3STc1TzE2Wnkyd21QOEhsSFY0UlZiSGJkTktOTzlvUldBekxDOWZ3N1QvaHN6c1RKc2hzckFxaWtJQm5xNC9JRTREQVVZOWVmdlc0b0lOcFNpVEFKSmcwcWNUd1lLMDRna0ozbTcwNUlYZCtidDBvZXV5Q3BnbklUc1RGM01rcmhibnBxRWlBRFJUTHFiaHNrTVRVY3VTVTZmMjcyUU5NQXpNQis3Y1pSWlFOZEVqaTQrZXdyckNiYWVkb0RJaFdNckJzQXQ2Z3lkOGY1UjJ1dXJIbG1wYzFVZWxZMDBqMU4zbC9IbUdIMDI1ajQvRG0vU2tYcnFMVFZQU0xnQkxkTmtUa0FYK0trZkZ4dzBjRkkwZDAyUko3bmhCcTZ6bVpEaW90K3RLVkE2Z1FQSWlDQ1JMaDE3YTdnb3YyM0l5ZjluVEtjc1lUbjlJSHRjVnkzeTArcTlHbk5pL21HRDU4ZmlLUGZ1MjZOdlF3N0tic2ptLy9McHFNekU1cnp3VXpDQlNhWTlBeEZBR1hBWThVS0g0SzlJZ2R2SnpRQWZRek5ucTN1ck4xZlBNWTl5QTZQK3ZhYkxLeXh3Mjc0Q3MxSmQrR1VFTys0UE4wdWxSYXoyU2lnaWJ2VTR4NVA5L092aEJhMmVYRS9NY1lNa2dNcC9pdE9KV2FrMzcvMHhyZjRmVlR5SFUwV0dyRmo1WGtxL2RoaWkrNlhTK3hJZWV5a0dOWDZvVVY1KzlGbWVFVVpXVC9IVndUT0x3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZWFkOTQ2NzFmNDIxNGY1MDk0ZWUiLCJleHAiOjE3MTkyNzU0MTQsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.j3HaqhcD5PEK9zP6M4uRpmh6rzpS35XssuM_M01f1TU");
                connection.setDoOutput(true);


                String digitavel = JOptionPane.showInputDialog(null, "Insira a linha digitável que deseja consultar", "Consulta de Boletos", JOptionPane.QUESTION_MESSAGE);
                String json = "{\r\n" +
                        "  \"barCode\": {\r\n" +
                        "    \"type\": 0,\r\n" +
                        "    \"digitable\": \""+digitavel+"\"\r\n" +
                        "  }\r\n" +
                        "}";


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


                String formattedResponse = addLineBreaks(response.toString(), 40);
                JOptionPane.showMessageDialog(null, formattedResponse, "Consulta de Boletos", JOptionPane.INFORMATION_MESSAGE);


            } catch (Exception e) {


            }
        }
    }
    private static String addLineBreaks(String text, int lineLength) {
        StringBuilder formattedText = new StringBuilder();
        int len = text.length();
        for (int i = 0; i < len; i += lineLength) {
            if (i + lineLength < len) {
                formattedText.append(text, i, i + lineLength).append("\n");
            } else {
                formattedText.append(text, i, len);
            }
        }
        return formattedText.toString();
    }
}




