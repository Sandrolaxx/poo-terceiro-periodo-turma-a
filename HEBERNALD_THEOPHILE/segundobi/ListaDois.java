import java.util.*;
import java.util.stream.Collectors;

public class ListaDois {
    public static void main(String[] args) {
        // ATIVIDADE 1:lista de números inteiros e retornar apenas os números pares
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numerosPares = numeros.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());
        System.out.println("ATIV1 - Números pares: " + numerosPares);

        // ATIVIDADE 2: Converter todos os nomes para letras maiúsculas
        List<String> nomes = Arrays.asList("roberto", "josé", "caio", "vinicius");
        List<String> nomesMaiusculos = nomes.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
        System.out.println("ATIV2 - Nomes em maiúsculas: " + nomesMaiusculos);

        // ATIVIDADE 3: Contar a frequência de cada palavra única em uma lista de strings
        List<String> palavras = Arrays.asList("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");
        Map<String, Long> frequenciaPalavras = palavras.stream()
        .collect(Collectors.groupingBy(p -> p, Collectors.counting()));
        System.out.println("ATIV3 - Frequência das palavras: " + frequenciaPalavras);

        // ATIVIDADE 4: Filtrar produtos com preço maior que R$ 100,00
        List<Produto> produtos = Arrays.asList(
         new Produto("Produto 1", 20.0),
         new Produto("Produto 2", 70.0),
         new Produto("Produto 3", 100.0),
         new Produto("Produto 4", 100.0)
        );
        List<Produto> produtosCaros = produtos.stream()
        .filter(p -> p.getPreco() > 100.0)
        .collect(Collectors.toList());
        System.out.println("ATIV4 - Produtos com preço > R$ 100,00: " + produtosCaros);

        // ATIVIDADE 5: Somar o valor total dos produtos
        double somaTotal = produtos.stream()
     .mapToDouble(Produto::getPreco)
        .sum();
        System.out.println("ATIV5 - Soma total dos preços dos produtos: " + somaTotal);

        // ATIVIDADE 6: Ordenar a lista conforme o tamanho da palavra 
        List<String> linguagens = Arrays.asList("Java", "Python", "C", "JavaScript", "Ruby");
        List<String> linguagensOrdenadas = linguagens.stream()
            .sorted(Comparator.comparingInt(String::length))
        .collect(Collectors.toList());
        System.out.println("ATIV6 - Linguagens ordenadas pelo tamanho: " + linguagensOrdenadas);
    }
}

// Classe Produto com nome e preço
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
        return nome + " - R$ " + preco;
    }
}
