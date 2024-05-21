package SEGUNDO_BIMESTRE.Aulas.CorrecaoProva;


public class Aluno {

    private Integer Id;

    private String nome;

    private int idade;

    private String curso;

    private String RA;

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String rA) {
        RA = rA;
    }

    public void setId(String id) {
        this.Id = Integer.parseInt(id);
    }

    public void setId(Integer id) {
        Id = id;
    }

}