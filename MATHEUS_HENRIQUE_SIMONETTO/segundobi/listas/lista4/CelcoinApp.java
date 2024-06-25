package segundobi.listas.lista4;

import javax.swing.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class CelcoinApp {
    private static final String TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiIrekk5Z3l2RS9MeGhWY0tLcCtNU1dNRFdYcmNLSlZ5VUxOSm1oaUR5Mk4wdnhKK0ljMDZjQWlGWFovKzFqaG5UL0E1elYrR3dqMmVKS3JBUHAwQ1BsTFN6SUR0WVlnQUNVR0k3RmlqdGsycDQ5b2FQVC9ySkJqaC9NRXJkRkVpU1d3L21adHNOZStVdlRGT01DajNqQkNWb0FBQ0cxYWpOVS9yVjdsZm93YzNtNFBkeHEzZWpXRW5YbjhJbHgxRytEWWkyRG5rbVZudk5TZXYwNUtMR1VrcklEV0pqY3ZKWVdzTyt6WFpHWWVmMFVYSktrdmlCMXM1REVudVNsSE0vc0pCQ251WW9wUEEvMlVQTkZBMWk2eFgySGljbGtPQjBjS1daYUpjTXh3Tzc1Z2hEbFNiKytiVExCY2pGMjVOOWtZRlpCaGkxam03RUlZdXFxbEhJY1Z0MEZGTUdVSnZiUjJVTzVuUUFNQ1l4ZFJEeVlRUmhBbmV2aWtqTWMyaTRIV3pjTEVWanF3d0VDNFQ4WXlHN3RRQzdQaCtDb0ZBWk0rR1pTbGZSOHNPMHVoYUF0WmZJaXprWlB6emRDYmZWa0Q2UklDZkg3Myswc2J0SnIxaFBGYVZ3UGpkS1ZVbFpBMElkVHZCODF0elQ4b3ZrUVlWMjI1U09kZ01odHIxcVZ3b0hmTWhHZEkvWEJQRUcxVm00OXR5dDhrdWJGc1E2NUFxekx4UmFNanZ3MDIwUmUzdnU1eFhzcEpxNjBwV3ZBSjdhMjVrcDhhMitEL2tJY3J2QkxnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiODE1ZmRlNzI5ZjViNDljYWFkMzkiLCJleHAiOjE3MTkyMDYwOTEsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.qiQLuCBnM_Ajjp_p9_H3ZyBEcRiD__zUzzHLXWyp8Po\"";
    private static final String CONVENIOS_URL = "https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions";
    private static final String BOLETOS_URL = "https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize";

    public static void main(String[] args) {
        while (true) {
            String[] options = {"Listar Convênios", "Consultar Boleto", "Sair"};
            int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    listarConvenios();
                    break;
                case 1:
                    consultarBoleto();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
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

            InputStream responseStream = conn.getInputStream();
            Scanner scanner = new Scanner(responseStream);
            String response = scanner.useDelimiter("\\A").next();
            scanner.close();

            JOptionPane.showMessageDialog(null, response, "Convênios", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao listar convênios: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void consultarBoleto() {
        String linhaDigitavel = JOptionPane.showInputDialog("Digite a linha digitável do boleto:");
        if (linhaDigitavel != null && !linhaDigitavel.trim().isEmpty()) {
            try {
                URL url = new URL(BOLETOS_URL + "/" + linhaDigitavel);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setRequestProperty("Authorization", "Bearer " + TOKEN);
                conn.setRequestProperty("Content-Type", "application/json");

                InputStream responseStream = conn.getInputStream();
                Scanner scanner = new Scanner(responseStream);
                String response = scanner.useDelimiter("\\A").next();
                scanner.close();

                JOptionPane.showMessageDialog(null, response, "Consulta de Boleto", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao consultar boleto: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "INVALIDO!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
