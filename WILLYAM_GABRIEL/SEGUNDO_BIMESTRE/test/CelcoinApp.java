package SEGUNDO_BIMESTRE.test;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;

public class CelcoinApp {

    private static final String API_URL_CONVENIOS = "https://developers.celcoin.com.br/reference/obtenha-a-lista-de-conv%C3%AAnios";
    private static final String API_URL_BOLETOS = "https://developers.celcoin.com.br/reference/pagamento-de-contas-2";
    private static final String TOKEN = "SEU_TOKEN_AQUI"; // Insira seu token de autenticação aqui

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new CelcoinApp().run());
    }

    private void run() {
        int option;
        do {
            option = JOptionPane.showOptionDialog(null,
                    "Escolha uma opção:",
                    "Menu Celcoin",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    new String[]{"Listar Convênios", "Consultar Boleto", "Sair"},
                    "Listar Convênios");

            switch (option) {
                case 0:
                    listarConvenios();
                    break;
                case 1:
                    consultarBoleto();
                    break;
                case JOptionPane.CLOSED_OPTION:
                    System.out.println("Saindo da aplicação...");
                    break;
            }
        } while (option != JOptionPane.CLOSED_OPTION);
    }

    private void listarConvenios() {
        // Implementar a lógica para listar convênios (substitua pelo seu código)
        JOptionPane.showMessageDialog(null, "Função de Listar Convênios ainda não implementada!");
    }

    private void consultarBoleto() {
        String linhaDigitavel = JOptionPane.showInputDialog("Digite a linha digitável do boleto:");
        if (linhaDigitavel != null && !linhaDigitavel.isEmpty()) {
            try {
                URL url = new URL(API_URL_BOLETOS);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json");
                conn.setRequestProperty("Authorization", "Bearer " + TOKEN);

                // Criar JSON com a linha digitável (substitua pelo seu código)
                String jsonData = "{\"linhaDigitavel\": \"" + linhaDigitavel + "\"}";

                conn.setDoOutput(true);
                conn.getOutputStream().write(jsonData.getBytes());

                int responseCode = conn.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    // Processar a resposta JSON para exibir detalhes do boleto (substitua pelo seu código)
                    BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                    reader.close();

                    // Exibir detalhes do boleto em JOptionPane
                    JOptionPane.showMessageDialog(null, "Detalhes do boleto:\n" + response.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao consultar boleto. Código: " + responseCode);
                }
                conn.disconnect();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        }
    }
}
