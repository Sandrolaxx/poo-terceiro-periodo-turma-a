package primeirobi.exemplos;

public class Arma extends Object
{
    String nome;

    String tipo;

    Integer dano;

    @Override
    public String toString() 
    {
        return "Arma [nome=" + nome + ", tipo=" + tipo + ", dano=" + dano + "]";
    }
}