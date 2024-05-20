package primeirobi.ListasExc.ProvaPOO01;

public class AlunoB {
    private String nomeAluno;
    private int numeroAluno;
//n° para verificar qual livro esta com qual
    public AlunoB(String nomeAluno, int numeroAluno) {
        this.nomeAluno = nomeAluno;
        this.numeroAluno = numeroAluno;
    }

    public String getNome() {
        return nomeAluno;
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }
}

