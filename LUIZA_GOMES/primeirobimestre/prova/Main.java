package LUIZA_GOMES.primeirobimestre.prova;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        do {
            System.out.println("\n-----> MENU <-----");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Cadastrar Aluno");
            System.out.println("3. Emprestar Livro");
            System.out.println("4. Devolver Livro");
            System.out.println("5. Verificar Disponibilidade de Livro");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    scanner.nextLine(); // Limpar o buffer do scanner
                    System.out.print("Digite o título do livro: ");
                    String tituloLivro = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autorLivro = scanner.nextLine();
                    biblioteca.cadastrarLivro(tituloLivro, autorLivro);
                    System.out.println("Livro cadastrado com sucesso!");
                    break;
                case 2:
                    scanner.nextLine(); // Limpar o buffer do scanner
                    System.out.print("Digite o nome do aluno: ");
                    String nomeAluno = scanner.nextLine();
                    System.out.print("Digite a matrícula do aluno: ");
                    int matriculaAluno = scanner.nextInt();
                    biblioteca.cadastrarAluno(nomeAluno, matriculaAluno);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;
                case 3:
                    scanner.nextLine(); // Limpar o buffer do scanner
                    System.out.print("Digite o título do livro a ser emprestado: ");
                    String tituloEmprestimo = scanner.nextLine();
                    System.out.print("Digite o nome do aluno que irá pegar o livro emprestado: ");
                    String nomeAlunoEmprestimo = scanner.nextLine();
                    Aluno alunoEmprestimo = encontrarAlunoPorNome(nomeAlunoEmprestimo, biblioteca);
                    if (alunoEmprestimo != null) {
                        biblioteca.emprestarLivro(tituloEmprestimo, alunoEmprestimo);
                        System.out.println("Livro emprestado com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;
                case 4:
                    scanner.nextLine(); // Limpar o buffer do scanner
                    System.out.print("Digite o título do livro a ser devolvido: ");
                    String tituloDevolucao = scanner.nextLine();
                    biblioteca.devolverLivro(tituloDevolucao);
                    System.out.println("Livro devolvido com sucesso!");
                    break;
                case 5:
                    scanner.nextLine(); // Limpar o buffer do scanner
                    System.out.print("Digite o título do livro para verificar disponibilidade: ");
                    String tituloVerificacao = scanner.nextLine();
                    if (biblioteca.verificarDisponibilidade(tituloVerificacao)) {
                        System.out.println("O livro está disponível para empréstimo.");
                    } else {
                        System.out.println("O livro não está disponível para empréstimo.");
                    }
                    break;
                case 6:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } while (opcao != 6);
        
        scanner.close();
    }
    
    private static Aluno encontrarAlunoPorNome(String nome, Biblioteca biblioteca) {
        for (Aluno aluno : biblioteca.getAlunos()) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                return aluno;
            }
        }
        return null;
    }
}
