package exercices.list2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class list2Main{

    public static void main(String[] args) {


        // ATIVIDADE 1
        // Escreva um programa que receba uma lista de números inteiros e retorne 
        // uma lista contendo apenas os números pares usando a Stream API. A lista deve ter ao menos 8 números.


        List<Integer> listNumbers = new ArrayList<>();

        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);
        listNumbers.add(4);
        listNumbers.add(5);
        listNumbers.add(6);
        listNumbers.add(7);
        listNumbers.add(8);

        List<Integer> listModified = listNumbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();

        System.out.println("\nAt. 1 - Exibindo números:");

        for (Integer number : listModified) {
            System.out.println(number);
        }



        // ATIVIDADE 2
        // Dada a seguinte lista de nomes("roberto", "josé", "caio", "vinicius"),
        // escreva um programa que converta todos os nomes para letras maiúsculas usando a Stream API.


        List<String> listNames = new ArrayList<>();

        listNames.add("roberto");
        listNames.add("josé");
        listNames.add("caio");
        listNames.add("vinicius");

        List<String> namesAuto = listNames.stream()
                .map(name -> name.toUpperCase())
                .toList();

        System.out.println("\nAt. 2 - Exibindo nomes:");

        for (String name : namesAuto) {
            System.out.println(name);
        }
        


        // ATIVIDADE 3
        // Crie um programa que conte quantas vezes cada palavra única aparece em uma lista de strings.
        // Utilize a Stream API para processar os dados. Lista de palavras("se", "talvez", "hoje" "sábado", "se", "quarta", "sábado")

        // EM DESENVOLVIMENTO
        // EM DESENVOLVIMENTO
        // EM DESENVOLVIMENTO
        // EM DESENVOLVIMENTO


        List<String> listWords = new ArrayList<>();

        listWords.add("se");
        listWords.add("talvez");
        listWords.add("hoje");
        listWords.add("sábado");
        listWords.add("se");
        listWords.add("quarta");
        listWords.add("sábado");

        List<String> vazia = new ArrayList<>();

        List<String> listWordsRepet = listWords.stream().
        
        List<String> listWordsRepet = listWords.stream()
                .distinct()
                .forEach(palavra -> {
                    long quantidade = listWords.stream()
                            .filter(p -> p.equals(palavra))
                            .count();
                    System.out.println(palavra + ": " + quantidade);
                });
    


        System.out.println("\nAt. 3 - Exibindo palavras:");

        for (String word : listWords) {
            System.out.println(word);
        }

        // .filter(word -> listWords.contains(word))
        // .map(word -> word + cont)
        //  // passar o contador de vezes que repetiu 
        // .toList();
                      


        // ATIVIDADE 4
        // Crie uma Classe Produto, ela possui os atributos nome e preço. Crie uma lista com 4 objetos do tipo Produto,
        // pode definir os valores diretamente no código("hard coded").
        // Escreva um programa que filtre os produtos cujo preço seja maior que R$ 100,00 utilizando a Stream API.


        Product keyboard = new Product("Teclado", 149.90);
        Product mouse = new Product("Mouse", 69.90);
        Product cabinet = new Product("Gabinete", 599.90);
        Product monitor = new Product("Monitor", 99.90);

        List<Product> listProducts = new ArrayList<>();
        
        listProducts.add(keyboard);
        listProducts.add(mouse);
        listProducts.add(cabinet);
        listProducts.add(monitor);
        
        List<Product> listProductsFilter = listProducts.stream()
        .filter(product -> product.getPreco() > 100)
        .toList();

        System.out.println("\nAt. 4 - Exibindo produtos maiores que R$ 100,00:");

        for (Product product : listProductsFilter) {
            System.out.println("Produto: " + product.getNome() + " - Preço: R$ " + product.getPreco());
        }



        // ATIVIDADE 5
        // Realize a soma do valor total dos Produtos que estão na lista de produtos criados na atv4,
        // realize essa soma utilizando Stream API.


        double total = listProducts.stream()
        .map(product -> product.getPreco())
        .reduce(0.0, (count, valor) -> count + valor);

        System.out.println("\nAt. 5 - Valor total de todos os produtor: R$ " + total);



        // ATIVIDADE 6
        // Dada a lista("Java", "Python", "C", "JavaScript", "Ruby"), ordene a mesma conforme o tamanho da palavra,
        // da menor para a maior, utilizando a Stream API.


        List<String> listLanguages = new ArrayList<>();

        listLanguages.add("Java");
        listLanguages.add("Python");
        listLanguages.add("C");
        listLanguages.add("JavaScript");
        listLanguages.add("Ruby");
        
        List<String> listLanguagesOrder = listLanguages.stream()
        .sorted(Comparator.comparing(String::length))
        .toList();

        System.out.println("\nAt. 6 - Exibindo linguagens em ordem de tamanho:");

        for (String languages : listLanguagesOrder) {
            System.out.println(languages);
        }
    }
}