package WYLLIAN_SILVA.seundobi.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class ProvaPOO2BIM {

    public static void main(String[] args) {
        String menuOpcoes = JOptionPane.showInputDialog(null, "Escolha uma opção: \n1 - Listagem dos alunos \n2 - Criar registro de testemunho\n3 - Sair", "MENU", JOptionPane.QUESTION_MESSAGE);

        int escolhaOpcoes = Integer.parseInt(menuOpcoes);
        switch (escolhaOpcoes) {
            case 1:
                ListagemAluno();
                break;
            case 2:
                CriarTestemunho();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Você escolheu sair.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "ERRO - SELEÇÃO INVÁLIDA", "404", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    public static void ListagemAluno() {
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/students");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            JFrame frame = new JFrame("Listagem dos alunos");
            JOptionPane.showMessageDialog(frame, response.toString().substring(0, 200), "LISTAGEM ALUNOS", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void CriarTestemunho() {
        try {
            String imageUrl = JOptionPane.showInputDialog(null, "Insira a URL da foto:", "URL", JOptionPane.QUESTION_MESSAGE);
            String ra = JOptionPane.showInputDialog(null, "Insira seu RA:", "RA", JOptionPane.QUESTION_MESSAGE);
            String description = JOptionPane.showInputDialog(null, "Insira uma breve descrição:", "DESCRIÇÃO", JOptionPane.QUESTION_MESSAGE);

            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\r\n" + //
                    "  \"imageUrl\": \"" + imageUrl + "\",\r\n" + //
                    "  \"description\": \"" + description + "\",\r\n" + //
                    "  \"ra\": \"" + ra + "\"\r\n" + //
                    "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
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

            JOptionPane.showMessageDialog(null, "Testemunho criado!", "TESTEMUNHO_CRIADO", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao criar, certifique se escreveu certo os campos", "ERRO_404", JOptionPane.ERROR_MESSAGE);
        }
    }
}
