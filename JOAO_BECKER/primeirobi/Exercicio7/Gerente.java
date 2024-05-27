package primeirobi.Exercicio7;
import java.util.ArrayList;

public class Gerente extends Vendedor{

    public Gerente(String nome, Integer idade, String loja, Double salarioBase, ArrayList<Double> salarioRecebido,
            Endereco endereco) {
        super(nome, idade, loja, salarioBase, salarioRecebido, endereco);
    }
    
}
