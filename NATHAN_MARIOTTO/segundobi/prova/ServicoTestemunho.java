package NATHAN_MARIOTTO.segundobi.prova;

import javax.swing.*;
import java.io.IOException;

public class ServicoTestemunho {
    private static final String URL_TESTEMUNHO = "https://poo-exam.vercel.app/api/testimonial";
    private static final String URL_FOTO = "https://avatars.githubusercontent.com/u/115180122?v=4";

    public void criarTestemunho() {
        try {
            String raAluno = JOptionPane.showInputDialog("Informe o RA do aluno:");
            String texto = JOptionPane.showInputDialog("Informe o texto do testemunho:");

            String dados = String.format("{\"imageUrl\":\"%s\", \"ra\":\"%s\", \"description\":\"%s\"}", URL_FOTO, raAluno, texto);
            String resposta = Http.enviarPost(URL_TESTEMUNHO, dados);
            JOptionPane.showMessageDialog(null, resposta, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException | InterruptedException e) {
            DialogoErro.mostrarErro("Erro ao criar testemunho: " + e.getMessage());
        }
    }
}
