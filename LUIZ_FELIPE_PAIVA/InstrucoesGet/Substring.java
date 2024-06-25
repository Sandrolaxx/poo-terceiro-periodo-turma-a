package InstrucoesGet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;

public class Substring {
    public static void main(String[] args) {
        try {
            String jsonData = getJsonData();
            if (jsonData != null) {
                // Apresentar apenas os primeiros 200 caracteres
                String truncatedData = jsonData.length() > 200 ? jsonData.substring(0, 200) + "..." : jsonData;
                JOptionPane.showMessageDialog(null, truncatedData, "JSON Data", JOptionPane.INFORMATION_MESSAGE);
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
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJiOWNSL1NrV2c0bVV0U242QkNhMmRxRmJ4US91SGVIclkyRTBOK0Z5RS83R1VNaUk0WjRNU1ZTMlJyNVoxdCt2RjdlOHY4NmR1TXl4SFRjQWppOXB6amd1ZjRoSmhsRE90aHo1bUJTMVI2YzFCQVN1NWV0czA0UnluNlRXMHkwYlhtNmVGTktRVFpUanh4R1pueXJQcGY5bEs1WjZHUnBKbHVTVFp2SDhlY3N4UTRzY20vMi83QlVkdnJoYzgxdVFXdXVvWmFGS0tzQlJMNmFqRy92VE1LVlUvWjNsZTNLbFJIbFRoeDNoS3Z0UFd0dlRpeTRrRnl1S0VDOTNjc3dHQWUvUGc5T21lTFF3RnlReTBBKzA1Y3ovMk5CUkJYVzlrMDFzeFJkU2NvQTRaWHhBUld4d0ZEYk10NE16NWMyQW5qZm1QOXNOd0pKb0dhMHY0Sis1VUxVZ0szVWNzV1VEb3h4bDhka0VEQzROWjJZOTNOdFN4UGdHYmxhSkVJb0xGQ25RL0JoQ0libTF6RC9oNXJsVkpabGhVa2NVMm0zM1V5U1hUR2kvcUpiaFByVlN2L0d3bWdscEFidVYrNElFYVIrWktsZUVCTzcxZHNUYTdTNWJlVjgwNmQzQ2VjS2l2dE11T3FwOUR1Y0VuaFhncGlkSXYxaU1qbHUvVmNMT0c2TVlpdWZma3lZTm9naXZHYnUzZnlkQnkrM29vZXdjazI3K05sanhTNFJtOVZ0UXJXM0N4QTFXVkhNQmtqaTNyTzMyVWZpT045UkI4MjNKbGYxSjVBPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiYzg2MTU1YjA4OTM3NDhjZWFkOTAiLCJleHAiOjE3MTkyMzk4NDMsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.pQ-Dekptr5SEFSwURl6Uymsq4kX09g60-cAj5bGp4EM");
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
