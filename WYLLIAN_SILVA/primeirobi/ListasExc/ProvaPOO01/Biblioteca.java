package primeirobi.ListasExc.ProvaPOO01;

import java.util.*;

public class Biblioteca {
    private List<AlunoB> alunos;
    private List<LivroB> livros;

    public Biblioteca() {
        alunos = new ArrayList<>();
        livros = new ArrayList<>();
    }

    public void cadastrarAluno(AlunoB aluno) {
        alunos.add(aluno);
    }

    public void cadastrarLivro(LivroB livro) {
        livros.add(livro);
    }

    public LivroB BuscaLivro(String nomeLivro) {
        for (LivroB livro : livros) {
            if (livro.NomeLivro().equalsIgnoreCase(nomeLivro)) {
                return livro;
            }
        }
        return null;
    }

    public boolean realizarEmprestimo(String nomeLivro, int numeroAluno) {
        LivroB livro = BuscaLivro(nomeLivro);
        if (livro != null && livro.isDisponivel()) {
            livro.emprestarLivro();
            return true;
        }
        return false;
    }

    public boolean realizarDevolucao(String nomeLivro) {
        LivroB livro = BuscaLivro(nomeLivro);
        if (livro != null && !livro.isDisponivel()) {
            livro.devolverLivro();
            return true;
        }
        return false;
    }

    public boolean verificarDisponibilidade(String nomeLivro) {
        LivroB livro = BuscaLivro(nomeLivro);
        return livro != null && livro.isDisponivel();
    }

    public double calcularMulta(int atraso) {
        return atraso * 3.50;
    }
}
