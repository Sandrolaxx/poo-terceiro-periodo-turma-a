package lista2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    } 

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }
    public String toString() {
        return nome;
    }
}

public class main {
    
    public static void main(String[] args) {
        
    //ATV 1

        List<Integer> listaNumeros = Arrays.asList(122, 42, 87, 72, 26, 12, 38, 53);
        List<Integer> numerosPares = listaNumeros.stream()

        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());

        System.out.println("\nOs números pares são: " + numerosPares);


    
    //ATV 2

        List<String> listaNomes = Arrays.asList("Roberto", "José", "Caio", "Vinicius");

        List<String> nomesMaiusculos = listaNomes.stream()

        .map(String::toUpperCase)
        .collect(Collectors.toList());

        System.out.println("\n\nNomes em letras maiúsculas: " + nomesMaiusculos);


    //ATV 3

        List<String> listaPalavras = Arrays.asList("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");

        Map<String, Long> contadorPalavras = listaPalavras.stream()
        
        .collect(Collectors.groupingBy(palavra -> palavra, Collectors.counting()));
        
        System.out.println("\n\nQuantas vezes cada palavra apareceu:");
        contadorPalavras.forEach((palavra, contador) -> System.out.println(palavra + ": " + contador));



    //ATV 4 e 5

        List<Produto> produtos = Arrays.asList(
            new Produto("Pastelzinho humilde (carne c/ queijo)", 122.0),
            new Produto("Suco de uva 1L", 15.99),
            new Produto("Kinder ovo", 130.00),
            new Produto("Cartela de ovos", 20.0));

        List<Produto> precosAltos = produtos.stream()

        .filter(produto -> produto.getPreco() > 100.0)
        .collect(Collectors.toList());

        System.out.println("\n\nProdutos com valor superior a R$: 100,00: ");
        precosAltos.forEach(System.out::println);

        double somaPrecos = produtos.stream()
        .mapToDouble(Produto::getPreco)
        .sum();

        System.out.println("\nPreço total: R$: " + somaPrecos);


    //ATV 6

    
        List<String> listaLinguagens = Arrays.asList("Java", "Python", "C", "JavaScript", "Ruby");

        List<String> ordemCrescente = listaLinguagens.stream()
        .sorted((lista1, lista2) -> Integer.compare(lista1.length(), lista2.length()))
        .collect(Collectors.toList());

        System.out.println("\n");
        ordemCrescente.forEach(System.out::println);
        System.out.println("\n");

    }
}
