package segundobi.listas.lista3;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main extends RuntimeException{
    public static void main(String[] args) {

        //Atividade 1 - Hello World -----------------------------------------------------------------------------------------

        // JFrame javaFrameUm = new JFrame("Atividade 1");

        // JOptionPane.showMessageDialog((javaFrameUm), 
        // "Olá Mundinho!",
        // "Mensagem Importantíssima!",
        // JOptionPane.INFORMATION_MESSAGE);

        // System.exit(0);

        //Atividade 2 - Inserção do Nome ------------------------------------------------------------------------------------

        // JFrame JavaFrameDois = new JFrame("Atividade 2");

        // String nome = JOptionPane.showInputDialog(JavaFrameDois,
        // "Insira o seu nome, por gentileza? <3",
        // "Responda ao formulário",
        // JOptionPane.QUESTION_MESSAGE
        // );

        // JOptionPane.showMessageDialog(JavaFrameDois, "Seja muito que bem-vindo/a " + nome + "!!!!!");

        // System.exit(0);

        //Atividade 3 - Confirmação de Diálogo ----------------------------------------------------------------------------------

        // int resposta = JOptionPane.showConfirmDialog(null,
        // "Deseja continuar????",
        // "Confirmação", 
        // JOptionPane.YES_NO_OPTION);

        // if (resposta == JOptionPane.YES_OPTION) {
        //     JOptionPane.showMessageDialog(null, "Então continue uai", "SIM??", JOptionPane.WARNING_MESSAGE);
        // } else if (resposta == JOptionPane.NO_OPTION) {
        //     JOptionPane.showMessageDialog(null, "Vaza daqui oxi", "NÃO???", JOptionPane.ERROR_MESSAGE);
        // } else {
        //     JOptionPane.showMessageDialog(null, "Nem teve coragem de responder", "CANCELADO!!", JOptionPane.QUESTION_MESSAGE);
        // }

        //Atividade 4 - Lista de Opções

        // JFrame JavaFrameQuatro = new JFrame("Atividade 4");
        // List<String> opcoes = List.of("Morango", "Baunilha", "Chocolate");

        // String opcao = (String) JOptionPane.showInputDialog(JavaFrameQuatro,
        // "Escolha um sabor de ice cream",
        // "Sabores",
        // JOptionPane.QUESTION_MESSAGE,
        // null,
        // opcoes.toArray(),
        // opcoes.toArray()[0]);

        // JOptionPane.showMessageDialog(JavaFrameQuatro,
        // "Aqui está seu sorvetinho de "+ opcao + "!!");

        // System.exit(0);

    

        //Atividade 5 - Exceção Personalizada

        // JFrame JavaFrameCinco = new JFrame("Atividade 5");

        // String opcao = JOptionPane.showInputDialog(JavaFrameCinco,
        // "Escreva um inteiro!!! TEM QUE SER INTEIRO",
        // "Insira o que pede ok",
        // JOptionPane.WARNING_MESSAGE);

        // try {
        //     int numero = Integer.parseInt(opcao);
        //     JOptionPane.showMessageDialog(JavaFrameCinco,
        //     "QUE ORGULHO! ESCOLHEU O INTEIRO " + numero);
        // } catch (NumberFormatException e) {
        //     JOptionPane.showMessageDialog(JavaFrameCinco,
        //     "SEU DESPROVIDO DE INTELIGENCIA!", 
        //     "Erro",
        //     JOptionPane.ERROR_MESSAGE);
        // }

        // System.exit(0);

        //Atividade 6 - Calculadora

        JFrame JavaFrameSeis = new JFrame("Atividade 6");
        List<String> operacoes = List.of("Adição", "Subtração", "Multiplicação", "Divisão");
        boolean continuar = true;

        //Uso contínuo da calculadora até cancelar
        while(continuar) {

            try{
                //Inserção do primeiro valor
                String primeiroValor = JOptionPane.showInputDialog(JavaFrameSeis,
                "Insira o primeiro valor abaixo",
                "Calculadora",
                JOptionPane.QUESTION_MESSAGE);
                
                // Cancelar caso não houver nada
                if (primeiroValor == null) {
                    break;
                }

                //Conversão do String para Double
                double primeiroNumero = Double.parseDouble(primeiroValor);

                //Inserção do segundo valor
                String segundoValor = JOptionPane.showInputDialog(JavaFrameSeis,
                "Insira o segundo valor abaixo",
                "Calculadora",
                JOptionPane.QUESTION_MESSAGE);

                // Cancelar caso não houver nada
                if (segundoValor == null) {
                    break;
                }

                //Conversão do String para Double
                double segundoNumero = Double.parseDouble(segundoValor); 

                // Escolha da Operação
                String operacao = (String) JOptionPane.showInputDialog(JavaFrameSeis,
                "Escolha a operação",
                "Calculadora",
                JOptionPane.QUESTION_MESSAGE,
                null,
                operacoes.toArray(),
                operacoes.toArray()[0]);

                // Cancelar caso não houver nada
                if (operacao == null) {
                    break;
                }

                //Resultado da operação
                double resultado = 0;

                //Switch
                switch (operacao) {

                    //Adição
                    case "Adição":
                        resultado = primeiroNumero + segundoNumero;
                        break;
                
                    //Subtração
                    case "Subtração":
                        resultado = primeiroNumero - segundoNumero;
                        break;

                    //Multiplicação
                    case "Multiplicação":
                        resultado = primeiroNumero * segundoNumero;
                        break;

                    //Divisão
                    case "Divisão":
                        if (segundoNumero == 0){
                            throw new ArithmeticException("Divisão Inválida! (por zero)");
                        }
                        resultado = primeiroNumero / segundoNumero;
                        break;
                        
                }

                //Resultado
                JOptionPane.showMessageDialog(JavaFrameSeis,
                "O Resultado da " + operacao + " é de: " + resultado,
                "Calculadora",
                JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException e) {
                //Caso o valor fosse inserido incorretamente
                JOptionPane.showMessageDialog(JavaFrameSeis,
                "Valor inserido é inválido, favor tente novamente",
                "Erro na Calculadora",
                JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException e) {
                //Caso o divisor fosse 0
                JOptionPane.showMessageDialog(JavaFrameSeis,
                "Erro:" + e.getMessage(),
                "Erro na Calculadora",
                JOptionPane.ERROR_MESSAGE);
            }

            //Prosseguir usando a calculadora?
            int continuarResposta = JOptionPane.showConfirmDialog(JavaFrameSeis,
            "Deseja iniciar outra operação?",
            "Continuar usar a calculadora?",
            JOptionPane.YES_NO_OPTION);

            //Fim do While
            if (continuarResposta == JOptionPane.NO_OPTION) {
                continuar = false;
            }

        }

        System.exit(0);

        }

    }


