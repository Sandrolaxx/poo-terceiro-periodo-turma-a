package lista3;

import javax.swing.JOptionPane;

//ATV 5

class Excecao extends Exception{
    public Excecao(String message){
        super(message);
        JOptionPane.showMessageDialog(null, message, "DEU ERRO", JOptionPane.ERROR_MESSAGE);
    }
}

public class main {
    public static void main(String[] args) {

        //ATV 1

        JOptionPane.showMessageDialog(null, "BOM DIA MEU CONSAGRADO");        


        //ATV 2

        String nomePessoa = JOptionPane.showInputDialog("Qual é o seu nome?");
        nomePessoa = nomePessoa.toUpperCase();
        String boasVindas = "BOM DIA MEU CARO " + nomePessoa + ", SEJA BEM-VINDO";
        JOptionPane.showMessageDialog(null, boasVindas);

        //ATV 3

        int resposta = JOptionPane.showConfirmDialog(null, "QUER CONTINUAR?", "ContinuarOuNao", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "VOCÊ QUIS CONTINUAR");
        } 
        if (resposta == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "VOCÊ NÃO QUIS CONTINUAR");
        }


        //ATV 4

        String[] opcoes = {"PETE", "REPETE", "O CACHORRO QUE NÃO É O PETE"};
        String mensagem = "EU TENHO DOIS CACHORROS, PETE E REPETE, PETE MORREU, QUEM SOBROU?";
    
        int escolha;
        do{
            escolha = JOptionPane.showOptionDialog(null, mensagem, "RESPONDA", 
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
    
            switch (escolha){
                case 0:
                    JOptionPane.showMessageDialog(null, "TÁ ERRADO");
                    break;

                case 1:
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "TÁ CERTO");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "NÃO AGUENTOU");
            }
        } while (escolha == 1);


        //ATV 6

        String[] options = {"SOMA", "SUBTRAÇÃO", "MULTIPLICAÇÃO", "DIVISÃO"};
        int escolha2 = JOptionPane.showOptionDialog(null, "SELECIONE A OPERAÇÃO DESEJADA:", "CALCULADORA", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        try {
            if (escolha2 == -1) {
                throw new Excecao("NADA SELECIONADO");
            }

            double num1 = getNumero("INSIRA O PRIMEIRO NÚMERO:");
            double num2 = getNumero("INSIRA O SEGUNDO NÚMERO:");
            double result = 0;

            switch (escolha2){
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
                    if (num2 == 0){
                        throw new Excecao("DIVISÃO POR 0 NÃO MEU PATRÃO");
                    }
                    result = num1 / num2;
                    break;
            }

            JOptionPane.showMessageDialog(null, "RESULTADO: " + result, "CALCULADORA", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Excecao e){
        }
    }

    private static double getNumero(String mensagem) throws Excecao{
        try{
            return Double.parseDouble(JOptionPane.showInputDialog(mensagem));
        } 
        catch (NumberFormatException e){
            throw new Excecao("INSIRA UM NÚMERO VÁLIDO");
        }
    }
}