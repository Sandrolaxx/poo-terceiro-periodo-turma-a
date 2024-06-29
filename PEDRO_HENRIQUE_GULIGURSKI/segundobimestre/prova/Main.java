package PEDRO_HENRIQUE_GULIGURSKI.segundobimestre.prova;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        exibirMenu();
    }

    private static void exibirMenu() {
        String[] options = {"Listar Alunos", "Criar Testemunho", "Sair"};

        while (true) {
            int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu Principal",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            switch (choice) {
                case 0:
                    Alunos.getAlunos();      
                    break;
                case 1:
                    Testemunho.setTestemunho();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saindo do programa.", "Encerrando", JOptionPane.INFORMATION_MESSAGE);
                    return;
                default:
                    return;
            }
                
        }

    }
}
