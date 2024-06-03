package segundo_bimestre.lista3;

import javax.swing.JOptionPane;

public class Calculadora{
    public static void main(String[] args) {
        boolean sair = false;

        while (!sair) {
            String opcaoStr = JOptionPane.showInputDialog(null, "Escolha uma das opções: \n [1] - Soma \n [2] - Subtração \n [3] - Multiplicação \n [4] - Divisão \n [5] - Sair", "Opções", JOptionPane.QUESTION_MESSAGE);

            if (opcaoStr == null || opcaoStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma opção válida.", "Erro", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            int opcao;
            try {
                opcao = Integer.parseInt(opcaoStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma opção válida.", "Erro", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            switch (opcao) {
                case 1:
                    calcularOperacao("+");
                    break;
                case 2:
                    calcularOperacao("-");
                    break;
                case 3:
                    calcularOperacao("*");
                    break;
                case 4:
                    calcularOperacao("/");
                    break;
                case 5:
                    sair = true;
                    JOptionPane.showMessageDialog(null, "Obrigado por usar o programa.", "Fim", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma opção válida.", "Erro", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }

    public static void calcularOperacao(String operacao) {
        try {
            double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro número:"));
            double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo número:"));

            double resultado;
            switch (operacao) {
                case "+":
                    resultado = soma(a, b);
                    break;
                case "-":
                    resultado = subtracao(a, b);
                    break;
                case "*":
                    resultado = multiplicacao(a, b);
                    break;
                case "/":
                    resultado = divisao(a, b);
                    break;
                default:
                    throw new ArithmeticException("Operação inválida.");
            }

            JOptionPane.showMessageDialog(null, "O resultado da " + operacao + " de " + a + " " + operacao + " " + b + " é " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return a / b;
    }
}
