package LUIZ_FELIPE_PAIVA.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;

public class Testemunho {
    public static void main(String[] args) {
        String testemunho = geraTestemunho();
        if (testemunho != null) {
            String substringTestemunho = testemunho.length() > 200 ? testemunho.substring(0, 200) + "..." : testemunho;
            JOptionPane.showMessageDialog(null, substringTestemunho, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static String geraTestemunho() {
        try {
            String imagem = JOptionPane.showInputDialog("Digite a URL da foto:");
            if (imagem.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe uma imagem válida.", "Erro", JOptionPane.ERROR_MESSAGE);
            };
            String descricao = JOptionPane.showInputDialog("Digite a sua descrição");
            if (descricao.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe uma descrição válida.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            String ra = JOptionPane.showInputDialog("Digite o seu RA");
            if (ra.length() != 5) {
                JOptionPane.showMessageDialog(null, "Informe um RA válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                return null;
            }
            
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            
            String json = "{\r\n" + 
              "  \"imageUrl\": \"" + imagem + "\",\r\n" + 
              "  \"description\": \"" + descricao + "\",\r\n" + 
              "  \"ra\": \"" + ra + "\"\r\n" + 
              "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line.trim());
            }

            reader.close();
            

            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
