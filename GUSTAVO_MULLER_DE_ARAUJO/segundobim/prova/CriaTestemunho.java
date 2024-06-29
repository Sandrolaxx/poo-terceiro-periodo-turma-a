package GUSTAVO_MULLER_DE_ARAUJO.segundobim.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class CriaTestemunho {

    public static void criarTestemunho() { 

        try {

            String linhaUrl = JOptionPane.showInputDialog("Insira a URL da sua foto de perfil:");
            String linhaRa = JOptionPane.showInputDialog("Insira seu RA:");
            String linhaTestemunho = JOptionPane.showInputDialog("Deixe um testemunho a respeito dos seus aprendizados:");

            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\r\n" + //
                    "  \"imageUrl\": \"" + linhaUrl + "\",\r\n" + //
                    "  \"description\": \"" + linhaTestemunho + "\",\r\n" + //
                    "  \"ra\": \"" + linhaRa + "\"\r\n" + //
                    "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            JOptionPane.showMessageDialog(null, " Sucesso ao criar testemunho!!"+ response.toString()); 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao criar testemunho: " + ex.getMessage());
            
        }
    }
    
}
