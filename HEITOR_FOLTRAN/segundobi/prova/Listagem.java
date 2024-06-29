package HEITOR_FOLTRAN.segundobi.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Listagem{
    
   public static String listagem(){
        try{
            //URL da api mesmo
            URL url = new URL("https://poo-exam.vercel.app/api/students");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
                   
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
           
            while ((line = reader.readLine()) != null){
                response.append(line);
            }
        
            reader.close();
            connection.disconnect();

            String substituicoesJson = response.toString().replace("},", "},\n");

            JFrame frame = new JFrame("Listagem dos alunos");
            JOptionPane.showMessageDialog(frame, substituicoesJson, "Listagem", JOptionPane.INFORMATION_MESSAGE);

            return null;

        } 
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERRO");
            return null;
        }
    }

}
