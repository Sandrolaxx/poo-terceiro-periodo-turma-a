package listas.lista4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ListagemConvenio {
        public static void main(String[] args) {
        try {
            // URL da API de listagem de convênios
            URL url = new URL("https://developers.celcoin.com.br/api/v1/convenios");

            // Abre conexão HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            // Verifica o código de resposta
            if (connection.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + connection.getResponseCode());
            }

            // Lê a resposta da API
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (connection.getInputStream())));

            // Exibe a resposta no console
            String output;
            System.out.println("Lista de Convênios:\n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            // Fecha conexão
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
