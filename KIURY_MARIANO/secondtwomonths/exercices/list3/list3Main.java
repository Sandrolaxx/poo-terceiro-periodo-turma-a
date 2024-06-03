package exercices.list3;

import java.util.List;

import javax.swing.JOptionPane;

public class list3Main {

    public static void main(String[] args) {


        // Atv1 - Crie um método em Java que exiba uma mensagem simples "Olá, Mundo!"
        // usando JOptionPane.

        JOptionPane.showMessageDialog(
                null,
                "Olá, Mundo!",
                "MENSAGEM SIMPLES",
                0);




        // Atv2 - Crie um método que solicite ao usuário seu nome e exiba uma mensagem
        // de boas-vindas.

        String name = JOptionPane.showInputDialog(
                null,
                "NOME:",
                "Informe seu nome:",
                JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(
                null,
                "Bem-vindo(a), " + name + "!",
                "Saudações",
                0);



        // Atv3 - Crie um método que pergunte(showConfirmDialog) ao usuário se ele
        // deseja continuar e exiba uma mensagem conforme a resposta.

        int option = JOptionPane.showConfirmDialog(null,
                "Você quer continuar?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (option == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(
                null,
                "Usuário escolheu 'Sim'",
                null,
                0);

        } else if (option == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(
                null,
                "Usuário escolheu 'Não'",
                null,
                0);

        } else {
            JOptionPane.showMessageDialog(
                null,
                "Usuário cancelou ou fechou a caixa de diálogo",
                null,
                0);
        }



        // Atv4 - Crie um método que apresente uma lista de opções ao usuário
        // e exiba uma mensagem segundo a opção escolhida. Exemplos de lista("Opção 1",
        // "Opção 2", "Opção 3").

        List<String> options = List.of("1 hora.", "2 horas.", "3 horas.");

        String selected = (String) JOptionPane.showInputDialog(null,
                "Selecione quanto tempo deseja:",
                "LanHouse:",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options.toArray(),
                options.toArray()[0]);

        switch (selected) {

            case "1 hora.":

                JOptionPane.showMessageDialog(
                        null,
                        "Aproveite sua 1 hora!",
                        null,
                        0);
                break;

            case "2 horas.":

                JOptionPane.showMessageDialog(
                        null,
                        "Aproveite suas 2 horas!",
                        null,
                        0);
                break;

            case "3 horas.":

                JOptionPane.showMessageDialog(
                        null,
                        "Aproveite suas 3 horas!",
                        null,
                        0);
                break;

            case null:

                JOptionPane.showMessageDialog(
                        null,
                        "Operação cancelada!",
                        null,
                        0);
                break;

            default:
                break;
        }



        // Atv5 - Crie uma exceção personalizada que apresente um dialog(ERROR_MESSAGE)
        // com a mensagem do erro que ocorreu.

        try {
            double x = 0 / 0;

        } catch (Exception e) {
            throw new customException(e.getMessage());
        }



        // Atv6 - Crie uma calculadora utilizando JOptionPane, apresente as quatro
        // opções matemáticas ao usuário,após selecionada a opção e avançar, requisite os dois números para realizar o
        // cálculo, apresente o resultado em um dialog(INFORMATION_MESSAGE) e em caso de erro
        // lance sua exceção personalizada da atividade 5.

        List<String> calculator = List.of("(+) Adição", "(-) Subtração", "(*) Multiplicação", "(/) Divisão");

        String operation = (String) JOptionPane.showInputDialog(null,
                "Selecione a OPERAÇÃO desejada:",
                "CALCULADORA:",
                JOptionPane.QUESTION_MESSAGE,
                null,
                calculator.toArray(),
                calculator.toArray()[0]);

        Double firstValue=0.0, secondValue=0.0, result = 0.0;
        String sinal = "";

        try {
            firstValue = Double.parseDouble(JOptionPane.showInputDialog(
                    null,
                    "Informe o PRIMEIRO valor:",
                    "ENTRADAS:",
                    JOptionPane.QUESTION_MESSAGE));

            secondValue = Double.parseDouble(JOptionPane.showInputDialog(
                    null,
                    "Informe o SEGUNDO valor:",
                    "ENTRADAS:",
                    JOptionPane.QUESTION_MESSAGE));

        } catch (Exception e) {
            throw new customException("ERRO!");
        }

        switch (operation) {

            case "(+) Adição":

                sinal = "+";
                result = firstValue + secondValue;
                break;

            case "(-) Subtração":

                sinal = "-";
                result = firstValue - secondValue;
                break;

            case "(*) Multiplicação":

                sinal = "*";
                result = firstValue * secondValue;
                break;

            case "(/) Divisão":

                sinal = "/";
                result = firstValue / secondValue;
                break;

            case null:

                break;

            default:
                break;
        }

        JOptionPane.showMessageDialog(
                null,
                "O resultado de " + firstValue + " " + sinal + " " + secondValue + " = " + result,
                "CALCULADORA",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
