package Lista2;
import java.util.List;

public class Produto2 {
    private String nome;
    private double preco;

    public Produto2(String nome, double preco) {
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

        double valorTotal = produtos.stream()
                                    .mapToDouble(Produto::getPreco) 
                                    .sum(); 

      
        System.out.println("Valor total dos produtos: R$" + valorTotal);
    }
}
