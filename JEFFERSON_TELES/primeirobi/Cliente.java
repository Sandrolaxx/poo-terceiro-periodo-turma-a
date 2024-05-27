package primeirobi;

public class Cliente {
    String nome;
    int idade;
    String cidade;
    String bairro;
    String rua;

    public Cliente(String nome, int idade, String cidade, String bairro, String rua) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void apresentarse() {
        System.out.println("NOME: " + nome);
        System.out.println("IDADE: " + idade);
    }

    public String getNome() {
        return nome;
    }
}
