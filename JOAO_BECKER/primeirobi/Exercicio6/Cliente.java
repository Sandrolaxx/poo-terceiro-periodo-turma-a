package primeirobi.Exercicio6;

public class Cliente{
    String nome;
    Integer idade;
    Endereco endereco;

    public void apresentarse(){
        System.out.println("O cliente "+nome+" tem "+idade+" anos.");
    }
}