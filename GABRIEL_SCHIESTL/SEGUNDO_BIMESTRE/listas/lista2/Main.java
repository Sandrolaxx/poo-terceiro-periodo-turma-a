package SEGUNDO_BIMESTRE.listas.lista2;

import java.util.List;
import java.util.ArrayList;

public class Main {
    
    private static List<Produto> produtos = new ArrayList<>();
    public static void main(String[] args) {
        
        atv1();

        atv2();

        atv3();

        atv4();

        atv5();

        atv6();

    }

    public static void atv1() {

        List<Integer> numbers = List.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        List<Integer> result = numbers.stream().filter(number -> number % 2 == 0).toList();

        System.out.println(result);

    }

    public static void atv2(){

        List<String> names = List.of("roberto", "jose", "caio", "vinicius");

        List<String> result = names.stream().map(name -> name.toUpperCase()).toList();

        System.out.println(result);

    }

    public static void atv3(){

        List<String> words = List.of("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");

        List<String> results = words.stream().distinct().toList();

        System.out.println(results);

    }

    public static void atv4(){

        produtos.add(new Produto("PC", 5000f));
        produtos.add(new Produto("Mesa", 500f));
        produtos.add(new Produto("Mousepad", 70f));
        produtos.add(new Produto("Mouse", 110f));

        produtos.stream().filter(produto -> produto.getPrice() > 100.00f).forEach(result -> System.out.println(result.getName()));

    }

    public static void atv5(){

        Float finalPrice = produtos.stream().map(product -> product.getPrice())
        .reduce(0f, (acumulator, product) -> product + acumulator);

        System.out.println("Preco final somando os precos dos produtos: R$" + finalPrice);

    }

    public static void atv6(){

        List<String> languages = List.of("Java", "Python", "C", "JavaScript", "Ruby");

        List<String> results = languages.stream()
        .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
        .toList();

        System.out.println(results);

    }
}
