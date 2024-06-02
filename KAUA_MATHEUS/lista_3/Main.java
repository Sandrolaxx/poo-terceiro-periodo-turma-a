import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args) {
/*
Atv1 - Crie um método em Java que exiba uma mensagem simples "Olá, Mundo!" usando JOptionPane.

Atv2 - Crie um método que solicite ao usuário seu nome e exiba uma mensagem de boas-vindas.

Atv3 - Crie um método que pergunte(showConfirmDialog) ao usuário se ele deseja continuar e exiba uma mensagem conforme a resposta.

Atv4 - Crie um método que apresente uma lista de opções ao usuário e exiba uma mensagem segundo a opção escolhida. Exemplos de lista("Opção 1", "Opção 2", "Opção 3").

Atv5 - Crie uma exceção personalizada que apresente um dialog(ERROR_MESSAGE) com a mensagem do erro que ocorreu.

Atv6 - Crie uma calculadora utilizando JOptionPane, apresente as quatro opções matemáticas ao usuário, após selecionada a opção e avançar, 
requisite os dois números para realizar o cálculo, apresente o resultado em um dialog(INFORMATION_MESSAGE) e em caso de erro lance sua exceção personalizada da atividade 5.

Crie todas as atividades em um arquivo Main.class, atividades separadas por comentários, exemplo //ATV1, abaixo o código.
*/
        // ATV1
        mostra_mensagem("Olá, Mundo!");

        // ATV2
        entrada_nome();

        // ATV3
        continuar();

        // ATV4
        options();

        // ATV5
        erros("Mensagem de Erro! ");

        // ATV6
        calculadora();

        System.exit(0);
    }

    // Metodo ATV1
    public static void mostra_mensagem(String message){

        // 0 Error / 1 Information / 2 Warning
        JFrame frame = new JFrame("ShowMessageDialog");

        JOptionPane.showMessageDialog(frame, message, null, JOptionPane.INFORMATION_MESSAGE);

    }

    // Metodo ATV2
    public static void entrada_nome(){

        JFrame frame = new JFrame("ShowInputDialog");

        String nome = JOptionPane.showInputDialog(frame, "Qual é o seu nome? ", null, 1);
        mostra_mensagem("Olá " + nome + "!");
        
    }

    // Metodo ATV3
    public static boolean continuar(){

        JFrame frame = new JFrame("ShowConfirmDialog");

        int question = JOptionPane.showConfirmDialog(frame, "Desejas Continuar?", null, 0);
        switch (question) {
            case 0:
                return true;
        
            default:
                mostra_mensagem("O programa será fechado! ");
                return false;
                //System.exit(0);
        }
        
    }

    // Metodo ATV4
    public static void options(){

        JFrame frame = new JFrame("ShowInputDialog - SelectOne");

        List<String> options_list = List.of("Opção1", "Opção2", "Opção3");

        String escolha = (String) JOptionPane.showInputDialog(frame, "Qual é a sua escolha?", 
        null, JOptionPane.QUESTION_MESSAGE, null,
        options_list.toArray(),
        options_list.toArray()[0]);

        mostra_mensagem("A escolha feita foi: " + escolha);

    }

    // Metodo ATV5
    public static void erros(String erro){
        throw new NovaException("Deu Erro! " + erro);
    }

    // Metodo ATV6
    public static void calculadora(){

        JFrame frame = new JFrame("Calculadora");
        
        List<String> options_list = List.of("Soma", "Subtração", 
        "Multiplicação", "Divisão");

        do{
            
        String escolha = (String) JOptionPane.showInputDialog(frame, "Qual operação deseja fazer?", 
        null, JOptionPane.QUESTION_MESSAGE, null,
        options_list.toArray(),
        options_list.toArray()[0]);
        
            switch (escolha) {
                case "Soma":
                    try {
                        String valor1 = JOptionPane.showInputDialog(frame, "Valor 1: ", 
                        null, 1);
                        String valor2 = JOptionPane.showInputDialog(frame, "Valor 2: ", 
                        null, 1);   

                        Float resultado = (Float.parseFloat(valor1) + Float.parseFloat(valor2));
                        mostra_mensagem("O resultado é: " + resultado);

                    } catch (Exception e) {
                        erros("Erro " + e.getMessage());
                    }
                    
                    break;

                case "Subtração":
                try {
                    String valor1 = JOptionPane.showInputDialog(frame, "Valor 1: ", 
                    null, 1);
                    String valor2 = JOptionPane.showInputDialog(frame, "Valor 2: ", 
                    null, 1);   

                    Float resultado = (Float.parseFloat(valor1) - Float.parseFloat(valor2));
                    mostra_mensagem("O resultado é: " + resultado);

                } catch (Exception e) {
                    erros("Erro " + e.getMessage());
                }
                
                break;

                case "Multiplicação":
                    try {
                        String valor1 = JOptionPane.showInputDialog(frame, "Valor 1: ", 
                        null, 1);
                        String valor2 = JOptionPane.showInputDialog(frame, "Valor 2: ", 
                        null, 1);   

                        Float resultado = (Float.parseFloat(valor1) * Float.parseFloat(valor2));
                        mostra_mensagem("O resultado é: " + resultado);
                    } catch (Exception e) {
                        erros("Erro " + e.getMessage());
                    }
                    
                    break;

                case "Divisão":
                try {
                    String valor1 = JOptionPane.showInputDialog(frame, "Valor 1: ", 
                    null, 1);
                    String valor2 = JOptionPane.showInputDialog(frame, "Valor 2: ", 
                    null, 1);   
                    Float resultado = (Float.parseFloat(valor1) / Integer.parseInt(valor2));
                    mostra_mensagem("O resultado é: " + resultado);
                } catch (Exception e) {
                    erros("Erro " + e.getMessage());
                }
                
                break;
                default:
                    break;
            }

        }while(continuar());
    }


    public static class NovaException extends RuntimeException {

        private final JFrame frame = new JFrame();

        public NovaException(String mensagem){
            JOptionPane.showMessageDialog(frame, mensagem, "Erro fora do Padrão!", JOptionPane.ERROR_MESSAGE);
        }

    }

}
