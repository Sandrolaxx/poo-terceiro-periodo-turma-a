package RAFAEL_KAITO.BIM1.prova;

public class Aluno {
    private String nome;
    private String cadastro;
    
    public Aluno(String nome, String cadastro) {
        this.nome = nome;
        this.cadastro = cadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCadastro() {
        return cadastro;
    }

    public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
    }
}
