package GUSTAVO_MULLER_DE_ARAUJO.segundobim.prova;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String[] opcoes = { "Listagem de alunos", "Criar registro de Testemunho", "Sair" };
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        switch (escolha) {
            case 0:

                ListaAlunos.listarAlunos();

                break;

            case 1:

                CriaTestemunho.criarTestemunho();

                break;

            case 2:

                JOptionPane.showMessageDialog(null, "Saindo...");

                break;

            default:
                break;
        }
    }

}