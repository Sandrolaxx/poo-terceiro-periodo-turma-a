package primeirobi.ListasExc.ProvaPOO01;

import java.util.*;

public class MainSistema extends Biblioteca{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int opcaoMenu;
        do {
            System.out.println("/:=== Menu: ===:/");
            System.out.println(" ");
            System.out.println("1 - Cadastrar um aluno no sistema:");
            System.out.println("2 - Cadastrar um livro no sistema:");
            System.out.println("3 - Realizar um empréstimo de livro");
            System.out.println("4 - Realizar devolução de um livro");
            System.out.println("5 - Sair do sistema");

            opcaoMenu = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcaoMenu) {
                case 1:
                    System.out.print("Nome do aluno: ");
                    String nomeAluno = scanner.nextLine();
                    System.out.print("Número do aluno: ");
                    int matricula = scanner.nextInt();
                    scanner.nextLine(); 
                    biblioteca.cadastrarAluno(new AlunoB(nomeAluno, matricula));
                    System.out.println("Aluno cadastrado no sistema");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.print("Nome do livro: ");
                    String tituloLivro = scanner.nextLine();
                    biblioteca.cadastrarLivro(new LivroB(tituloLivro)); 
                    System.out.println("Livro cadastrado no sistema");
                    System.out.println(" ");

                    break;
                case 3:
                    System.out.print("Título do livro para empréstimo: ");
                    String tituloEmprestimo = scanner.nextLine();
                    System.out.print("Número do aluno: ");
                    int matriculaEmprestimo = scanner.nextInt();
                    scanner.nextLine(); 
                    if (biblioteca.realizarEmprestimo(tituloEmprestimo, matriculaEmprestimo)) {
                        System.out.println("Empréstimo feito");
                        System.out.println(" ");

                    } else {
                        System.out.println("Livro já está sendo emprestado ou não foi encontado no sistema");
                        System.out.println(" ");

                    }
                    break;
                case 4:
                    System.out.print("Título do livro para devolução: ");
                    String tituloDevolucao = scanner.nextLine();
                    if (biblioteca.realizarDevolucao(tituloDevolucao)) {
                        System.out.println("Devolução realizada com sucesso");
                        System.out.println(" ");

                    } else {
                        System.out.println("Livro já devolvido ou não foi adicionado no sistema");
                        System.out.println(" ");

                    }
                    break;
                case 5:
                    System.out.println("/:===Saindo do sistema===:/");
                    break;
                default:
                    System.out.println("Opção inválida, selecione uma novamente");
                    System.out.println(" ");

            }
        } while (opcaoMenu != 5);
        scanner.close();
    }
}
