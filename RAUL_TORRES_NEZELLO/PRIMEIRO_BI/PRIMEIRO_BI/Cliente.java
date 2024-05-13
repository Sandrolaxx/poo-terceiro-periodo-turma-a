package PRIMEIRO_BI.PRIMEIRO_BI;

public class Cliente {
    private String nome;
    private int idade;
    private String cidade;
    private String bairro;
    private String rua;


    public Cliente(String nome, int idade, String cidade, String bairro, String rua){
        this.bairro = bairro;
        this.cidade = cidade;
        this.idade = idade;
        this.nome = nome;
        this.rua = rua;
    }
    public void apresentarse(){
        System.out.println("Olá, meu nome é "+nome+" e tenho "+idade+" anos");
    }
}

