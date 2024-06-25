package ProvaB1;
import java.util.Scanner;

public class Biblioteca {
    private CadastroLivros cadastroLivros;
    private Emprestimo emprestimo;
    private Devolucao devolucao;

    public Biblioteca(CadastroLivros cadastroLivros, Emprestimo emprestimo, Devolucao devolucao) {
        this.cadastroLivros = cadastroLivros;
        this.emprestimo = emprestimo;
        this.devolucao = devolucao;
    }

    public void realizarEmprestimo(Scanner scanner) {
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();
        Livro livro = cadastroLivros.buscarLivroPorTitulo(titulo);
        if (livro != null) {
            emprestimo.setLivro(livro);
            boolean emprestimoRealizado = emprestimo.realizarEmprestimo();
            if (emprestimoRealizado) {
                System.out.println("Empréstimo realizado com sucesso.");
            } else {
                System.out.println("Empréstimo não realizado. Livro indisponível.");
            }
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    public void realizarDevolucao(Scanner scanner) {
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();
        Livro livro = cadastroLivros.buscarLivroPorTitulo(titulo);
        if (livro != null) {
            devolucao.setLivro(livro);
            boolean devolucaoRealizada = devolucao.devolverLivro();
            if (devolucaoRealizada) {
                System.out.println("Devolução realizada com sucesso.");
            } else {
                System.out.println("Devolução não realizada. Livro não emprestado.");
            }
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    public void procurarPorTitulo(Scanner scanner) {
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();
        Livro livro = cadastroLivros.buscarLivroPorTitulo(titulo);
        if (livro != null) {
            System.out.println("Livro encontrado: " + livro);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    public void procurarPorAutor(Scanner scanner) {
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Digite o nome do autor:");
        String autor = scanner.nextLine();
        Livro livro = cadastroLivros.buscarLivroPorAutor(autor);
        if (livro != null) {
            System.out.println("Livro encontrado: " + livro);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}
