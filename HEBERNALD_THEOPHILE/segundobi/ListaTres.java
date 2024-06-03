import javax.swing.JOptionPane;

// ATV1
public class ListaTres {
    public static void main(String[] args) {
        
        atv1();
        atv2();
        atv3();
        atv4();
        atv6(); 
    }
     // ATV1:
    public static void atv1() {
        JOptionPane.showMessageDialog(null, "Olá, Mundo!");
    }
     // ATV2:
    public static void atv2() {
        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        if (nome != null) {
            JOptionPane.showMessageDialog(null, "Bem-vindo, " + nome + "!");
        }
    }
     // ATV3: 
    public static void atv3() {
        int resposta = JOptionPane.showConfirmDialog(null, "Você deseja continuar?");
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu continuar.");
        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu não continuar.");
        } else {
            JOptionPane.showMessageDialog(null, "Ação cancelada.");
        }
    }
      // ATV4: 
    public static void atv4() {
        String[] options = {"Opção 1", "Opção 2", "Opção 3"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Opções",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (escolha != -1) {
            JOptionPane.showMessageDialog(null, "Você escolheu " + options[escolha]);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma opção escolhida.");
        }
    }
     // ATV5: 
    static class MinhaExcecao extends Exception {
        public MinhaExcecao(String mensagem) {
            super(mensagem);
            JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
     // ATV6: 
    public static void atv6() {
        String[] operacoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        int operacao = JOptionPane.showOptionDialog(null, "Escolha uma operação", "Calculadora",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, operacoes, operacoes[0]);

        if (operacao != -1) {
            try {
                String num1Str = JOptionPane.showInputDialog("Digite o primeiro número:");
                String num2Str = JOptionPane.showInputDialog("Digite o segundo número:");

                double num1 = Double.parseDouble(num1Str);
                double num2 = Double.parseDouble(num2Str);
                double resultado;

                switch (operacoes[operacao]) {
                    case "Soma":
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
                            throw new MinhaExcecao("Erro: Divisão por zero não é permitida.");
                        }
                        resultado = num1 / num2;
                        break;
                    default:
                        throw new MinhaExcecao("Operação desconhecida.");
                }
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                new MinhaExcecao("Erro: Entrada inválida. Por favor, insira números válidos.");
            } catch (MinhaExcecao e) {
                
            }
        }
    }
}
