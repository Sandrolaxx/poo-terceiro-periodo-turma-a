package Testes.Lista5;

public class Cliente {
    private String nome;
    private int idade;

    public Cliente(String nome, int idade ){
        this.nome = nome;
        this.idade = idade;  
    }
    public void apresentarSe (){
        System.out.println("Nome: "+nome+ "\nIdade: "+idade);
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
    
}

