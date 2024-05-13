package ListaSete;

public class Cliente {
    private final String nome;
    private final int idade;
    private final Endereco endereco; 

    public Cliente(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco; 
    }

    public void apresentarSe() {
        System.out.printf("Nome: %s, Idade: %d%n", nome, idade);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Endereco getEndereco() {
        return endereco; 
    }
}
