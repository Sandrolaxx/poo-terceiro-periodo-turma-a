package BIM2.aulas.lista3;

import javax.swing.JOptionPane;

public class Excecao extends RuntimeException{
    public Excecao (String message){
        JOptionPane.showMessageDialog(null, message, "Erro", JOptionPane.ERROR_MESSAGE);

    } 
    
}
