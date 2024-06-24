package aulas.aula8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TesteHttp {
    public static void main(String[] args) {
        try {
            System.out.println(getJsonData());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getJsonData() {
        try {
            // URL alvo da requisição
            URL url = new URL("https://economia.awesomeapi.com.br/json/last/USD");

            // Criando conexão HTTP para a URL específica
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Configuração do método da requisição (GET)
            connection.setRequestMethod("GET");

            // Lendo a resposta
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            // Desfazendo a conexão
            connection.disconnect();

            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
