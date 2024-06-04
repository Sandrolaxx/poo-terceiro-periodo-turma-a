package prova;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Livraria {

    private List<Livro> livros;

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public Livraria() {
        this.livros = new ArrayList<>();
    }

    public void LivroAdiciona(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> BuscaTitulo(String titulo) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    public double MultaLivro(Livro livro) {
        if (livro.getDataEmprestimo() == null) {
            return 0.0;
        }
        long diasAtraso = (new Date().getTime() - livro.getDataEmprestimo().getTime()) / 86400000;
        if (diasAtraso > 7) {
            return (diasAtraso - 7) * 3.5;
        } else {
            return 0.0;
        }
    }

    public List<Livro> ProcuraAutor(String autor) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getAutor().equals(autor)) {
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    public boolean LivroEmprestar(Livro livro, Aluno aluno) {
        if (livro.isEmprestado()) {
            return false;
        } else {
            livro.emprestar(aluno);
            aluno.adicionarLivro(livro);
            return true;
        }
    }

    public boolean LivroDevolver(Livro livro) {
        if (!livro.isEmprestado() || livro.getAlunoEmprestado() == null) {
            return false;
        } else {
            Aluno aluno = livro.getAlunoEmprestado();
            aluno.removerLivro(livro);
            livro.devolver();
            return true;
        }
    }

    public boolean disponibilidadeLivro(Livro livro) {
        return !livro.isEmprestado();
    }

}
