package segundo_bimestre.Listas.lista1.lista2;

import java.util.*;
import java.util.stream.Collectors;
// ATV1 - Lista de números inteiros e filtro de pares
public class MainFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite pelo menos 8 números inteiros:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            try {
                numeros.add(scanner.nextInt());
            } catch (Exception e) {
                System.out.println("Entrada inválida, por favor, insira um número inteiro.");
                scanner.next(); 
                i--; 
            }
        }
        List<Integer> numerosPares = numeros.stream()
                                             .filter(num -> num % 2 == 0)
                                             .collect(Collectors.toList());

        System.out.println("Números pares: " + numerosPares);
        
        scanner.close();

        // ATV2 - Conversão de nomes para maiúsculas
        List<String> nomes = new ArrayList<>();
        nomes.add("roberto");
        nomes.add("josé");
        nomes.add("caio");
        nomes.add("vinicius");

        List<String> nomesMaiusculos = nomes.stream()
                                             .map(String::toUpperCase)
                                             .collect(Collectors.toList());

        System.out.println("Nomes em letras maiúsculas: " + nomesMaiusculos);

        // ATV3 - Contagem de palavras únicas em uma lista
        List<String> palavras = Arrays.asList("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");

        Map<String, Long> contagemPalavras = palavras.stream()
                                                     .collect(Collectors.groupingBy(palavra -> palavra, Collectors.counting()));

        contagemPalavras.forEach((palavra, contagem) -> 
            System.out.println("Palavra: " + palavra + ", Contagem: " + contagem));

        // ATV4 - Lista de produtos e filtro por preço
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

        // ATV5 - Soma do valor total dos produtos
        double valorTotal = produtos.stream()
                                    .mapToDouble(Produto::getPreco) 
                                    .sum(); 

        System.out.println("Valor total dos produtos: R$" + valorTotal);

        // ATV6 - Ordenação de palavras por tamanho
        List<String> palavrasOrdenadas = Arrays.asList("Java", "Python", "C", "JavaScript", "Ruby");

        palavrasOrdenadas = palavrasOrdenadas.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        System.out.println("Palavras ordenadas por tamanho:");
        palavrasOrdenadas.forEach(System.out::println);
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
}