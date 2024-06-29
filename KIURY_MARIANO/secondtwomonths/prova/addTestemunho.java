package KIURY_MARIANO.secondtwomonths.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;


// A função desta classe é adicionar o testemunho proriamente dito a API.


public class addTestemunho {

    public static void main(String[] args) {
        addNewTestimonial();
    }
    
    public static void addNewTestimonial() {
        try {

            URL url = new URI("https://poo-exam.vercel.app/api/testimonial").toURL();

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String imageURL = JOptionPane.showInputDialog(
                null,
                "Informe o URL completo da imagem:",
                "Adicionar Testemunho",
                JOptionPane.QUESTION_MESSAGE);

            String description = JOptionPane.showInputDialog(
                null,
                "Insira seu testemunho:",
                "Adicionar Testemunho",
                JOptionPane.QUESTION_MESSAGE);

            String ra = JOptionPane.showInputDialog(
                null,
                "Informe seu RA:",
                "Adicionar Testemunho",
                JOptionPane.QUESTION_MESSAGE);

            String json = "{\r\n" +
            "  \"imageUrl\": \""+imageURL+"\",\r\n" +
            "  \"description\": " +
            "\""+description+"\",\r\n" +
            "  \"ra\": \""+ra+"\"\r" +
            "\n" +
            "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
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

            System.out.println(response.toString());

            JOptionPane.showMessageDialog(
                            null,
                            "Sucesso! Seu testemunho foi publicado.",
                            null,
                            0);


        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            JOptionPane.showMessageDialog(
                            null,
                            "Você inseriu os dados incorretamente! Tente novamente.",
                            null,
                            0);
            
        }
    }
}
