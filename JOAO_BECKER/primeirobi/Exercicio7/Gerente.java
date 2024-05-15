package primeirobi.Exercicio7;
import java.util.ArrayList;

public class Gerente extends Vendedor{
    
    public Gerente(String nome, Integer idade, String loja, String cidade, String bairro, String rua,Double salarioBase, ArrayList<Double> salarioRecebido, Endereco endereco) {
        super(nome, idade, loja, cidade, bairro, rua, salarioBase, salarioRecebido, endereco);
    }
}
