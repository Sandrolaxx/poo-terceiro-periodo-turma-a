import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

         try (Scanner scanner = new Scanner(System.in)){

            JFrame frame = new JFrame("Atividade");

            //Escolha do fluxo
            List<String> fluxos = List.of("Cidadão","Defensoria");

            String opcao = (String) JOptionPane.showInputDialog(frame,
                    "Escolha uma opção",
                    "Atividade 4",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    fluxos.toArray(),
                    fluxos.toArray()[0]);

         }
    }
}
