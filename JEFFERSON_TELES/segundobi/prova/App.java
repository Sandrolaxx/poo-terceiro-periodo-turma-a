package JEFFERSON_TELES.segundobi.prova;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class App {
    private static final String BASE_URL = "https://poo-exam.vercel.app/api";
    private static final HttpClient httpClient = HttpClient.newHttpClient();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(App::criarGUI);
    }

    private static void criarGUI() {
        JFrame frame = new JFrame("Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JButton btnListarAlunos = new JButton("Listagem de Alunos");
        JButton btnCriarTestemunho = new JButton("Criar Novo Testemunho");
        JButton btnSair = new JButton("Sair");

        btnListarAlunos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = BASE_URL + "/students";
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .GET()
                        .build();

                enviarRequisicao(request);
            }
        });

        btnCriarTestemunho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fotoUrl = JOptionPane.showInputDialog("Informe a URL da foto:");
                String ra = JOptionPane.showInputDialog("Informe o RA do aluno:");
                String texto = JOptionPane.showInputDialog("Informe o texto do testemunho:");

                if (texto != null && !texto.isEmpty()) {
                    String url = BASE_URL + "/testimonial";
                    String requestBody = String.format("fotoUrl=%s&ra=%s&texto=%s", fotoUrl, ra, texto);
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(url))
                            .header("Content-Type", "application/x-www-form-urlencoded")
                            .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                            .build();

                    enviarRequisicao(request);
                } else {
                    exibirModalErro("Necessário informar seu depoimento!");
                }
            }
        });

        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Encerrando a aplicação...");
                System.exit(0);
            }
        });

        panel.add(btnListarAlunos);
        panel.add(btnCriarTestemunho);
        panel.add(btnSair);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    private static void enviarRequisicao(HttpRequest request) {
        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status code: " + response.statusCode());
            System.out.println("Resposta: " + response.body());
        } catch (Exception e) {
            System.err.println("Erro ao fazer a requisição: " + e.getMessage());
        }
    }

    private static void exibirModalErro(String mensagem) {
        JOptionPane.showMessageDialog(null, "Erro: " + mensagem);
    }
}
