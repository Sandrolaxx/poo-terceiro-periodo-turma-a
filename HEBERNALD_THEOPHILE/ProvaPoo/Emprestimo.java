package ProvaPoo;


public class Emprestimo {
    private Aluno aluno;
    private Livro livro;

    public Emprestimo(Aluno aluno, Livro livro) {
        this.aluno = aluno;
        this.livro = livro;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Livro getLivro() {
        return livro;
    }
}
