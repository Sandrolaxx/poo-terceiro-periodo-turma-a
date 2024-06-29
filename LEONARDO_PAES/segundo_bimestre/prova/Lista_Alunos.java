package LEONARDO_PAES.segundo_bimestre.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Lista_Alunos {

    public static String listaAlunos() {
        try {
            //URL alvo da request
            @SuppressWarnings("deprecation")
            URL url = new URL("https://poo-exam.vercel.app/api/students");

            //criando conexão HTTP para a URL especificada
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            //config método da requisição(GET)
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");


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

            
       Pattern pattern = Pattern.compile("\\{\\s*\"ra\"\\s*:\\s*\"(\\d+)\",\\s*\"name\"\\s*:\\s*\"([^\"]+)\"\\s*\\}");
Matcher matcher = pattern.matcher(response);

List<String> students = new ArrayList<>();

while (matcher.find()) {
    String ra = matcher.group(1);
    String name = matcher.group(2);
    students.add("RA: " + ra + ", Nome: " + name);
}

StringBuilder sb = new StringBuilder();
sb.append("Lista de Alunos:\n");
for (String student : students) {
    sb.append(student).append("\n");
}

JOptionPane.showMessageDialog(null, sb.toString(), "Lista de Alunos", JOptionPane.INFORMATION_MESSAGE);
                return response.toString();
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

            return null;
        }
    }
    
}