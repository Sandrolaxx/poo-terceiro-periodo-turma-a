public class Produto 
{
    private String nome;
    
    private Double preço;

    public Produto(String nome, Double preço)
    {
        this.nome = nome;
        this.preço = preço;
    }

    public String getNome()
    {
        return nome;
    }

    public Double getPreço()
    {
        return preço;
    }

    @Override
    public String toString()
    {
        return ("Produto: " + nome + "Preço " + preço);
    }
}