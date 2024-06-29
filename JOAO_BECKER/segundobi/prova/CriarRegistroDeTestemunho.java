package JOAO_BECKER.segundobi.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class CriarRegistroDeTestemunho {

    public static void criarTestemunho(String ra,String description,String imageURL){
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\r\n" + //
                                "\t\t\"imageUrl\":\""+imageURL+"\",\r\n" + //
                                "\t\t\"description\":\""+description+"\",\r\n" + //
                                "\t\t\"ra\":\""+ra+"\"\r\n" + //
                                "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type","application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

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

            JOptionPane.showMessageDialog(null,"Testemunho criado Com sucesso", "!", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Ocorreu um erro na cração do testemunho tente novamente", "!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
