package SEGUNDO_BI.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JOptionPane;

public class ListagemAlunos {

    public static void listagemAlunos() {
    
        try {

            URL url = new URL("https://poo-exam.vercel.app/api/students");
                    
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");
            

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;


            while ((line = reader.readLine()) != null) {
                    response.append(line);
            }
   
            reader.close();
   
            connection.disconnect();
            JOptionPane.showMessageDialog(null, response.toString(), "Listagem de alunos", JOptionPane.INFORMATION_MESSAGE);

        }   catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERRO", "Prova", JOptionPane.ERROR_MESSAGE);
        }
            
    }
}
