package primeirobi.prova;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public Livro buscarPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && !livro.isEmprestado()) {
                return livro;
            }
        }
        return null;
    }

    public Livro buscarPorAutor(String autor) {
        for (Livro livro : livros) {
            if (livro.getAutor().equalsIgnoreCase(autor) && !livro.isEmprestado()) {
                return livro;
            }
        }
        return null;
    }

    public boolean realizarEmprestimo(String titulo) {
        Livro livro = buscarPorTitulo(titulo);
        if (livro != null && !livro.isEmprestado()) {
            livro.setEmprestado(true);
            return true;
        }
        return false;
    }

    public boolean realizarDevolucao(String titulo) {
        Livro livro = buscarPorTitulo(titulo);
        if (livro != null && livro.isEmprestado()) {
            livro.setEmprestado(false);
            return true;
        }
        return false;
    }

    public boolean verificarDisponibilidade(String titulo) {
        Livro livro = buscarPorTitulo(titulo);
        return livro != null && !livro.isEmprestado();
    }
}
