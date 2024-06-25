package Lista4pt2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;

public class Convenio {
    public static void main(String[] args) {
        try {
            String convenio = getJsonData();
            if (convenio != null) {
                String substringconvenio = convenio.length() > 200 ? convenio.substring(0, 200) + "..." : convenio;
                JOptionPane.showMessageDialog(null, substringconvenio, "Lista convênios", JOptionPane.INFORMATION_MESSAGE);
            } 
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Este erro aconteceu: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static String getJsonData() {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJqaC9sL2tVMTBuZDRQWGh4ckpyMUJDRzBlRENsWGIwNWh6ZTRoN05ibEFha3d2WTFmd2ZnTjVlWExZTW1BS0d5cGdwL091QTJ4djVxVFFOcFZCZEs1cTN6REtHdFNQSjNkZjhRK2UrYndvNUFnM0doT2NWdUp4YUhENkVUUjFUSXBvWGxIMG1WelBJNGtuWWpmVmJVNVBlZWNiV3dnTVdOdUQ0MGNyTm9JTHUraVNiV1NTdW9LYVlRb1BkSHlLMzFmZVdOa0JpSnhRQ3FUenY0UWlleklQQkc2ck93YWJVakgyUVJrcGs1R1R3YkRLSS81Uk5YLzIvUVl3dnVzTzRKamF5aWpCSVVZSkEwTXNaVzZvbG1PUFU2Y2tBaUNhQ2x4ZW1zSlYwYnJLWVl6V09pQkJ5eVdQWU9ISFdBSG5EMDVEZzlwWGpJNTRLTmNoT3pYUFI2RmZISzBBeUZ2Z2JsMERIbGx2S3VXOTFXaU5RUzkwem9MNXpVMkZDeE5NTUlQM2tlalltdVBtZnpYNHdNTCtrVllpOTBRY1B0eFQ1bU5US1B1RmRkVkJVNUcra0xvQXd3YW83VHRlQmNUZEVITFlkZkZSdklvUVBTSUNHb0w4Wm5UYW4yNkV6ckVUb2g2UzZFUmxYQkZVWmZDSjA1QnFGRDZZcGVQek1ZVVlOejN5djhvU2sxQ3VFdlJFa1hvTXRsa1BFR1dyeTc3TGNOZ2pQQVVhVzY4SlVCdjJkQVFtUERnUHNQYXV5TnBwMXlPakRpS0tUKzN5bkZOdTlmN2xSenBnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNGM2NmM5YjQ0OWVkNGE2NTgzMDEiLCJleHAiOjE3MTkyNDI3NzIsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.fcte6Z9RXhgXZYAZP2bhSz88FoPimPt0gRypDaD0jIA");
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
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
