package primeirobi.atividade2.AtividadeListaUM.AtividadeListaDOIS;

import java.util.List;
import java.util.ArrayList;

public class Main {
    
    private static List<Produto> produtos = new ArrayList<>();
    public static void main(String[] args) {
    //attv1
    List<Integer>numeros = List.of(2,3,4,5,8,10,50,40,60,52,43,21);
    List<Integer> total= numeros.stream()
    .filter(numero -> numero % 2 == 0)
    .toList();
    System.out.println("numeros pares"+ total);

//attv2
    List<String> nome = List.of("roberto", "jose", "caio", "vinicius");
    List<String> totall = nome.stream()
    .map(nomes -> nomes.toUpperCase())
    .toList();
    System.out.println(totall);

     //attv3
    List<String> palavrs = List.of("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");
    List<String> totalls = palavrs.stream()
    .toList();
    System.out.println(totalls);

    //attv4
    produtos.add(new Produto("PS5", 4000f));
    produtos.add(new Produto("controle", 200f));
    produtos.add(new Produto("cabo tipo C", 210f));
    produtos.add(new Produto("game pass", 120f));

    produtos.stream()
    .filter(produto -> produto.getPreco() > 100.00f)
    .forEach(totals -> System.out.println(totals.getNome()));
//attv5
    Float totalPreco = produtos.stream()
    .map(produto -> produto.getPreco())
    .reduce(0f, (acomula, produto) -> produto + acomula);
    System.out.println("preco total dos items e :R$" + totalPreco);

    //attv6
    List<String> linguagenscrecente = List.of("Java", "Python", "C", "JavaScript", "Ruby");
    List<String> results = linguagenscrecente .stream()
    .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
    .toList();
    System.out.println(results);

    }
}