package RAFAEL_KAITO.BIM2.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Alunos {
    public static void main(String[] args) {
        try {
            System.out.println(getAlunos());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getAlunos() {
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

            String formattedResponse = response.toString().replace("},", "},\n");

            JFrame frame = new JFrame("Listagem de alunos");
            JOptionPane.showMessageDialog(frame, formattedResponse, "Listagem alunos", JOptionPane.INFORMATION_MESSAGE);
            return response.toString();

        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }
    
}
