package MATHEUS_EDUARDO_DOS_SANTOS.primeirobimestre.prova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private List<Aluno> alunos;
    private List<Livro> livros;
    private Scanner scanner;

    public Biblioteca() {
        this.alunos = new ArrayList<>();
        this.livros = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.executar();
    }

    public void cadastrarAluno() {
        System.out.println("Digite o número da matrícula do aluno:");
        int matricula = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        Aluno aluno = new Aluno(matricula, nome);
        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso.");
    }

    public void cadastrarLivro() {
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();

        System.out.println("Digite o autor do livro:");
        String autor = scanner.nextLine();

        Livro livro = new Livro(titulo, autor);
        livros.add(livro);
        System.out.println("Livro cadastrado com sucesso.");
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public Livro buscarLivroPorAutor(String autor) {
        for (Livro livro : livros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                return livro;
            }
        }
        return null;
    }

    public void realizarEmprestimo() {
        System.out.println("Digite a matrícula do aluno:");
        int matricula = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o título do livro:");
        String tituloLivro = scanner.nextLine();

        Aluno aluno = null;
        for (Aluno x : alunos) {
            if (x.getMatricula() == matricula) {
                aluno = x;
                break;
            }
        }

        if (aluno == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        Livro livro = buscarLivroPorTitulo(tituloLivro);
        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }

        if (!livro.Disponivel()) {
            System.out.println("O livro não está disponível para empréstimo.");
            return;
        }

        livro.setDisponivel(false);
        System.out.println("Empréstimo realizado para " + aluno.getNome() + ", Livro: " + livro.getTitulo());
    }

    public void realizarDevolucao() {
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();

        Livro livro = buscarLivroPorTitulo(titulo);
        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }

        if (livro.Disponivel()) {
            System.out.println("Este livro já está disponível.");
            return;
        }

        livro.setDisponivel(true);
        System.out.println("Devolução realizada: " + livro.getTitulo());
    }

    public void exibirMenu() {
        System.out.println("1. Cadastrar aluno");
        System.out.println("2. Cadastrar livro");
        System.out.println("3. Buscar livro por título");
        System.out.println("4. Buscar livro por autor");
        System.out.println("5. Realizar empréstimo");
        System.out.println("6. Realizar devolução");
        System.out.println("7. Sair");
    }

    public void executar() {
        int opcao;
        do {
            exibirMenu();
            System.out.println("Digite sua opção:");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    cadastrarLivro();
                    break;
                case 3:
                    System.out.println("Digite o título do livro:");
                    String tituloLivro = scanner.nextLine();
                    Livro livroTitulo = buscarLivroPorTitulo(tituloLivro);
                    if (livroTitulo != null) {
                        System.out.println(
                        "Livro encontrado: " + livroTitulo.getTitulo() + ", Autor: " + livroTitulo.getAutor());
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Digite o autor do livro:");
                    String autorLivro = scanner.nextLine();
                    Livro livroAutor = buscarLivroPorAutor(autorLivro);
                    if (livroAutor != null) {
                        System.out.println("Livro encontrado: " + livroAutor.getTitulo() + ", Autor: " + livroAutor.getAutor());
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 5:
                    realizarEmprestimo();
                    break;
                case 6:
                    realizarDevolucao();
                    break;
                case 7:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 7);
    }
}
