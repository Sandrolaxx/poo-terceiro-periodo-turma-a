package ProvaPoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();
Scanner scanner = new Scanner(System.in);
 boolean sair = false;
        while (!sair) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Cadastrar livro");
            System.out.println("3. Realizar empréstimo");
            System.out.println("4. Realizar devolução");
            System.out.println("5. Verificar disponibilidade de empréstimo");
            System.out.println("6. Sair");

           System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
switch (opcao) {
                case 1:
                    System.out.print("Nome aluno: ");
                    String nomeAluno = scanner.nextLine();
                    System.out.print("Matrícula aluno: ");
                    int matriculaAluno = scanner.nextInt();
                    biblioteca.cadastrarAluno(new Aluno(nomeAluno, matriculaAluno));
                    System.out.println("Aluno cadastrado com sucesso.");
                    break;
                case 2:
                    System.out.print("Título do livro: ");
                    String tituloLivro = scanner.nextLine();
                    System.out.print("Autor do livro: ");
                    String autorLivro = scanner.nextLine();
                    biblioteca.cadastrarLivro(new Livro(tituloLivro, autorLivro));
                    System.out.println("Livro cadastrado com sucesso.");
                    break;
                case 3:
                    System.out.print("Matrícula do aluno: ");
                    int matriculaEmprestimo = scanner.nextInt();
                    Aluno aluno = buscarAlunoPorMatricula(biblioteca, matriculaEmprestimo);
                    if (aluno != null) {
                        System.out.print("Título do livro: ");
                        scanner.nextLine(); 
                        String tituloEmprestimo = scanner.nextLine();
                        Livro livro = biblioteca.buscarLivroPorTitulo(tituloEmprestimo);
                        if (livro != null) {
                            Emprestimo emprestimo = new Emprestimo(aluno, livro);
                            if (biblioteca.realizarEmprestimo(emprestimo)) {
                                System.out.println("Empréstimo realizado com sucesso.");
                            } else {
                                System.out.println("Não foi possível realizar o empréstimo.");
                            }
                        } else {
                            System.out.println("Livro não encontrado.");
                        }
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Título do livro devolvido: ");
                    String tituloDevolucao = scanner.nextLine();
                    Livro livroDevolucao = biblioteca.buscarLivroPorTitulo(tituloDevolucao);
                    if (livroDevolucao != null) {
                        Devolucao devolucao = new Devolucao(livroDevolucao);
                        biblioteca.realizarDevolucao(devolucao);
                        System.out.println("Devolução realizada com sucesso.");
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("Título do livro: ");
                    String tituloDisponibilidade = scanner.nextLine();
                    Livro livroDisponibilidade = biblioteca.buscarLivroPorTitulo(tituloDisponibilidade);
                    if (livroDisponibilidade != null) {
                        boolean disponibilidade = biblioteca.verificarDisponibilidadeEmprestimo(tituloDisponibilidade);
                        if (disponibilidade) {
                            System.out.println("O livro está disponível para empréstimo.");
                        } else {
                            System.out.println("O livro não está disponível para empréstimo.");
                        }
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 6:
                    sair = true;
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
scanner.close();
    }
    private static Aluno buscarAlunoPorMatricula(Biblioteca biblioteca, int matricula) {
        for (Aluno aluno : biblioteca.getAlunos()) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }
}
