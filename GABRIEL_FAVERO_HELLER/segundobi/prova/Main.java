package GABRIEL_FAVERO_HELLER.segundobi.prova;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {

        Get listagem = new Get();
        Post registro = new Post();

        String[] opcoes = {"Listagem dos alunos", "Criar registro de testemunho", "Sair"};
        
        int escolha = JOptionPane.showOptionDialog(null, 
        "Escolha uma opção:", 
        "Opções", 
        JOptionPane.DEFAULT_OPTION, 
        JOptionPane.INFORMATION_MESSAGE, 
        null, 
        opcoes, 
        opcoes[0]);

        switch (escolha) {
            case 0:
                listagem.listagemAlunos();
                break;
            case 1:
                registro.registroTestemunho();
                break;
            case 2:
                System.exit(0);
                break;
        }
    }
}
