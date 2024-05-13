package RAFAEL_KAITO.BIM1.prova;

import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;
public class Aplicacao 
{
    public static void main(String[] args) 
    {

        ArrayList<Livro> listaLivros = new ArrayList<>();
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        ArrayList<Livro> listaEmprestados = new ArrayList<>();

        Livro livro1 = new Livro ("PequenoPrincipe", "Pedro");
        listaLivros.add(livro1);
        Livro livro2 = new Livro ("Moby Dick", "Paulo");
        listaLivros.add(livro2);

        Aluno aluno1 = new Aluno ("Sandro", "001");

        Date dataEmprestimo = new Date(); 
        Date dataDevolucao = null; 
        long seteDias = 7 * 86400000L; 
        Date dataVencimento = new Date(dataEmprestimo.getTime() + seteDias);

        Emprestimo emprestimo1 = new Emprestimo (livro1, aluno1, dataEmprestimo); 

        Scanner scanner = new Scanner(System.in);
        int opc;

        do{
        System.out.println("Menu:\n [1]Cadastrar Livro\n [2]CAdastrar Aluno\n [3]Realizar Emprestimo\n [4]Realizar devolução\n [5]Sair");
        opc = scanner.nextInt();

        switch(opc)
        {
            case 1:
                System.out.println("Cadastro de livro:");
                System.out.println("Informe o nome do livro:");
                String titulo = scanner.next();
                System.out.println("Informe o autor:");
                String autor = scanner.next();
        
                Livro novoLivro = new Livro(titulo, autor);
        
                listaLivros.add(novoLivro);
        
                System.out.println("Novo livro cadastrado.");
                
            break;
            case 2:
            System.out.println("Cadastro de livro:");
                System.out.println("Informe o nome do aluno:");
                String nome = scanner.next();
                System.out.println("Informe o cadastro do aluno:");
                String cadastro = scanner.next();
        
                Aluno novoAluno = new Aluno(nome, cadastro);
        
                listaAlunos.add(novoAluno);
        
                System.out.println("Novo aluno cadastrado.");
            break;
            case 3:

            //System.out.println("Pesquisar por:\n [1]Titulo do livro\n [2]Autor\n");
            //int pesquisa = scanner.nextInt();
            for (int i = 0; i<listaLivros.size(); i++)
            {
                Livro livro = listaLivros.get(i);
                System.out.println("[" + (i + 1) + "] " + livro.getTitulo() + ", " + livro.getAutor());  
            }
            System.out.println("Selecione o número correspondete ao seu livro");
            int selecaoLivro = scanner.nextInt();
            if (selecaoLivro > 0 && selecaoLivro <= listaLivros.size()) {
                Livro livroEscolhido = listaLivros.get(selecaoLivro - 1);
                listaEmprestados.add(livroEscolhido);
                System.out.println(livroEscolhido.getTitulo() + " foi emprestado com sucesso");
            } else {
                System.out.println("Número de item inválido. Tente novamente.");
            }
            break;
            case 4:
            System.out.println("Qual livro você vai devolver?");
            for (int i = 0; i<listaEmprestados.size(); i++)
            {
                Livro livro = listaEmprestados.get(i);
                System.out.println("[" + (i + 1) + "] " + livro.getTitulo() + ", " + livro.getAutor()); 
                System.out.println("Selecione o número correspondete ao seu livro");
                int devolucaoLivro = scanner.nextInt(); 
                if (devolucaoLivro > 0 && devolucaoLivro <= listaEmprestados.size()) {
                    Livro livroDevolvido = listaEmprestados.get(devolucaoLivro - 1);
                    listaEmprestados.remove(livroDevolvido);
                    System.out.println(livroDevolvido.getTitulo() + " foi devolvido com sucesso");
                } else {
                    System.out.println("Número de item inválido. Tente novamente.");
                }
            }
            
            break;
            case 5:
            System.out.println("Encerrando...");
            break;
        }
        }while(opc !=5);
            //switch (pesquisa) {
               // case 1:
                //    System.out.println("Qual o livro você busca?");
                //    String busca = scanner.nextLine();
                    
                //    for (int i = 0; i<listaLivros.size(); i++){
                        
               //     }
              //  break;
            
             //   default:
    }           // System.out.println("Opcao invalida");
}
