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
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJzTHJjL1hGelZvcDFiaE81OGpUOFVCT0p5cXpNTTdjbkMwS1ZpcFJkU0cwR0xDSXRmY0d1WWNRd2VhU01oNHdodzNHRXIrZm04dDRCRDVrblpRRStqNmZKd1g3L1VrcWdXV2Qrb0UvSU1MeXhvTjYvQno5dEVqaGt5aVp1T1NpWHlDNEVqakhnQzlMeFlKL3B4YktxTEtVZTNnUTVVN1FrY3daR3pYdmNGOUJBS1RvVDFBNDg5a05jS2lsSWlVcGhDYkVYdm9rMjlJRmthWWhWOEMyUTE5cHEvN1YyY014MGxZWktsY2NGeW5wTElqTlFqbjViOVVvL0NEcFRXS0U0a2NLclpYU0t4ZzlQWS9CMUJjUmVHSThjOEl6YkZ4TGR5N2FnSW5iVEtad2p4ODY3YW1qeS83dkh4bFg1azlFZGJ1bmI4Qkd6Ny9mU3loZFpDMnI0MGtySm80RmxaK3NyaGF4VHNMczhBd3Mvd1BXNW5SVExubDZOMVZrYldEdEZjNjZXRU5zdWZ4MmRxYXlmSXZyYUtXcUJ1L012K2lieHNQV0REZTdxY3pWcEVxQ2hxclNFVThhZXdWdDlXaHdySWtpbGhGeVcxSzdWdjI2SndPWjVCRThYYThLeFBEKzErQitSaGROVVpyd1JFVkVuLzJ1TjdtNXZOMm5yelRCYmpkcTdNbjA3Q3hjeDEzRDRyeHJ1TEVXMkNYRUV5L3B4Ui90a2JVT2RvSzZCL3NNRnErdHJGSVpYeFNPV3VxV3JpUFc3VVNjaTBaMnY5YTh4ZGMzNlNnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiOTc4NGZmNWVhNjExNGQ5NDhlMzgiLCJleHAiOjE3MTkyNjY2MDksImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0._DjCzlSJuRGflwivEKqhSVV4klYhCda33DfxwUpMxfU");
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
