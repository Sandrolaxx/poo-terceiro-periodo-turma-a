package listas.lista3;

import java.util.List;

import javax.swing.JOptionPane;

public class Main {
    

    // Atividade 1 - Exibir mensagem
    public static void exibirMensagem(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    // Atividade 2 - Exibir mensagen de Boas Vindas
    public static void exibirMensagemBoasVindas() {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");

        if (nome == null || nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum nome foi fornecido. Adeus!");
            return;
        }

        JOptionPane.showMessageDialog(null, "Olá, " + nome + "! Bem-vindo!");
    }

    // Atividade 3 - Verificar se deseja seguir ou não
    public static boolean verificarContinuar() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu continuar. Ótimo!");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Você escolheu não continuar. Tudo bem, até logo!");
            return false;
        }
    }

    // Atividade 4 - Selecionar opções
    public static void apresentarOpcoes() {
        Object[] opcoes = {"Banana", "Maçã", "Laranja"};

        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma fruta:", "Frutas", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

        switch (escolha) {
            case 0:
                JOptionPane.showMessageDialog(null, "Você escolheu a Banana");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Você escolheu a Maça");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Você escolheu a Laranja");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada");
                break;
        }
    }

    // Atividade 5 - Mensagem de Erro
    static class CustomException extends Exception {
        public CustomException(String mensagem) {
            super(mensagem);
            JOptionPane.showMessageDialog(null, this.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
        

    public static List<Double> lerNumeros() throws Main.CustomException {
        try {
            String input1 = JOptionPane.showInputDialog("Digite um número:");
            String input2 = JOptionPane.showInputDialog("Digite outro número:");

            if (input1 == null || input2 == null) {
                JOptionPane.showMessageDialog(null, "Um ou nenhum número foi fornecido. Adeus!");
                return null;
            }

            Double num1 = Double.parseDouble(input1);
            Double num2 = Double.parseDouble(input2);
            List<Double> listaNums = List.of(num1, num2);
            return listaNums;
        } catch (NumberFormatException e) {
            throw new CustomException("Por favor, insira um número válido!");
        }
    }

    // Atividade 6 - Calculadora
    public static void main(String[] args) throws Main.CustomException {

        String msg = "Olá bem-vindo a calculadora irada!";
        exibirMensagem(msg);

        String resultado =  "O resultado é ";
        Object[] opcoes = {"Somar", "Subtrair", "Multiplicar", "Dividir"};
        int escolha = JOptionPane.showOptionDialog(null, "Qual é a operação desejada?", "Seleção de Operação", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
        switch (escolha) {
            case 0:
                Double soma = lerNumeros().stream().reduce(0.0, (a, b) -> a + b);
                resultado = resultado.concat(Double.toString(soma));
                exibirMensagem(resultado);
                break;
            case 1:
                Double subtracao = lerNumeros().stream().reduce((a, b) -> a - b).orElse(0.0);
                resultado = resultado.concat(Double.toString(subtracao));
                exibirMensagem(resultado);
                break;
            case 2:
                Double multiplicacao = lerNumeros().stream().reduce(1.0, (a, b) -> a * b);
                resultado = resultado.concat(Double.toString(multiplicacao));
                exibirMensagem(resultado);
                break;
            case 3:
                Double divisao = lerNumeros().stream().reduce((a, b) -> a / b).orElse(0.0);
                if (Double.isNaN(divisao)|| Double.isInfinite(divisao)){
                    throw new CustomException("Pane no sistema!! Alguém me desconfigurou!!!");
                }
                resultado = resultado.concat(Double.toString(divisao));
                exibirMensagem(resultado);
                break;
            default:
                exibirMensagem("Opção Inválida.");
                break;      
            }
        }
        
    }