package primbi.prova;

public class Aluno {

    private String nomeAluno;
    private int idAluno;

    public Aluno(String nomeAluno, int idAluno) {
        this.nomeAluno = nomeAluno;
        this.idAluno = idAluno;
    }


    public String getNomeAluno() {
        return this.nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getIdAluno() {
        return this.idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }


}
