package primbi.prova;

public class Livro {
    protected String nomeLivro;
    protected int idLivro;
    protected String nomeAutor;


    public Livro(String nomeLivro, int idLivro, String nomeAutor) {
        this.nomeLivro = nomeLivro;
        this.idLivro = idLivro;
        this.nomeAutor = nomeAutor;
    }



    public String getNomeLivro() {
        return this.nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public int getIdLivro() {
        return this.idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getNomeAutor() {
        return this.nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
    



}
