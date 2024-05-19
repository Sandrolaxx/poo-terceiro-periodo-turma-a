package primeirobi.atividades.lista5;

public class Cliente {
    
    String nome, cidade, bairro, rua;
    int idade;

    public Cliente(String nome, String cidade, String bairro, String rua, int idade){
        this.nome = nome;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.idade = idade;
    }

    void apresentarSe(){
        System.out.println("Cliente: " + this.nome+ "\nIdade: " + this.idade);
    }

}
