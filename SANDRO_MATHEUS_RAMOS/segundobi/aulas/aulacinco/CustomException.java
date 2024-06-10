package segundobi.aulas.aulacinco;

import javax.swing.JOptionPane;

public class CustomException extends RuntimeException {

    CustomException(String errorMsg) {
        JOptionPane.showMessageDialog(
                null,
                errorMsg,
                "ERRROOO!!!!",
                JOptionPane.ERROR_MESSAGE);
    }

}
