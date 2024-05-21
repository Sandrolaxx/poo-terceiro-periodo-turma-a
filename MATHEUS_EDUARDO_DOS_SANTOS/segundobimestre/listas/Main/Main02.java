package segundobimestre.listas.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import segundobimestre.listas.Classe.Produto;

public class Main02 {
    public static void main(String[] args) {
        //ATV 01//
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numerosPares = numeros.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());

        System.out.println("Números pares: " + numerosPares);

        //ATV 02//
        List<String> listaNomes = new ArrayList<>();

        listaNomes.add("roberto");
        listaNomes.add("josé");
        listaNomes.add("caio");
        listaNomes.add("vinicius");

        List<String> nomesMaiusculos = listaNomes.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());

        for (String nome : nomesMaiusculos) {
            System.out.println(nome);
        }

        //ATV 03//
        List<String> listaPalavras = Arrays.asList("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");

        Map<String, Long> contagemPalavras = listaPalavras.stream()
            .collect(Collectors.groupingBy(palavra -> palavra, Collectors.counting()));

        contagemPalavras.forEach((palavra, contagem) -> {
            System.out.println(palavra + ": " + contagem);
        });

        //ATV 04//
        List<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Produto("Produto A", 50.00));
        listaProdutos.add(new Produto("Produto B", 150.00));
        listaProdutos.add(new Produto("Produto C", 200.00));
        listaProdutos.add(new Produto("Produto D", 80.00));

        List<Produto> produtosCaros = listaProdutos.stream()
            .filter(produto -> produto.getPreco() > 100.0)
            .collect(Collectors.toList());

        produtosCaros.forEach(System.out::println);

        //ATV 05//
        double somaTotal = listaProdutos.stream()
        .mapToDouble(Produto::getPreco)
        .sum();

        System.out.println("Soma total dos preços dos produtos: R$ " + somaTotal);

        //ATV 06//
        List<String> listaLanguage = Arrays.asList("Java", "Python", "C", "JavaScript", "Ruby");

        List<String> palavrasOrdenadas = listaLanguage.stream()
            .sorted((p1, p2) -> Integer.compare(p1.length(), p2.length()))
            .collect(Collectors.toList());

        palavrasOrdenadas.forEach(System.out::println);
    
    }
}
