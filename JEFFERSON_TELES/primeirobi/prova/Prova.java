package JEFFERSON_TELES.primeirobi.prova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Livros> livros = new ArrayList<>();
        List<Alunos> alunos = new ArrayList<>();
        Emprestimo emprestimo = new Emprestimo();

        int opcao;
        do {
            exibirMenu();
            opcao = lerOpcao(scanner);

            switch (opcao) {
                case 1:
                    cadastrarAluno(alunos, scanner);
                    break;
                case 2:
                    cadastrarLivro(livros, scanner);
                    break;
                case 3:
                    buscarPorTitulo(livros, scanner);
                    break;
                case 4:
                    buscarPorAutor(livros, scanner);
                    break;
                case 5:
                    realizarEmprestimo(emprestimo, livros, alunos, scanner);
                    break;
                case 6:
                    realizarDevolucao(emprestimo, livros, scanner);
                    break;
                case 7:
                    verificarDisponibilidade(emprestimo, livros, scanner);
                    break;
                case 8:
                    criarMulta(emprestimo, scanner);
                    break;
                case 9:
                    System.out.println("PROGRAMA FINALIZADO.");
                    break;
                default:
                    System.out.println("OPCAO INVALIDA.");
            }
        } while (opcao != 9);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n-MENUZINHO-\n");
        System.out.println("1. CADASTRO DE ALUNOS");
        System.out.println("2. CADASTRO DE LIVROS");
        System.out.println("3. BUSCAR POR TITULO (Retorna Primeiro Registro)");
        System.out.println("4. BUSCAR POR AUTOR (Retorna Primeiro Registro)");
        System.out.println("5. REALIZAR EMPRESTIMO");
        System.out.println("6. REALIZAR DEVOLUÇÃO");
        System.out.println("7. VERIFICAR A DISPONIBILIDADE DE EMPRESTIMO DE UM TITULO");
        System.out.println("8. CRIAR MULTA ATRASO (Apos 7 dias, 3.50 Por Dia de Atraso)");
        System.out.println("9. SAIR");
        System.out.println("DIGITE A OPÇÃO QUE DESEJA (DE 1 A 9) (9 SAI)");
    }

    private static int lerOpcao(Scanner scanner) {
        System.out.print("Opção: ");
        return scanner.nextInt();
    }

    private static void cadastrarAluno(List<Alunos> alunos, Scanner scanner) {
        System.out.println("CADASTRO DE ALUNO");
        System.out.print("Nome do aluno: ");
        String nome = scanner.next(); 
        System.out.print("Matrícula do aluno: ");
        String matricula = scanner.next(); 
        Alunos aluno = new Alunos(nome, matricula); 
        alunos.add(aluno); 
        System.out.println("Aluno cadastrado com sucesso!");
    }

    private static void cadastrarLivro(List<Livros> livros, Scanner scanner) {
        System.out.println("CADASTRO DE LIVRO");
        System.out.print("Título do livro: ");
        String titulo = scanner.next(); 
        System.out.print("Autor do livro: ");
        String autor = scanner.next(); 
        System.out.print("Ano de publicação do livro: ");
        int anoPublicacao = scanner.nextInt();

        Livros livro = new Livros(titulo, autor, anoPublicacao);
        livros.add(livro); 
        System.out.println("Livro cadastrado com sucesso!");
    }

    private static void buscarPorTitulo(List<Livros> livros, Scanner scanner) {
        System.out.println("BUSCA POR TÍTULO");
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.next(); 

        for (Livros livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Livro encontrado:");
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
                return; 
            }
        }

        System.out.println("Livro não encontrado.");
    }

    private static void buscarPorAutor(List<Livros> livros, Scanner scanner) {
        System.out.println("BUSCA POR AUTOR");
        System.out.print("Digite o autor do livro: ");
        String autor = scanner.next();

        for (Livros livro : livros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                System.out.println("Livro encontrado:");
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
                return; 
            }
        }

        System.out.println("Livro não encontrado.");
    }

    private static void realizarEmprestimo(Emprestimo emprestimo, List<Livros> livros, List<Alunos> alunos, Scanner scanner) {
        System.out.println("REALIZAR EMPRÉSTIMO");
        System.out.print("Matrícula do aluno: ");
        String matricula = scanner.next(); 

        Alunos aluno = null;
        for (Alunos a : alunos) {
            if (a.getMatricula().equalsIgnoreCase(matricula)) {
                aluno = a;
                break;
            }
        }

        if (aluno == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        System.out.print("Título do livro: ");
        String tituloLivro = scanner.next(); 

        Livros livro = null;
        for (Livros l : livros) {
            if (l.getTitulo().equalsIgnoreCase(tituloLivro)) {
                livro = l;
                break;
            }
        }

        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }

        if (emprestimo.emprestar(livro, aluno)) {
            System.out.println("Empréstimo realizado com sucesso!");
        } else {
            System.out.println("O livro não está disponível para empréstimo.");
        }
    }

    private static void realizarDevolucao(Emprestimo emprestimo, List<Livros> livros, Scanner scanner) {
        System.out.println("REALIZAR DEVOLUÇÃO");
        System.out.print("Título do livro devolvido: ");
        String tituloLivro = scanner.next();

        for (Livros livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(tituloLivro)) {
                if (emprestimo.devolver(livro)) {
                    System.out.println("Devolução realizada com sucesso!");
                } else {
                    System.out.println("Livro não estava emprestado ou já foi devolvido.");
                }
                return;
            }
        }

        System.out.println("Livro não encontrado.");
    }

    private static void verificarDisponibilidade(Emprestimo emprestimo, List<Livros> livros, Scanner scanner) {
        System.out.println("VERIFICAR DISPONIBILIDADE");
        System.out.print("Título do livro: ");
        String tituloLivro = scanner.next(); 

        for (Livros livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(tituloLivro)) {
                if (emprestimo.verificarDisponibilidade(livro)) {
                    System.out.println("O livro está disponível para empréstimo.");
                } else {
                    System.out.println("O livro não está disponível para empréstimo no momento.");
                }
                return;
            }
        }

        System.out.println("Livro não encontrado.");
    }

    private static void criarMulta(Emprestimo emprestimo, Scanner scanner) {
        System.out.println("CRIAR MULTA");
        System.out.print("Título do livro: ");
        String tituloLivro = scanner.next(); 
        System.out.print("Dias de atraso: ");
        int diasAtraso = scanner.nextInt(); 

        double multa = emprestimo.calcularMulta(tituloLivro, diasAtraso);
        if (multa > 0) {
            System.out.println("Multa calculada: R$" + multa);
        } else {
            System.out.println("O livro não possui multa por atraso.");
        }
    }
}
