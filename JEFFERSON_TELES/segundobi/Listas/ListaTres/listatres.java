package segundobi.Listas.ListaTres;
import javax.swing.JOptionPane;

public class listatres {

    // Atividade 1
    public static void atv1() {
        JOptionPane.showMessageDialog(null, "Olá, Mundo!");
    }

    // Atividade 2
    public static void atv2() {
        String nome = JOptionPane.showInputDialog("Insira seu nome:");
        JOptionPane.showMessageDialog(null, "Bem vindo, " + nome + "!!!");
    }

    // Atividade 3
    public static void atv3() {
        int resposta = JOptionPane.showConfirmDialog(null, "Você quer prosseguir?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu prosseguir.");
        } else {
            JOptionPane.showMessageDialog(null, "Você escolheu não prosseguir.");
        }
    }

    // Atividade 4 
    public static void atv4() {
        String[] options = {"Opção 1", "Opção 2", "Opção 3"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Opções",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        JOptionPane.showMessageDialog(null, "Você escolheu: " + options[escolha]);
    }

    // Atividade 5
    public static class MinhaExcecao extends Exception {
        public MinhaExcecao(String mensagem) {
            super(mensagem);
        }

        public void exibirErro() {
            JOptionPane.showMessageDialog(null, getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Atividade 6
    public static void atv6() {
        try {
            String[] operacoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
            int operacao = JOptionPane.showOptionDialog(null, "Qual operação deseja?:", "Calculadora",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, operacoes, operacoes[0]);

            if (operacao == -1) {
                throw new MinhaExcecao("Nenhuma operação foi selecionada.");
            }

            String num1Str = JOptionPane.showInputDialog("Insira o primeiro número:");
            String num2Str = JOptionPane.showInputDialog("Insira o segundo número:");

            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);
            double resultado = 0;

            switch (operacao) {
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
                        throw new MinhaExcecao("Divisão por zero não é permitida.");
                    }
                    resultado = num1 / num2;
                    break;
            }

            JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (MinhaExcecao e) {
            e.exibirErro();
        }
    }

    public static void main(String[] args) {
        
        atv1();
        atv2(); 
        atv3();
        atv4();
        atv6(); 
    }
}