package aulas.aula_8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class testToken {

    public static void main(String[] args) throws Exception{
        
        try {
            
            getJsonData();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    public static String getJsonData(){

        try{

            URL url = new URL("https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata/Moedas?$top=100&$format=json&$select=tipoMoeda");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
            
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
    
}
