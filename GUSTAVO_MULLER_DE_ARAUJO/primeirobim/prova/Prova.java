package primeirobim.prova;

import java.util.Scanner;


public class Prova {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        int escolha;

        do {

            System.out.println("Informe a opção que deseja");

            System.out.println("1. Cadastro de Alunos.");
            System.out.println("2. Cadastro de Livros.");
            System.out.println("3. Realizar empréstimo de Livro.");
            System.out.println("4. Realizar devolução de Livro.");
            System.out.println("0. Sair do programa.");

            escolha = scanner.nextInt();

            if(escolha == 1){
                Aluno aluno = new Aluno();
                aluno.cadastraAluno();
            }


            if (escolha == 2) {
                Livro livro = new Livro();
                livro.cadastraLivro();
            }


            if (escolha == 3) {

                Emprestimo emprestimo = new Emprestimo();
                emprestimo.realizarEmprestimo();
            }


            if (escolha == 4) {

                Emprestimo emprestimo = new Emprestimo();
                emprestimo.realizarDevolucao();
            }
        
        }
        while (escolha != 0);
    }

}
