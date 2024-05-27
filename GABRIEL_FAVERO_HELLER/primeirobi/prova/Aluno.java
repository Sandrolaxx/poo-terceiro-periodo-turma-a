package GABRIEL_FAVERO_HELLER.primeirobi.prova;

public class Aluno {
    private String nome;
    private String curso;
    private Integer periodo;

    public Aluno(String nome, String curso, Integer periodo) {
        this.nome = nome;
        this.curso = curso;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public void apresentarSe() {
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Período: " + periodo);
    }
}
