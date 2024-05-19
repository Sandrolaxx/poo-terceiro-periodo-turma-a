package SEGUNDO_BIMESTRE.Aulas.CorrecaoProva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Integer indexAluno = 0;
        Integer indexLivro = 0;
       // Integer indexAluno = 0;


        Aluno[] alunos = new Aluno[200];
        Livro[] livros = new Livro[200];
        Emprestimo[] emprestimos = new Emprestimo[200];

        System.out.println("LIB-FAG");
        System.out.println("1- CADASTRO ALUNO");
        System.out.println("2- CADASTRO LIVRO");
        System.out.println("3- BUSCAR LIVRO");
        System.out.println("4- BUSCAR LIVRO - Autor");
        System.out.println("5- REALIZAR EMPRESTIMO");
        System.out.println("6- REALIZAR DEVOLUÇÃO");
        System.out.println("7- SAIR");

        Integer opcao = input.nextInt();

        while (opcao != 7) {

            switch (opcao){
            case 1:
            Scanner input1 = new Scanner(System.in);
            System.out.println("Informe seu nome");

            Aluno aluno = new Aluno();

            aluno.setNome(input1.nextLine());

            System.out.println("Informe o RA:");
            aluno.setRA(input1.nextLine());
            aluno.setId(input1.nextLine());

            alunos[indexAluno] = aluno;

            indexAluno++;
            break;
        }

    }
}
}
