import javax.swing.*;

public class listatres {

    public static void main(String[] args) {
    
        mostrarMensagem();

        saudacaoUsuario();

        perguntarContinuacao();

        escolherOpcao();

        try {
            lançarExcecaoPersonalizada();
        } catch (MinhaExcecao e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        calculadora();
    }

    // Atividade 1
    public static void mostrarMensagem() {
        JOptionPane.showMessageDialog(null, "Hello, World!");
    }

    // Atividade 2
    public static void saudacaoUsuario() {
        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        JOptionPane.showMessageDialog(null, "Bem-vindo, " + nome + "!");
    }

    // Atividade 3
    public static void perguntarContinuacao() {
        int resposta = JOptionPane.showConfirmDialog(null, "Continuar?", "Escolha uma opção", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu continuar.");
        } else {
            JOptionPane.showMessageDialog(null, "Você escolheu não continuar.");
        }
    }

    // Atividade 4 
    public static void escolherOpcao() {
        String[] opcoes = {" 1 ", " 2 ", " 3 "};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
        JOptionPane.showMessageDialog(null, "Você escolheu: " + opcoes[escolha]);
    }

    // Atividade 5
    public static void lançarExcecaoPersonalizada() throws MinhaExcecao {
        throw new MinhaExcecao("Esta é uma exceção personalizada!");
    }

    // Atividade 6 
    public static void calculadora() {
        String[] opcoes = {" + ", " - ", " * ", " / "};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma operação:", "Calculadora", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        try {
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
            double resultado = 0;

            switch (escolha) {
                case 0:
                    resultado = num1 + num2;
                    break;
                case 1:
                    resultado = num1 - num2;
                    break;
                case 2:
                    resultado = num1 * num2;
                    break;
                case 3:
                    if (num2 == 0) {
                        throw new MinhaExcecao("Erro: Divisão por zero!");
                    }
                    resultado = num1 / num2;
                    break;
            }

            JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);

        } catch (MinhaExcecao e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Entrada inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

class MinhaExcecao extends Exception {
    public MinhaExcecao(String mensagem) {
        super(mensagem);
    }
}
