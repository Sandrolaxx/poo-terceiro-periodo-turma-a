package JEAN_LUCA.segundobi.prova;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ListaDeAlunos { 
   

    public  void getJsonData() {
        try {
            //URL alvo da request
            URL url = new URL("https://poo-exam.vercel.app/api/students");

            //criando conexão HTTP para a URL especificada
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            //config método da requisição(GET)
            connection.setRequestMethod("GET");

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

            JFrame frame = new JFrame("Lista de Aunos");
            JOptionPane.showMessageDialog(frame, response.toString().subSequence(0, 200), "ALUNOS", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "REVISE O CODIGO", "ERROU", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();

         
        } 
    }
}

