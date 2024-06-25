package GetPostSemToken;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        while (true) {
            String[] options = {"Listar Convênios", "Consultar Boleto"};
            int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
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
            URL url = new URL("URL_DA_API_LISTAGEM_DE_CONVENIOS");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                JOptionPane.showMessageDialog(null, response.toString(), "Convênios", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao listar convênios", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void consultarBoleto() {
        String linhaDigitavel = JOptionPane.showInputDialog("Digite a linha digitável do boleto:");
        if (linhaDigitavel != null && !linhaDigitavel.trim().isEmpty()) {
            try {
                URL url = new URL("URL_DA_API_CONSULTA_BOLETO" + linhaDigitavel);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json");
                conn.setDoOutput(true);

                String jsonInputString = "{\"barcode\":\"" + linhaDigitavel + "\"}"; // Aqui você pode adicionar parâmetros adicionais se necessário

                try (OutputStream os = conn.getOutputStream()) {
                    byte[] input = jsonInputString.getBytes("utf-8");
                    os.write(input, 0, input.length);
                }

                int responseCode = conn.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    String inputLine;
                    StringBuilder response = new StringBuilder();

                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();

                    JOptionPane.showMessageDialog(null, response.toString(), "Resultado da Consulta", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao consultar boleto", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Linha digitável inválida", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
