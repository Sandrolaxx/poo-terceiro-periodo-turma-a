package InstrucoesGet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;

public class Normal {
    public static void main(String[] args) {
        try {
            String jsonData = getJsonData();
            if (jsonData != null) {
                JOptionPane.showMessageDialog(null, jsonData, "JSON Data", JOptionPane.INFORMATION_MESSAGE);
            } 
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static String getJsonData() {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJtNERMbGJFQXFIRWFIS2wxSkErbmpDTlcxY3hPRmVYbklCU0RTQkV1NC9KTjd2YTg0bHhCRkM3WVJ3SE42bUYrTXlVb0VhZlJOYnBIUGNlME10T3ZtcXpWcDJUdW5kS3FyT1U4WUpWeUhzU3RHTFd0L1A3aVMyL3MwZUpNUnF1anJWU3kyVGxmcUNUWGxGNzQyMFBidUt4TGthRzVSQzk2d20zeHpDUjZra1ZrN0V2dSs1WHYydzBHQTZPalhJci9Jd2tuQjg2NHVwVzhRdXRDZUNxck9sV09rVmJoRFM5TktwZjREelU4S1FMWEZzVGgwcjllZHpCL2xoaWxZcUo3YzY2NkljN3ZxSE4xc2crcmhHTVF5L3FrK2pPR0VncW5JK216RTc2aGFpSXIrK0R5cVhZdmRrMGRhYk9kYTNRNVgyL1krMGtzZk1qMHBsaEJFemVLNkVsSmJRTXBlZUJOZ1dPYXM4OUF6YUhkUmFSOFdFZnFNY3VaaHE1dmgrUHlvc29RUEhTVXMrZi83czRrYWJuelJFZUdmbjdtQTNHS25LTm80enczZ0dudDF2aDA1Y3Rpakp1R0s3UE5NRldYeStYcU9YRnpyRk5ZaURBeTQ0TVgxcVdHMThwdWQycm1kUnNQWHJOODdubzdRVTFTYmw5dFJKWGJEam02QW9sR2w4em9Fbk5IRDhiWWdnVnBPQmFYWS94WkdkWXpjRUNHalpGRlNDczNpSFlZOThnTWdJeXc4Uk9VSDdla29zV3NzSzdKb2R4c2V1dTBkVmhudDB3UlRnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiODcwOWM5ZGRiMTY0NDQ4ZWJkYmEiLCJleHAiOjE3MTkyMzk0MzIsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.Jby_WGWX1_nHH5slikdg49dSnVloqEc0BXeNBrMFehs");
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


