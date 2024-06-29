package JORGE_BASTOS.segundobi.prova;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ListaAlunos listaAlunos = new ListaAlunos();
        RegistroTestemunho registroTestemunho = new RegistroTestemunho();

        while (true) {
            String[] options = {"Listagem dos alunos", "Criar registro de testemunho", "Sair"};
            int option = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (option) {
                case 0:
                    listaAlunos.listar(null, 20d);
                    break;
                case 1:
                    String imageUrl = JOptionPane.showInputDialog("Foto (URL):");
                    String ra = JOptionPane.showInputDialog("RA:");
                    String description = JOptionPane.showInputDialog("Testemunho:");
                    registroTestemunho.registrar(imageUrl, description, ra);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Fechando");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}
