package primeirobi.ListasExc;

import java.io.OutputStream;
import java.net.URL;
import java.io.BufferedReader;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.nio.charset.StandardCharsets;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class Lista4PT2_2B {
    public static void main(String[] args) {
        String menuOpcoes = JOptionPane.showInputDialog(null,"/:=== Menu ===:/\n 1 - Lista de convênios\n 2 - Consultar boletos\n 3 - Sair","OPÇÕES",JOptionPane.QUESTION_MESSAGE);

        int escolhaOpcoes = Integer.parseInt(menuOpcoes);

        switch (escolhaOpcoes){
            case 1:
            ListaConvenio();
            break;

            case 2:
            GeradorConsulta(null, 20d);
            break;

            case 3:
            JOptionPane.showMessageDialog(null, "Você escolheu sair.");

            default:
            JOptionPane.showMessageDialog(null, "Opção inválida - Erro 404", "ERRO", JOptionPane.ERROR_MESSAGE);
               break;
        }
    }


    public static String ListaConvenio() {

        try {

            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET"); // Auth pode ser hardcoded

            connection.setRequestProperty("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJKNFJubVFyRWovQlJGeCs1YzZ4ZGFGM1d1TUh4NXBSdlV0T3dqSHNISGNhTlBnZmhwV1NGc0hKY1FCazV1SlVyYWN4azNOTVcwUzN2S004YVZ6TXZuTEZwQWRSTDc3OHVEOUZUZW1vb1A0Y0EwcnVyOHFuUklYaU16WXhFcG1sVDVsY2ZQV2Q4ancxNTBuVjdLNFp2V2tSNjJCZmorZFRPTy96WTBkUll4MHM5UzRoZ2xPaDNIWTJwMURlVm10d2g0L0FWajREaitLbnJqMFY5N3BDM2JBWnRVb1FCNmlBMlpWOGphYmNKWkVYZkVNVTZLc2Q5UTNJeDRDWUczeDRodEJkMW9MUzFpZEwwbzdlWFBSRGpGOUg3a2s0K1FReThKZmtvVWJkVTZ3ekYza2RzbldJa3A3UGlNc3lURHBXalR0cU9SVCtTMTRkVDJjSWZRV0xjNWlKMWdxazBZS0QxQzVDdFRNamJlZTBBZCs1dEdlVUc2RjZrU3EwRENtYXdYUzJTVXBFTmswMGc0NmJMaldlM2g4Z1h1OWtxTGlPaC85d1huMTUzc2tzTXhaalpwR0JUU2dWQkp1VGdHckczZnFrWkk2QzJUQVBzU29qZ212bmc5YTJCNWZNb3VFVkE4bDMwMldqWWZZbGx0eFZYeGhPdVpLTi9UQlpYZCs0bExUSkZmN2JDSjZEWUszOVJQOVFKbVpWUnRtYldJMlVhWGdYUVdHamFFTGZVeFVETmVBNmcxVGk0SWcwRksrcnowQlRQWjByemNkbVRZbmFYcUJQWGtRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZDU3NjMwZjA1OGE0NGRkZGI1YTQiLCJleHAiOjE3MTkyODQxNjEsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.MrpRZnit_jOT99VHbzZ5FpJlZOERnmInr1JbiBBWRI4");
           
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            connection.disconnect();


        JFrame frame = new JFrame("/:=== Lista de convênios ===:/\n");
        JOptionPane.showMessageDialog(frame, response.toString().substring(0, 200), "LISTA_CONVENIO", JOptionPane.INFORMATION_MESSAGE);
        
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null; 
    }


    public static void GeradorConsulta (String token, Double amount) {

        try {
            
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String digitable = JOptionPane.showInputDialog(null,"Insira um requerimento:","REQUERIMENTO",JOptionPane.QUESTION_MESSAGE);

            String json = "{\n" + //
                            "  \"barCode\": {\n" + //
                            "    \"type\": 0,\n" + //
                            "    \"digitable\": \""+digitable+"\"\r\n" + //
                            "  }\r\n" + //
                            "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");  // Auth pode ser hardcoded

            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJKNFJubVFyRWovQlJGeCs1YzZ4ZGFGM1d1TUh4NXBSdlV0T3dqSHNISGNhTlBnZmhwV1NGc0hKY1FCazV1SlVyYWN4azNOTVcwUzN2S004YVZ6TXZuTEZwQWRSTDc3OHVEOUZUZW1vb1A0Y0EwcnVyOHFuUklYaU16WXhFcG1sVDVsY2ZQV2Q4ancxNTBuVjdLNFp2V2tSNjJCZmorZFRPTy96WTBkUll4MHM5UzRoZ2xPaDNIWTJwMURlVm10d2g0L0FWajREaitLbnJqMFY5N3BDM2JBWnRVb1FCNmlBMlpWOGphYmNKWkVYZkVNVTZLc2Q5UTNJeDRDWUczeDRodEJkMW9MUzFpZEwwbzdlWFBSRGpGOUg3a2s0K1FReThKZmtvVWJkVTZ3ekYza2RzbldJa3A3UGlNc3lURHBXalR0cU9SVCtTMTRkVDJjSWZRV0xjNWlKMWdxazBZS0QxQzVDdFRNamJlZTBBZCs1dEdlVUc2RjZrU3EwRENtYXdYUzJTVXBFTmswMGc0NmJMaldlM2g4Z1h1OWtxTGlPaC85d1huMTUzc2tzTXhaalpwR0JUU2dWQkp1VGdHckczZnFrWkk2QzJUQVBzU29qZ212bmc5YTJCNWZNb3VFVkE4bDMwMldqWWZZbGx0eFZYeGhPdVpLTi9UQlpYZCs0bExUSkZmN2JDSjZEWUszOVJQOVFKbVpWUnRtYldJMlVhWGdYUVdHamFFTGZVeFVETmVBNmcxVGk0SWcwRksrcnowQlRQWjByemNkbVRZbmFYcUJQWGtRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZDU3NjMwZjA1OGE0NGRkZGI1YTQiLCJleHAiOjE3MTkyODQxNjEsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.MrpRZnit_jOT99VHbzZ5FpJlZOERnmInr1JbiBBWRI4");
          
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


            JFrame frame = new JFrame("/:=== Boletos pendentes ===:/");
            JOptionPane.showMessageDialog(frame, response.toString().substring(0, 200), "BOLETOS", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 }
