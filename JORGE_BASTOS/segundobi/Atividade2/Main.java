package segundobi.Atividade2;

import java.util.List;
import java.util.ArrayList;

public class Main {
    private static List<Product> produto = new ArrayList<>();
    public static void main(String[] args) {
        
        atv1();

        atv2();

        atv3();

        atv4();

        atv5();

        atv6();

    }
    
    //ATIVIDADE 1
    public static void atv1() {

        List<Integer> numeros = List.of(15, 16, 17, 18, 19, 20, 21, 21, 22, 23, 24, 25);

        List<Integer> resultado = numeros.stream().filter(numero -> numero % 2 == 0).toList();

        System.out.println(resultado);

    }

    //ATIVIDADE 2
    public static void atv2(){

        List<String> nomes = List.of("roberto", "jose", "caio", "vinicius");

        List<String> resultado = nomes.stream().map(nome -> nome.toUpperCase()).toList();

        System.out.println(resultado);

    }

    //ATIVIDADE 3
    public static void atv3(){

        List<String> palavra = List.of("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");

        List<String> resultado = palavra.stream().distinct().toList();

        System.out.println(resultado);

    }

    //ATIVIDADE 4
    public static void atv4(){

        produto.add(new Product("Tenis", 8000f));
        produto.add(new Product("Jaqueta", 300f));
        produto.add(new Product("Camiseta", 60f));
        produto.add(new Product("Calca", 190f));

        produto.stream().filter(produto -> produto.getPrice() > 100.00f).forEach(resultado -> System.out.println(resultado.getName()));

    }

    //ATIVIDADE 5
    public static void atv5(){

        Float precofinal = produto.stream().map(produto -> produto.getPrice())
        .reduce(0f, (acumular, produto) -> produto + acumular);

        System.out.println("Preco final somando os precos dos produtos: R$" + precofinal);

    }

    //ATIVIDADE 6
    public static void atv6(){

        List<String> linguagem = List.of("Java", "Python", "C", "JavaScript", "Ruby");

        List<String> resultado = linguagem.stream()
        .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
        .toList();

        System.out.println(resultado);

    }
    
}
