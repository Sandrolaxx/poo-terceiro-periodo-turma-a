package segundobi.listas.lista2;

public class Produto {
    
    private String nome;

    private Integer preco;
    
    public Produto(String nome, Integer preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    
}
