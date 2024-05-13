package JORGE_BASTOS.primeirobi.prova;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {
    private List<Aluno> alunos;
    private List<Livro> livros;
    private Map<Livro, Aluno> emprestimo;
    private static final long umDiaEmMs = 86400000;

    public Biblioteca() {
        this.alunos = new ArrayList<>();
        this.livros = new ArrayList<>();
        this.emprestimo = new HashMap<>();
    }

    public void cadastroAluno(String nome, int matricula) {
        Aluno aluno = new Aluno(nome, matricula);
        alunos.add(aluno);
    }

    public void cadastroLivro(String titulo, String autor) {
        Livro livro = new Livro(titulo, autor);
        livros.add(livro);
    }

    public Livro buscarLivroTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public Livro buscarLivroAutor(String autor) {
        for (Livro livro : livros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                return livro;
            }
        }
        return null;
    }

    public void realizarEmprestimo(String titulo, int matricula) {
        Livro livro = buscarLivroTitulo(titulo);
        Aluno aluno = null;
        for (Aluno a : alunos) {
            if (a.getMatricula() == matricula) {
                aluno = a;
                break;
            }
        }
        if (livro != null && aluno != null && livro.isDisponivel()) {
            livro.setDisponivel(false);
            emprestimo.put(livro, aluno);
            System.out.println("Empréstimo realizado");
        } else {
            System.out.println("Livro não disponível");
        }
    }

    public void realizarDevolucao(String titulo) {
        Livro livro = buscarLivroTitulo(titulo);
        if (livro != null && !livro.isDisponivel()) {
            Aluno aluno = emprestimo.get(livro);
            if (aluno != null) {
                livro.setDisponivel(true);
                emprestimo.remove(livro);
                System.out.println("Devolução do livro '" + livro.getTitulo() + "' realizado por '" + aluno.getNome() + "'.");
            } else {
                System.out.println("Livro não disponível, ou aluno não encontrado");
            }
        }
    }

    public boolean verificarDisponibilidade(String titulo) {
        Livro livro = buscarLivroTitulo(titulo);
        return livro != null && livro.isDisponivel();
    }

    public double verificarMulta(String titulo) {
        Livro livro = buscarLivroTitulo(titulo);
        if (livro != null && !livro.isDisponivel()) {
            LocalDate dataAtual = LocalDate.now();
            LocalDate dataDevolucao = LocalDate.of(2024, 4, 15);
    
            long diasAtrasados = ChronoUnit.DAYS.between(dataDevolucao, dataAtual);
            long msAtraso = diasAtrasados * umDiaEmMs;
    
            if (diasAtrasados > 7) {
                double multa = ((double) msAtraso / umDiaEmMs - 7) * 3.50;
                return multa;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();


        biblioteca.cadastroAluno("João", 77289);
        biblioteca.cadastroAluno("José", 322201);


        biblioteca.cadastroLivro("Entendendo algoritmos", "José Alencar");
        biblioteca.cadastroLivro("O sistema linux que deu certo", "Linus Torvalds");

  
        biblioteca.realizarEmprestimo("Entendendo algoritmos", 77289);

        biblioteca.realizarDevolucao("Entendendo algoritmos");
    }
}
