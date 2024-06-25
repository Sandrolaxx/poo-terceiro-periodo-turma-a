import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class atvLista4{

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("ShowInputDialog - SelectOne");
        List<String> options_list = List.of("Lista convênios", "Consultar Boleto", "Sair");

        while (true) {

            String escolha = (String) JOptionPane.showInputDialog(frame, "Qual é a sua escolha?",
            "Operações", JOptionPane.QUESTION_MESSAGE, null,
            options_list.toArray(),
            options_list.toArray()[0]);

            switch (escolha) {
                case "Lista convênios":
                    System.out.println(listaConvenios());
                    break;

                case "Consultar Boleto":
                    String code = JOptionPane.showInputDialog(frame, "Digite o boleto: ", "Consultar Boleto", 1);
                    System.out.println(postBoleto(code));
                    break;

                case "Sair":
                    System.out.println("Até mais!");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }

    }

    public static String listaConvenios(){
        
        try{
        URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Authorization",
        "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJvb2lrM2xIYmZnejllTFl0bExYVUhxdnpzTDRRZUwySDVTRDJVTjZTTWU4MkV4dEFoZ3ZCNjF3L3NJOFc1WS9ZU3M2R1JqUUNpZHlTbVJHd3BiUC91L3NncXFMS3c1bFY0bXpGZ3RTRlc0MVhkYlZmemcvcHFxVHE0bHlpdDRXQ1lpVzlCUzVVV1JmeHJhcHZOT3VrcnhnQ0NkK3Y2VDBqQ0Y1S3I0WjBOcFp4Ny9mL0E3TTV0OUdGQW5DOEpwYzlJZVdwaERHcTc3K1NjMjdlY1RyUUl3T3duRk10dG44ejhLRDVESEh3OU5DTTkyMTZaaXpmMGw2eWxLUkhkV25IRHl5VmFPL1JGb2NTQm9JRVNNOFN4aTZRYXdOM2ZDVEFmY2xydFg4Y0JtRVB3dm9lRDFHWTVaQXU3akk0TUFJd1VqaWxKaTJaaEZkd0RHNkNnbmZoL1grZjlSRWtXM2xXWDZEaVYydUVlcUJaUjU0TDA1dlFjTWFOc1VHTE0xQkdScWFBR2dMVFF3aUhJdE1sRkFMQmxnM0l6cEVTQm5HOVN0SjJ2eGhkZ2dqMkVSSDFPUjIwVlN2WEprdExRZmJEeCszYVZlNmtBdjQvVlVFbWtYc2dEUDZncnI0NDFQcUVDcjlRN3BTRjRkb1hHaG1ZVExWNlcvWkE2N3E2Z1NUMGNOemRpZ21wcHRpRjRJSXdOL0pCMEx4RjZvWXdWYlQvb2lGazZLdjU2WG5HSFhKU2pyY210OHkyMmt1bnIxV3VYV3ZxZHRaeVRWa2d3bzlvejFpL2d3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiYzE4NWQ3M2YyZWIxNDVjODhjZWIiLCJleHAiOjE3MTkxNzE0NTcsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.-aMrlfUW3ekwByjdS5x3NHZx1m6hyMV2iHjdSPPskFE");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while((line = reader.readLine()) != null){
            response.append(line);
        }

        reader.close();
        connection.disconnect();

        return response.toString();

        }catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public static String postBoleto(String code){

        if(code == null){
            code = "23793381286008301352856000063307789840000150000";
        }

        try{
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");
    
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\r\n" + //
                                "  \"barCode\": {\r\n" + //
                                "    \"type\": 0,\r\n" + //
                                "    \"digitable\": \"" + code + "\"\r\n" + //
                                "  }\r\n" + //
                                "}";
    
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization",
            "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJvb2lrM2xIYmZnejllTFl0bExYVUhxdnpzTDRRZUwySDVTRDJVTjZTTWU4MkV4dEFoZ3ZCNjF3L3NJOFc1WS9ZU3M2R1JqUUNpZHlTbVJHd3BiUC91L3NncXFMS3c1bFY0bXpGZ3RTRlc0MVhkYlZmemcvcHFxVHE0bHlpdDRXQ1lpVzlCUzVVV1JmeHJhcHZOT3VrcnhnQ0NkK3Y2VDBqQ0Y1S3I0WjBOcFp4Ny9mL0E3TTV0OUdGQW5DOEpwYzlJZVdwaERHcTc3K1NjMjdlY1RyUUl3T3duRk10dG44ejhLRDVESEh3OU5DTTkyMTZaaXpmMGw2eWxLUkhkV25IRHl5VmFPL1JGb2NTQm9JRVNNOFN4aTZRYXdOM2ZDVEFmY2xydFg4Y0JtRVB3dm9lRDFHWTVaQXU3akk0TUFJd1VqaWxKaTJaaEZkd0RHNkNnbmZoL1grZjlSRWtXM2xXWDZEaVYydUVlcUJaUjU0TDA1dlFjTWFOc1VHTE0xQkdScWFBR2dMVFF3aUhJdE1sRkFMQmxnM0l6cEVTQm5HOVN0SjJ2eGhkZ2dqMkVSSDFPUjIwVlN2WEprdExRZmJEeCszYVZlNmtBdjQvVlVFbWtYc2dEUDZncnI0NDFQcUVDcjlRN3BTRjRkb1hHaG1ZVExWNlcvWkE2N3E2Z1NUMGNOemRpZ21wcHRpRjRJSXdOL0pCMEx4RjZvWXdWYlQvb2lGazZLdjU2WG5HSFhKU2pyY210OHkyMmt1bnIxV3VYV3ZxZHRaeVRWa2d3bzlvejFpL2d3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiYzE4NWQ3M2YyZWIxNDVjODhjZWIiLCJleHAiOjE3MTkxNzE0NTcsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.-aMrlfUW3ekwByjdS5x3NHZx1m6hyMV2iHjdSPPskFE");
            connection.setDoOutput(true);

            try(OutputStream os = connection.getOutputStream()){
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }
    
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
    
            while((line = reader.readLine()) != null){
                response.append(line);
            }
    
            reader.close();
            connection.disconnect();
    
            return response.toString();
    
            }catch(Exception e)
            {
                e.printStackTrace();
                return null;
            }

    }

}