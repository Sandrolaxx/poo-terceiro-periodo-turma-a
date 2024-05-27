package segundobi.listas.lista2;

public class Produto {
    String nome;
    Double preco;

    public Produto(String nome, Double preco) {
        setNome(nome);
        setPreco(preco);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + "|| Preço: " + preco;
    }

    
}
