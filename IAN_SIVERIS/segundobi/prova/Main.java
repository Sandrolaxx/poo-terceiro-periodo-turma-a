package IAN_SIVERIS.segundobi.prova;

import javax.swing.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

class Aluno {
    private String ra;
    private String nome;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

class Testemunho {
    private String ra;
    private String urlFoto;
    private String texto;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}

class AlunoService {
    private static final String BASE_URL = "https://poo-exam.vercel.app/api/students";

    public List<Aluno> listarAlunos() throws IOException {
        URL url = new URL(BASE_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        int responseCode = conn.getResponseCode();
        if (responseCode != HttpURLConnection.HTTP_OK) {
            throw new IOException("Erro na comunicação com a API: " + responseCode);
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder response = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        List<Aluno> alunos = new ArrayList<>();
        
        String jsonResponse = response.toString();
        // Removendo os colchetes do início e fim da resposta JSON
        jsonResponse = jsonResponse.substring(1, jsonResponse.length() - 1);
        String[] alunosArray = jsonResponse.split("\\},\\{");
        for (String alunoJson : alunosArray) {
            Aluno aluno = new Aluno();
            String[] campos = alunoJson.split(",");
            aluno.setRa(campos[0].split(":")[1].replaceAll("\"", "").trim());
            aluno.setNome(campos[1].split(":")[1].replaceAll("\"", "").trim());
            alunos.add(aluno);
        }

        return alunos;
    }
}

class TestemunhoService {
    private static final String BASE_URL = "https://poo-exam.vercel.app/api/testimonial";

    public void criarTestemunho(Testemunho testemunho) throws IOException {
        URL url = new URL(BASE_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        String jsonInputString = "{\"ra\": \"" + testemunho.getRa() + "\", " +
                "\"urlFoto\": \"" + testemunho.getUrlFoto() + "\", " +
                "\"texto\": \"" + testemunho.getTexto() + "\"}";

        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        int responseCode = conn.getResponseCode();
        if (responseCode != HttpURLConnection.HTTP_CREATED && responseCode != HttpURLConnection.HTTP_OK) {
            throw new IOException("Erro na comunicação com a API: " + responseCode);
        }
    }
}

class MenuView {
    private AlunoService alunoService;
    private TestemunhoService testemunhoService;

    public MenuView() {
        this.alunoService = new AlunoService();
        this.testemunhoService = new TestemunhoService();
    }

    public void exibirMenu() {
        int opcao = 0;
        while (opcao != 3) {
            String input = JOptionPane.showInputDialog(
                    "Menu:\n" +
                            "1. Listar alunos\n" +
                            "2. Criar registro de testemunho\n" +
                            "3. Sair\n" +
                            "Escolha uma opção:");
            try {
                opcao = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                continue;
            }

            switch (opcao) {
                case 1:
                    listarAlunos();
                    break;
                case 2:
                    criarTestemunho();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        }
    }

    private void listarAlunos() {
        try {
            List<Aluno> alunos = alunoService.listarAlunos();
            StringBuilder sb = new StringBuilder();
            sb.append("Lista de alunos:\n");
            for (Aluno aluno : alunos) {
                sb.append("RA: ").append(aluno.getRa()).append(", Nome: ").append(aluno.getNome()).append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar alunos: " + e.getMessage());
        }
    }

    private void criarTestemunho() {
        try {
            String ra = JOptionPane.showInputDialog("Digite o RA do aluno:");
            String urlFoto = JOptionPane.showInputDialog("Digite a URL da foto:");
            String texto = JOptionPane.showInputDialog("Digite o texto do testemunho:");

            Testemunho testemunho = new Testemunho();
            testemunho.setRa(ra);
            testemunho.setUrlFoto(urlFoto);
            testemunho.setTexto(texto);

            testemunhoService.criarTestemunho(testemunho);
            JOptionPane.showMessageDialog(null, "Testemunho criado com sucesso!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar testemunho: " + e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MenuView menuView = new MenuView();
        menuView.exibirMenu();
    }
}
