package primeirobi.prova;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n|MENU:\n|[1] Cadastro de alunos\n|[2] Cadastro de livros\n|[3] Buscar por título\n|[4] Buscar por autor\n|[5] Realizar empréstimo\n|[6] Realizar devolução\n|[7] Verificar disponibilidade\n|[8] Sair");
            int opcao = scanner.nextInt(); scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("Nome do aluno:");
                    String nomeAluno = scanner.nextLine();
                    System.out.println("Curso do aluno:");
                    String cursoAluno = scanner.nextLine();
                    biblioteca.cadastrarAluno(new Aluno(nomeAluno, cursoAluno));
                    break;

                case 2:
                    System.out.println("Título do livro:");
                    String tituloLivro = scanner.nextLine();
                    System.out.println("Autor do livro:");
                    String autorLivro = scanner.nextLine();
                    biblioteca.cadastrarLivro(new Livro(tituloLivro, autorLivro));
                    break;

                case 3:
                    System.out.println("Título do livro para buscar:");
                    Livro livroTitulo = biblioteca.buscarPorTitulo(scanner.nextLine());
                    if (livroTitulo != null) {
                        System.out.println("Livro encontrado: " + livroTitulo.getTitulo() + " por " + livroTitulo.getAutor());
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Autor do livro para buscar:");
                    Livro livroAutor = biblioteca.buscarPorAutor(scanner.nextLine());
                    if (livroAutor != null) {
                        System.out.println("Livro encontrado: " + livroAutor.getTitulo() + " por " + livroAutor.getAutor());
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Título do livro para empréstimo:");
                    boolean emprestado = biblioteca.realizarEmprestimo(scanner.nextLine());
                    if (emprestado) {
                        System.out.println("Empréstimo realizado");
                    } else {
                        System.out.println("Falha no empréstimo");
                    }
                    break;

                case 6:
                    System.out.println("Título do livro para devolução:");
                    boolean devolvido = biblioteca.realizarDevolucao(scanner.nextLine());
                    if (devolvido) {
                        System.out.println("Devolução realizada");
                    } else {
                        System.out.println("Falha na devolução");
                    }
                    break;

                case 7:
                    System.out.println("Verificar disponibilidade do livro:");
                    boolean disponivel = biblioteca.verificarDisponibilidade(scanner.nextLine());
                    if (disponivel) {
                        System.out.println("Livro disponível");
                    } else {
                        System.out.println("Livro indisponível");
                    }
                    break;

                case 8:
                    System.out.println("\nSAINDO DO PROGRAMA");
                    scanner.close();
                    return;

                default:
                    System.out.println("\nOPÇÃO INVÁLIDA!");
                    break;
            }

            System.out.println("--------------------------------------------");
        }
    }
}
