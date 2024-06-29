package RAFAEL_KAITO.BIM2.prova;

import javax.swing.JOptionPane;

public class Aplicacao {
    public static void main(String[] args) {
        String[] options = {"Listagem dos Alunos", "Criar Registro de testemunho", "Sair"};
        int opc = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        String result;

        switch (opc) {
            case 0:
                result = Alunos.getAlunos();
            break;
                        
            case 1:
                result = Testemunhos.getTestemunho();
            break;
            case 2:
            System.out.println("Finalizando...");
            break;
            default:
            result = "Nenhuma opção selecionada.";
        }
    }
}
