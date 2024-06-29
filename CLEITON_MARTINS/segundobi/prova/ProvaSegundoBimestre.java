package CLEITON_MARTINS.segundobi.prova;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ProvaSegundoBimestre {
    
    public static void main(String[] args) 
    {    
        JFrame frame = new JFrame("ShowInputDialog SelectOne");
        List<String> lista = List.of("Get","Post","Sair");

        String lista1 = (String) JOptionPane.showInputDialog(
            frame,
            "Insira uma alternativa",
            "Escolha:",
            JOptionPane.QUESTION_MESSAGE,
            null,
            lista.toArray(),
            lista.toArray()[0]);
        
        if (lista == lista.toArray()[2]) 
        {
            System.exit(0);
        }
    }
}
