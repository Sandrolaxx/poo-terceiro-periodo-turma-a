package GUSTAVO_MULLER_DE_ARAUJO.segundobim.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JOptionPane;

public class ListaAlunos {

    public static void listarAlunos() {

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

            JOptionPane.showMessageDialog(null, response.toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar alunos" + e.getMessage());
        }
    }

    
}
