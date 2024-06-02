package segundobi.lista3;
import javax.swing.JOptionPane;

public class main {

    // ATV 1
    static class HelloWorld {
        public static void showMessage() {
            JOptionPane.showMessageDialog(null, "Olá, Mundo!");
        }
    }

    // ATV 2
    static class WelcomeUser {
        public static void welcomeUser() {
            String name = JOptionPane.showInputDialog(null, "Qual é o seu nome?");
            if (name != null) {
                JOptionPane.showMessageDialog(null, "Bem-vindo, " + name + "!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum nome fornecido.");
            }
        }
    }

    // ATV 3
    static class ConfirmContinue {
        public static void askToContinue() {
            int response = JOptionPane.showConfirmDialog(null, "Você deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Você escolheu continuar.");
            } else if (response == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Você escolheu não continuar.");
            } else {
                JOptionPane.showMessageDialog(null, "Ação cancelada.");
            }
        }
    }

    // ATV 4
    static class ColorSelector {
        public static void presentColorOptions() {
            String[] colors = {"Vermelho", "Verde", "Azul"};
            int choice = JOptionPane.showOptionDialog(
                null, 
                "Escolha uma cor:", 
                "Seleção de Cores", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                colors, 
                colors[0]
            );
            switch (choice) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Você escolheu a cor Vermelho.");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Você escolheu a cor Verde.");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Você escolheu a cor Azul.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Nenhuma cor escolhida.");
                    break;
            }
        }
    }

    // ATV 5
    static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
            JOptionPane.showMessageDialog(null, "Algo deu errado, continue tentando...", "Erro", JOptionPane.ERROR_MESSAGE);
            System.out.println("Erro: " + message);
        }
    }

    // ATV 6
    static class Calculadora {
        public static void execute() {
            try {
                String[] operacoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
                String operacaoSelecionada = (String) JOptionPane.showInputDialog(null, "Selecione a operação desejada:", "Calculadora", JOptionPane.PLAIN_MESSAGE, null, operacoes, operacoes[0]);

                double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
                double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

                double resultado = 0;
                switch (operacaoSelecionada) {
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
                            throw new ArithmeticException("Divisão por zero não é permitida.");
                        }
                        resultado = numero1 / numero2;
                        break;
                    default:
                        throw new CustomException("Operação inválida.");
                }

                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (CustomException e) {

            }
        }
    }

    public static void main(String[] args) {
        HelloWorld.showMessage(); // ATV 1
        WelcomeUser.welcomeUser(); // ATV 2
        ConfirmContinue.askToContinue(); // ATV 3
        ColorSelector.presentColorOptions(); // ATV 4
        Calculadora.execute(); // ATV 6
    }
}
