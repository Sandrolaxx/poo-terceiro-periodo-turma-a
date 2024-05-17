package PEDRO_HENRIQUE_GULIGURSKI.primeirobimestre.prova;

public class Aluno {
    private String nome;
    private String turma;
    private Integer numeroMatricula;

    Integer numeroParaMatricula = 0;
    public Aluno(String nome, String turma){
        numeroParaMatricula ++;
        this.nome = nome;
        this.turma = turma;
        this.numeroMatricula = numeroParaMatricula;
    }

    public String getNome() {
        return nome;
    }

    public String getTurma() {
        return turma;
    }

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }
}
