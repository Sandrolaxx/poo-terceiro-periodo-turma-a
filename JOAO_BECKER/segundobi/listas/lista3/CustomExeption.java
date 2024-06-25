package segundobi.listas.lista3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CustomExeption extends RuntimeException{
    
    private final JFrame frame = new JFrame();

    public CustomExeption(String message){
        JOptionPane.showMessageDialog(frame, message, "Erro não esperado", JOptionPane.ERROR_MESSAGE);
    }
}
