package Lista2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Atividade2 {
    public static void main(String[] args) {
        // Atv1
        List<Integer> numeros = Arrays.asList(10, 5, 7, 20, 15, 30, 25, 8);
        List<Integer> numerosPares = numeros.stream()
                                           .filter(num -> num % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Números pares: " + numerosPares);

        // Atv2
        List<String> nomes = Arrays.asList("roberto", "josé", "caio", "vinicius");
        List<String> nomesMaiusculos = nomes.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());
        System.out.println("Nomes em maiúsculas: " + nomesMaiusculos);

        // Atv3
        List<String> palavras = Arrays.asList("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");
        palavras.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                .forEach((palavra, frequencia) -> System.out.println(palavra + ": " + frequencia));

        // Atv4
        List<Produto> produtos = Arrays.asList(
                new Produto("Produto1", 150.0),
                new Produto("Produto2", 80.0),
                new Produto("Produto3", 120.0),
                new Produto("Produto4", 200.0)
        );
        List<Produto> produtosCaros = produtos.stream()
                                              .filter(produto -> produto.getPreco() > 100.0)
                                              .collect(Collectors.toList());
        System.out.println("Produtos com preço maior que R$ 100,00: " + produtosCaros);

        // Atv5
        double total = produtos.stream()
                               .mapToDouble(Produto::getPreco)
                               .sum();
        System.out.println("Valor total dos produtos: R$ " + total);

        // Atv6
        List<String> linguagens = Arrays.asList("Java", "Python", "C", "JavaScript", "Ruby");
        List<String> ordenadas = linguagens.stream()
                                           .sorted((s1, s2) -> s1.length() - s2.length())
                                           .collect(Collectors.toList());
        System.out.println("Lista ordenada: " + ordenadas);
    }
}

class Produto {
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

    @Override
    public String toString() {
        return nome + " (R$ " + preco + ")";
    }
}