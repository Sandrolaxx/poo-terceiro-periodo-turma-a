package training;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class exampleGet {
    
    public static void main(String[] args) {
        
        try {
            System.out.println(getJsonData());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static String getJsonData() {

        try {
            URL url = new URI("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions").toURL();

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJ0T010WUd1QjVWajdrU0hJaS92bzF5NHFpT25TaWRrdTdUTks2MGZ6NE1yY0RFalg5QkcwZkxHL3dPWlArQkN3cjZjZG9pWjBlZnZKMTZLa2tTeklWRXZsL3c4UHZkdDBpT21TU0R3S3ErRWV4amNmTUorMWZnenJUV3VSdUlxYmF5M0RFZ29OTFkzUXdkSVh5U0U1dERtWVJJQ3k1am1aQ3lJNHVLRmt2eEVXT3FiTjVoTjFrWkJ4QUxvck1TdnZqdHRCSWgrWlRXOFd3Q3lXRGlVRXhwb0pGM202VjltZHQwZlVNcFp6Ymc2WXRNKzYvbGFwZ0tzbUJYY3YwYTJOeDZuQnJ3ZXF4cnBodkl5am5tVDRJc1ZRbjd6RUZ3bERZcVkzamxJUzducTdiWVdmVXBzeUVYZWIyMkp2YWpiSllWWXZRbmZoRzFZMm1wOXlMYTNuSVBoSnJwNlczUTlCZDNOdEQzb0xJSFhMd3RWNXp4UE5MaVhQY3lFUWV2L2hzY0RvWGd4Ym5WeWJjU3FiQzQ0eUZtcGdIbEI2OHc2OE42TWFLd3lZS0ZEbmk3Wi9JREE1eEQzYURZZys4d2FNanJzYWlabVdnVHVWSzVnWmJsUWpXZ1Jvb3R3emErWnJFcHVmT0EyQ1RuR0d5Rk93b01Kb3J4akVHN2xoak15Y2ZIYXIzUnJGNitMcUJhalcwN09zcjNyajNlaDRUQTNlS3IzQXZtOE5YaDJ5elM0N3kzbzZDdHFHZEtaZnRRbFF2MVVIQVlZL2NRM2ZQbVl2QUdjSmRnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZWM5ZmI1NTEzNWYwNDcwZGFhNDIiLCJleHAiOjE3MTkyNjAyNjksImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.iIUg5b383iJvQY0tsETJhqgajODu38RRSl6XwvvKvLk");

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
            return e.getMessage();
        }
    }

    
}
