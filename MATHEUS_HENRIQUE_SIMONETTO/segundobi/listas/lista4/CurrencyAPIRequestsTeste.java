package segundobi.listas.lista4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrencyAPIRequestsTeste {

    private static final String BASE_URL = "https://economia.awesomeapi.com.br/json/";

    public static void main(String[] args) {
        try {
            
            sendGetRequest("last/USD-BRL,EUR-BRL");

            
            sendGetRequest("daily/USD-BRL/2");

            
            sendGetRequest("daily/USD-BRL/5?start_date=20240520&end_date=20240525");

            
            sendGetRequest("daily/EUR-BRL/5");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void sendGetRequest(String endpoint) throws Exception {
        String url = BASE_URL + endpoint;
        HttpURLConnection httpClient = (HttpURLConnection) new URL(url).openConnection();

        
        httpClient.setRequestMethod("GET");

        int responseCode = httpClient.getResponseCode();
        System.out.println("GET Request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(httpClient.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        
        System.out.println(response.toString());
    }
}
