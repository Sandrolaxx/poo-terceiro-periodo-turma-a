package SEGUNDO_BIMESTRE.listas.lista3;

import javax.swing.JOptionPane;

public class CustomException extends RuntimeException {

    public CustomException(String message) {

        JOptionPane.showMessageDialog(null, message,
                "Errou vacilao", JOptionPane.ERROR_MESSAGE);

    }

}
