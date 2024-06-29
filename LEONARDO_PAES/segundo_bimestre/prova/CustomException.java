package LEONARDO_PAES.segundo_bimestre.prova;

import javax.swing.JOptionPane;

 class CustomException extends Exception {
    public CustomException(String erroMsg) {
        JOptionPane.showMessageDialog(null, erroMsg, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}