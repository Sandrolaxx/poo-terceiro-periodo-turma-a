package segundobi.listas.lista3;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Lista3 
{
    public static void main(String[] args) 
    {
        //Exercício 1
        JFrame frame = new JFrame("ShowMessageDialog");

        JOptionPane.showMessageDialog(frame,"Seja muito bem vindo ao JOptionPane!","Bem Vindo!",JOptionPane.INFORMATION_MESSAGE);

        //Exercício 2
        String option = JOptionPane.showInputDialog(frame,null,"Insira o seu nome: ",JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(frame,"Bem vindo, "+ option);

        //Exercício 3
        Integer result = JOptionPane.showConfirmDialog(null,"Atenção, o procedimento à seguir pode levar a danos cerebrais graves. Deseja continuar?","ALERTA!",JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) 
        {
            JOptionPane.showMessageDialog(null,"Agora está por sua conta de risco!");
        }
        else if (result == JOptionPane.NO_OPTION) 
        {
            JOptionPane.showMessageDialog(null,"Você escolheu sanidade mental, o Manicômio CarcerCity espera ansiosamente pelo seu retorno!");
        }

        //Exercício 4
        List<String> confirmação = List.of("Sim","SIM","sim");

        String confirmaçãoSe = (String) JOptionPane.showInputDialog(frame,
        "Você acredita estar apto para receber alta?",
        "Teste de aptidão",
        JOptionPane.QUESTION_MESSAGE,
        null,
        confirmação.toArray(),
        confirmação.toArray()[0]);

        JOptionPane.showMessageDialog(frame, "Sua escolha foi: " + confirmaçãoSe);
        JOptionPane.showMessageDialog(frame, "Sim - Aprovado \nSIM - Reprovado \nsim - Reprovado");

        //Exercício 5 em CustomException.java

        //Exercício 6
        String input = JOptionPane.showInputDialog(frame,"[1] - Soma\n[2] - Subtração\n[3] - Divisão\n[4] - Multiplicação","Calculadora",JOptionPane.QUESTION_MESSAGE);

        if (input == null) 
        {
            JOptionPane.showMessageDialog(frame,"Operação cancelada!");
        }

        //trecho pego do chatgpt por conta da complexidade (provavelmente deve ser menos complexo do que a maneira que eu pensei)
        Integer calculadora;
        try 
        {
            calculadora = Integer.parseInt(input);
        } 
        catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(frame,"Entrada inválida, por favor insira um número.");
            return;
        }
        
        switch (calculadora) 
        {
            case 1:
                JOptionPane.showMessageDialog(frame,"Soma selecionada, informe o primeiro valor: ","Soma",JOptionPane.QUESTION_MESSAGE);
                JOptionPane.showMessageDialog(frame,"Soma selecionada, informe o segundo valor: ","Soma",JOptionPane.QUESTION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(frame,"Subtração selecionada, informe o primeiro valor: ","Subtração",JOptionPane.QUESTION_MESSAGE);
                JOptionPane.showMessageDialog(frame,"Subtração selecionada, informe o segundo valor: ","Subtração",JOptionPane.QUESTION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(frame,"Divisão selecionada, informe o primeiro valor: ","Divisão",JOptionPane.QUESTION_MESSAGE);
                JOptionPane.showMessageDialog(frame,"Divisão selecionada, informe o segundo valor: ","Divisão",JOptionPane.QUESTION_MESSAGE);
                break;
            case 4:
                JOptionPane.showMessageDialog(frame,"Multiplicação selecionada, informe o primeiro valor: ","Multiplicação",JOptionPane.QUESTION_MESSAGE);
                JOptionPane.showMessageDialog(frame,"Multiplicação selecionada, informe o segundo valor: ","Multiplicação",JOptionPane.QUESTION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(frame,"Informe uma opção inválida");
                break;
        }
    }
}
