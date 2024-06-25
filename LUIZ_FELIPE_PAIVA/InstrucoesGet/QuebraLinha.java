package InstrucoesGet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;

public class QuebraLinha {
    public static void main(String[] args) {
        try {
            String jsonData = getJsonData();
            if (jsonData != null) {
                // Formatar a string JSON para ter quebras de linha a cada 40 caracteres
                String formattedData = addLineBreaks(jsonData, 40);
                JOptionPane.showMessageDialog(null, formattedData, "JSON Data", JOptionPane.INFORMATION_MESSAGE);
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
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJEQ0d3enlKelN6OEpkcy9udGhTSnkxWVc0N3VlVWVodnRndXFVZ0lTbFc3enc0R0Y3SEthYzZaaVViclFDSSt1dG5HWjVncXVJSDZrTGkrd1llNm5sT0NxZ3pvM3lNN201Rkc5VFp3M002R3lYTkxUa09qQ2JRV1pXTk1TTEZXT1NmbmR4S1N5Ny93dVFXSFZQSUpIN25GNE9CcStrMWRRZnY0TFdQYW5FVkEzMFMvTDlzQlU4OFpCQVFiVjdrOHlpdTJaUENYdnljVVc2L2w3Zmc3ZG0yamdFUTRObkRCTEExU2RDWDZ6Mk53cmtRTGdMamMrRjg3Q3JlK1JQOXI1L0NOT05VdG5qV1QvQ3VUamp5dkEvQ0dmZ1VhczEzZkRnVTh4MC8zcmdyVUJmS3FwbUc4dWVZWURYbUFJQ1F4NEtJQ2JyUG9VWjZVMlR2TmRUenh0cVMydjQrdXlSMTBNdjFybys1a2RrZFdaTzUvbFFKM2wwekw4LzdFbjlRcUVMYVpyQlVNdWlTSFA5WjdCa25jcVZ2bjJDb05iSGV4UDl3ZXpmU2F5Rk52blVYbEF3Q0pSYnU3azIrNlN6bThzbUdrMHpoTThIdTlIRzEvOWRQTWVMakQwQjNNa05tOTk0REo0Uk5GdWloeGZiYTBVa2lod3FwL1QxakIzV3pEdkNkYzVHR1pmSTA3ZmJZdy9DR0NyRFFpckRDbmg3aVRhbkJrQXBSSWxma2tiTDROLzMwYzNkd2N3NDBtekZaZGo2bEF5VnRQMGJ3R1ZCSFJWZkdPTWR3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZDk1NGU2MDYxM2IxNDkxN2EyNjEiLCJleHAiOjE3MTkyNDAwNjksImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.gHk-F47E8QV9jyAs6F6FeoOfwFITs5xhlPVoGs5WP3c");
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

    // Método auxiliar para adicionar quebras de linha a cada N caracteres
    public static String addLineBreaks(String input, int maxLineLength) {
        StringBuilder result = new StringBuilder();
        int length = input.length();
        for (int i = 0; i < length; i += maxLineLength) {
            if (i + maxLineLength < length) {
                result.append(input, i, i + maxLineLength).append("\n");
            } else {
                result.append(input, i, length);
            }
        }
        return result.toString();
    }
}
