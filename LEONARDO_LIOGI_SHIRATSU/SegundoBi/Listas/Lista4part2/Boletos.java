package SegundoBi.Listas.Lista4part2;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Boletos {

    private static final String TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJ1UVBDOUJUK2N5WG5IOUNaS1dXS3V6dnhOdlE3T0JjMUdMMTRpZ0hEUlBRYXNCSndmd1F2RXBvenJieGJvTTczYlVvNUd6enkvdldVMkRqS0tWVVcwRnhCT1EvYXFEd1lzejJ4SWhHbGZtM052UWxyR3AvU2pDekxtbXU1K2ZpbERjdWdGZXhUMkhqMTBNRVhsNEkwRS8waWJUcGREYUFWWWZBSFpjUWFOTkJhb1pGamRuREM3SE9CK3o0VEhZZ1h4TUEzRHJKakt3d2lRVVYvcU5mWHdyYjhmdGxtSzlOZVd5WURYTHVZRlc2Rmp2ODFMR2EzYWpMemFCUGVzc09aQTRWWWphOE1UL0V0UWppMGM5eWV4eUVDTDErWDZ4T1lIaUU3dm95cTBmbW1NTTFvN3BOaXZWTVo0Q0N1YlloQU5WM0s3T2EvNlBMd2J5TjVhN1hFZTlsTUl5UjVnbVJxWXdiTEorSmthZTgzZEZacGY2Y1Q3VXVyUEJQWDJHNFRtTDBlenJQTEgxd1RhYjlHRHR6V1pBeTA2MUthZ0FqeWpld1E0UkxBcVlJREZDV2JGcjkzNVZjcDhVT1o4QjFTTDJjOG5GNVgrQllJdjVrbDhWQmNTZzdkemZOTWp6b3lXTHRjanhpdmtXbVd5bEJaZnFnM3BrTUtIOHZMdGkwL084b0s5R3lBaXBLblhpL2g3MzdINEVTQ3BvRndJd3ZUVCtqRlZtOE44Snh3eStwQmtta0hpMVRYUkZCNnFSdlcrOHZPZE1rRVRxZFpqM0phRHdQOGFRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiYmQ5MzI2NWJkOTEzNDA1MDg1YjQiLCJleHAiOjE3MTkyNjAxNjMsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.JEnxFih5runeWDXIP_7_NKUcxUeyLfHDHdsPGZCyLuM";
    private static final String CONVENIOS_URL = "https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions";
    private static final String CONSULTA_BOLETO_URL = "https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize";

    public static void main(String[] args) {
        while (true) {
            String[] options = {"Listar Convênios", "Consultar Boleto", "Sair"};
            int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if (choice == 0) {
                listarConvenios();
            } else if (choice == 1) {
                consultarBoleto();
            } else {
                break;
            }
        }
    }

    private static void listarConvenios() {
        try {
            URL url = new URL(CONVENIOS_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + TOKEN);
            conn.setRequestProperty("Content-Type", "application/json");

            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                JOptionPane.showMessageDialog(null, response.toString(), "Convênios", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao listar convênios: " + responseCode, "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao listar convênios: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void consultarBoleto() {
        String linhaDigitavel = JOptionPane.showInputDialog(null, "Digite a linha digitável do boleto:");
        if (linhaDigitavel == null || linhaDigitavel.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Linha digitável não pode ser vazia.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            URL url = new URL(CONSULTA_BOLETO_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Authorization", "Bearer " + TOKEN);
            conn.setRequestProperty("Content-Type", "application/json");

            String jsonInputString = "{ \"digitable\": \"" + linhaDigitavel + "\" }";

            conn.setDoOutput(true);
            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                JOptionPane.showMessageDialog(null, response.toString(), "Consulta de Boleto", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao consultar boleto: " + responseCode, "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao consultar boleto: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

    
