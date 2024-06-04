package SegundoBi.Listas.Lista2;

import java.util.*;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {

        // Atv1 - Escreva um programa que receba uma lista de números inteiros e retorne uma lista contendo apenas os números pares usando a Stream API.
        // A lista deve ter ao menos 8 números.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Números pares: " + numerosPares);

        // Atv2 - Dada a seguinte lista de nomes("roberto", "josé", "caio", "vinicius"),
        // escreva um programa que converta todos os nomes para letras maiúsculas usando a Stream API.

        List<String> nomes = Arrays.asList("roberto", "josé", "caio", "vinicius");
        List<String> nomesMaiusculos = nomes.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Nomes em maiúsculas: " + nomesMaiusculos);

        // Atv3 - Crie um programa que conte quantas vezes cada palavra única aparece em uma lista de strings.
        // Utilize a Stream API para processar os dados. Lista de palavras("se", "talvez", "hoje" "sábado", "se", "quarta", "sábado")

        List<String> palavras = Arrays.asList("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");
        Map<String, Long> contagemPalavras = palavras.stream()
                .collect(Collectors.groupingBy(p -> p, Collectors.counting()));
        System.out.println("Contagem : " + contagemPalavras);

        // Atv4 - Crie uma Classe Produto, ela possui os atributos nome e preço. Crie uma lista com 4 objetos do tipo Produto, definir os valores diretamente no código("hard coded").
        // Escreva um programa que filtre os produtos cujo preço seja maior que R$ 100,00 utilizando a Stream API.

        class Produto {
            String nome;
            double preco;

            Produto(String nome, double preco) {
                this.nome = nome;
                this.preco = preco;
            }

            @Override
            public String toString() {
                return "Produto{" + "nome='" + nome + '\'' + ", preco=" + preco + "}";
            }
        }

        List<Produto> produtos = Arrays.asList(
                new Produto("Ovo de pascoa", 150.00),
                new Produto("Saco de arroz", 50.00),
                new Produto("Calota de gol 2008", 200.00),
                new Produto("Monza 6 rodas", 75.00));

        List<Produto> produtosCaros = produtos.stream()
                .filter(p -> p.preco > 100.00)
                .collect(Collectors.toList());
        System.out.println("Produtos com preço maior que R$ 100,00: " + produtosCaros);

        // Atv5 - Realize a soma do valor total dos Produtos que estão na lista de produtos criados na atv4, realize essa soma utilizando Stream API.

        double valorTotal = produtos.stream()
                .mapToDouble(p -> p.preco)
                .sum();
        System.out.println("Valor total dos produtos: R$ " + valorTotal);

        // Atv6- Dada a lista("Java", "Python", "C", "JavaScript", "Ruby"), ordene a mesma conforme o tamanho da palavra, da menor para a maior, utilizando a Stream API.

        List<String> linguagens = Arrays.asList("Java", "Python", "C", "JavaScript", "Ruby");
        List<String> linguagensOrdenadas = linguagens.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println("Linguagens ordenadas por tamanho: " + linguagensOrdenadas);

    }
}
