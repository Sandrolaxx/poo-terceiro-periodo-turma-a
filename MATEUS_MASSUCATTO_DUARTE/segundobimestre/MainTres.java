package segundobimestre;

import javax.swing.JOptionPane;

class MinhaExcecao extends Exception {
    public MinhaExcecao(String mensagem) {
        super(mensagem);
    }
}

class ExcecaoPersonalizada extends Exception {
    public ExcecaoPersonalizada(String mensagem) {
        super(mensagem);
    }
}

public class MainTres {
    public static void main(String[] args) {
        // Atividade 1
        mostrarHelloWorld();

        // Atividade 2
        String nome = JOptionPane.showInputDialog(null, "Insira seu nome:");
        if (nome != null && !nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bem-vindo " + nome);
        } else {
            JOptionPane.showMessageDialog(null, "Nome inválido");
        }

        // Atividade 3
        perguntarDesejaContinuar();

        // Atividade 4
        apresentarOpcoes();

        // Atividade 5
        try {
            metodoQueLancaExcecao();
        } catch (MinhaExcecao e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        // Atividade 6
        try {
            String[] operacoes = {"Soma", "Subtracao", "Multiplicacao", "Divisao"};
            String operacaoEscolhida = (String) JOptionPane.showInputDialog(null, "Escolha a operação:", "Calculadora", JOptionPane.QUESTION_MESSAGE, null, operacoes, operacoes[0]);

            switch (operacaoEscolhida) {
                case "Soma":
                    calcularSoma();
                    break;
                case "Subtracao":
                    calcularSubtracao();
                    break;
                case "Multiplicacao":
                    calcularMultiplicacao();
                    break;
                case "Divisao":
                    calcularDivisao();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operação Inválida", "Erro", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } catch (ExcecaoPersonalizada e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método Atividade 1
    public static void mostrarHelloWorld() {
        JOptionPane.showMessageDialog(null, "Hello World");
    }

    // Método Atividade 3
    public static void perguntarDesejaContinuar() {
        int resposta = JOptionPane.showConfirmDialog(null, "Voce deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Continuar foi escolhido");
        } else {
            JOptionPane.showMessageDialog(null, "Nao continuar foi escolhido");
        }
    }

    // Método Atividade 4
    public static void apresentarOpcoes() {
        String[] opcoes = {"Opcao 1", "Opcao 2", "Opcao 3"};
        int escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha uma opção:",
            "Seleção de Opção",
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            null,
            opcoes, 
            opcoes[0] 
        );

        if (escolha != JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "Voce escolheu: " + opcoes[escolha]);
        } else {
            JOptionPane.showMessageDialog(null, "Voce não escolheu nenhuma opção");
        }
    }

    // Método Atividade 5
    public static void metodoQueLancaExcecao() throws MinhaExcecao {
        throw new MinhaExcecao("Ocorreu um erro");
    }

    // Métodos Atividade 6
    private static void calcularSoma() throws ExcecaoPersonalizada {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero:"));
        double resultado = num1 + num2;
        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void calcularSubtracao() throws ExcecaoPersonalizada {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero:"));
        double resultado = num1 - num2;
        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void calcularMultiplicacao() throws ExcecaoPersonalizada {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero:"));
        double resultado = num1 * num2;
        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void calcularDivisao() throws ExcecaoPersonalizada {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero:"));
        if (num2 == 0) {
            throw new ExcecaoPersonalizada("ERROR");
        }
        double resultado = num1 / num2;
        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}

