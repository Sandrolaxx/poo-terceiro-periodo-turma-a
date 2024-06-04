
import java.util.List;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) throws Main.CustomException {
        Atividade_001(args);
        System.out.println("\n\n");
        Atividade_002(args);
        System.out.println("\n\n");
        Atividade_003(args);
        System.out.println("\n\n");
        Atividade_004(args);
        System.out.println("\n\n");
        Atividade_005(args);
        System.out.println("\n\n");
        Atividade_006(args);
    }

    // ======= Atividade 001 =======
    public static void Atividade_001(String[] args) {

        JOptionPane.showMessageDialog(null, "Olá, Mundo.");
    }

    // ======= Atividade 002 =======
    public static void Atividade_002(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite seu nome");

        if (nome != null && !nome.trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Bem vindo " + nome);
        } else {

            JOptionPane.showMessageDialog(null, "Nome invalido.");
        }
    }

    // ======= Atividade 003 =======
    public static void Atividade_003(String[] args) {

        int resposta = JOptionPane.showConfirmDialog(null,
                "Deseja continuar?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == JOptionPane.YES_OPTION) {

            JOptionPane.showMessageDialog(null, "Decidiu Continuar!");

        } else if (resposta == JOptionPane.NO_OPTION) {

            JOptionPane.showMessageDialog(null, "Decidiu Não Continuar!");

        } else {

            JOptionPane.showMessageDialog(null, "Algum erro Desconhecido");

        }

    }

    // ======= Atividade 004 =======
    public static void Atividade_004(String[] args) {

        String[] opcao = { "Opção 1", "Opção 2", "Opção 3" };

        int escolha = JOptionPane.showOptionDialog(null,
                "Escolha uma opção:",
                "Escolha",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcao,
                opcao[0]);

        switch (escolha) {
            case 0:
                JOptionPane.showMessageDialog(null, "Escolheu a Opção 1!");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Escolheu a Opção 2!");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Escolheu a Opção 3!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nenhuma das Alternativas foi Escolhida!!!");
                break;
        }
    }

    // Classe de exceção personalizada Atividade_005 e 006
    static class CustomException extends Exception {
        public CustomException(String erroMsg) {
            JOptionPane.showMessageDialog(null, erroMsg, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // ======= Atividade 005 =======
    public static void Atividade_005(String[] args) {
        try {

            teste_erro();
        } catch (CustomException e) {

            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void teste_erro() throws CustomException {

        throw new CustomException("an error occurred while displaying the previous error. JAVA 2024.");
    }

    // ======= Atividade 006 =======
    public static void Atividade_006(String[] args) throws Main.CustomException {

        List<String> escolha = List.of("Soma", "Subtracao", "Multiplicacao", "Divisao");

        int operacao = JOptionPane.showOptionDialog(null, "Escolha a operacao desejada",
                "Escolha", JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                escolha.toArray(),
                escolha.toArray()[0]);

        String num1String = JOptionPane.showInputDialog("Digite o primeiro número:");
        String num2String = JOptionPane.showInputDialog("Digite o segundo número:");

        try {

            double num1 = Double.parseDouble(num1String);
            double num2 = Double.parseDouble(num2String);
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
                        throw new CustomException("Divisão por zero não é permitida.");
                    }
                    resultado = num1 / num2;
                    break;
                default:
                    throw new CustomException("Nenhuma operação válida selecionada.");

            }
            JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            throw new CustomException("Entrada inválida. Por favor, digite números válidos.");
        }
    }

}