package BIM2.aulas.lista4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;
public class Boletos {
    public static void main(String[] args) {
       try {
           //23793381286008301352856000063307789840000150000
           System.out.println(getBoleto());
       } catch (Exception e) {
           e.printStackTrace();
       }
   }

   public static String getBoleto() {
       try {
           // URL alvo da request
           String codigoBoleto = JOptionPane.showInputDialog("Insira o código do boleto");
           URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

           // criando conexão HTTP para a URL especificada
           HttpURLConnection connection = (HttpURLConnection) url.openConnection();

           // Dados json
           String json = "{\r\n" + //
                               "  \"barCode\": {\r\n" + //
                               "    \"type\": 0,\r\n" + //
                               "    \"digitable\": \"" + codigoBoleto +"\"\r\n" + //
                               "  }\r\n" + //
                               "}";

           // Configurar método e propriedades da conexão
           connection.setRequestMethod ("POST");
           connection.setRequestProperty ("Content-Type", "application/json");
           connection.setRequestProperty ("Accept", "application/json");
           connection.setRequestProperty("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJRbFdEK0x5SWZocEY1NFEwMGN1N2VNZ0pOUTFvK0FXMndDbXpDVGwrNVFxalRDd0dRZUh2VGs4NW5BZmRoSjVXWUlFNkJqU21hWGhoS1JGN2xmUFo4cHJNelRTd0xGQllvTFpnRmlYTCtwNG1tUzhXRlQyeVNITTVVUDhXQXZRY21YNUR0ZTI3ZzVlZnk1RE1hT0RuMXFrMW9YZzZPa2t5bTlSYlZtdjlEME1yMlZuYUt5SlRmNWZ4c2F3RzdQVzZET2tLZ1NQUFd2Y2tuL0Z1S3FaSGN1YTdqZlRjVE4yR3RTanFqRXZNL2pjSmhtRGN3ck44eWZnY3NCRlBDRXhQeFE1TW5UMUdTMW1mK3VPU2U5L1VzZ3RXTjZmd1hPSE96VHlXbklkRjNaWDFKL2ZzeG9LYTdtcEpycFg0aERxdHc1Q0EvQlBPdllKTmJjRjZETFhaNzFDVFVxcHZDUmtCSm9vRng2T0VCQXRWZTBMMVJpSG9HMzhCT1ZHTnJJOXQyNUZKNjlGL3hkanc1V3E4dHlYZ05DWmNYRUdzV3A5eUNxUndrU2RmTmZkZXY5TXRPWmFiTW1GTmhzR0J5SmtNYUlNRmVlN1RPV2RqeGRpVkpQbDd5dlN3cnl1eDlmOXZobEZnd1BySWl1ZnNVbHVacVRNNWdhV2NUUVkvWnFkZVNKQi9URnd2ZmVSNzlNMEE2L2gzblVydy80VXZ2L1NCdG5rVlVQSnZ6TVVkcTdQNE02OUJGZC9jQ3FoV0RTcHZkbUVldVpXT3h1anNvR2UwY1g1aHpBPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZTQxMjNlODEwYWFmNDM3YmFjZDMiLCJleHAiOjE3MTkyNjk2NTcsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.5jgFKc7YeUDWKR335NcYEVfzIEd3TnuqRQleKbVMI6Q");
           //Setar dados no body
           connection.setDoOutput(true);

           try (OutputStream os = connection.getOutputStream()) {
               byte[] input = json.getBytes(StandardCharsets.UTF_8);
               os.write(input, 0, input.length);
           }

           // lendo response
           BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
           StringBuilder response = new StringBuilder();
           String line;

           while ((line = reader.readLine()) != null) {
               response.append(line);
           }

           reader.close();

           // fechando a conexão
           connection.disconnect();
           String printOrganizado = response.toString().replace("\",\"","\",\n\"");
           JOptionPane.showMessageDialog(null, printOrganizado);
           return response.toString();
       } catch (Exception e) {
           e.printStackTrace();

           return null;
       }
   }
}
