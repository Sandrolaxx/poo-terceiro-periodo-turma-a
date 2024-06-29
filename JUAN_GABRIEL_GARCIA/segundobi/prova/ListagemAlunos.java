package JUAN_GABRIEL_GARCIA.segundobi.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ListagemAlunos {
    
    public static void listarDadosAlunos() {
        try {
            // URL alvo da request
            URL url = new URL("https://poo-exam.vercel.app/api/students");

            // criando conexão HTTP para a URL especificada
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // config método da requisição(GET)
            connection.setRequestMethod("GET");

            // lendo response
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            // fechando a conexão
            connection.disconnect();

            System.out.println(response.toString());

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
