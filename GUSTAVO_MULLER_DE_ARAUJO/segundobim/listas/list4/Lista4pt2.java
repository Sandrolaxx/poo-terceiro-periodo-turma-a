package segundobim.listas.list4;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;

public class Lista4pt2 {

    public static void main(String[] args) {

        String[] opcoes = { "Consulta de Boleto", "Listar Convenios", "Sair" };
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        switch (escolha) {
            case 0:
                consultaBoleto();
                break;

                case 1:
                listaConvenio();
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Saindo...");
                break;
            default:
                break;
        }
    }

    public static void consultaBoleto() {
            try {

                String linhaDigitavel = JOptionPane.showInputDialog("Digite a linha digitável do boleto:"); 

            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize"); 
            
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\r\n" + //
                                "  \"barCode\": {\r\n" + //
                                "    \"type\": 0,\r\n" + //
                                "    \"digitable\": \""+ linhaDigitavel + "\"\r\n" + // 
                                "  }\r\n" + //
                                "}"; // 
           
            connection.setRequestMethod("POST");  
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJyRlhTdS9FS3Rnb1lqVEtveGIrRk5kalRndHNtSUc2dmVib3l5QTN2T1p5d0ZVTXR6NTdhandMeXdEWEgvZ1M2dy9IUFI2OERPR21KbldtUjlEWFlZUWVQemsrUFk0MERYTnFmQkJmdHlLakN4SEVHUkIzSXlMdEM5WFR0cEl6ZEdjUWYyTFd1ZWpCYkNkRXU5ZGNvc1ZBREU5UEFJYUdUQTJpRG80aUNuR3R0L010UWhRSW16b1ZQUW4wUGZpbnFnWExxbDhqYmlWc0FYOFkxS3VQWGkyS1VicFVUT3UvdTNaSDVzN2wzZUdZWjFaMG16L1hRUGhndk9hQmFybXRMdldzRjU0SGN2Y2ZZbGx3NVBsblB0MW5FdkdaY1NMem9RRGRFYTdMamxmZnVURERidXdraVY1azhpYnBRSkVsb2hNT0x2QWU4Z0dCT0tEOUI3QTZQMGVTaSt0TUhiUUQraDZsQmRtbXd3Z0ExcWx4amp5M3RSL29uZU90TS83V1JPUDl6ZkJSdnAvcXA0L1NpUjc2UlNvWkRpWDdvQVlNcGpPMDRiMDQ5eDhGekV6Y1F4ZG1FYUozS2J4SmFPbjZkNkVpbmY0eVE5TmxCMjNIZkk2cHRtdXJEWEI4UzV4dmV2Z0RMVmxHcDJtSFJKemZ5UVAvbW12TTE0T1FUTlltbHlkVGN3QnNCdXpVNGhrZWYvSkF5ZXZDMmRScktZWTI1ZzNweUNBQkNpeFZxRExtZWs3WEM4WXoxVDc3dUFvUHpzTmd5YWlLbXAwdUN2Ymk2YWh6cjFnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiM2M1NmI2ZGMxYWE3NGY5OTllNjUiLCJleHAiOjE3MTkyNzcwMDUsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.s42QUYGralVHPG72-wmylEQyjkQGt__bympxL1NP7Tg");
            connection.setDoOutput(true);

         try (OutputStream os = connection.getOutputStream()) {
            byte[] input = json.getBytes(StandardCharsets.UTF_8);
            os.write(input, 0, input.length);
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
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

    public static void listaConvenio () {
        try {
            //!URL alvo da request
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJxV3EvSHVob3htOERWMjdHMnNSY3Vvb3dtYzJKZGV1OVpPVkVLQ0VmWUVmViszWFVlSDJzWS9uT2FOWmxEd0J3NkNVMnpNaGo1MnZ2WHN1VGw3TWNONEh2YkM2S1FIWkpVL0ZraDZGMUtDUG9oMVNHKzFkTVJyRCs1L0RJK295bGR3QUd5Z05GT2Z1aWk0cUphK1BvQ2J4bTR1WTl2OUlCNW9lcGlzU1BqcHUyWnZTSTBaVHpkeUVzOEtBdmZiMDhEeDB1TVZBbzFxQ2NRcWdOMUNQeXUvZUxDSFppWWxTTW9YTktPd0NuTUs1QnBsR3E2anF4WFRQd2tUd2lQUjltQi9wcmp1cVFDK2p2WHNFdmljRE5XQXBqTytFTDc5TWdlWTB3VmVtaFY4bldQK0xEWTQ2N0lVd2Fuell0ZHhjN0hTbzljYzFjRWFpUkZ1U0VCMXh6QXFJeVRUeXNKZVptQm9RaVBKRklURytTQkxMdGwwZkFIVVFpZDVnblBoV0ZmWWZtcjJGQlRoMnZwWjBjSCtlQlNHQk1oZkhucWFmcU5lU2RYeFdER0dHVWllaHNlVlBTU1FDbkRDM2p2bU9GVkZHTFRpWVJzTjRMOWJremVoai9kdyszWlpjQld3M3dPTTNnZWR0c0d5WVJXclIxTDZIRUkxTE5xa2UyTTJxTkFCRTRScGVXV1Q1bzgyZlV5TWVJOTVVSVFmVVRXZkRlYUl5Q3FMTFVsVmpvNUg4MXRrQndicnZabDNKbFF2dXhMZmEzRjBvS25qbklrL1hBeEZLanZRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMTliZmRmZGQ5MWQyNGVkZmJhZmUiLCJleHAiOjE3MTkyNzcwMjEsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.QIT8puImrjkfnPzwcN_2hYC96f9w8r8kfYlJbYiYnR8");

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
}


   

