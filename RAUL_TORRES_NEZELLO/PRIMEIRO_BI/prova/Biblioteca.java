package RAUL_TORRES_NEZELLO.PRIMEIRO_BI.prova;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)){
            int loopMenu = 0;
            String autorLivro = null;
            String tituloLivro = null;
            List<Livro> listaLivros = new ArrayList();
            List<Aluno> listaAlunos = new ArrayList();
            List<Livro> listaEmprestados = new ArrayList();
            Livro novoLivro = new Livro(0,null,null,null);
            Date dataEmprestimo = null;
            int idLivro = 1;
            long msDia = 86400000L;
            long seteDias = 0;

            while (loopMenu==0) {
            System.out.println("Bem vindo(a) ao site da biblioteca.\nComo posso ajudar?\n [1]Cadastrar aluno\n [2]Cadastrar livro\n [3]Realizar emprestimo\n [4]Realizar devolucao\n [5]Consultar livros disponiveis\n [6]Sair");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                System.out.println("Nome do aluno:");
                String nomeAluno = scanner.next();
                System.out.println("Sobrenome do aluno:");
                String sobrenomeAluno = scanner.next();

                Aluno novoAluno = new Aluno(nomeAluno, sobrenomeAluno);
                listaAlunos.add(novoAluno);
                    break;
                case 2:
                System.out.println("Titulo do livro:");
                 tituloLivro = scanner.next();
                System.out.println("Autor do livro:");
                 autorLivro = scanner.next();

                novoLivro = new Livro(idLivro++, tituloLivro, autorLivro,dataEmprestimo);
                listaLivros.add(novoLivro);
                    break;
                case 3:
                System.out.println("Qual o id do livro que deseja?");
                int buscaId = scanner.nextInt();
                int verificacao = 0;
                    for( Livro livro : listaEmprestados){
                        if (buscaId==livro.getId()) {
                            System.out.println("Esse livro já está emprestado");
                            verificacao = 1;
                            break;
                        }
                    }
                    if (verificacao==1) {
                        break;
                    }
                    for( Livro livro2 : listaLivros){
                        if(buscaId == livro2.getId()){
                            livro2.emprestimoLivro();
                            dataEmprestimo = new Date();
                            seteDias = dataEmprestimo.getTime() + (7 * msDia);
                            listaEmprestados.add(livro2);
                        }
                    }
                    break;
                case 4:
                System.out.println("Qual o id do livro que deseja devolver?");
                int devolveId = scanner.nextInt();
                //Simulando atraso de 3 dias e uns quebrados na entrega, apenas para demonstrar a funcionalidade. Caso deseje usar a data atual no dia da entrega a variavel seria assim Date dataDevolucao = new Date(seteDias + (msDia * 3));
                Date dataDevolucao = new Date(seteDias + (msDia * 3));
                for(Livro livro : listaLivros){
                    if(devolveId==livro.getId()){
                        livro.devolucaoLivro();
                        if (dataDevolucao.getTime()>seteDias) {
                            System.out.println("Validade de entrega excedida\nValor da multa: "+((dataDevolucao.getTime()-seteDias)/msDia)*3.50);
                        }
                        listaEmprestados.remove(livro);
                    }
                }
                    break;
                case 5:
                for(Livro livro : listaLivros){
                    livro.apresentarLivro();
                }
                System.out.println("[1]Consultar por titulo\n[2]Consultar por Autor");
                int escolhaConsulta = scanner.nextInt();
                    switch (escolhaConsulta) {
                        case 1:
                        System.out.println("Qual o titulo do livro que deseja consultar");
                        String consultaTitulo = scanner.next();
                        
                        for(Livro livro2 : listaLivros){
                            if (consultaTitulo.equals(livro2.getTitulo())) {
                                livro2.apresentarLivro();
                            }
                        }
                            break;
                        case 2:
                        System.out.println("Qual o autor do livro que deseja consultar");
                        String consultaAutor = scanner.next();
                
                            for(Livro livro2 : listaLivros){
                                if (consultaAutor.equals(livro2.getAutor())) {
                                 livro2.apresentarLivro();
                    }
                }
                            break;
                    }
                    break;
                case 6:
                System.out.println("Obrigado e volte sempre! :)");
                loopMenu = 1;
                default:
                System.out.println("Numero invalido");
                    break;
         }
        }
     }
    }
}
