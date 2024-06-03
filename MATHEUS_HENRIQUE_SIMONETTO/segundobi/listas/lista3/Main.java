package segundobi.listas.lista3;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        exibirMensagemSimples();

        
        solicitarNomeEExibirMensagem();

       
        perguntarSeDesejaContinuar();

        
        apresentarListaDeOpcoes();

     
        calculadora();
    }

    // ATV1
    public static void exibirMensagemSimples() {
        JOptionPane.showMessageDialog(null, "Olá, Mundo!");
    }

    // ATV2
    public static void solicitarNomeEExibirMensagem() {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        if (nome != null && !nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Suave, " + nome + "!");
        } else {
            JOptionPane.showMessageDialog(null, "Nome não fornecido.");
        }
    }

    // ATV3
    public static void perguntarSeDesejaContinuar() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu continuar.");
        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu sair.");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada.");
        }
    }

    // ATV4
    public static void apresentarListaDeOpcoes() {
        String[] opcoes = {"Opção 1", "Opção 2", "Opção 3"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Lista de Opções",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
        if (escolha == 0) {
            JOptionPane.showMessageDialog(null, "Você escolheu a Opção 1.");
        } else if (escolha == 1) {
            JOptionPane.showMessageDialog(null, "Você escolheu a Opção 2.");
        } else if (escolha == 2) {
            JOptionPane.showMessageDialog(null, "Você escolheu a Opção 3.");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma opção escolhida.");
        }
    }

    // ATV5
    public static class MinhaExcecao extends Exception {
        public MinhaExcecao(String mensagem) {
            super(mensagem);
        }
    }

    public static void tratarExcecao(Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }

    // ATV6
    public static void calculadora() {
        String[] operacoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        int operacao = JOptionPane.showOptionDialog(null, "Escolha uma operação:", "Calculadora",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, operacoes, operacoes[0]);

        if (operacao >= 0) {
            try {
                double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
                double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
                double resultado = 0;
                String mensagem = "";

                switch (operacao) {
                    case 0: 
                        resultado = num1 + num2;
                        mensagem = "O resultado da soma é: " + resultado;
                        break;
                    case 1: 
                        resultado = num1 - num2;
                        mensagem = "O resultado da subtração é: " + resultado;
                        break;
                    case 2: 
                        resultado = num1 * num2;
                        mensagem = "O resultado da multiplicação é: " + resultado;
                        break;
                    case 3: 
                        if (num2 == 0) {
                            throw new MinhaExcecao("Erro: Divisão por zero!");
                        }
                        resultado = num1 / num2;
                        mensagem = "O resultado da divisão é: " + resultado;
                        break;
                    default:
                        throw new MinhaExcecao("Erro: Operação inválida!");
                }
                JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                tratarExcecao(new MinhaExcecao("Erro: Entrada inválida!"));
            } catch (MinhaExcecao e) {
                tratarExcecao(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma operação escolhida.");
        }
    }
}
