import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Trabalho_web_java {

    

    public static void Erro() {

        JOptionPane.showMessageDialog(null, "ERRO");

    }

    public static void main(String[] args) {
        
        while (true) {

            try {

                
                String[] opcao = { "Convenios", "Boleto", "sair" };
                int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Escolha",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcao, opcao[0]);

                        
                switch (escolha) {
                    case 0:

                        getConvenio();

                        break;

                    case 1:
                        
                        postBoleto();

                        break;

                    case 2:
                        
                        System.exit(0);

                        break;
                    
                    default:
                        break;
                }

            } catch (Exception e) {
                Erro();
            }
        }
    }
                    
    public static String getConvenio() {

        try {
            //primeiro começamos com a URL, basicamente isso daqui que faz vc conseguir o direcionamento da web que tu deseja ir :) ...
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");
            //Abre uma conexão HTTP, que entendo não entendedo, basicamente liga o codigo com a url que teoricamente liga com web
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            //aqui basicamente tu vai ta definido oq cada coisa é...
            //O GET por exemplo, é uma requisição que vc só desejando só receber a informação tu não quer eviar nada pra analisar ou quanquer outra coisa, vc quer pegar uma informação com a web conctada...
            connection.setRequestMethod("GET");
            //e... basicamente tu vai ta definindo o cabeçalho de requisição, basicamente falando oq é o negocio tipo o json...
            connection.setRequestProperty("Content-Type", "application/json");
            //é basicamente o ingresso da informação, imagina que tu ta numa balada, vc quer conhecer essa balada, mas vc precisa do ingresso pra isso, token é basicamente isso, é o teu ingresso pra acessar a informação...
            connection.setRequestProperty("Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJGbDJOOGFubndrT05lYnhyU0ZOcUZJWWdKT3pyVHY5YUNOR2R4VjhUVFZXdDF2blQwZXZDZUJRWXZaWVFXQzQzSEpHeHNnN2RTTmI1R25pcE1tVE0rMjVSWFhYeGlaYUZFcHRXdjNpTWQvdkw1VXlVRktXYWdwZ0ZOeXBJYjJQOFN3SUFicFJzc2NIQktuRHM1KzlpSXV1Q0Q5ZUtPQzl5RFc1VGhMZUZYN1dGU1NKTjNXWkU4bmJ1OUpndDhmZm1SdkMya1JMNXhSbGx3K1lJeERqSEZPdDZOSlowZS9KTFpkZFpzYVA0aWJreVJoNHNxQlNabWc2d2xGTGZhWnYyYlozNHhoZmFpenVybVhOYm93STF3R21aV3lWVmJNdFlGKzFIMlNENEpodDk2bExuNWhOV2QxOEQvU0ljTU12VXZDYTJ2R3lxdDZGanQ3STIzd1BoTXZTWlE1b1BqSGRDSDNuNUZPTnNMb1hKTGlwUjloMTJHd1hwdGg2TXFYZVhPcHp6M3JKT09RclI4TGZXRFNHdDdCRkV1bi9ieXhJRU5uREFRLzdBSjFtRzM2MjRmeTAvbDJqL2ZqSGtqblQ5VzNSRCtzMVNWL1JOSUJkMExhUmJnZWdwVlJ6YlNrc2dsNEtIR3V5aDVQYUx6b2E0QnZyZVZQdTF3NlAvWHRYNDRRbWIxNEZKNmhwNm1WM1BRa05VNTJSUU9HUEhaZHAyWlBQMUhmZmJsaFZTWkFiRC91TklLY05vOWtiTXcxa04vUGFDc0RiNkViYnV3TmI1NWlESm5BPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMGIyMjljNjlmNDcwNGNhY2JkNWYiLCJleHAiOjE3MTkyNTg5NDYsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.K7P9FZdmBHWr8mYJW4ttfUYy5hyQHo-O0428ksoLx80");
                    
            //parabens se passou aqui, agora o sistema está lendo as informações....
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            //preparativos pra contruir as informação, ta basicamente pegando os materias...
            StringBuilder response = new StringBuilder();
            String line;
            
            //agora ta contruido(tão pequeno e já ta contruindo parece eu com minecraft :))...
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            
            //fechando o BufferedReader, vc não precisa mais dele já que ta lido e contruido...
            reader.close();

            //Fechando a conexão com o HTTP, tu já leu oq tinha pra lé então não precisa mais ta na web... 
            connection.disconnect();


            // Criamos um JFrame para exibir a resposta em uma caixa de diálogo.
            JFrame frame = new JFrame("Lista de convenio");

            // Mostramos a resposta (limitada aos primeiros 200 caracteres) em um JOptionPane, pq se não ia ta gigante igual o Vasco,e não consegui fazer do outro jeito, triste.
            JOptionPane.showMessageDialog(frame, response.toString().substring(0, 200), "CONVENIO",
                    JOptionPane.INFORMATION_MESSAGE);

            //não precisa retorna nada pq já foi dita a informação...
            return null;

        } catch (Exception e) {
            Erro();
            return null;
        }

    }

    public static void postBoleto() {

        try {

            //pedindo pro usuário informa o codigo... até agora só funcionou um então né....
            String cod_Boleto = JOptionPane.showInputDialog(null, "Digite o codigo do boleto");
            // codigo digitavel : 23793381286008301352856000063307789840000150000

            //URL CLASSICA
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

            //Mesma coisa de antes so que diferente, agora tu vai ta acessando uma api pra meio que confirma um pagamento de boleto... 
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            //toma json, lembrete caso o negocio não se arrume sozinho entra no : https://www.javaescaper.com..

            String str = "{\r\n" +
                    "  \"barCode\": {\r\n" +
                    "    \"type\": 0,\r\n" +
                    "    \"digitable\": " +
                    "\"" + cod_Boleto + "\"\r\n" +
                    "  }\r\n" +
                    "}";
            //agora mesma coisa de antes diferente, post basicamente tu vai ta mandando uma informação...
            connection.setRequestMethod("POST");
            //mesma coisa do outro o tipo e os negocio...
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJGbDJOOGFubndrT05lYnhyU0ZOcUZJWWdKT3pyVHY5YUNOR2R4VjhUVFZXdDF2blQwZXZDZUJRWXZaWVFXQzQzSEpHeHNnN2RTTmI1R25pcE1tVE0rMjVSWFhYeGlaYUZFcHRXdjNpTWQvdkw1VXlVRktXYWdwZ0ZOeXBJYjJQOFN3SUFicFJzc2NIQktuRHM1KzlpSXV1Q0Q5ZUtPQzl5RFc1VGhMZUZYN1dGU1NKTjNXWkU4bmJ1OUpndDhmZm1SdkMya1JMNXhSbGx3K1lJeERqSEZPdDZOSlowZS9KTFpkZFpzYVA0aWJreVJoNHNxQlNabWc2d2xGTGZhWnYyYlozNHhoZmFpenVybVhOYm93STF3R21aV3lWVmJNdFlGKzFIMlNENEpodDk2bExuNWhOV2QxOEQvU0ljTU12VXZDYTJ2R3lxdDZGanQ3STIzd1BoTXZTWlE1b1BqSGRDSDNuNUZPTnNMb1hKTGlwUjloMTJHd1hwdGg2TXFYZVhPcHp6M3JKT09RclI4TGZXRFNHdDdCRkV1bi9ieXhJRU5uREFRLzdBSjFtRzM2MjRmeTAvbDJqL2ZqSGtqblQ5VzNSRCtzMVNWL1JOSUJkMExhUmJnZWdwVlJ6YlNrc2dsNEtIR3V5aDVQYUx6b2E0QnZyZVZQdTF3NlAvWHRYNDRRbWIxNEZKNmhwNm1WM1BRa05VNTJSUU9HUEhaZHAyWlBQMUhmZmJsaFZTWkFiRC91TklLY05vOWtiTXcxa04vUGFDc0RiNkViYnV3TmI1NWlESm5BPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMGIyMjljNjlmNDcwNGNhY2JkNWYiLCJleHAiOjE3MTkyNTg5NDYsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.K7P9FZdmBHWr8mYJW4ttfUYy5hyQHo-O0428ksoLx80");
            //isso aqui é importante basicamente é vc ta confirmando a alteração...
            connection.setDoOutput(true);

            //Envio dos dados JSON no corpo da requisição
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = str.getBytes(StandardCharsets.UTF_8);

                os.write(input, 0, input.length);
            }
            
            //agora ta lendo e contruindo igual o que aconteceu antes(dale minecraft)...
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
           
            reader.close();

            connection.disconnect();

           
            JOptionPane.showMessageDialog(null, response.toString());

        } catch (Exception e) {
            Erro();
        }

    }
}