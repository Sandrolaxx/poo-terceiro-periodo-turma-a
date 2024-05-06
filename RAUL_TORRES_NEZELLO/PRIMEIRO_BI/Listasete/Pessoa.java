package PRIMEIRO_BI.Listasete;

public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
    public void apresentarse(){
        System.out.println("Olá, meu nome é "+getNome()+" e tenho "+getIdade()+" anos");
        System.out.println("Endereço");
        endereco.apresentarLogradouro();
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    
}
