package exercices.list3;

import javax.swing.JOptionPane;

public class customException extends RuntimeException {
    
   customException(String msgError){

        JOptionPane.showMessageDialog(null,
                "O erro ocorrido foi '" +msgError+ "'",
                "ERRO",
                JOptionPane.ERROR_MESSAGE);
   }

}
