package segundobi.listas.lista3;

import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Atv 1
        JOptionPane.showMessageDialog(null,
        "Hello World!",
        "Atividade 1",
        JOptionPane.INFORMATION_MESSAGE);

        // Atv 2
        String nome = JOptionPane.showInputDialog(null,
        "Coloque seu nome no campo abaixo:");

        JOptionPane.showMessageDialog(null,
        "Bem vindo " + nome,
        "Atividade 2",
        JOptionPane.INFORMATION_MESSAGE);

        // Atv 3
        int confirm = JOptionPane.showConfirmDialog(null,
        "Deseja continuar?",
        "Atividade 3",
        JOptionPane.INFORMATION_MESSAGE);

        if (confirm == 0) {
        JOptionPane.showMessageDialog(null,
        "Voce continuou!",
        "Atividade 3",
        JOptionPane.INFORMATION_MESSAGE);
        }

        if (confirm == 1) {
        JOptionPane.showMessageDialog(null,
        "Voce NÃO continuou!",
        "Atividade 3",
        JOptionPane.INFORMATION_MESSAGE);
        }

        // Atv 4
        List<String> opcoes = List.of("Opção 1", "Opção 2", "Opção 3");

        String escolhaOpcoes = (String) JOptionPane.showInputDialog(null,
        "Escolha uma das opções abaixo:",
        "Atividade 4",
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoes.toArray(),
        opcoes.toArray()[0]);

        JOptionPane.showMessageDialog(null, "Opção escolhida: " + escolhaOpcoes);

        // Atv 5
        int confirmar = JOptionPane.showConfirmDialog(null,
        "Clique em SIM para confirmar!",
        "Atividade 5",
        JOptionPane.INFORMATION_MESSAGE);

        if (confirmar == 0) {
        JOptionPane.showMessageDialog(null,
        "Voce confirmou patrão!",
        "Atividade 5",
        JOptionPane.PLAIN_MESSAGE);
        }

        if (confirmar == 1) {
        throw new Exception("Errou patrão!");
        }

        if (confirmar == 2) {
        throw new Exception("Errou patrão!");
        }

        // Atv 6
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Coloque o primeiro valor:",
                "Calculadora topzera",
                JOptionPane.INFORMATION_MESSAGE));
       
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Coloque o segundo valor:",
                "Calculadora topzera",
                JOptionPane.INFORMATION_MESSAGE));

        String calculadora = JOptionPane.showInputDialog(null,
                "Escolha uma operação:\n+ (somar)\n- (subtrair)\n" +
                        "* (multiplicar)\n/ (dividir)",
                "Calculadora topzera",
                JOptionPane.INFORMATION_MESSAGE);

        switch (calculadora) {
            case "+":
                JOptionPane.showMessageDialog(null,
                        "RESULTADO: " + (num1 + num2),
                        "Calculadora topzera",
                        JOptionPane.INFORMATION_MESSAGE);
                break;

            case "-":
                JOptionPane.showMessageDialog(null,
                        "RESULTADO: " + (num1 - num2),
                        "Calculadora topzera",
                        JOptionPane.INFORMATION_MESSAGE);
                break;

            case "*":
                JOptionPane.showMessageDialog(null,
                        "RESULTADO: " + (num1 * num2),
                        "Calculadora topzera",
                        JOptionPane.INFORMATION_MESSAGE);
                break;

            case "/":
                if (num2 != 0) {
                    JOptionPane.showMessageDialog(null,
                            "RESULTADO: " + (num1 / num2),
                            "Calculadora topzera",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    throw new Exception("Não é possivel dividir por zero meu rei");
                }
                break;
            default:
                throw new Exception("ERROOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO" +
                "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO" +
                "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO" +
                "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO" +
                "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO" +
                "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
        }
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
