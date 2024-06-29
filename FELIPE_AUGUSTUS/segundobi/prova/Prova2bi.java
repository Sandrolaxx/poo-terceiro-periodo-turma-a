package FELIPE_AUGUSTUS.segundobi.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Prova2bi {

    public static void main(String[] args) {
        while (true) {
            try {
                String[] opcoes = { "Listagem dos alunos", "Criar registro de testemunho", "Sair" };
                int escolha = exibirMenu("Escolha uma opção", "Menu", opcoes);

                switch (escolha) {
                    case 0:
                        listarAlunos();
                        break;
                    case 1:
                        criarTestemunho();
                        break;
                    case 2:
                        encerrar();
                        return;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                        break;
                }

            } catch (Exception e) {
                exibirErro("Ocorreu um erro na aplicação.");
            }
        }
    }

    public static int exibirMenu(String mensagem, String titulo, String[] opcoes) {
        return JOptionPane.showOptionDialog(null, mensagem, titulo, JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
    }

    public static void exibirErro(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public static void listarAlunos() {
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/students");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            JFrame frame = new JFrame("Listagem de Alunos");
            JOptionPane.showMessageDialog(frame, response.toString(), "Alunos",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            exibirErro("Erro ao buscar dados dos alunos.");
        }
    }

    public static void criarTestemunho() {
        try {
            String urlFoto = JOptionPane.showInputDialog(null, "Digite a URL da foto:");
            String raAluno = JOptionPane.showInputDialog(null, "Digite o RA do aluno:");
            String textoTestemunho = JOptionPane.showInputDialog(null, "Digite o texto do testemunho:");

            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String requestBody = "{"
                    + "\"imageUrl\": \"" + urlFoto + "\", "
                    + "\"ra\": \"" + raAluno + "\", "
                    + "\"description\": \"" + textoTestemunho + "\""
                    + "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = requestBody.getBytes(StandardCharsets.UTF_8);
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

            JOptionPane.showMessageDialog(null, "Testemunho criado com sucesso!", "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            exibirErro("Erro ao criar testemunho.");
        }
    }

    public static void encerrar() {
        JOptionPane.showMessageDialog(null, "Encerrando a aplicação.", "Encerramento",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
