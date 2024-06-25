package SegundoBi.Listas.Lista3;


import javax.swing.JOptionPane;

public class Main3 {

    public static void main(String[] args) {
        exibirMensagemOlaMundo();
        exibirMensagemBoasVindas();
        perguntarSeDesejaContinuar();
        apresentarListaDeOpcoes();
        calculadora();
    }

    // Atv1 - Crie um método em Java que exiba uma mensagem simples "Olá, Mundo!" usando JOptionPane.
    public static void exibirMensagemOlaMundo() {
        JOptionPane.showMessageDialog(null, "Olá, Mundo!");
    }

    //Atv2 - Crie um método que solicite ao usuário seu nome e exiba uma mensagem de boas-vindas.

    public static void exibirMensagemBoasVindas() {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        JOptionPane.showMessageDialog(null, "Bem-vindo(a), " + nome );
    }

    // Atv3 - Crie um método que pergunte(showConfirmDialog) ao usuário se ele deseja continuar e exiba uma mensagem conforme a resposta.

    public static void perguntarSeDesejaContinuar() {
        int resposta = JOptionPane.showConfirmDialog(null, "Você deseja continuar?");
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu continuar");
        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu não continuar.");
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada");
        }
    }

    // Atv4 - Crie um método que apresente uma lista de opções ao usuário e exiba uma mensagem segundo a opção escolhida. Exemplos de lista("Opção 1", "Opção 2", "Opção 3").

    public static void apresentarListaDeOpcoes() {
        String[] opcoes = {"Opção 1", "Opção 2", "Opção 3"};
        String escolha = (String) JOptionPane.showInputDialog(
            null,
            "Escolha uma opção:",
            "Opções",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );

        if (escolha != null) {
            JOptionPane.showMessageDialog(null, "Opção escolhida : " + escolha);
        } else {
            JOptionPane.showMessageDialog(null, "Você não escolheu nenhuma opção.");
        }
    }

    // Atv5 - Crie uma exceção personalizada que apresente um dialog(ERROR_MESSAGE) com a mensagem do erro que ocorreu.

    public static class ErroExcecao extends Exception {
        public ErroExcecao(String mensagem) {
            super(mensagem);
            JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Atv6 - Crie uma calculadora utilizando JOptionPane, apresente as quatro opções matemáticas ao usuário,
    // após selecionada a opção e avançar, requisite os dois números para realizar o cálculo, 
    // apresente o resultado em um dialog(INFORMATION_MESSAGE) e em caso de erro lance sua exceção personalizada da atividade 5.

    public static void calculadora() {
        String[] operacoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        String operacao = (String) JOptionPane.showInputDialog(
            null,
            "Escolha uma operação:",
            "Calculadora",
            JOptionPane.QUESTION_MESSAGE,
            null,
            operacoes,
            operacoes[0]
        );

        if (operacao != null) {
            try {
                String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
                String input2 = JOptionPane.showInputDialog("Digite o segundo número:");
                
                if (input1 == null || input2 == null) {
                    throw new ErroExcecao("Entrada inválida: um dos valores é nulo.");
                }

                double numero1 = Double.parseDouble(input1);
                double numero2 = Double.parseDouble(input2);
                double resultado = 0;

                switch (operacao) {
                    case "Soma":
                        resultado = numero1 + numero2;
                        break;
                    case "Subtração":
                        resultado = numero1 - numero2;
                        break;
                    case "Multiplicação":
                        resultado = numero1 * numero2;
                        break;
                    case "Divisão":
                        if (numero2 == 0) {
                            throw new ErroExcecao("Erro: divisão por zero.");
                        }
                        resultado = numero1 / numero2;
                        break;
                }

                JOptionPane.showMessageDialog(null, "O resultado da " + operacao.toLowerCase() + " é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                new ErroExcecao("Erro: entrada inválida.");
            } catch (ErroExcecao e) {
            }
        }
    }

    
}


