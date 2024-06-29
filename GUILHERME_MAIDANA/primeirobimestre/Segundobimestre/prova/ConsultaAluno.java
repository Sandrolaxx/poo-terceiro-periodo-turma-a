package GUILHERME_MAIDANA.primeirobimestre.Segundobimestre.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ConsultaAluno {
    public static String listarAlunos() {
        try {
            //URL alvo da request
            URL url = new URL("https://poo-exam.vercel.app/api/students");

            //criando conexão HTTP para a URL especificada
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            //config método da requisição(GET)
            String nomeAluno = JOptionPane.showInputDialog(null,"Entre com o nome do Aluno", "Nome", JOptionPane.QUESTION_MESSAGE);
            String raAluno = JOptionPane.showInputDialog(null,"Entre com o RA do Aluno", "RA do Aluno", JOptionPane.QUESTION_MESSAGE);
            int raCerto = Integer.parseInt(raAluno);
        // Dados do json -- Caso seu VS code não idente utilizar https://www.javaescaper.com
            String json  = "{\r\n  \"data\": [\r\n    {\r\n      \"name\": "+nomeAluno+",\r\n      \"ra\":" +raCerto+"\r\n    }\r\n  ]\r\n}";
            connection.setRequestMethod("GET");
        

            connection.setDoOutput(true);
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
    
                os.write(input, 0, input.length);
            }

            //lendo response
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            //fechando a conexão
            connection.disconnect();

            JFrame frame = new JFrame("Lista Aluno");
            JOptionPane.showMessageDialog(frame, response.toString().substring(0,200 ), "Lista Aluno", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
}
