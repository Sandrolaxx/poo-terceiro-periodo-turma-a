package JOAO_OTAVIO_GARCIA.segundobi.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;

public class Prova2 {

    public static void erro() {

        JOptionPane.showMessageDialog(null, "ERRO");

    }

    public static void main(String[] args) {

        while (true) {

            try {

                String[] opcao = { "listar dados dos alunos", "novo testemunho", "sair" };
                int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Escolha",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcao, opcao[0]);

                switch (escolha) {
                    case 0:

                        getLista();

                        break;

                    case 1:

                        postTestemunho();

                        break;

                    case 2:

                        System.exit(0);

                        break;

                    default:
                        break;
                }

            } catch (Exception e) {
                erro();
            }
        }
    }

    public static String getLista() {

        try {
            
            URL url = new URL("  https://poo-exam.vercel.app/api/students");
            
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            
            connection.setRequestMethod("GET");
            
            connection.setRequestProperty("Content-Type", "application/json");
           

            
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            
            StringBuilder response = new StringBuilder();
            String line;

            
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            
            reader.close();

            
            connection.disconnect();

            

            System.out.println(response.toString());

           
            return null;

        } catch (Exception e) {
            erro();
            return null;
        }

    }

    public static void postTestemunho() {

        try {
            
              
              
              String urlfoto = JOptionPane.showInputDialog(null, "URL da foto");
              
              
              String descricao = JOptionPane.showInputDialog(null, "descrição");
             
              String ra = JOptionPane.showInputDialog(null, "sua RA");
              
              
             
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            String str = "{\r\n" +
            "  \"imageUrl\": \""+urlfoto+"\",\r\n" +
            "  \"description\": " +
            "\""+descricao+"\",\r\n" +
            "  \"ra\": \""+ra+"\"\r\n" +
            "}";
         
            connection.setRequestMethod("POST");
           
            connection.setRequestProperty("Content-Type", "application/json");

            connection.setDoOutput(true);

            
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = str.getBytes(StandardCharsets.UTF_8);

                os.write(input, 0, input.length);

            
            connection.disconnect();


             BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            
            StringBuilder response = new StringBuilder();
            String line;

            
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

           
            reader.close();



            JOptionPane.showMessageDialog(null, "Esta feito");

            
            }

        } catch (Exception e) {
            erro();
        }

    }
}
