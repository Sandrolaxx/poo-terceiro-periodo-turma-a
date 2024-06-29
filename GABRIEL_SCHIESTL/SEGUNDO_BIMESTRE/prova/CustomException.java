package GABRIEL_SCHIESTL.SEGUNDO_BIMESTRE.prova;

import javax.swing.JOptionPane;

public class CustomException extends RuntimeException {

    public CustomException(Exception error) {

        JOptionPane.showMessageDialog(null, error.getMessage(),
                "Erroooooou", JOptionPane.ERROR_MESSAGE);
    }
}
