package listasete2;

public class Pessoa extends Objeto {
    
    String nome;
    int idade;

    protected Pessoa(int id, String nome, int idade) {
        super(id);
        this.nome = nome;
        this.idade = idade;
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected int getIdade() {
        return idade;
    }

    protected void setIdade(int idade) {
        this.idade = idade;
    }
}
