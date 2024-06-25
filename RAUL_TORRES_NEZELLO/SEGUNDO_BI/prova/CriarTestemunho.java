package SEGUNDO_BI.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class CriarTestemunho {
    
    public static void criarTestemunho(){
        try{
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");
                    
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            String urlFoto = JOptionPane.showInputDialog(null, "Insira a URL de sua foto", "Prova", JOptionPane.QUESTION_MESSAGE);
            String ra = JOptionPane.showInputDialog(null, "Insira o RA do aluno", "Prova", JOptionPane.QUESTION_MESSAGE);
            String  descricao = JOptionPane.showInputDialog(null, "Insira a descrição", "Prova", JOptionPane.QUESTION_MESSAGE);


            String json =  "{\r\n"+
              " \"imageUrl\": \""+urlFoto+"\",\r\n"+
               " \"description\": \""+descricao+"\",\r\n"+ 
               "\"ra\": \""+ra+"\"\r\n"+
               "}";

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

        }   catch (Exception e) {
                   JOptionPane.showMessageDialog(null, "ERRO", "Prova", JOptionPane.ERROR_MESSAGE);
            }
    }
}
