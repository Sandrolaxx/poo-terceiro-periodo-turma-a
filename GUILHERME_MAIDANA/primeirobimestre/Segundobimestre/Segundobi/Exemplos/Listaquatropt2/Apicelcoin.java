package primeirobimestre.Segundobimestre.Segundobi.Exemplos.Listaquatropt2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Apicelcoin {
     public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog(null, 
        "Escolha uma opção: 1 - Para Listar Convênio  2 - Para Consultar Boleto , 3 - Para Sair ", 
        "Lista de Opções",
        JOptionPane.QUESTION_MESSAGE);
        int opcao = Integer.parseInt(entrada);
        switch (opcao) {
            case 1:
            listarConvenio();
                break;
            case 2:
            consultaBoletos(null, 20d);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Saindo...", "Sair", JOptionPane.ERROR_MESSAGE);
                break;
            default:
            JOptionPane.showMessageDialog(null, "Opção inválida", "Erro", JOptionPane.ERROR_MESSAGE);
                break;
    }
        
    }

    public static String listarConvenio() {
        try {
            //URL alvo da request
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

            //criando conexão HTTP para a URL especificada
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            //config método da requisição(GET)
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiI4WEFwbjJ0YjdudWsydEo5NUR3ajdNeFRTVWV4MXNzUVNBdFl3ZVppK1JtRXYxeHN1VXZUb1JUbHFrcXRaQTQxeEZoNnhVa2hybnR2VXhwQVZWTHFjNm8rWG5PVUNxYWJORm5TUzArT3NuRi92elYyNXJ3elFQTUk4aHpNR0dnRVVCeGdrM3NVUzMxUEE1aXpBamQ4T3AyblNIMjVpTENmTUdPN1BraXIvWTgxVnBZUEVlalBjR3FJWWlEQmJHTDJPd0l1RklCdjIrZmpNV1NwS1BhVGRDVmlXODgyWkdyeGFOdk1lSjQyekxHaklTZW5OR3p4dXVZUjdoVnpwMXpIQkIwVm5iN3p4TkJWeFNoQjY5TUpVOHYwdGZvWHl5NVFkK0pjaUpscHpnMnYxMUNxdHArRFNaUEJ6b2d4TTNvUG02R2FYZDlkSVM0K2FMUDVMSlpXbGNzZUZrR2RKT0x4anFYclZ4L2VYTlg1ZEpWc3RISWxZVTludWJ5Y091bWhtNmN2YTErVVhqSkJYRjFCVTcvNzgzNDZRbUhadWR4dm5VNlBLdFhwcUt3MWk3MGEzZURHeTgrc1orZUNzeXZvZlFyaVFTK3RwMlVqRXdRcCtNU1JUWEpoWkNKd3U5dGZDdEhaSFhKUEQyaktRU2MxZVhRR2s0UTZzMlRwZ0N5NDdiRmhIZWlNbXNyRzZzK1grazQyK0YwVWtyY2hXYU5RSWE5Rk8yZVo0dlBEOHhSQ1I1d0s5aTBlS2syRG5JWFNMdVFLKzdWSmIyS3IyemlWNWcrSFd3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiYjZkN2JlNWMzMThmNDE3Y2IyOGQiLCJleHAiOjE3MTkwMjg1MjQsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.bWkfcZudOkq1lg_rTzWRtea0sc7vbIhpXxfbtPC21RM");

            //lendo response
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            //fechando a conexão
            connection.disconnect();

            JFrame frame = new JFrame("lista convenio");
            JOptionPane.showMessageDialog(frame, response.toString().substring(0,200 ), "listar convenio", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public static void consultaBoletos(String token, Double amount) {
    try {
        // DEFINE A URL DA REQUISIÇÃO
        URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

        // CLASSE AUXILIAR PARA REALIZAR REQUEST HTTP
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        String linhadigitavel = JOptionPane.showInputDialog(null,"Entre com a linha Digitavel (23793381286008301352856000063307789840000150000)", "Digitave", JOptionPane.QUESTION_MESSAGE);
        // Dados do json -- Caso seu VS code não idente utilizar https://www.javaescaper.com
        String json = "{\r\n" + //
                        "  \"barCode\": {\r\n" + //
                        "    \"type\": 0,\r\n" + //
                        "    \"digitable\": \""+linhadigitavel+"\"\r\n" + //
                        "  }\r\n" + //
                        "}";

        // REALIZA A CONFIGURAÇÃO DA REQUEST
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Accept", "application/json");
        connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiI4WEFwbjJ0YjdudWsydEo5NUR3ajdNeFRTVWV4MXNzUVNBdFl3ZVppK1JtRXYxeHN1VXZUb1JUbHFrcXRaQTQxeEZoNnhVa2hybnR2VXhwQVZWTHFjNm8rWG5PVUNxYWJORm5TUzArT3NuRi92elYyNXJ3elFQTUk4aHpNR0dnRVVCeGdrM3NVUzMxUEE1aXpBamQ4T3AyblNIMjVpTENmTUdPN1BraXIvWTgxVnBZUEVlalBjR3FJWWlEQmJHTDJPd0l1RklCdjIrZmpNV1NwS1BhVGRDVmlXODgyWkdyeGFOdk1lSjQyekxHaklTZW5OR3p4dXVZUjdoVnpwMXpIQkIwVm5iN3p4TkJWeFNoQjY5TUpVOHYwdGZvWHl5NVFkK0pjaUpscHpnMnYxMUNxdHArRFNaUEJ6b2d4TTNvUG02R2FYZDlkSVM0K2FMUDVMSlpXbGNzZUZrR2RKT0x4anFYclZ4L2VYTlg1ZEpWc3RISWxZVTludWJ5Y091bWhtNmN2YTErVVhqSkJYRjFCVTcvNzgzNDZRbUhadWR4dm5VNlBLdFhwcUt3MWk3MGEzZURHeTgrc1orZUNzeXZvZlFyaVFTK3RwMlVqRXdRcCtNU1JUWEpoWkNKd3U5dGZDdEhaSFhKUEQyaktRU2MxZVhRR2s0UTZzMlRwZ0N5NDdiRmhIZWlNbXNyRzZzK1grazQyK0YwVWtyY2hXYU5RSWE5Rk8yZVo0dlBEOHhSQ1I1d0s5aTBlS2syRG5JWFNMdVFLKzdWSmIyS3IyemlWNWcrSFd3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiYjZkN2JlNWMzMThmNDE3Y2IyOGQiLCJleHAiOjE3MTkwMjg1MjQsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.bWkfcZudOkq1lg_rTzWRtea0sc7vbIhpXxfbtPC21RM");
        connection.setDoOutput(true);

        // ADICIONA O JSON A REQUEST
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = json.getBytes(StandardCharsets.UTF_8);

            os.write(input, 0, input.length);
        }

        // REALIZA A LEITURA DOS DADOS
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        reader.close();

        connection.disconnect();
        JFrame frame = new JFrame("Consulta Boleto");
        JOptionPane.showMessageDialog(frame,response.toString().substring(0,200 ),"Consulta Boleto",JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        e.printStackTrace();
        
    }
    
}
}