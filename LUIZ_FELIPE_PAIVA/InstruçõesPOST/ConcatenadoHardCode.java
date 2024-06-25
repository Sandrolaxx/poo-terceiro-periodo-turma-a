package InstruçõesPOST;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class ConcatenadoHardCode {
    public static void main(String[] args) {
        System.out.println(gerBoleto());
    }

    public static String gerBoleto() {
        try {
            //URL alvo da request NÃO MUDA
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

            //criando conexão HTTP para a URL especificada NÃO MUDA
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            String linhaDigitavel = "23793381286008301352856000063307789840000150000";

            // Dados do json NÃO MUDA, somente o JSON a passar
            String json = " {\n" + //
                                "  \"barCode\": {\n" + //
                                "    \"type\": 0,\n" + //
                                "    \"digitable\":"+linhaDigitavel+"\n" + //
                                "  }\n" + //
                                "}\n" + //
                                "";

            // Dados da Headers da nossa request e configs. NÃO MUDAM, sem autorização remover os /r
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJYK1REcjJ0VG1rMUk5QmEvUnFCY0E2STBxNkpmWDVEcTN1Nzg1dUhLOURJcmxreFJGNkwxSnhjNE9MTHdiMmRoU0grQXorbDVad2NIZ2JNQ0JGbW04OFNKd1JwR1V3WEhNWVhtT2JaRXM5LzdVbmIzeDJubzZhaTc2VTRYMkJ1SVhCOUVvSXFtOWEyZ0ZiZ2Qwdm9zOEN3b0U2Q2V2c3MvcmN4Z2FHRm15NkcwMEdueE9RNmxsQlBoaE1SQzkrYUcrT0pmTExzZTFPUWNPM2ROMEhVaGRUcWVxZEpyMFoxTFpycG9qNzBDQ214K3JXZzhMQS9BVUVtUHlBRjJkWE9JUFZOc2FObFVsMzNGZFZHRTIzdGV5NnQ2ZXFrUE4zRFVjVHZMM3ozbXFCSE5iZGhxM0UreEE4dFFSMVpqWmZYcTlnNjcvbm1ENVFUVVRzdWU2b2psVVFRV2hOWUVoTjZPNHk1SFlLT1NZYXlETzdkSWhHQk5ucVBPa2EzbDlGa3JadjNmaFlMUXFmRnltSGcybG5ZTDE2cFJtZkJIZ3V1S3QwMWpGVG5qREF4bkFxWTNHRnNZby9EV3VnVmMxSmM3L0hoZGpuc2RNY0h0Y3p4d0VwK3dlR3lNb1pQUTlQMmJtV2ZNekYrRjMwUFVSdFdlQXl1RER1ZkFzVVpnbkxPODA2Lzgybjk3M2V1dG8ydERML0QyZ0xsMnY3a3kvalMrMzdrc29zTmZXdW04TnlMRU9wNndqZXpkU1d3dHdtU0RnWllkNnZBeDBkV3YvaUxwaDJBZzdRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiOWFhYzkyOWY0ZmIxNDE0ODg5Y2UiLCJleHAiOjE3MTkyNDA5NTYsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.EA9rnBq-4Holtu3C7R8aa3Ayvl770qVfuyLv5d8WBBA");
            
            //Tem json vai o codigo abaixo
            connection.setDoOutput(true);

            // Escrevendo JSON na request provavelmente não muda
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Lendo retorno JSON da request e atribuindo em uma String, ler a resposta da API caso ela tenha
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
