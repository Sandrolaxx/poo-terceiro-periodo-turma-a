package listas.Lista_002;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Criação da lista de produtos Atividade 4 e 5
        List<Produto> produtos = List.of(
                new Produto("Produto1", 50.0),
                new Produto("Produto2", 120.0),
                new Produto("Produto3", 80.0),
                new Produto("Produto4", 150.0));

        Atividade_001(args);
        System.out.println("\n\n");
        Atividade_002(args);
        System.out.println("\n\n");
        Atividade_003(args);
        System.out.println("\n\n");
        Atividade_004(produtos);
        System.out.println("\n\n");
        Atividade_005(produtos);
        System.out.println("\n\n");
        Atividade_006(args);
    }

    // ======= Atividade 001 =======
    public static void Atividade_001(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i <= 30; i++) {

            numeros.add(i);

        }

        Stream<Integer> numerosPares = numeros.stream().filter(num -> num % 2 == 0);
        numerosPares.forEach(System.out::println);

    }

    // ======= Atividade 002 =======
    public static void Atividade_002(String[] args) {

        List<String> nome = new ArrayList<>();

        nome.add("Ana");
        nome.add("Clara");
        nome.add("Andressa");
        nome.add("Maria");
        nome.add("Luiza");

        List<String> nomesLetraMaiuscula = nome.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(nomesLetraMaiuscula);

    }

    // ======= Atividade 003 =======
    public static void Atividade_003(String[] args) {

        List<String> palavras = List.of("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");

        Map<String, Long> palavrasRepeticao = palavras.stream()
                .collect(Collectors.groupingBy(String::toString, Collectors.counting()));

        System.out.println(palavrasRepeticao);
    }

    // ======= Atividade 004 =======
    public static void Atividade_004(List<Produto> produtos) {

        List<Produto> produtosCaros = produtos.stream()
                .filter(produto -> produto.getPreco() > 100.0)
                .collect(Collectors.toList());

        produtosCaros.forEach(System.out::println);

    }

    // ======= Atividade 005 =======
    public static void Atividade_005(List<Produto> produtos) {

        Double somaValores = produtos.stream()
                .mapToDouble(Produto::getPreco)
                .sum();

        System.out.println("Valor total dos produtos: R$ " + somaValores);
    }

    // ======= Atividade 006 =======
    public static void Atividade_006(String[] args) {

        List<String> linguaList = List.of("Java", "Python", "C", "JavaScript", "Ruby");

        List<String> listaOrdenada = linguaList.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println(listaOrdenada);

    }

}
