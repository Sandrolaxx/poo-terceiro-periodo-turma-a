package PEDRO_HENRIQUE_GULIGURSKI.segundobimestre.prova;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class Testemunho {
    public static void main(String[] args) {
        setTestemunho();
    }

    public static void setTestemunho() {
        String urlImg = JOptionPane.showInputDialog("Digite o url da sua foto: ");
        String raAluno = JOptionPane.showInputDialog("Digite o RA para o testemunho: ");
        String message = JOptionPane.showInputDialog("Digite seu testemunho: ");
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\r\n" + //
                                "  \"imageUrl\": \""+urlImg+"\",\r\n" + //
                                "  \"description\": \""+message+"\",\r\n" + //
                                "  \"ra\": \""+raAluno+"\"\r\n" + //
                                "}";
        
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            if (connection.getResponseCode() != 201) {
                String errorMsg = "Error " + connection.getResponseCode();
                JOptionPane.showMessageDialog(null, errorMsg, "Erro", JOptionPane.ERROR_MESSAGE);
                throw new RuntimeException("Failed : HTTP error code : "
                        + connection.getResponseCode());         
            } else {
                connection.disconnect();
                JOptionPane.showMessageDialog(null, "Parabéns! Seu testemunho foi enviado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro desconhecido", "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }   
    }
}
