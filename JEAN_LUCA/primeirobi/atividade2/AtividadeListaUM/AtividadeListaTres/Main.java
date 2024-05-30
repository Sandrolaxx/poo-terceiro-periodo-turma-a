package primeirobi.atividade2.AtividadeListaUM.AtividadeListaTres;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        // ATV1
        JOptionPane.showMessageDialog(null,"Ola,mundo");

        //ATV2
        String boa;
        boa = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null,"Seja bem vindo, "+boa);

        //ATV3

        int resultado= JOptionPane.showConfirmDialog(null,"Voce quer continuar?","atencao",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);

        if (resultado==JOptionPane.YES_NO_OPTION) {
        JOptionPane.showMessageDialog(null, "ok, aguarde alguns segundos");
        }else if(resultado==JOptionPane.NO_OPTION) {
        JOptionPane.showMessageDialog(null, "ok, entao voce nao quer continuar",
        "Erro",JOptionPane.ERROR_MESSAGE);
        }
           //ATV4
        String operatorr = JOptionPane.showInputDialog(null,"entre com os numeros:(1) ou (2) ou (3)","lista",JOptionPane.QUESTION_MESSAGE);
        int operator = Integer.parseInt(operatorr);
        switch (operator) {

        case 1:
        JOptionPane.showMessageDialog(null,"voce escoleu a opcao "+ operatorr);
        break;
        case 2:
        JOptionPane.showMessageDialog(null,"voce escoleu a opcao "+ operatorr);
        break;
        case 3:
        JOptionPane.showMessageDialog(null,"voce escoleu a opcao "+ operatorr);
        break;
        
        default:
        JOptionPane.showMessageDialog(null, "Numero incorreto","Erro",JOptionPane.ERROR_MESSAGE);
        break;

        }
         //ATV5
        JOptionPane.showMessageDialog(null, "ERRO","Erro",JOptionPane.ERROR_MESSAGE);

        String opcao = JOptionPane.showInputDialog(null,
                "escolha uma opcao" + "\n 1-Soma" + "\n 2-Menos" + "\n 3-Mutiplicaçao" + "\n 4-Divisao",
                JOptionPane.QUESTION_MESSAGE);

        String n1;
        String n2;
        n1 = JOptionPane.showInputDialog(null, "digite o primeiro numero", "Primeiro Numero", 3);
        n2 = JOptionPane.showInputDialog(null, "digite o segundo numero", "Segundo numero ", 3);
        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);
        double resultad = 0;
        String menssagem = "o resultado da operacao: ";
        int opcao1 = Integer.parseInt(opcao);

        switch (opcao1) {

            case 1:

                resultad = num1 + num2;
                break;
            case 2:

                resultad = num1 - num2;
                break;
            case 3:

                resultad = num1 * num2;
                break;
            case 4:

                resultad = num1 / num2;
                break;

            default:
                break;
        }
        JOptionPane.showMessageDialog(null, menssagem + resultad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
