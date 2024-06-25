import javax.swing.JOptionPane;

public class JOptionSampleTwo {
    
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog(
            null,
            "Informe seu nome:",
            "Informe seus dados!",
            JOptionPane.QUESTION_MESSAGE);

        System.out.println(nome);
    }
}
