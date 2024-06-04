package prova;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Livro> livrosEmprestados;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public Aluno(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void removerLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }
}
