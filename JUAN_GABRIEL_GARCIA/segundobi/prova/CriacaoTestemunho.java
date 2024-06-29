package JUAN_GABRIEL_GARCIA.segundobi.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class CriacaoTestemunho {
    
    public static void criarTestemunho() {

        String urlFoto = JOptionPane.showInputDialog("Coloque a url da sua foto abaixo:");

        String raAluno = JOptionPane.showInputDialog("Coloque o seu RA abaixo:");

        String textoTestemunho = JOptionPane.showInputDialog("Coloque seu testemunho abaixo:");

        try {
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Dados do json
            String json = "{\r\n" + //
                                "  \"imageUrl\": \"" + urlFoto + "\",\r\n" + //
                                "  \"description\": \"" + textoTestemunho + "\",\r\n" + //
                                "  \"ra\": \"" + raAluno + "\"\r\n" + //
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
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
            e.getMessage(), 
            "RA invalido",
            JOptionPane.ERROR_MESSAGE);
        }
    }
}
