package segundobimestre.listas.Main;

import java.util.List;

import javax.swing.JOptionPane;

import segundobimestre.listas.Classe.MinhaExcecao;

public class Main03 {
    public static void main(String[] args) {
        //ATV 01
        JOptionPane.showMessageDialog(null, "Olá, Mundo!");

        //ATV 02
        String nome = JOptionPane.showInputDialog(null, "Por favor, insira seu nome:");
        
        if (nome != null && !nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bem-vindo, " + nome + "!");
        } else {
            JOptionPane.showMessageDialog(null, "Nome não pode ser vazio. Por favor, tente novamente.");
        }

        //ATV 03
        int resposta = JOptionPane.showConfirmDialog(null, "Você deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu continuar!");
        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu não continuar.");
        } else {
            JOptionPane.showMessageDialog(null, "Ação cancelada.");
        }

        //ATV 04
        List<String> opcoes = List.of("Opção 1", "Opção 2", "Opção 3");
        
        String escolha = (String) JOptionPane.showInputDialog(null,
                "Escolha uma das opções:",
                "Escolha uma opção",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes.toArray(),
                opcoes.toArray()[0]);

        if (escolha != null) {
            switch (escolha) {
                case "Opção 1":
                    JOptionPane.showMessageDialog(null, "Você escolheu a Opção 1");
                    break;
                case "Opção 2":
                    JOptionPane.showMessageDialog(null, "Você escolheu a Opção 2");
                    break;
                case "Opção 3":
                    JOptionPane.showMessageDialog(null, "Você escolheu a Opção 3");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Nenhuma opção válida foi escolhida.");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma opção foi escolhida.");
        }

        //ATV 05
        try {
            apresentarMenu();
        } catch (MinhaExcecao e) {
        }
        
    }
    //ATV 06
    public static void apresentarMenu() throws MinhaExcecao {
        String[] opcoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        
        String escolha = (String) JOptionPane.showInputDialog(null,
                "Escolha uma operação:",
                "Calculadora",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        if (escolha != null) {
            double numero1 = solicitarNumero("Digite o primeiro número:");
            double numero2 = solicitarNumero("Digite o segundo número:");

            double resultado = realizarOperacao(escolha, numero1, numero2);

            JOptionPane.showMessageDialog(null, "O resultado da " + escolha.toLowerCase() + " é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            throw new MinhaExcecao("Nenhuma operação foi escolhida.");
        }
    }

    public static double solicitarNumero(String mensagem) throws MinhaExcecao {
        String input = JOptionPane.showInputDialog(null, mensagem, "Entrada de número", JOptionPane.QUESTION_MESSAGE);
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new MinhaExcecao("Entrada inválida. Por favor, insira um número válido.");
        }
    }

    public static double realizarOperacao(String operacao, double numero1, double numero2) throws MinhaExcecao {
        switch (operacao) {
            case "Soma":
                return numero1 + numero2;
            case "Subtração":
                return numero1 - numero2;
            case "Multiplicação":
                return numero1 * numero2;
            case "Divisão":
                if (numero2 == 0) {
                    throw new MinhaExcecao("Erro: Divisão por zero.");
                }
                return numero1 / numero2;
            default:
                throw new MinhaExcecao("Operação desconhecida.");
        }
    }
}
