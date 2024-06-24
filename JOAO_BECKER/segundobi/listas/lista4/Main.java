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
        int x = 1;
        String[] opcoes = { "Listar convênios", "Consulta de boleto","Sair"};
        while(x==1){
            String opcao = (String) JOptionPane.showInputDialog(null,"Ensira os dados:", null, JOptionPane.QUESTION_MESSAGE, null,opcoes, opcoes[0]);
            switch (opcao) {
                case "Listar convênios" :
                    System.out.println(listagemConvenios()); 
                    break;
            
                case "Consulta de boleto":
                    System.out.println(consultaBoletos());
                    break;

                case "Sair":
                    JOptionPane.showMessageDialog(null,"Saindo", "", JOptionPane.INFORMATION_MESSAGE);
                    x=0;
                    break;
            }
        }
    }
    
    public static String listagemConvenios(){
        try{
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");
            
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type","application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJ5WWtUOW5IZ2ZGL1cycjFmaFhGV2JuaTdydkpQQ0pJc3BPTC93OEs2YzlQU3dBQ25QcHNadnVDYnVTY2dEMTAvMVVoWDJtZkNNc0pKcWdwQ0FnU1czNEhvaDBDdkQ1bDlvb0E2VEFueEdUSW9STXFZVXVpMU5uSlFLandqbDlaMHozSmdlV1ZKR2YyYzdDTmdvd1hLY3djbXNOWFVYd2srVDNya0NoV1VKelBGNGpIeURrMWg3aUpDQjJXVVpNUEYxd1p1RHB1Wms2S2k0R0FBWDVCejc5YlBBTjRFQ2Z5YVR5SjR2TkxNRTRpKytzd3lkYlNvQ3JIZ2pIWnEzU3U1a3B6Wk5rZGRySG1XZDJ0NkRQOWoybHJaeUs1TXdTazAzMS9FdndCSjg2ZFlWNmhWdGQycWxNa1M1R3Z0N1daNVhDLzNjQ0lXUHZ2MVZmUXJVelJ6WEtrbXhTQ2kxZEVNZm1iY0krcUh1RDV3bXpLM2RXa3NNOC85eDBFQjBrMWFLallsZ2JkTFd0ZWJPYzlHR1M3VmZtZFoyRW1XSE4zL0hWWjF5VTc4SS9HVHVDODZSbE9NZHg2eW1JV2hLb0FBRUErTXhPdVYyYkJwSk1OWkVvbnlkRXZQdmkzVzBiQUFJZ2tDbVl4WTg4MUlGUXhzOWR5ZGFYenFZbU42SjNiZ2JzOUU4L1lSMEZVNUJlNHlheHk4alpDTW5YUFd1M1RjalJNZkZkVXVWWlJJVHRuQmQ5UXk1bEtoY0trWjV4a0t4bE5PbVF6MllBZ2V6SzluNkF3bnN3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMjRhZTU2MWIwM2I4NDZlZTg5NzIiLCJleHAiOjE3MTkyNDY5NjcsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.GMOYhoDS0kDgK6IgrgSrqBTM92nS1Bxq3diNtjOGj34");
            BufferedReader reader = new BufferedReader(new InputStreamReader((connection.getInputStream())));
            StringBuilder response = new StringBuilder();
            String line;

            while((line = reader.readLine()) != null){
                response.append(line);
            }

            reader.close();

            connection.disconnect();

            return response.toString();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }


    
    public static String consultaBoletos(){
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
            connection.setRequestProperty("Content-Type","application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJ5WWtUOW5IZ2ZGL1cycjFmaFhGV2JuaTdydkpQQ0pJc3BPTC93OEs2YzlQU3dBQ25QcHNadnVDYnVTY2dEMTAvMVVoWDJtZkNNc0pKcWdwQ0FnU1czNEhvaDBDdkQ1bDlvb0E2VEFueEdUSW9STXFZVXVpMU5uSlFLandqbDlaMHozSmdlV1ZKR2YyYzdDTmdvd1hLY3djbXNOWFVYd2srVDNya0NoV1VKelBGNGpIeURrMWg3aUpDQjJXVVpNUEYxd1p1RHB1Wms2S2k0R0FBWDVCejc5YlBBTjRFQ2Z5YVR5SjR2TkxNRTRpKytzd3lkYlNvQ3JIZ2pIWnEzU3U1a3B6Wk5rZGRySG1XZDJ0NkRQOWoybHJaeUs1TXdTazAzMS9FdndCSjg2ZFlWNmhWdGQycWxNa1M1R3Z0N1daNVhDLzNjQ0lXUHZ2MVZmUXJVelJ6WEtrbXhTQ2kxZEVNZm1iY0krcUh1RDV3bXpLM2RXa3NNOC85eDBFQjBrMWFLallsZ2JkTFd0ZWJPYzlHR1M3VmZtZFoyRW1XSE4zL0hWWjF5VTc4SS9HVHVDODZSbE9NZHg2eW1JV2hLb0FBRUErTXhPdVYyYkJwSk1OWkVvbnlkRXZQdmkzVzBiQUFJZ2tDbVl4WTg4MUlGUXhzOWR5ZGFYenFZbU42SjNiZ2JzOUU4L1lSMEZVNUJlNHlheHk4alpDTW5YUFd1M1RjalJNZkZkVXVWWlJJVHRuQmQ5UXk1bEtoY0trWjV4a0t4bE5PbVF6MllBZ2V6SzluNkF3bnN3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMjRhZTU2MWIwM2I4NDZlZTg5NzIiLCJleHAiOjE3MTkyNDY5NjcsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.GMOYhoDS0kDgK6IgrgSrqBTM92nS1Bxq3diNtjOGj34");
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

