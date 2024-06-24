package segundobi.listas.lista2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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

    /*
     * Atv1 - Escreva um programa que receba uma lista de números inteiros e retorne
     * uma lista contendo apenas os números pares usando a Stream API. A lista deve
     * ter ao menos 8 números.
     */

    public static void atv1() {

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);

        List<Integer> resultado = numeros.stream().filter(numero -> numero % 2 == 0).toList();

        System.out.println(resultado);
    }

    /*
     * Atv2 - Dada a seguinte lista de nomes("roberto", "josé", "caio", "vinicius"),
     * escreva um programa que converta todos os nomes para letras maiúsculas usando
     * a Stream API.
     */

    public static void atv2() {

        List<String> nomes = List.of("roberto", "jose", "caio", "vinicius");

        List<String> resultado = nomes.stream().map(nome -> nome.toUpperCase()).toList();

        System.out.println(resultado);
    }

    /*
     * Atv3 - Crie um programa que conte quantas vezes cada palavra única aparece em
     * uma lista de strings. Utilize a Stream API para processar os dados. Lista de
     * palavras("se", "talvez", "hoje" "sábado", "se", "quarta", "sábado")
     */

    public static void atv3() {

        List<String> palavras = new ArrayList<String>();

                palavras.add("se");
                palavras.add("talvez");
                palavras.add("hoje");
                palavras.add("sábado");
                palavras.add("se");
                palavras.add("quarta");
                palavras.add("sábado");

                Map<String, Long> palavrasRepetidas = palavras.stream()
                .collect(Collectors.groupingBy(palavra -> palavra, Collectors.counting()));
                
                palavrasRepetidas.forEach((palavra, quantidade) -> System.out.println(palavra + ":" + quantidade));
    }

    /*
     * Atv4 - Crie uma Classe Produto, ela possui os atributos nome e preço. Crie
     * uma lista com 4 objetos do tipo Produto, pode definir os valores diretamente
     * no código("hard coded"). Escreva um programa que filtre os produtos cujo
     * preço seja maior que R$ 100,00 utilizando a Stream API.
     */

    public static void atv4() {

        produtos.add(new Produto("Academia", 120f));
        produtos.add(new Produto("Whey da Growth", 100f));
        produtos.add(new Produto("Creatina da Growth", 80f));
        produtos.add(new Produto("Insider Tech T-Shirt", 160f));

        produtos.stream().filter(produto -> produto.getPreco() > 100.00f)
                .forEach(result -> System.out.println(result.getNome()));
    }

    /*
     * Atv5 - Realize a soma do valor total dos Produtos que estão na lista de
     * produtos criados na atv4, realize essa soma utilizando Stream API.
     */

    public static void atv5() {

        Float precoFinal = produtos.stream().map(produto -> produto.getPreco())
                .reduce(0f, (acumulador, produto) -> produto + acumulador);

        System.out.println("Soma final do preço dos produtos: R$" + precoFinal);
    }

    /*
     * Atv6- Dada a lista("Java", "Python", "C", "JavaScript", "Ruby"), ordene a
     * mesma conforme o tamanho da palavra, da menor para a maior, utilizando a
     * Stream API.
     */

    public static void atv6() {

        List<String> linguagens = List.of("Java", "Python", "C", "JavaScript", "Ruby");

        List<String> resultados = linguagens.stream()
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .toList();

        System.out.println(resultados);
    }
}