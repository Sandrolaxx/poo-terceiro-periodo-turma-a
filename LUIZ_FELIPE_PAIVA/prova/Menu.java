package LUIZ_FELIPE_PAIVA.prova;

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        String[] options = {"Alunos", "Testemunho", "Sair"};
        int choice = JOptionPane.showOptionDialog(
            null,
            "Escolha uma opção:",
            "Menu de Opções",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]
        );

        switch (choice) {
            case 0:
                ConsultaAlunos.main(null);
                break;
            case 1:
                Testemunho.main(null);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Saindo do programa.");
                System.exit(0);
                break;
            default:
                
                break;
        }
    }
}
