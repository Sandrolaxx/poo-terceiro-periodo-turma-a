package ProvaB1;

public class Emprestimo {
    private Livro livro;

    public Emprestimo(Livro livro) {
        this.livro = livro;
    }

    public boolean realizarEmprestimo() {
        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            return true; 
        }
        return false; 
    }
}




