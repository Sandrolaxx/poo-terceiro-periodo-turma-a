package primeirobi.ListasExc.ProvaPOO01;

public class LivroB {
    private String nomeLivro;
    private boolean dispLivro;

    public LivroB(String nomeLivro) {
        this.nomeLivro = nomeLivro;
        this.dispLivro = true;
    }

    public String NomeLivro() {
        return nomeLivro;
    }

    public boolean isDisponivel() {
        return dispLivro;
    }

    public void emprestarLivro() {
        dispLivro = false;
    }

    public void devolverLivro() {
        dispLivro = true;
    }
}

