package primeirobimestre.Segundobimestre.Segundobi.Exemplos.Listatres;

import javax.swing.JOptionPane;

public class Listatres {
    public static void main(String[] args) {

        //ATT1 
       // JOptionPane.showMessageDialog(null, "hello World");

        //ATT2
       /* String nome = JOptionPane.showInputDialog("Olá Digite seu nome : ", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Olá " + nome + " Seja Bem Vindo");*/


        //ATT3
        /*int resposta = JOptionPane.showConfirmDialog(null, "Voce Gostaria de contnuar?", "Confirmação", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Voce escolheu sim");
            }
            else if (resposta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Voce escolheu não"); 
            }*/

        //ATT4 
        /*String entrada = JOptionPane.showInputDialog(null, 
            "Escolha uma opção: 1, 2, 3", 
            "Lista de Opções", 
            JOptionPane.QUESTION_MESSAGE);
        
        int opcao = Integer.parseInt(entrada);
        switch (opcao) {
            case 1:
                JOptionPane.showMessageDialog(null, "Você escolheu a Opção 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Você escolheu a Opção 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Você escolheu a Opção 3");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma opção entre 1 e 3.");
                break;
        }*/

        //ATT5
        //JOptionPane.showMessageDialog(null, "Erro 404", "Erro", JOptionPane.ERROR_MESSAGE);    

        //ATT6
        /*Integer resultado;
        String numero1 = JOptionPane.showInputDialog(null,"Entre com o Valor 1", "Valor1", JOptionPane.QUESTION_MESSAGE);
        String numero2 = JOptionPane.showInputDialog(null,"Entre com o Valor 1", "Valor2", JOptionPane.QUESTION_MESSAGE);
        
        int valor1 = Integer.parseInt(numero1);
        int valor2 = Integer.parseInt(numero2);

        String entrada = JOptionPane.showInputDialog(null, 
        "Escolha uma opção: 1 - Para somar, 2 - Para subtrair, 3 - Para dividir , 4 - Para Mutiplicar", 
        "Lista de Opções", 
        JOptionPane.QUESTION_MESSAGE);
    
    int opcao = Integer.parseInt(entrada);
        switch (opcao) {
            case 1:
            resultado = valor1 + valor2;
            JOptionPane.showMessageDialog(null, "O resultado é : " +resultado);
                break;
            case 2:
            resultado = valor1 - valor2;
            JOptionPane.showMessageDialog(null, "O resultado é : " +resultado);
                break;
            case 3:
            resultado = valor1/valor2;    
            JOptionPane.showMessageDialog(null, "O resultado é : " +resultado);
                break;
            case 4:
            resultado = valor1 * valor2;   
            JOptionPane.showMessageDialog(null, "O resultado é : " +resultado);
                break;
            default:
            JOptionPane.showMessageDialog(null, "Opção inválida", "Erro", JOptionPane.ERROR_MESSAGE); 
                break;
        }*/

    }
}
