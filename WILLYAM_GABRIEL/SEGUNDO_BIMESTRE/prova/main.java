package WILLYAM_GABRIEL.SEGUNDO_BIMESTRE.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        List<String> opcoes = List.of("OPÇÃO 1", "OPÇÃO 2", "OPÇÃO 3");

        try {
            String opcao = (String) JOptionPane.showInputDialog(null,
                    "OPÇÃO 1 - LISTA ALUNO\nOPÇÃO 2 - CRIAR TESTEMUNHO\nOPÇÃO 3 - SAIR",
                    "ESCOLHA UMA DAS OPÇÕES",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes.toArray(),
                    opcoes.toArray()[0]);

            switch (opcao) {
                case "OPÇÃO 1":
                    JOptionPane.showMessageDialog(null, "VOCÊ ESCOLHEU A OPÇÃO 1");
                    getListaAlunos();
                    break;

                case "OPÇÃO 2":
                    JOptionPane.showMessageDialog(null, "VOCÊ ESCOLHEU A OPÇÃO 2");
                    getTestemunhos(null);
                    break;

                case "OPÇÃO 3":
                JOptionPane.showMessageDialog(null, "ADEUS");
                break;
            }
        } catch (Exception e) {

        }

    }

    protected static void getListaAlunos() {
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/students");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            int respostaLista = connection.getResponseCode();
            System.out.println(connection.getContent());

            if (respostaLista == HttpURLConnection.HTTP_OK) {
                System.out.println("Requisição OK");

                try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))){
                    StringBuilder resposta = new StringBuilder();
                    String linhaResposta;
                    while ((linhaResposta = br.readLine()) != null) {
                        resposta.append(linhaResposta.trim());
                    }
                    JOptionPane.showMessageDialog(null, "resposta:" + resposta.toString());
                }

                
            }
        } catch (Exception e) {

        }

    }

    protected static void getTestemunhos(String linhaDigitavel) {
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            String infoImagem = JOptionPane.showInputDialog("informe o URL da sua imagem: ");
            String infoTeste = JOptionPane.showInputDialog("escreva o seu testemunho: ");
            String infoRa = JOptionPane.showInputDialog("informe o seu RA: ");

            String testemunhoLista = "{\r\n" + //
                                "  \"imageUrl\": "+infoImagem+",\r\n" + //
                                "  \"description\": "+infoTeste+",\r\n" + //
                                "  \"ra\": "+infoRa+"\n" + //
                                "}";

            //https://avatars.githubusercontent.com/u/161391384?v=4&size=64
            //Acredito que esse bimestre foi mais produtivo que o anterior, mas, por conta das demandas das outras diciplinas, essa materia não teve a devida atenção dos demais alunos (eu me incluo). Quero agradeçer ao Prof. Sandro, pela sua paciencia conosco e por ter pasado um pouco do seu conheçimento para nós. SUCESSO PROF, QUE DEUS ABENÇOE A SUA VIDA <3.
            //10585

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = testemunhoLista.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Verifica a resposta
            int responseCode = connection.getResponseCode();
            System.out.println(connection.getContent());
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("Requisição enviada com sucesso.");
                try (BufferedReader br = new BufferedReader(
                        new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
                    StringBuilder response = new StringBuilder();
                    String responseLine;
                    while ((responseLine = br.readLine()) != null) {
                        response.append(responseLine.trim());
                    }
                    JOptionPane.showMessageDialog( null,"Resposta: " + response.toString());

                }
            } else {
                System.out.println("Erro na requisição: " + responseCode);
            }

        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}