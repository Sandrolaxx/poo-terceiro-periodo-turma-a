package ProvaB1;

public class Devolucao {
    private Livro livro;

    public Devolucao(Livro livro) {
        this.livro = livro;
    }

    public boolean devolverLivro() {
        if (!livro.isDisponivel()) {
            livro.setDisponivel(true);
            return true; 
        }
        return false; 
    }
}
