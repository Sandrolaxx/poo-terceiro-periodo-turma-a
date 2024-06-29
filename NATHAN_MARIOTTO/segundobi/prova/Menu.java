package NATHAN_MARIOTTO.segundobi.prova;

import javax.swing.*;

public class Menu {
    private final ServicoAluno servicoAluno;
    private final ServicoTestemunho servicoTestemunho;

    public Menu() {
        servicoAluno = new ServicoAluno();
        servicoTestemunho = new ServicoTestemunho();
    }

    public void exibir() {
        while (true) {
            String[] opcoes = {"Listar Alunos", "Criar Testemunho", "Sair"};
            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu Principal",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            switch (escolha) {
                case 0:
                    servicoAluno.listarAlunos();
                    break;
                case 1:
                    servicoTestemunho.criarTestemunho();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
