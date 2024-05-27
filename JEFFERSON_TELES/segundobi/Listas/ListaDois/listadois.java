package segundobi.Listas.ListaDois;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class listadois {

    public static void main(String[] args) {
        // Atividade 1
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numerosPares = numeros.stream()
                                            .filter(n -> n % 2 == 0)
                                            .collect(Collectors.toList());
        System.out.println("Atividade 1 - Numeros Pares: " + numerosPares);

        // Atividade 2
        List<String> nomes = Arrays.asList("roberto", "jose", "caio", "vinicius");
        List<String> nomesMaiusculos = nomes.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());
        System.out.println("Atividade 2 - Nomes Maiusculos: " + nomesMaiusculos);

        // Atividade 3
        List<String> palavras = Arrays.asList(" se", " talvez", " hoje", " sábado", " se", " quarta", " sábado");
        Map<String, Long> contagemPalavras = palavras.stream()
                                                     .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println("Atividade 3 - Contagem de palavras: " + contagemPalavras);

        // Atividade 4
        class Produto {
            String nome;
            double preco;

            Produto(String nome, double preco) {
                this.nome = nome;
                this.preco = preco;
            }

            @Override
            public String toString() {
                return nome + ": " + preco;
            }
        }

        List<Produto> produtos = Arrays.asList(
                new Produto("Produto 1", 50.0),
                new Produto("Produto 2", 150.0),
                new Produto("Produto 3", 200.0),
                new Produto("Produto 4", 80.0)
        );

        List<Produto> produtosCaros = produtos.stream()
                                              .filter(p -> p.preco > 100.0)
                                              .collect(Collectors.toList());
        System.out.println("Atividade 4 - Produtos com preço > R$ 100,00: " + produtosCaros);

        // Atividade 5
        double somaTotal = produtos.stream()
                                   .mapToDouble(p -> p.preco)
                                   .sum();
        System.out.println("Atividade 5 - Soma dos produtos: " + somaTotal);

        // Atividade 6
        List<String> linguagens = Arrays.asList("Java", "Python", "C", "JavaScript", "Ruby");
        List<String> linguagensOrdenadas = linguagens.stream()
                                                     .sorted(Comparator.comparingInt(String::length))
                                                     .collect(Collectors.toList());
        System.out.println("Atividade 6 - Linguagens ordenadas pelo tamanho: " + linguagensOrdenadas);
    }
}
