
import javax.swing.JOptionPane;


public class GUI {

    

    public static void main(String[] args) {
     /*   // ATV1: Exibir "Olá, Mundo!".
        showHelloWorld();

        // ATV2: Solicitar nome e exibir mensagem de boas-vindas.
        showWelcomeMessage();

        // ATV3: Perguntar se deseja continuar e exibir mensagem conforme a resposta.
        askToContinue();

        // ATV4: Apresentar lista de opções ao usuário e exibir mensagem conforme a escolha.
        showOptions();

        // ATV5: Criar exceção personalizada e ATV6: Calculadora.
        try {
            showCalculator();
        } catch (CustomException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método da ATV1
    public static void showHelloWorld() {
        JOptionPane.showMessageDialog(null, "Olá, Mundo!");
    }

    // Método da ATV2
    public static void showWelcomeMessage() {
        String name = JOptionPane.showInputDialog("Qual é o seu nome?");
        JOptionPane.showMessageDialog(null, "Bem-vindo, " + name + "!");
    }

    // Método da ATV3
    public static void askToContinue() {
        int response = JOptionPane.showConfirmDialog(null, "Você deseja continuar?");
        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu continuar!");
        } else if (response == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu não continuar!");
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada!");
        }
    }

    // Método da ATV4
    public static void showOptions() {
        String[] options = {"Opção 1", "Opção 2", "Opção 3"};
        int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Opções",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (choice >= 0 && choice < options.length) {
            JOptionPane.showMessageDialog(null, "Você escolheu " + options[choice]);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma opção foi escolhida.");
        }
    }

    // Exceção personalizada para ATV5 e ATV6
    public static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }

    // Método da ATV6
    public static void showCalculator() throws CustomException {
        String[] operations = {"Adição", "Subtração", "Multiplicação", "Divisão"};
        int operationChoice = JOptionPane.showOptionDialog(null, "Escolha uma operação:", "Calculadora",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, operations, operations[0]);

        if (operationChoice < 0 || operationChoice >= operations.length) {
            throw new CustomException("Operação inválida.");
        }

        String num1Str = JOptionPane.showInputDialog("Digite o primeiro número:");
        String num2Str = JOptionPane.showInputDialog("Digite o segundo número:");

        try {
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);
            double result = 0;

            switch (operationChoice) {
                case 0:
                    result = num1 + num2;
                    break;
                case 1:
                    result = num1 - num2;
                    break;
                case 2:
                    result = num1 * num2;
                    break;
                case 3:
                    if (num2 == 0) {
                        throw new CustomException("Divisão por zero não é permitida.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new CustomException("Operação desconhecida.");
            }

            JOptionPane.showMessageDialog(null, "O resultado é: " + result, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            throw new CustomException("Entrada inválida. Certifique-se de digitar números válidos.");
        }
    }
     */


     //atividade 1
     JOptionPane.showMessageDialog(null, "Olá, Mundo!");

     //atividade 2
     String Name = JOptionPane.showInputDialog(null, "Qual o seu nome?");
     JOptionPane.showMessageDialog(null, "Ola "+Name+", seja bem vindo(a)");

     //atividade 3
     int resposta = JOptionPane.showConfirmDialog(null, "Você deseja continuar?");
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu continuar!");
        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu não continuar!");
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada!");
        }

    //atividade 4
    String[] opção = {"Opção 1", "Opção 2", "Opção 3","ao"};
    int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Opções",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opção, opção[0]);
            
  
        JOptionPane.showMessageDialog(null, "Você escolheu " + opção[escolha]);

    //atividade 5
    
    
   


}
}



    

