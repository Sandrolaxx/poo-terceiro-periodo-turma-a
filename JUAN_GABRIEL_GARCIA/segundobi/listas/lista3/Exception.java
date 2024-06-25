package segundobi.listas.lista3;

import javax.swing.JOptionPane;

public class Exception extends RuntimeException{
    
    public Exception(String aviso) {

        JOptionPane.showMessageDialog(null,
        aviso,
        "DEU ERRO MEU LAMBISGOIO!!!",
        JOptionPane.ERROR_MESSAGE);
    }
}
