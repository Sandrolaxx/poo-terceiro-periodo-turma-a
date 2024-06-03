package segundo_bimestre.lista3;

import javax.swing.JOptionPane;

public class Opcao {

    public static void main(String[] args) {
        String[] opcoes = {"Opção 1", "Opção 2", "Opção 3"};
        
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Seleção de Opção", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        JOptionPane.showMessageDialog(null, "Você escolheu a " + opcoes[escolha] + "!");
    }
}
