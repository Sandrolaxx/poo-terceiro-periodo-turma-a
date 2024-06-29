package JOAO_BECKER.segundobi.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ListagemDosAlunos {
        public static String listagemDosAlunos(){
        try{
            URL url = new URL("https://poo-exam.vercel.app/api/students");
            
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader((connection.getInputStream())));
            StringBuilder response = new StringBuilder();
            String line;

            while((line = reader.readLine()) != null){
                response.append(line);
            }

            reader.close();

            connection.disconnect();

            return response.toString();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
        public static void listagemFormatada() {

        String jsonResponse = ListagemDosAlunos.listagemDosAlunos();

        try {
            Pattern pattern = Pattern.compile("\"(\\w+)\":\"([^\"]+)\"");
            Matcher matcher = pattern.matcher(jsonResponse);

            Map<String, Object> jsonData = new HashMap<>();

            StringBuilder sb = new StringBuilder();

            sb.append("Dados do alunos:");


            while (matcher.find()) {
                String key = matcher.group(1);
                String value = matcher.group(2);
                jsonData.put(key, value);
                sb.append("\nNome: " + jsonData.get("name"));
                sb.append("\nRA: " + jsonData.get("ra"));
            }
            
            JFrame frame = new JFrame("Listagem Alunos");
            JOptionPane.showMessageDialog(frame, sb.toString(), "Listagem Alunos", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
