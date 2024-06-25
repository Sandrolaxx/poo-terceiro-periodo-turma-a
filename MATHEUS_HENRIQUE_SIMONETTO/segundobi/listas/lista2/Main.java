package segundobi.listas.lista2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // ATV1: Filtrar números pares
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        if (numeros.size() >= 8) {
            List<Integer> pares = numeros.stream()
                                          .filter(n -> n % 2 == 0)
                                          .collect(Collectors.toList());
            System.out.println("Números pares: " + pares);
        } else {
            System.out.println("Lista de números deve conter pelo menos 8 elementos.");
        }

        // ATV2:
        List<String> nomes = Arrays.asList("naruto", "ednaldo", "sandro", "leonidas");
        List<String> nomesMaiusculos = nomes.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());
        System.out.println("Nomes em maiúsculas: " + nomesMaiusculos);

        // ATV3:
        List<String> palavras = Arrays.asList("parsa", "talvez", "hoje", "sábado", "parsa", "quarta", "sábado");
        if (!palavras.isEmpty()) {
            Map<String, Long> frequencia = palavras.stream()
                                                   .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            System.out.println("Frequência das palavras: " + frequencia);
        } else {
            System.out.println("Lista de palavras está vazia.");
        }

        // ATV4:
        List<Produto> produtos = Arrays.asList(
            new Produto("Livro", 99.90),
            new Produto("Smartphone", 499.99),
            new Produto("Caneta", 1.50),
            new Produto("Notebook", 1200.00)
        );
        List<Produto> produtosCaros = produtos.stream()
                                              .filter(p -> p.getPreco() > 100.00)
                                              .collect(Collectors.toList());
        if (!produtosCaros.isEmpty()) {
            System.out.println("Produtos com preço maior que R$ 100,00: " + produtosCaros);
        } else {
            System.out.println("Nenhum produto com preço maior que R$ 100 encontrado.");
        }

        // ATV5:
        double totalValor = produtos.stream()
                                    .mapToDouble(Produto::getPreco)
                                    .sum();
        System.out.println("Valor total dos produtos: " + totalValor);

        // ATV6:
        List<String> linguagens = Arrays.asList("Java", "Python", "C", "JavaScript", "Ruby");
        List<String> linguagensOrdenadas = linguagens.stream()
                                                     .sorted(Comparator.comparingInt(String::length))
                                                     .collect(Collectors.toList());
        System.out.println("Linguagens ordenadas por tamanho: " + linguagensOrdenadas);
    }

    // Classe Produto
    static class Produto {
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
            return String.format("Produto{nome='%s', preco=%.2f}", nome, preco);
        }
    }
}
