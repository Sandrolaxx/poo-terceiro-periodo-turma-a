package RAFAEL_KAITO.BIM2.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class Testemunhos {
    public static void main(String[] args) {
       try {
           System.out.println(getTestemunho());
       } catch (Exception e) {
           e.printStackTrace();
       }
   }

   public static String getTestemunho() {
       try {
           // URL alvo da request
           String imageURL= JOptionPane.showInputDialog("Insira a URL da sua foto");
           String description = JOptionPane.showInputDialog("Insira a seu testemunho");
           String ra = JOptionPane.showInputDialog("Insira seu RA de aluno");
           URL url = new URL("https://poo-exam.vercel.app/api/testimonial");

           // criando conexão HTTP para a URL especificada
           HttpURLConnection connection = (HttpURLConnection) url.openConnection();

           // Dados json
           //String json = "{\r\n" + //
                            //  "  \"imageUrl\": \"https://avatars.githubusercontent.com/u/161254640?s=400&u=3a64baedef84d1e457bffa63bfc9a2bb704b9c18&v=4\",\r\n" + //
                             // "  \"description\": "+description+",\r\n" + //
                             // "  \"ra\": "+ra+"\r\n" + //
                            //  "}"; 
                          
            String json = "{\r\n" + //
                                "  \"imageUrl\": \""+ imageURL +"\",\r\n" + //
                                "  \"description\": \""+description+"\",\r\n" + //
                                "  \"ra\": \""+ ra +"\"\r\n" + //
                                "}" ;

           // Configurar método e propriedades da conexão
           connection.setRequestMethod ("POST");
           connection.setRequestProperty ("Content-Type", "application/json");
           connection.setRequestProperty ("Accept", "application/json");
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
