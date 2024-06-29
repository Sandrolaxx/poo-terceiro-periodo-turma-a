package HEITOR_FOLTRAN.segundobi.prova;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){

        Listagem listagem = new Listagem();
        Testemunho testemunho = new Testemunho();

        while (true){
            try{
                String[] opcoes = { "Ver lista de alunos", "Criar testemunho", "Sair" };
                int escolhas = JOptionPane.showOptionDialog(null, "O que você quer ver?", "Opções",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

                switch (escolhas){
                    case 0:
                        listagem.listagem();
                        break;

                    case 1:
                        testemunho.testemunho();
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
