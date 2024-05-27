package primeirobi.ListasExc.Lista6Nova;

public class Cliente {
    private String nome;
    private int idade;
    private String cidade;
    private String bairro;
    private String rua;

    public Cliente(String nome, int idade, String cidade, String bairro, String rua) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
    }

    public String getNome() {
        return nome;
    }

    public void apresentarse() {
        System.out.println("/:====Informações dos clientes===:/");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
        System.out.println("Bairro: " + bairro);
        System.out.println("Rua: " + rua);
        System.out.println(" ");
    }
}
