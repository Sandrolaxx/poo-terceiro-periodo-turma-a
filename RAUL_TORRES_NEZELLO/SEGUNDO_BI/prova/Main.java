package RAUL_TORRES_NEZELLO.SEGUNDO_BI.prova;

import java.util.List;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        List<String> opcoes = List.of("Listagem dos alunos","Criar registro de testemunho", "Sair");


        String opcao = (String)JOptionPane.showInputDialog(null,
                                "Escolha uma opção",
                        "Prova",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opcoes.toArray(),
                        opcoes.toArray()[0]);


        if(opcao.equals("Listagem dos alunos")){

                ListagemAlunos.listagemAlunos();

            }
        if (opcao.equals("Criar registro de testemunho")) {
            
                CriarTestemunho.criarTestemunho();

        }
        if (opcao.equals("Sair")) {

                JOptionPane.showMessageDialog(null, "Saindo", "Prova", JOptionPane.INFORMATION_MESSAGE);
        
        }
        
    }
}
