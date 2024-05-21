package primbi.prova;

import java.util.List;
import java.util.Date;

public class Emprestimo  {

    private int idLivro;
    private int idAluno;
    private List<Livro> nomeLivro;
    private List<Livro> nomeAutor;
    private Date datadeEmprestimo;
    


    public Emprestimo(int idLivro, int idAluno, List<Livro> nomeLivro, List<Livro> nomeAutor, Date datadeEmprestimo) {
        this.idLivro = idLivro;
        this.idAluno = idAluno;
        this.nomeLivro = nomeLivro;
        this.nomeAutor = nomeAutor;
        this.datadeEmprestimo = datadeEmprestimo;
    }





    public int getIdLivro() {
        return this.idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public int getIdAluno() {
        return this.idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public List<Livro> getNomeLivro() {
        return this.nomeLivro;
    }

    public void setNomeLivro(List<Livro> nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public List<Livro> getNomeAutor() {
        return this.nomeAutor;
    }

    public void setNomeAutor(List<Livro> nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public Date getDatadeEmprestimo() {
        return this.datadeEmprestimo;
    }

    public void setDatadeEmprestimo(Date datadeEmprestimo) {
        this.datadeEmprestimo = datadeEmprestimo;
    }


}
