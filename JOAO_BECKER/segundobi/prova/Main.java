package JOAO_BECKER.segundobi.prova;
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        String ra = "";
        String imageURL = "";
        String description = "";

        int x = 1;
        String[] opcoes = { "Listagem dos alunos", "Criar registro de testemunho","Sair"};
        while(x==1){
            String opcao = (String) JOptionPane.showInputDialog(null,"Ensira os dados:", null, JOptionPane.QUESTION_MESSAGE, null,opcoes, opcoes[0]);
            switch (opcao) {
                case "Listagem dos alunos" :
                    ListagemDosAlunos.listagemFormatada();
                    break;
                case "Criar registro de testemunho":
                    ra = JOptionPane.showInputDialog(null, "RA", "Insira seu RA abaixo", JOptionPane.INFORMATION_MESSAGE);
                    imageURL = JOptionPane.showInputDialog(null, "Imagem", "Insira URL da sua imagem abaixo", JOptionPane.INFORMATION_MESSAGE);
                    description = JOptionPane.showInputDialog(null, "Descrição", "Insira descrição abaixo", JOptionPane.INFORMATION_MESSAGE);
                    CriarRegistroDeTestemunho.criarTestemunho(ra, description, imageURL);
                    break;

                case "Sair":
                    x=0;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção Invalida", "", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        }
    }

}


