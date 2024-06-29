package GUILHERME_MAIDANA.primeirobimestre.Segundobimestre.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegistroTestemunho {
    public static void registroTestemunho(String token, Double amount) {
    try {
        // DEFINE A URL DA REQUISIÇÃO
        URL url = new URL("https://poo-exam.vercel.app/api/testimonial");

        // CLASSE AUXILIAR PARA REALIZAR REQUEST HTTP
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        
        // Dados do json -- Caso seu VS code não idente utilizar https://www.javaescaper.com
        String json = "{\r\n  \"imageUrl\": \"https://avatars.githubusercontent.com/u/160553240?v=4\",\r\n  \"description\": \"Tmj Sandrolax, uma Honra adquirir esse conhecimentos através da sua pessoa\",\r\n  \"ra\": \"11007\"\r\n}";
        // REALIZA A CONFIGURAÇÃO DA REQUEST
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Accept", "application/json");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

        // ADICIONA O JSON A REQUEST
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = json.getBytes(StandardCharsets.UTF_8);

            os.write(input, 0, input.length);
        }

        // REALIZA A LEITURA DOS DADOS
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        reader.close();

        connection.disconnect();
        JFrame frame = new JFrame("Testemunho");
        JOptionPane.showMessageDialog(frame,response.toString().substring(0,200 ),"Testemunho",JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        e.printStackTrace();
        
    }
    
}
}
