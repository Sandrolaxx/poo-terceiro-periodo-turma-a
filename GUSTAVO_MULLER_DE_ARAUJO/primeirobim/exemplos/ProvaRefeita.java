package primeirobim.exemplos;

import java.util.Scanner;

public class ProvaRefeita {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer indexAluno = 0;
        Integer indexLivro = 0;
        Integer indexEmprestimo = 0;

        Aluno [] alunos = new Aluno[200];
        Livro [] livros = new Livro[200];
        Emprestimo [] emprestimos = new Emprestimo[200];

        System.out.println("Biblioteca da FAG");
        System.out.println("1- Cadastro de aluno");
        System.out.println("2- Cadastro de livro");
        System.out.println("3- Busca livro - titulo");
        System.out.println("4- Busca livro - autor");
        System.out.println("5- Realizar emprestimo");
        System.out.println("6- Realizar devolução");
        System.out.println("7- Sair");

        Integer opcao = scanner.nextInt();

        do {

            switch (opcao) {
                case 1: // colocar em um método!!

                Scanner scanner2 = new Scanner (System.in);

                System.out.println("Informe seu nome");
                Aluno aluno = new Aluno();

                aluno.setNome(scanner2.nextLine());

                System.out.println("Informe seu RA");
                aluno.setRa(scanner2.nextLine());
                aluno.setId(indexAluno);

                alunos[indexAluno] = aluno;
                indexAluno ++;

                    
                    break;

                    case 3:
                    for (int i = 0; i < livros.length; i ++ ) {
                        System.out.println(livros[i]);
                    }
            
                default:
                    break;
            }

        }while (opcao !=7);


        

    }

    
    
}
