import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
    Integer menu = 1;
    while(menu==1){
        String opcao = JOptionPane.showInputDialog(null,"[1] - Listar convenios\n[2] - Consultar boletos\n[3] - Sair","",JOptionPane.QUESTION_MESSAGE);
        switch (opcao) {
            case "1":
                System.out.println(listagemConvenios());
                break;
    
            case "2":
                System.out.println(consultaBoletos());
                break;
    
            case "3":
                menu = 0;
                break;
        
            default:
                break;
        }
    }
    }

    public static String listagemConvenios() {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type","application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJ5eWcxR3hJTHlvRm9hNkRhVjRBN3RsRXFJbGVZMHdkdTZieWphN1g3cWEvejI0R2xWVmJkNWdCTHZJRUIrVkR2SzJiU3FTemRmZ1pCZE1qcCs0R2VVUGZSWVU3c3dDLzZicHZoY29TQXJlZThtWHZpSDM5TXY0aFkreGdNcDU2QnpVN2tFejA1ZXNDMW83L0N6ejU0WnNlVm1EcWRXS3J3R3pXOStoaUlKYVFMdUlNTjNaSEVMU1p6YmQwdkxoYlpUNFJWMUJGdml3cmJIV0ZUd0V1YmM2d1prdTdzM1BVaWFSamZQQy8xWjJLLzRyN0UrRWFCSktyVUFvYXBYVlRlMjQ3OFpyNVRmemVNem12QmdwcGtKb1E3UWNoVkRJSEQ2SjhUQnBld0pjSHBnSytPSloyanFGeUxyU3hseW56dUJXbkNJWXNwcVN0WDFyaFZPV1J0MHJYQ0VKbURzTnN2TTNrMEhrc0xGbFBPb3lHS0wzcXpDME5jZVV6M1JQc0hvbWJjVkFPVFQxelFianI1Z0lsOWVOT2tQcDI4L0l4LzZvQ3czd21MMlZIOGx3L0dyUU9yYkxlRFB6WFc2a1BWOXpwNEJSVmE2RnpvT1VDd3Q2a3plVytjRnVPOFE0VXZSaUNObHpBbHZPMVlCTVJxS05ZMitoM1lNMCsyNGc2UHJLQTQvMXVOaks2TzZsTTNwMVEwMm5BbzlxY2JFMUNUNFNKeDNyTDdaVXpNcUZwL3dKbkJZd1dHcmRGa0JObCs0TExYSzM2WXVNWUp1V2hzTUNsVURRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiYWRiZTgyNmM2NmVlNDgxMjkwMjAiLCJleHAiOjE3MTkyNzk2MTMsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.HW8AHRWBB3m0nir5HjaHwZWP2vb5fvnF4EK5gszqdHY");

            BufferedReader reader = new BufferedReader(new InputStreamReader((connection.getInputStream())));
            StringBuilder response = new StringBuilder();
            String line;

            while((line = reader.readLine()) != null){
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

    public static String consultaBoletos() {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\r\n" + //
                    "\t\"externalTerminal\":\"07122040409\",\r\n" + //
                    "\t\"externalINSU\":0,\r\n" + //
                    "\t\"barCode\":{\r\n" + //
                    "\t\t\"type\": 0,\r\n" + //
                    "\t\t\"digitable\":23793381286008301352856000063307789840000150000,\r\n" + //
                    "\t\t\"barCode\":\"3123145151512\"\r\n" + //
                    "\t}\r\n" + //
                    "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJ5eWcxR3hJTHlvRm9hNkRhVjRBN3RsRXFJbGVZMHdkdTZieWphN1g3cWEvejI0R2xWVmJkNWdCTHZJRUIrVkR2SzJiU3FTemRmZ1pCZE1qcCs0R2VVUGZSWVU3c3dDLzZicHZoY29TQXJlZThtWHZpSDM5TXY0aFkreGdNcDU2QnpVN2tFejA1ZXNDMW83L0N6ejU0WnNlVm1EcWRXS3J3R3pXOStoaUlKYVFMdUlNTjNaSEVMU1p6YmQwdkxoYlpUNFJWMUJGdml3cmJIV0ZUd0V1YmM2d1prdTdzM1BVaWFSamZQQy8xWjJLLzRyN0UrRWFCSktyVUFvYXBYVlRlMjQ3OFpyNVRmemVNem12QmdwcGtKb1E3UWNoVkRJSEQ2SjhUQnBld0pjSHBnSytPSloyanFGeUxyU3hseW56dUJXbkNJWXNwcVN0WDFyaFZPV1J0MHJYQ0VKbURzTnN2TTNrMEhrc0xGbFBPb3lHS0wzcXpDME5jZVV6M1JQc0hvbWJjVkFPVFQxelFianI1Z0lsOWVOT2tQcDI4L0l4LzZvQ3czd21MMlZIOGx3L0dyUU9yYkxlRFB6WFc2a1BWOXpwNEJSVmE2RnpvT1VDd3Q2a3plVytjRnVPOFE0VXZSaUNObHpBbHZPMVlCTVJxS05ZMitoM1lNMCsyNGc2UHJLQTQvMXVOaks2TzZsTTNwMVEwMm5BbzlxY2JFMUNUNFNKeDNyTDdaVXpNcUZwL3dKbkJZd1dHcmRGa0JObCs0TExYSzM2WXVNWUp1V2hzTUNsVURRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiYWRiZTgyNmM2NmVlNDgxMjkwMjAiLCJleHAiOjE3MTkyNzk2MTMsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.HW8AHRWBB3m0nir5HjaHwZWP2vb5fvnF4EK5gszqdHY");
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

            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
