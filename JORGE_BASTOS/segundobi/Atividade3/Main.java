package segundobi.Atividade3;

import javax.swing.JOptionPane;


public class Main {
    
     // ATIVIDADE 1
     static class OlaMundo {
        public static void showMessage() {
            JOptionPane.showMessageDialog(null, "Olá, Mundo!");
        }
    }

    // ATIVIDADE 2
    static class BemVindo {
        public static void bemVindo() {
            String nomepessoa = JOptionPane.showInputDialog(null, "Qual o seu nome?");
            if (nomepessoa != null) {
                JOptionPane.showMessageDialog(null, "Bem-vindo, " + nomepessoa + "!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma informação fornecida.");
            }
        }
    }
    
    // ATIVIDADE 3
    static class ConfirmContinue {
        public static void askToContinue() {
            int resposta = JOptionPane.showConfirmDialog(null, "Continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Continuando");
            } else if (resposta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Não continuar");
            } else {
                JOptionPane.showMessageDialog(null, "Fim");
            }
        }
    }

    // ATIVIDADE 4
    static class OpcoesCarros {
        public static void presentOpcoesCarro() {
            String[] carros = {"BMW", "Mercedes", "Porsche"};
            int choice = JOptionPane.showOptionDialog(
                null, 
                "Escolha um carro:", 
                "Opcoes de carros", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                carros, 
                carros[0]
            );
            switch (choice) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Você escolheu uma BMW.");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Você escolheu uma Mercedes.");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Você escolheu Porsche.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escolha um carro porfavor, nenhum carro selecionado.");
                    break;
            }
        }
    }

    // ATIVIDADE 5
    static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
            JOptionPane.showMessageDialog(null, "Erro", "Erro", JOptionPane.ERROR_MESSAGE);
            System.out.println("Erro: " + message);
        }
    }

    // ATIVIDADE 6
    static class Calculadora {
        public static void execute() {
            try {
                String[] operacoes = {"Soma", "Subtracao", "Multiplicacao", "Divisao"};
                String operacaoSelecionada = (String) JOptionPane.showInputDialog(null, "Selecione a operacao desejada:", "Calculadora", JOptionPane.PLAIN_MESSAGE, null, operacoes, operacoes[0]);

                double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digita o primeiro numero:"));
                double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));

                double resultado = 0;
                switch (operacaoSelecionada) {
                    case "Soma":
                        resultado = numero1 + numero2;
                        break;
                    case "Subtracao":
                        resultado = numero1 - numero2;
                        break;
                    case "Multiplicacao":
                        resultado = numero1 * numero2;
                        break;
                    case "Divisao":
                        if (numero2 == 0) {
                            throw new ArithmeticException("Erro");
                        }
                        resultado = numero1 / numero2;
                        break;
                    default:
                        throw new CustomException("Operação invalida.");
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
        OlaMundo.showMessage(); // ATIVIDADE 1
        BemVindo.bemVindo(); // ATIVIDADE 2
        ConfirmContinue.askToContinue(); // ATIVIDADE 3
        OpcoesCarros.presentOpcoesCarro(); // ATIVIDADE 4
        Calculadora.execute(); // ATIVIDADE 6
    }
}
