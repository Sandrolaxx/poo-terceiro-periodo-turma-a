package SEGUNDO_BIMESTRE.listas.lista4.API;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class Main {
    private static String tokenConvenio = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJ5K05kQkR2KzJaMHl0S1UvaGhxYzh1ckFjcmtUeWxmdkk2cWx6WEhjWk93MzFEamk1TGpVVUpQQmxGSWxQYW1pMVNoUk5xL0dBNThLanV4VjZNaVVjeTFidFdsbnJCZ2JrZ2t1WTYraVVsbHFqUFpDeFU0RkRVQmlBU1hnUXhDRmdTTjdqTGVOQXNXNm1pbDhQYm1BTVoydlM4Nkd2SjNMd2lsRE0vZjUxWkZFNUM4WTE2aGZjSHp0ZHFaZlo0ZWZxYWpuRnM4NnpZbWc2UzhKM0M1dHcxdWRJUzgvL25jNy9IVU1tVSt0RWNuV2YwMHZMU2VKR0pmUXBlVjcxZklwNEQyakpmRkpyUVdRRTNGTnN3emNSbjI3cm1QUnRuRGt4Rm0zNVdKYmlPU1hmRXI2Um94WUlKMU5CVEFMRGpvYWNVZllVc09MbVRGcTJRWGFnVWl4MDlndGE3QTlSUFQvaDhVUnRtdEU0NVUwMm5VTFBnUjNxZ1hqZW9FazA5NWl2SkxESW9pdFZHNVoyL3htOXA3QlNiSkRUMmlhVEpteHdLSVFENndNd0p4OGpMS0ZXQkxqZHFzdFo5eHhJQWR3bUtaOUlLUmV3N256aHpQdURxamZ2enlBMUVvM3JtRGxPdXZNOEJLOFpEbTAzY0krS1JleUtMenhqb2o3NzY0M3IwMlpKVmtFZGxTSU1kZmFEQTQvUTRBVWZUcXlwUUNTOUhQQm5UdjJUNG5WQXJ1eHJrdHU3WTR3WGlXYWF3aURUeUFVNHFDNUhsMXEvNDBiSTFNNnFBPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZjY4ODI5N2U1YjAyNDIwM2FkMmUiLCJleHAiOjE3MTg5MjM1MjYsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.RRbAXsZKkxVESTuItDumaplUSjdiat00pBAw_XyV4j8";
    private static String tokenBoleto = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJlbFhDMno5MGJzaWFHbStCVXJPUDRyYXBCYUJINGpiNzBBS1pOcFdQZ3puNHpCLzR4UmxLN0kvcnkyZVk3YmgyclNuRjhOa0l6dUZTSnlyQVhVMmRYejJQRzF3dVlIUGJ4K0ZWb2dtOHRJc3A4Z3F2Yk5tZUY1aVVHWXh4UUwwSHk1eDUwMXJYTng4dkZvZ3ZpOTByTTI4RkFTU2NBQWxVbEhpYTlGK2xxdVVORDJBc1NmQ2tadGNDSGFkcGM0UUszSGRrRUkrdXhiU2E3Ukk0VmxyRTZDOURFU3NzQi9wNmFsUVlISERrMUl5OEtWQ28yVlBveGtaQXZUeFlhN3oxbktwUkw1VFZiUXlvR21uTG41WUxBODZzNW1xbDVreS9hOGIwazZXc1ZRMzNGbmhVV3FaMVJ5U0xidjQrT25qWHhFR3Avclc0ZHlJS2NhNHE5dkMwY1plRTJtQThoZkZKRXNIUDExdmxDV2hnVmlGcUdlS0JKTkk2YUpzcDFFSXMybEQ1cDdhcXR6bEI3NHVvZUl0Y0RxbHlmUEU2UGxKL1JzK0g0SGh6bGwzemU1Mzc3UU96cm5ueXc0ZERudWltVE1CZnBzTTVSRXhXMUYwMGhsT2tuVnJSM0htOUdEYTgraGRXY3c1dGdlWEhYRk96ejFYWEc3SGFQTlFnYnBOaHVhR3UwaFRmVnVZdzVtRDRnWVNBd3liTytVOWUrN1lZWUhRcG9pM1dJeWNIK2xLYkFCZ01jWFBlbHFYRWprbXhwdXJjMElxbmRyczdpc2pSWlF6aWpnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiYWNkYzE0NTBhMzdlNDA4ZDgwYzMiLCJleHAiOjE3MTg5MjY0MTYsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.xB_H1mdb5p5kp98F5IgVH92c5ZYanR2vO6FZRGO0Ovg";

    public static void main(String[] args) {
        String[] options = { "Listar convenios", "Consulta de boleto" };

        String selectedOption = (String) JOptionPane.showInputDialog(null,
                "Escolha uma operacao:", null, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);

        if (selectedOption.equals("Listar convenios")) {
            System.out.println(getConvenios());
        } else {
            String line = (String) JOptionPane.showInputDialog(null, "Qual a linha digitavel do boleto?");
            getBoletos(line);
        }
    }

    public static String getConvenios() {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer " + tokenConvenio);

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
            return null;
        }
    }

    public static void getBoletos(String lineToSearch) {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\r\n" +
                    "    \"externalTerminal\": \"Terminal de identificação externa do sistema do cliente, Ex: CPF\",\r\n"
                    +
                    "    \"externalNSU\": 0,\r\n" +
                    "    \"barCode\": {\r\n" +
                    "        \"type\": 2,\r\n" +
                    "        \"digitable\": \"" + lineToSearch + "\",\r\n" +
                    "        \"barCode\": \"\"\r\n" +
                    "    }\r\n" +
                    "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer " + tokenBoleto);
            connection.setDoOutput(true);

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            connection.disconnect();

            JOptionPane.showMessageDialog(null, response, "Informacoes", 0);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
