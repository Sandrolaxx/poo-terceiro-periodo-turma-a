package segundobi.aulas.provaprimeirob;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Integer indexAluno = 0;
        Integer indexLivro = 0;
        Integer indexEmprestimo = 0;

        Aluno[] alunos = new Aluno[200];
        Livro[] livros = new Livro[200];
        Emprestimo[] emprestimos = new Emprestimo[200];

        printMenu();
        Integer opcao = input.nextInt();
        
        while (opcao != 7) {

            switch (opcao) {
                case 1:
                    Scanner input1 = new Scanner(System.in);
                    System.out.println("Informe seu nome:");
                    Aluno aluno = new Aluno();

                    aluno.setNome(input1.nextLine());

                    System.out.println("Informe RA:");
                    aluno.setRa(input1.nextLine());
                    aluno.setId(indexAluno);

                    alunos[indexAluno] = aluno;

                    indexAluno++;
                    break;
                default:
                    break;
                case 3:
                    for (int i = 0; i < livros.length; i++) {
                        System.out.println(livros[i].getId());
                    }
                    break;
            }
            printMenu();
            opcao = input.nextInt();
        }

    }
    
    public static void printMenu() {
        System.out.println(" LIB - FAG");
        System.out.println("[1] Cadastro Aluno");
        System.out.println("[2] Cadastro Livro");
        System.out.println("[3] Busca Livro - Título");
        System.out.println("[4] Busca Livro - Autor");
        System.out.println("[5] Realizar Emprestimo");
        System.out.println("[6] Realizar Devolução");
        System.out.println("[7] Sair");
    }

}
