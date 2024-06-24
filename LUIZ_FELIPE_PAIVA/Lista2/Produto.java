package Lista2;
import java.util.List;
import java.util.stream.Collectors;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public static void main(String[] args) {
    
        List<Produto> produtos = List.of(
                new Produto("Computador", 2500.0),
                new Produto("Smartphone", 1200.0),
                new Produto("Monitor", 400.0),
                new Produto("Câmera Fotográfica", 300.0)
        );

       
        List<Produto> produtosCaros = produtos.stream()
                                              .filter(produto -> produto.getPreco() > 100.0)
                                              .collect(Collectors.toList());

       
        System.out.println("Produtos com preço maior que R$ 100,00:");
        produtosCaros.forEach(produto -> System.out.println(produto.getNome() + ": R$" + produto.getPreco()));
    }
}
