package primeirobi.ListasExc.Lista7;

public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;

    public void apresentar() {
        System.out.println(nome+ "Meu nome é : " + nome + " e tenho " + idade + " anos ");
        System.out.println(endereco.apresentarLogradouro());
    }

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}