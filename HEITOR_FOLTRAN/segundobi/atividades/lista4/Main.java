package lista4;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){

        Boleto boleto = new Boleto();
        Convenio convenio = new Convenio();

        while (true){
            try{
                String[] opcoes = { "Ver convênios", "Ver boletos", "Sair" };
                int escolhas = JOptionPane.showOptionDialog(null, "O que você quer ver?", "Opções",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

                switch (escolhas){
                    case 0:
                        convenio.convenio();
                        break;

                    case 1:
                        boleto.boleto();
                        break;

                    case 2:
                        System.exit(0);
                        break;

                    default:
                        break;
                }

            } 
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "ERRO");
            }
        }
    }
}

