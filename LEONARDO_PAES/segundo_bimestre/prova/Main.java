package LEONARDO_PAES.segundo_bimestre.prova;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) throws CustomException {

        String[] opcoes = {"Listagem dos alunos", "Criar registro de testemunho", "Sair"};

        while (true) {
            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu Principal",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

            switch (escolha) {
                case 0:
                
                Lista_Alunos.listaAlunos();

                    break;
                case 1:

                Cria_Testemunho.cria_testemunho();
                    break;
                case 2:

                    JOptionPane.showMessageDialog(null, "Saindo do programa.", "Encerrando", JOptionPane.INFORMATION_MESSAGE);
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }

}
