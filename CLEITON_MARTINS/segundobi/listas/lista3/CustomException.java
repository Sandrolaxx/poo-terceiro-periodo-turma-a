package segundobi.listas.lista3;

import javax.swing.JOptionPane;

//Exercício 5
public class CustomException extends Exception
{
    public CustomException(String errorMessage)
    {
        JOptionPane.showMessageDialog(null, errorMessage, "ERRO!", JOptionPane.ERROR_MESSAGE); //Por que usar errorMessage na segunda posição?
    }
}
