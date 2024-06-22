package primeirobi.atividade2.AtividadeListaUM.AtividadeListaQuatro;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
public class Main {
    public static void main(String[] args) {
        String comeco = JOptionPane.showInputDialog(null,"Escolha uma opcao 1:Lista de convenio , 2 consultar boleto , 3 sair","opcoes",JOptionPane.QUESTION_MESSAGE);
        int opcao = Integer.parseInt(comeco );
        switch (opcao){
            case 1:
            getJsonData();
            break;
            case 2:
            genQRCode(null, 20d);
            break;
            default:
            JOptionPane.showMessageDialog(null, "ERRO", "404", JOptionPane.ERROR_MESSAGE);
               break;

        
        }
    }

    public static String getJsonData() {
        try {
            //URL alvo da request
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

            //criando conexão HTTP para a URL especificada
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            //config método da requisição(GET)
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJLa0hKWUdURm1UaW5mVlAxbEE2bHRENmdCR0Vsc2N0bVgycnZVY0FUWkZOOEppQlZBeHJDamxnb2VYWUE0cTczQUE5WVJFdDFLRXBiOXZFL2JuQ01JWGVlZUdyWFp1LzkwRDVzV1NBUkhwem14ak4yaHRvUWtSVWtCRW94aDUrWHhFUFlJTFBXLzMrLytaZnJ0L0JPQzVUc0hOd3JtOWhBdzJYZGFLcjVrdjl2d3JseGdON0N1R0UzVkd6STR0VjBSOXRaaldEbFYyVHZOUWJHWHdTWS9wRGllU0MyaXhpSHYxUGJEY2QyT3NCNzQvN1RvdnEySEZMeGJXREQrYXdkTGlUZ2RQamZVSXpyVmVuc0RUS0E1dzVJbXRlYkxUNXNwdjRDTXNrU0N1VUVOMFQwR0d3WC9TZjgrRzlscHZwSkVVbTR1ajFFaFhkMkJCdnIwRGVFelhpSzlodS9tY1ZmNzhtV3dack5zdERHZFA3QlRkckVaQVBmc1hDQ3pkR2hmNThFWFlrejQ1UEVVV0FmQXhKQXpvczVyaS92bHpqaFZ1c2hBdzZpai9PRzFiSDdLcDQxNDdOS2FDLzZjcDF0dlFpVk5jYy9jYVNQcGd4c1pSNyttVzVycGdrUUhtd2c4TUtIRGI5V0VrN3VYQk9RQmpIaldJeGVMMlA0d1UrZi9tVHVucTIyR01LcGlRakhYRXpqaEg3L0dpVHVscU5rd0NlNlVYeTY0aUpkK1BsRmZ1U3ZSSkplTDFiMHhTT1ZYUE5kRFZhc20xVWZZaHZZQ0YzMmV3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZTcxODk4YjgzNGNmNDQ2NTg0YmEiLCJleHAiOjE3MTkwMjg3NDcsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.0tRQ2FdpNxT2HMojc7XY5g1gUPUq0x_YNlDk8rBSB7A");
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

   
          JFrame frame = new JFrame("Lista de convenio");
        JOptionPane.showMessageDialog(frame, response.toString().substring(0, 200), "CONVENIO", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
        return null; 
    }

public static void genQRCode(String token, Double amount) {
    try {
        // DEFINE A URL DA REQUISIÇÃO
        URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

        // CLASSE AUXILIAR PARA REALIZAR REQUEST HTTP
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        String digitable = JOptionPane.showInputDialog(null,"coloque o codigo de requirimento: 23793381286008301352856000063307789840000150000","Requirimento",JOptionPane.QUESTION_MESSAGE);

        // Dados do json -- Caso seu VS code não idente utilizar https://www.javaescaper.com
        String json = "{\n" + //
                        "  \"barCode\": {\n" + //
                        "    \"type\": 0,\n" + //
                        "    \"digitable\": \""+digitable+"\"\r\n" + //
                        "  }\r\n" + //
                        "}";

        // REALIZA A CONFIGURAÇÃO DA REQUEST
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Accept", "application/json");
        connection.setRequestProperty("Authorization", "Bearer  eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJLa0hKWUdURm1UaW5mVlAxbEE2bHRENmdCR0Vsc2N0bVgycnZVY0FUWkZOOEppQlZBeHJDamxnb2VYWUE0cTczQUE5WVJFdDFLRXBiOXZFL2JuQ01JWGVlZUdyWFp1LzkwRDVzV1NBUkhwem14ak4yaHRvUWtSVWtCRW94aDUrWHhFUFlJTFBXLzMrLytaZnJ0L0JPQzVUc0hOd3JtOWhBdzJYZGFLcjVrdjl2d3JseGdON0N1R0UzVkd6STR0VjBSOXRaaldEbFYyVHZOUWJHWHdTWS9wRGllU0MyaXhpSHYxUGJEY2QyT3NCNzQvN1RvdnEySEZMeGJXREQrYXdkTGlUZ2RQamZVSXpyVmVuc0RUS0E1dzVJbXRlYkxUNXNwdjRDTXNrU0N1VUVOMFQwR0d3WC9TZjgrRzlscHZwSkVVbTR1ajFFaFhkMkJCdnIwRGVFelhpSzlodS9tY1ZmNzhtV3dack5zdERHZFA3QlRkckVaQVBmc1hDQ3pkR2hmNThFWFlrejQ1UEVVV0FmQXhKQXpvczVyaS92bHpqaFZ1c2hBdzZpai9PRzFiSDdLcDQxNDdOS2FDLzZjcDF0dlFpVk5jYy9jYVNQcGd4c1pSNyttVzVycGdrUUhtd2c4TUtIRGI5V0VrN3VYQk9RQmpIaldJeGVMMlA0d1UrZi9tVHVucTIyR01LcGlRakhYRXpqaEg3L0dpVHVscU5rd0NlNlVYeTY0aUpkK1BsRmZ1U3ZSSkplTDFiMHhTT1ZYUE5kRFZhc20xVWZZaHZZQ0YzMmV3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZTcxODk4YjgzNGNmNDQ2NTg0YmEiLCJleHAiOjE3MTkwMjg3NDcsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.0tRQ2FdpNxT2HMojc7XY5g1gUPUq0x_YNlDk8rBSB7A");
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

        
         JFrame frame = new JFrame("BOletos pendentes");
        JOptionPane.showMessageDialog(frame, response.toString().substring(0, 200), "BOLETOS", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}