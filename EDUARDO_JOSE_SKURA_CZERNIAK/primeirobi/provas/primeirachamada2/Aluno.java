package primeirobi.provas.primeirachamada2;

public class Aluno {

    private String aluno;
    private String curso;
    private String idAluno;

    public Aluno(String aluno, String curso, String idAluno) {
        this.aluno = aluno;
        this.curso = curso;
        this.idAluno = idAluno;
    }

    public String getAluno() {
        return aluno;
    }

    public String getCurso() {
        return curso;
    }

    public String getIdAluno() {
        return idAluno;
    }
    
}
