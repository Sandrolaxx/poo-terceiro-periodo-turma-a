package primeirobi.lists.Lista6;

public class Cliente extends Endereco {
    String nome;
    Integer idade;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentarSe() {
        System.out.println("Sou o " + nome + " e tenho " + idade + " anos");
    }
}