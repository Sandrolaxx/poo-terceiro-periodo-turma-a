package primeirobi.ListasExc;

import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ExemploAula7API {

        public static void main(String[] args) {
            
            try{
                URL url = new URL ("https://economia.awesomeapi.com.br/json/last/USD");

                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                connection.setRequestMethod("GET");

                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            }
        }


    
}
