package JEAN_LUCA.segundobi.prova;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegistoDeTestemunho {
   

    public void Registro() {
        try {
            // DEFINE A URL DA REQUISIÇÃO
            URL url = new URL(" https://poo-exam.vercel.app/api/testimonial");

            // CLASSE AUXILIAR PARA REALIZAR REQUEST HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            String description = JOptionPane.showInputDialog(null,"Coloque a descricao","Requirimento",JOptionPane.QUESTION_MESSAGE);
            String imageUrl = JOptionPane.showInputDialog(null,"Coloque a URL de uma imagem ","Requirimento",JOptionPane.QUESTION_MESSAGE);
            String ra = JOptionPane.showInputDialog(null,"Coloque Seu ra de aluno  ","Requirimento",JOptionPane.QUESTION_MESSAGE);

            // Dados do json -- Caso seu VS code não idente utilizar https://www.javaescaper.com
            String json = "{\r\n" + //
                                "  \"imageUrl\": \""+imageUrl+"\",\r\n" + //
                                "  \"description\": \""+description +" \",\r\n" + //
                                "  \"ra\": \""+ra+"\"\r\n" + //
                                "}";

                        


            // REALIZA A CONFIGURAÇÃO DA REQUEST
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
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

        
             JFrame frame = new JFrame(" Criar registro de testemunho");
            JOptionPane.showMessageDialog(frame,"Testemunho realizado com sucesso"+ response.toString(), " testemunho", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "REVISE O CODIGO", "ERROU", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}
