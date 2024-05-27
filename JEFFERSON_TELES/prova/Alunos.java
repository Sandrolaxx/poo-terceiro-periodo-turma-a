package prova; 

public class Alunos {
    private String nome;
    private String matricula;

    public Alunos(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}
