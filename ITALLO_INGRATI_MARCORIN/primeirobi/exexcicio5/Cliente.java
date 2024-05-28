package primeirobi.exexcicio5;

public class Cliente {
    String nome;
    Integer idade;
    String cidade;
    String bairro;
    String rua;

    public void apresentarSe() {
        System.out.println("Nome: " + nome + " Idade: " + idade);
    }
}