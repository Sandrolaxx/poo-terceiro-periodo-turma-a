package LUIZA_GOMES.primeirobimestre.prova;

class Emprestimo {
    private Livro livro;
    private Aluno aluno;
    private boolean devolvido;
    private int diasAtraso;

    public Emprestimo(Livro livro, Aluno aluno) {
        this.livro = livro;
        this.aluno = aluno;
        this.devolvido = false;
        this.diasAtraso = 0;
    }

    public Livro getLivro() {
        return livro;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }
}
