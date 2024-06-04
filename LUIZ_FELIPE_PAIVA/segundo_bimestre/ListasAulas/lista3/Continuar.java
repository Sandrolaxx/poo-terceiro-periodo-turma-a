package segundo_bimestre.ListasAulas.lista3;

import javax.swing.JOptionPane;

public class Continuar {

    public static void main(String[] args) {
        perguntarSeDesejaContinuar();
    }

    public static void perguntarSeDesejaContinuar() {
        int resposta = JOptionPane.showConfirmDialog(null, "Você quer continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
        
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu continuar!");
        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu não continuar!");
        }
    }
}
