package BIM1.Lista5Lojas;

public class Pessoa {
    String nome;
    int idade;
    Endereco endereco;
    
    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
