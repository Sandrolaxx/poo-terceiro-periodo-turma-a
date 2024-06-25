package SEGUNDO_BIMESTRE.listas.lista3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.List;

public class Main {

    private static JFrame frame = new JFrame("Frame para atividades");

    public static void main(String[] args) {

        atv1();

        atv2();

        atv3();

        atv4();

        atv5();

        atv6();

    }

    public static void atv1() {

        JOptionPane.showMessageDialog(null, "Ola mundo!",
                "Boas vindas", JOptionPane.INFORMATION_MESSAGE);

    }

    public static void atv2() {

        String name = JOptionPane.showInputDialog(null, "Digite seu nome");

        JOptionPane.showMessageDialog(null, ("Seja bem vindo(a) " + name),
                "Boas vindas", JOptionPane.INFORMATION_MESSAGE);

    }

    public static void atv3() {

        Integer option = JOptionPane.showConfirmDialog(null, "Deseja continuar",
                "Continuar?", 0);

        String result = option == 0 ? "continuar" : "nao continuar";

        JOptionPane.showMessageDialog(null, ("Voce escolheu " + result),
                null, 1);
    }

    public static void atv4() {

        List<String> options = List.of("Opção 1", "Opção 2", "Opção 3");

        String selectedOption = (String) JOptionPane.showInputDialog(null,
                "Escolha uma opcao:", null, JOptionPane.QUESTION_MESSAGE, null,
                options.toArray(), options.toArray()[0]);

        JOptionPane.showMessageDialog(null, selectedOption,
                "Opcao escolhida: ", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void atv5() {

        String bestStudent = "Gabriel";

        String option = JOptionPane.showInputDialog(null, "Melhor aluno?");

        option = option.toLowerCase();

        if (!option.equals("gabriel")) {

            throw new CustomException("Aluno errado seu safado");

        } else {

            JOptionPane.showMessageDialog(null,
                    "Aluno correto", "Parabens", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    public static void atv6() {

        List<String> options = List.of("+", "-", "/", "*");

        String selectedOption, firstNumber, secondNumber;

        Integer number1, number2;

        try {

            selectedOption = (String) JOptionPane.showInputDialog(null,
                    "Escolha uma operacao:", null, JOptionPane.QUESTION_MESSAGE, null,
                    options.toArray(), options.toArray()[0]);

            firstNumber = JOptionPane.showInputDialog(null,
                    "Digite um numero", "Primeiro numero", 3);

            number1 = Integer.parseInt(firstNumber);

            secondNumber = JOptionPane.showInputDialog(null,
                    "Digite um numero", "Segundo numero", 3);

            number2 = Integer.parseInt(secondNumber);

        } catch (Exception error) {

            throw new CustomException("Algo de errado voce fez meu parceiro");

        }

        switch (selectedOption) {
            case "+":

                JOptionPane.showMessageDialog(null, (number1 + number2),
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);

                break;

            case "-":

                JOptionPane.showMessageDialog(null, (number1 - number2),
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);

                break;

            case "/":

                JOptionPane.showMessageDialog(null, (number1 / number2),
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);

                break;

            default:

                JOptionPane.showMessageDialog(null, (number1 * number2),
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);

                break;

        }
    }
}
