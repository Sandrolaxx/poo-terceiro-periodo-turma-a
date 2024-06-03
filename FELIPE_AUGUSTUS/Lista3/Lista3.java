package Lista3;

import javax.swing.JOptionPane;

public class Lista3 {

    public static void main(String[] args) throws ErroPersonalizado {
        // ATV1
        mensagemOlaMundo();

        // ATV2
        mensagemBoasVindas();

        // ATV3
        continuar();

        // ATV4
        escolhaOpcao();

        // ATV6
        calculadora();
    }

    // ATV1
    public static void mensagemOlaMundo() {
        JOptionPane.showMessageDialog(null, "Te amo professor, vc é foda <3");
    }

    // ATV2
    public static void mensagemBoasVindas() {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        JOptionPane.showMessageDialog(null, "Seja bem-vindo, " + nome + "!");
    }

    // ATV3
    public static void continuar() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu continuar!");
        } else {
            JOptionPane.showMessageDialog(null, "Você escolheu sair!");
        }
    }

    // ATV4
    public static void escolhaOpcao() {
        String[] opcoes = {"Opção 1", "Opção 2", "Opção 3"};
        String escolha = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Opções", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        JOptionPane.showMessageDialog(null, "Você escolheu: " + escolha);
    }

    // ATV5
    public static class ErroPersonalizado extends Exception {
        public ErroPersonalizado(String mensagem) {
            super(mensagem);
        }
    }

    // ATV6
    public static void calculadora() throws ErroPersonalizado {
        String[] opcoes = {"Adição", "Subtração", "Multiplicação", "Divisão"};
        String escolha = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Calculadora", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        double num1, num2, resultado;

        try {
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

            switch (escolha) {
                case "Adição":
                    resultado = num1 + num2;
                    break;
                case "Subtração":
                    resultado = num1 - num2;
                    break;
                case "Multiplicação":
                    resultado = num1 * num2;
                    break;
                case "Divisão":
                    if (num2 == 0) {
                        throw new ErroPersonalizado("Erro: Divisão por zero!");
                    }
                    resultado = num1 / num2;
                    break;
                default:
                    throw new ErroPersonalizado("Erro: Opção inválida!");
            }

            JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "Calculadora", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            throw new ErroPersonalizado("Erro: Número inválido!");
        } catch (ErroPersonalizado e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}