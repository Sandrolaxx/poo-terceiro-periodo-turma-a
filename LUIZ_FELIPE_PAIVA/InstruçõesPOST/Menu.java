package InstruçõesPOST;

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        String[] options = {"Convênio", "Boleto", "Sair"};
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
                // Chamar o código para Convênio
                Lista4pt2.Convenio.main(null);
                break;
            case 1:
                // Chamar o código para Boleto
                Lista4pt2.Boleto.main(null);
                break;
            case 2:
                // Encerrar o programa
                JOptionPane.showMessageDialog(null, "Saindo do programa.");
                System.exit(0);
                break;
            default:
                
                break;
        }
    }
}
