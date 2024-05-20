package ProvaPoo;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Aluno> alunos;
    private ArrayList<Livro> livros;

    public Biblioteca() {
        this.alunos = new ArrayList<>();
        this.livros = new ArrayList<>();
    }

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
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

    public boolean realizarEmprestimo(Emprestimo emprestimo) {
        Aluno aluno = emprestimo.getAluno();
        Livro livro = emprestimo.getLivro();
        if (!livro.isEmprestado()) {
            livro.setEmprestado(true);
            return true;
        }
        return false;
    }

    public void realizarDevolucao(Devolucao devolucao) {
        Livro livro = devolucao.getLivro();
        livro.setEmprestado(false);
    }

    public boolean verificarDisponibilidadeEmprestimo(String titulo) {
        Livro livro = buscarLivroPorTitulo(titulo);
        return livro != null && !livro.isEmprestado();
    }

    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 3.50;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
}
