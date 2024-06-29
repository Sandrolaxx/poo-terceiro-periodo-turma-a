package PEDRO_HENRIQUE_GULIGURSKI.segundobimestre.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Alunos {
    public static void main(String[] args) {
        exibeAlunos(getAlunos());
    }

    public static String getAlunos() {
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/students");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            if (connection.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + connection.getResponseCode());
            }

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            exibeAlunos(response.toString());
            return response.toString();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro desconhecido", "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return null;
        }   
    }

    public static String exibeAlunos(String response) {

        StringBuilder message = new StringBuilder();
        message.append("Lista de Alunos:\n\n");
        message.append(response);

        JTextArea textArea = new JTextArea(20, 50); 
        textArea.setEditable(false);
        textArea.setText(message.toString());

        JScrollPane scrollPane = new JScrollPane(textArea);

        JOptionPane.showMessageDialog(null, scrollPane, "Alunos", JOptionPane.INFORMATION_MESSAGE);
        return null;
    }

}
