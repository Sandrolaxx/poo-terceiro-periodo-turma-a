package segundobi.listas.lista4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;


    public class Convenio {
        
        // Estáticos para não serem alterados
        private static final String TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJLQW9lUTVSM0lmcXpkMHp2cFdLYjNISnd6eThtMW82Skx1cHAzQko5MkcxT2l3Y1grdVEyaEYyV212ZmVBZmM2RFYzby9DMmtydEdYeFZHQWdMbDMwL0FVWXBFVnJiL2ZrcU1zbFNpWHhhL0Jnd3UxVzdlRExIY3pUREpWR001RUNoWkQ5Z2pNdm5VVENyV2w2YkxUcUlhR3J3QXdKQ1p2MzErRWJZWFd6TldHd0VSM0dTYXh2RmFKaXVrRkZUTnpuQmxNU0ZhVjhKaXhNYTdnRWcvSm9wUHB0a09OSTNqZTVsakd3bEVrWXlxQUh2OUUvaFNDOG9pcXo4QlNYU2Z4U2VoRnNLVzZDUzhWeWJzdHVwYVA2NHJkREw3Qm5nTVpxZHJidUF0TnlENC9BcFI2U3ZjUmwxczN0MmxzU3lZSUVnUzV1ZlNsTTBZbHRWaGRaWTZxdS9mdlZ4Q3hsUGNlY1Q1azlncFBwSXh6YkZxbHNWaFJBcGc4N0I0NFUrOGxHRE45MlV5Z3dIWDB1UldXb2tTd29IcGdMSHo4NTRndXV4NEZmenZyeXd4M2hlaUlhSy9SOUtoQ0o2VTViVjhjMFdRcGs3VlRwOUVyNmhHbC9BUjBWTWpXNi80S0w0SjIvM1I4SkVKN0tFTnlhbG0ybnAvaHYreDdHc0tCTVpVaTJzK0dtOGFRT0VTVm1tMGlpeTNSQ1Z1NDJsY00vNXF1SlBpSldhNDk3Z0dBSVQraFBqd2FlWE1MRnQ3QXRoQTlmNWhtUGNrZWgzS1FWdmJXdDRNQ1ZBPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMDRmOTU4NjgzOGE0NDYxMmIzYzYiLCJleHAiOjE3MTkyNjE5NTIsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.mvS9WPTbOW1l8orebH3lhqVV9IPPJDAKKW_47ORLIEo";
        private static final String URL_LISTAGEM_CONVENIOS = "https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions";
        private static final String URL_CONSULTA_BOLETOS = "https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize";

        public static void main(String[] args) {

            // Menu com JOptionPane
            while (true) {
                String[] options = {
                    "Listagem de Convênios",
                    "Consulta de Boletos",
                    "Sair"};

                int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Seja bem vindo ao Celcoin, escolha o serviço abaixo", 
                    "Menu", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.INFORMATION_MESSAGE, 
                    null, 
                    options, 
                    options[0]);

                    if (escolha == 0) {
                        listagemDeConvenios(); // Método de Listar Convênios
                    } else if (escolha == 1) {
                        consultaDeBoletos(); // Método de Consultar Boletos
                    } else {
                        break; // Fecha o menu
                    }
                    }

            }

            private static void listagemDeConvenios() {
            try{
                // URL da Requisição
                URL url = new URL(URL_LISTAGEM_CONVENIOS);
                // Classe Auxiliar - Realização de Request HTTP
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                // Configuração de Request
                connection.setRequestMethod("GET");
                connection.setRequestProperty("Authorization", "Bearer " + TOKEN); // ESPAÇO NO BEARER
                connection.setRequestProperty("Accept", "application/json");

                // Leitura de Dados
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                // Saída de Dados
                JOptionPane.showMessageDialog(
                    null,
                    response.toString(),
                    "Lista de Convênios",
                    JOptionPane.INFORMATION_MESSAGE);

                } catch (Exception e) { // Se caso der Erro
                    JOptionPane.showMessageDialog(
                        null, 
                        "Erro durante a listagem de convênios: " + e.getMessage(),
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);

                }

            }
        
        private static void consultaDeBoletos() {

        // Valor padrão de teste
        String valorPadrao = "23793381286008301352856000063307789840000150000";


            // Entrada de Dados
            String espaco = JOptionPane.showInputDialog(
                null,
                "Digite o espaço em branco do boleto",
                valorPadrao);

            // Se caso estiver Vazio
            if (espaco == null || espaco.isEmpty()) {
                JOptionPane.showMessageDialog(
                    null,
                    "Espaço está vazio, não pode isto!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
                    return;
            }

            

            try{
                // URL da Requisição
                URL url = new URL(URL_CONSULTA_BOLETOS);
                // Classe Auxiliar - Realização de Request HTTP
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                // Configuração de Request
                connection.setRequestMethod("POST");
                connection.setRequestProperty("Authorization", "Bearer " + TOKEN); // ESPAÇO NO BEARER
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setRequestProperty("Accept", "application/json");
                connection.setDoOutput(true);

                // Conversão de bytes (JSON) para bytes (HTTP)
                String json = String.format("{\"digitableLine\": \"%s\"}", espaco);
                try (OutputStream os = connection.getOutputStream()) {
                    byte[] input = json.getBytes(StandardCharsets.UTF_8);
                    os.write(input, 0, input.length);
                }

                //Leitura de Dados
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                reader.close();
                connection.disconnect();

                // Saída de Dados
                JOptionPane.showMessageDialog(
                    null, 
                    response.toString(),
                    "Consulta de Boleto",
                    JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog( // Se caso der erro
                    null, 
                    "Erro durante a consulta do boleto: " + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            }
            }
        }
    

