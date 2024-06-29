package LUIZ_FELIPE_PAIVA.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;

public class ConsultaAlunos {
    public static void main(String[] args) {
        try {
            String aluno = listaAlunos();
            if (aluno != null) {
                String substringAluno = aluno.length() > 200 ? aluno.substring(0, 200) + "..." : aluno;
                JOptionPane.showMessageDialog(null, substringAluno, "Lista convênios", JOptionPane.INFORMATION_MESSAGE);
            } 
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Este erro aconteceu: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static String listaAlunos() {
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/students");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
