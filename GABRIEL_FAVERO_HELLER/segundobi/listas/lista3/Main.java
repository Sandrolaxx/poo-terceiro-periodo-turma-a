package segundobi.listas.lista3;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        exibirMensagem();

        solicitarNome();

        perguntarContinuar();

        apresentarOpcoes();

        try {
            lancarExcecao();
        } catch (MinhaExcecao e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        calculadora();
    }

    /*
     * Atv1 - Crie um método em Java que exiba uma mensagem simples "Olá, Mundo!"
     * usando JOptionPane.
     */

    private static void exibirMensagem() {

        JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);

    }

    /*
     * Atv2 - Crie um método que solicite ao usuário seu nome e exiba uma mensagem
     * de boas-vindas.
     */

    private static void solicitarNome() {

        String nome = JOptionPane.showInputDialog("Digite seu nome:");

        JOptionPane.showMessageDialog(null, "Bem-vindo, " + nome + "!", "Boas-vindas", JOptionPane.INFORMATION_MESSAGE);

    }

    /*
     * Atv3 - Crie um método que pergunte(showConfirmDialog) ao usuário se ele
     * deseja continuar e exiba uma mensagem conforme a resposta.
     */

    private static void perguntarContinuar() {

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Pergunta", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu continuar!", "Resposta",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Você escolheu não continuar!", "Resposta",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }

    /*
     * Atv4 - Crie um método que apresente uma lista de opções ao usuário e exiba
     * uma mensagem segundo a opção escolhida. Exemplos de lista("Opção 1",
     * "Opção 2", "Opção 3").
     */

    private static void apresentarOpcoes() {

        String[] opcoes = { "Opção 1", "Opção 2", "Opção 3" };

        String escolha = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Opções",
                JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        JOptionPane.showMessageDialog(null, "Você escolheu: " + escolha, "Resposta", JOptionPane.INFORMATION_MESSAGE);

    }

    /*
     * Atv5 - Crie uma exceção personalizada que apresente um dialog(ERROR_MESSAGE)
     * com a mensagem do erro que ocorreu.
     */

    private static void lancarExcecao() throws MinhaExcecao {

        throw new MinhaExcecao("Erro ocorrido!");

    }

    /*
     * Atv6 - Crie uma calculadora utilizando JOptionPane, apresente as quatro
     * opções matemáticas ao usuário, após selecionada a opção e avançar, requisite
     * os dois números para realizar o cálculo, apresente o resultado em um
     * dialog(INFORMATION_MESSAGE) e em caso de erro lance sua exceção personalizada
     * da atividade 5.
     */

    private static void calculadora() {

        String[] opcoes = { "Adição", "Subtração", "Multiplicação", "Divisão" };

        String escolha = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Calculadora",
                JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

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
                        throw new MinhaExcecao("Erro: divisão por zero!");
                    }
                    resultado = num1 / num2;
                    break;

                default:
                    throw new MinhaExcecao("Erro: opção inválida!");

            }

            JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "Calculadora",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (MinhaExcecao e) {

            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Erro: entrada inválida!", "Erro", JOptionPane.ERROR_MESSAGE);

        }
    }
}

class MinhaExcecao extends RuntimeException {

    public MinhaExcecao(String mensagem) {
        super(mensagem);
        
    }
}