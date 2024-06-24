package listas.lista4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class ConsultaBoleto {
    public static void main(String[] args) {
        consultarBoleto();
    }

    public static void consultarBoleto() {
        try {
            String linhaDigitavel = JOptionPane.showInputDialog("Informe a linha digitável:");

            // URL da API de consulta de boletos
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");
            // Abre conexão HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        

            String json = "{\r\n" + //
                                "    \"externalTerminal\": \"Terminal de identificação externa do sistema do cliente, Ex: CPF\",\r\n" + //
                                "    \"externalNSU\": 0, //Identificador da transação do sistema cliente\r\n" + //
                                "    \"barCode\": {\r\n" + //
                                "        \"type\": 2,\r\n" + //
                                "        \"digitable\": \""+linhaDigitavel+"\",\r\n" + //
                                "        \"barCode\": \"\"\r\n" + //
                                "    }";
        
            connection.setRequestMethod("POST");
            connection.setRequestProperty("accept", "application/json");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiI3cXlwS25NelMrcTBRaGtRYm9pWXIwVm5YOE9paFMxN2JUZkJjcHY1cHpUc3ovT0JIWHJnbjFOYUp1UVJYUlhFZ0t2UzBnZzJzbG8yOHVlcUFRaG1kNDZJZ29Qd3JiRU9ocU9IODViMndEODF2Z1pwdVRwbk9ndjhaamFaTi9hM1JuKytwUXpzSkFNbkxoK1BrbmZlc0g2ZEdyZXB2RXVGUFpNTzFLazh5K0tYcG4zQkpHWjV6RE9EWm0rKzhNVDI1QVJ0NVBNZ3M5STY2Z3VKTStIWDdBbmwyUHdISHBadFMrMXRqdThwVmkzeFpqbzZCOW5mOVJxNFFtdjA2dEpIWXZkcEZEUExybWNjM242RUNYRHhkQmM1MHlhSVJoTHpvcFNEVzNPb1VuT0NGaHRaVFRIbEc1K1lEdDNUVURvam1uU3VGVUY1OUdpcmUxWENXMmhRS0dqN3hkS3V5OWRLeHZpT3NTYW9COThCZ1daVmV6Y0NBZXhjeG9Eelg5VzJJbHlBRVJBVm9QdXNyTEg3NDNkc1k5R2g2d0dzWHFHYVZ6c3daSGtZdmFGZTdVRUtjUEhGSWtkTVh0c21qRWNpNzlXUXBEMVhKVktQMld5akZHTEw4SDkycGhSNU1hMDVZOXdob0xqWUNkcktDU0svc2tpYWRFT0dtQnV5T2RRdnhONnhaNWZHNHVyWjF5ZHBJYmN5TFhGbXVtMzdtbVlaT0pmMGpCUU9kaDBCeHB3Y01taXRkaE0vL3o1RzNIWnliVVRxcnYwL2lkS0hlVWN3MnVOK3NRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiN2YyZGE2ZDE0MDVlNGM0M2E3YTIiLCJleHAiOjE3MTkyNjkxODUsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.gJ-srz9m8WcU56_f6TalyhALAGeQCesW_IOCZ0WBCzs");
            connection.setDoOutput(true);

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Lendo o retorno JSON da requisição e atribuindo em uma String
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            // Verifica o código de resposta
            if (connection.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + connection.getResponseCode());
            }

            String respo = response.toString();

            // Fecha conexão
            connection.disconnect();

            JOptionPane.showMessageDialog(null, "Detalhes do Boleto:\n\n" + respo , "Consulta de Boleto", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
