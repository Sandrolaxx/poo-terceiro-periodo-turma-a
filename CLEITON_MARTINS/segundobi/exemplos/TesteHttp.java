import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TesteHttp {

    public static void main(String[] args) {
        try {
            System.out.println(getJasonData());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static String getJasonData() {
        try {//ignora a exceção e permite rodar o código

            URL url = new URL("https://economia.awesomeapi.com.br/json/last/USD");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");//mudar para 'GET' ou 'POST'

            BufferedReader reader = new BufferedReader(new  InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            connection.disconnect();

            return response.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
