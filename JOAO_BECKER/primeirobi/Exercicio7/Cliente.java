package primeirobi.Exercicio7;

public class Cliente {
    private Endereco endereco;
    private String nome;
    private Integer idade;

    public Cliente(Endereco endereco, String nome, Integer idade) {
        this.endereco = endereco;
        this.nome = nome;
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
}
