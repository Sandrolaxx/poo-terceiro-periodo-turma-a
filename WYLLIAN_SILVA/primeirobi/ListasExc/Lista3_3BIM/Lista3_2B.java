package primeirobi.ListasExc.Lista3_3BIM;


import javax.swing.JOptionPane;

public class Lista3_2B {
    public static void main(String[] args) {

        System.out.println("/:=== Atividade - 1: ===:/");

        JOptionPane.showMessageDialog(null, "Ola, Mundo!");
        System.out.println(" ");

        System.out.println("/:=== Atividade - 2: ===:/");

        String nome = JOptionPane.showInputDialog("Digite seu nome para autentificação: ", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Seja bem-vindo ao sistema Java, " + nome);
        System.out.println(" ");


        System.out.println("/:=== Atividade - 3: ===:/"); 

        int confirmar = JOptionPane.showConfirmDialog(null, "Continuar? S/N", "JANELA", JOptionPane.YES_NO_OPTION); //atualizar nav
        
            if (confirmar == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Pode continuar");
            }
            if (confirmar == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Não continue");
                System.out.println(" "); 
            }
            

            System.out.println("/:=== Atividade - 4: ===:/");

        String entrada = JOptionPane.showInputDialog(null, "Escolha uma Opção: \n1) Maça\n2) Banana\n3) Limão", "JANELA", JOptionPane.QUESTION_MESSAGE);
        

        
        int opcao = Integer.parseInt(entrada);
        switch (opcao) {
            case 1:
                JOptionPane.showMessageDialog(null, "Você ganhou uma maça!");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Você ganhou uma banana!");
                break;

            case 3:

            
                JOptionPane.showMessageDialog(null, "Você ganhou um limão!");
                break;

            default:
                JOptionPane.showMessageDialog(null, "ERRO - Selecione uma opção ente 1 - 3");
                break;
        }
        System.out.println(" ");


        System.out.println("/:=== Atividade - 5: ===:/");

        JOptionPane.showMessageDialog(null, "Encontramos um erro no sistema, apagando System32.", "ERRO FATAL", JOptionPane.ERROR_MESSAGE);   
        System.out.println(" "); 

        System.out.println("/:=== Atividade - 6: ===:/");

        Integer calculo;

        String X = JOptionPane.showInputDialog(null,"Escolha o primeiro número ", "JANELA", JOptionPane.QUESTION_MESSAGE);
        String Y = JOptionPane.showInputDialog(null,"Escolha o segundo", "JANELA", JOptionPane.QUESTION_MESSAGE);

        int resultX = Integer.parseInt(X);
        int resultY = Integer.parseInt(Y);
        String calculadora = JOptionPane.showInputDialog(null,  "Escolha uma Opção: \n1) Adição \n2) Subtração\n3) Multiplicação\n4) Divisão",  "JANELA",  JOptionPane.QUESTION_MESSAGE);
    
        int escolhaCalculadora = Integer.parseInt(calculadora);
        switch (escolhaCalculadora) {
            case 1:
            calculo = resultX + resultY;
            JOptionPane.showMessageDialog(null, "Resultado da adição: " +calculo);
                break;

            case 2:
            calculo = resultX - resultY;
            JOptionPane.showMessageDialog(null, "Resultado da subtação :" +calculo);
                break;

            case 3:
            calculo = resultX * resultY;    
            JOptionPane.showMessageDialog(null, "Resultado da multiplicação: " +calculo);
                break;

            case 4:
            calculo = resultX/resultY;   
            JOptionPane.showMessageDialog(null, "Resultado da divisão: " +calculo);
                break;

            default:
            JOptionPane.showMessageDialog(null, "Selecione uma das opções mencionadas!", "JANELA", JOptionPane.ERROR_MESSAGE); 
                break;
        }

    }
}
