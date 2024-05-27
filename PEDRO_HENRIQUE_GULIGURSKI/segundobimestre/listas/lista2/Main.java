package listas.lista2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.function.Function;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class Main {
    
     // Atividade 1 - Filtrar Pares na Lista
     public static void paresNaLista() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); 
        
        List<Integer> numerosPares = numeros.stream()
                                            .filter(numero -> numero % 2 == 0) 
                                            .collect(Collectors.toList());
        
        System.out.println("Números Pares: " + numerosPares);
    }

    // Atividade 2 - Mudar nomes para Maíscula
    public static void nomesMaisculos() {
        List<String> nomes = Arrays.asList("roberto", "josé", "caio", "vinicius");
        
        List<String> nomesMaiusculos = nomes.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());
        
        System.out.println("Nomes em Maiúsculas: " + nomesMaiusculos);
    }

    // Atividade 3 - Procurar palavras repetidas
    public static void procuraRepetidas() {
        String[] palavras = {"se", "talvez", "hoje", "sábado", "se", "quarta", "sábado"};

        Map<String, Long> contagemPalavras = Arrays.stream(palavras)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        contagemPalavras.forEach((palavra, contagem) ->
                System.out.println(palavra + ": " + contagem));
    }

    // Atividade 4 e 5 - Filtrar preços e mostrar maior preço
    public static void filtrarPrecos() {

        Product teclado = new Product("Teclado", 150);
        Product caboHdmi = new Product("Cabo HDMI", 69.90);
        Product gabinete = new Product("Gabinete", 489.90);
        Product mouse = new Product("Mouse", 99.90);

        List<Product> listaProdutos = new ArrayList<>();
        listaProdutos.add(teclado);
        listaProdutos.add(caboHdmi);
        listaProdutos.add(gabinete);
        listaProdutos.add(mouse);

        List<Product> listaProdutosFilter = listaProdutos.stream()
                .filter(product -> product.getPrice() > 100)
                .collect(Collectors.toList());

        System.out.println("\nAt. 4 - Exibindo produtos maiores que R$ 100,00:");
        for (Product product : listaProdutosFilter) {
            System.out.println("Produto: " + product.getName() + " - Preço: R$ " + product.getPrice());
        }

        double total = listaProdutos.stream()
        .mapToDouble(Product::getPrice)
        .sum();

        System.out.println("\nAt. 5 - Valor total de todos os produtos: R$ " + total);
    }

    // Atividade 6 - Ordena tamanho da Palavra
    public static void tamanhoPalavras() {
        List<String> languages = Arrays.asList("Java", "Python", "C", "JavaScript", "Ruby");

        List<String> sortedLanguages = languages.stream()
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .collect(Collectors.toList());

        System.out.println("Lista ordenada pelo tamanho das palavras:");
        sortedLanguages.forEach(System.out::println);
    }

    public static void main(String[] args) {
        // paresNaLista();
        // nomesMaisculos();
        // procuraRepetidas();
        // filtrarPrecos();
        tamanhoPalavras();
    }

}
