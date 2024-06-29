package NATHAN_MARIOTTO.segundobi.prova;

import javax.swing.*;
import java.io.IOException;

public class ServicoAluno {
    private static final String URL_ALUNOS = "https://poo-exam.vercel.app/api/students";

    public void listarAlunos() {
        try {
            String resposta = Http.enviarGet(URL_ALUNOS);
            JOptionPane.showMessageDialog(null, resposta, "Lista de Alunos", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException | InterruptedException e) {
            DialogoErro.mostrarErro("Erro ao listar alunos: " + e.getMessage());
        }
    }
}
