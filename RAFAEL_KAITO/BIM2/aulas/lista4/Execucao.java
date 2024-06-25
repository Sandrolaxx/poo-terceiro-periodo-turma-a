package BIM2.aulas.lista4;

import javax.swing.JOptionPane;

public class Execucao {
     public static void main(String[] args) {
        String[] options = {"Boletos", "Convênios"};
        int opc = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        String result;

        //23793381286008301352856000063307789840000150000
        switch (opc) {
            case 0:
                result = Boletos.getBoleto();
            break;
                        
            case 1:
                result = Convenios.getJsonData();
            break;
            default:
            result = "Nenhuma opção selecionada.";
        }
    }
}