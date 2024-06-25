import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionSampleThree {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("ShowInputDialog SelectOne");
        List<String> professores = List.of("Sandro","Rita","Elenildo","Andrade","Elaine");

        String professor = (String) JOptionPane.showInputDialog(
            frame,
            "Qual seu professor favorito?",
            "O melhor professor",
            JOptionPane.QUESTION_MESSAGE,
            null,
            professores.toArray(),
            professores.toArray()[0]);

        JOptionPane.showMessageDialog(frame, "meu professor favorito é " + professor);
        System.exit(0);
    }
}
