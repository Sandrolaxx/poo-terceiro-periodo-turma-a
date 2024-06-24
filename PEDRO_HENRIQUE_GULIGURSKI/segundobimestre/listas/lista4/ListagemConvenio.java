package listas.lista4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ListagemConvenio {
    public static void main(String[] args) {
        System.out.println(getConvenio(1));
    }

    public static String getConvenio(Integer type) {
        try {
            // URL da API de listagem de convênios
            URL url;
            if (type==0) {
                url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions?Type=NACIONAL");
            } else if (type==1) {
                url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions?Type=ESTADUAL"); 
            } else {
                url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");
            }
            
            // Abre conexão HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJTY3lnZEhrU2RrRnN6aytpcVk4V2tuRVpNT1Vwem92ZnFsTVRYRTFZbCs4ZXp2eHRPVm1ORllFb28rMlB1UXV6NW4zNnJ6TE4zZ2htanRieGdvQjhBK0wzemkwSXZHTUMyV3ptTTBBTmNMN2JZRFdkTU1DZzcyOFZQcUE4Um5hU1dMaGVsQkVvSExLSlFNMWZJYnMxbGIxYVBpV0NVWWpDRitVOU9HRHlqL3lJYjdrU0pXRVhBMVBteHFWUUVnZkZraVROcTFET1dsd01PeFZxWlFYMTdLN1lZTkpsN0ZjM1Npa3NpQnVsM3JTYkxEVmZRNHJ2aitkbmtETkZlUVBRQU1YaHpmQWlSeVRaOEhaVGJ0VzVJSkhWMkt6ekc1THNQdmdxeGJhT01uM21WNEVKK3RsUHkrelY1ZmdZc3RDUThMclN1TTNSVjdRZVJOQ2dOb0IwM3l5cXVMMS9PVC9wY2VMRWNVVmpFdVdpWlNxakhqckFBWUVtNlkwM2NpTTZRaldPYUtJV3BTSGc3MUJrSXNaNGJURFk0OHBxZzA2V0NCMi9TM3R6ZU5iSFo0OEh2Y2FYMFJ0VlNwWkNGOUk0M0g1alRRamxZSVRKYjlTSE1CeGhyY1Uxb1k3YTJWSFVveHpwNGw3MmpIVVg5VlI2MnBMT2JFbEhJdmFWdjlCNk1JcUVVUzIzcnFYVXBPclk5MkJDQmM2a0NsQ0RXMEp5cmhUK2dwdUZKMkVyTVhraGVZcnpiRmVtSHArZjVCWDB6OEhHS2lJcHNWK0YzTkhDakxKZWpRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNWZkOGNmYWQzMmU5NDc4OTgxNWEiLCJleHAiOjE3MTkyNjEyMTksImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.PMhrDwh09BuNQBbH8RiIfo9h-a5ZkGdonOl_EhDMXpo");
            connection.setDoOutput(true);

            // Verifica o código de resposta
            if (connection.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + connection.getResponseCode());
            }

            // Verifica o código de resposta
            if (connection.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + connection.getResponseCode());
            }

            // Lendo o retorno JSON da requisição e atribuindo em uma String
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            // Fecha conexão
            connection.disconnect();

            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
