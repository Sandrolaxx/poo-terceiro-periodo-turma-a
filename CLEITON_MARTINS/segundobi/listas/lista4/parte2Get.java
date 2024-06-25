import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class parte2Get {
    public static void main(String[] args) {
        try {
            System.out.println(getJasonData());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static String getJasonData() {
        try {

            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

            
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJaMTVPajdqckJjcHUxQ3B4aXBOcVRxZ3YwdUZ5RUJMQys2Q1BMazVvZXQ4Wk4wdkRJNVFPUzh5QS9uTmZKSlVZTG9IVEY5Y2FGandiQ0cvWmJhd0lmclVrcWdNeGZUWjA2dDdVOElKQmY2MDZDRHpwdmdNTG54b1p3SnVEaUZITmt4U1EwRDNYaEhFTHFFaXcxdm9pTnpVS04wb3d5cndnb2tCcS9aMnRXTGY4ekJWWEw1eUVKdGpUMmtTTVgreWJVOWd6YzU1ckN5Q3J0YjY3L0VoK3l0ellaUTgwc3ZieGNFR3ZQVFRsTEhzVXpHSHJsNkRqVWRybDlZSlBQRmRlYUFmMEtsU0d6NW5zSzB4Q3NEMzFIWE9pWFZ6RFZ5K2dDeXdVNlhCcW13YklEZTdrTXVia2YzdVpVQ3JReUxlOVlEVFplUFd3Z2hIUXlwSXI1VWNmbnlOeVhJOWVoa0hnM1Q2K0tZUk5udmMrTW9yYlpvZUFDWm5LWUlueGprSjFFdmJoYzlGNHYvVk8vR1hmYm4yQVZOOEJHUmw0ZmFwd2FIS0Y0SlREeUU4NS9odE85RldTTkJYRU1keDRKTktmMzFydU9KL2duTktjbFZScWhsQlF3TllwTmZuaGwrOUxvbHE2bmlscjd3NDFqUnNqT2lBUzZ4S00vYmtuSitMMEpDV09hTmlMWitGVnhNKzcvZExzK1NrTmpSdnpLejF1SDdRd01RanlKNkcwK3JuUG9PaE95aWYxbkpLL25LMFpXL0h4VnBOV1FxNk5heEYrakswQ1ZBPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZTk3N2I4YTdiMWJmNDM1NDg0NDgiLCJleHAiOjE3MTkyODM0NDcsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.VPqQc1Pukadr-dkl5fLVQ92_R7yja64hCVmWjbzS1r8");

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
