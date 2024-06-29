package HEITOR_FOLTRAN.segundobi.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;

public class Testemunho{
    
    public static void testemunho(){
        try{
            String raAluno = JOptionPane.showInputDialog(null, "Insira o RA");
            String recado = JOptionPane.showInputDialog("Insira a sua descrição");
            //https://avatars.githubusercontent.com/u/126490357?v=4 <- endereço da imagem
            String linkImagem = JOptionPane.showInputDialog("Insira o link da imagem");

            //URL da api mesmo
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String str = "{\r\n" +
   "  \"imageUrl\": \""+linkImagem+"\",\r\n" +
   "  \"description\": " +
   "\""+recado+"\",\r\n" +
   "  \"ra\": \""+raAluno+"\"" +
   "\r\n" +
   "}";
        
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            
            connection.setDoOutput(true);

            try (OutputStream os = connection.getOutputStream()){
                byte[] input = str.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }
           
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null){
                response.append(line);
            }

            reader.close();
            connection.disconnect();

        } 
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERRO");
        }
    }

}