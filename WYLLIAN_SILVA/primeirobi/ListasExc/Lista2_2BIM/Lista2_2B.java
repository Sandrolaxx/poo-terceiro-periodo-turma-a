package primeirobi.ListasExc.Lista2_2BIM;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class Lista2_2B {

    public static void main(String[] args) {

        System.out.println("/:=== Atividade - 1: ===:/");
        List<Integer> num = Arrays.asList(2131247, 561263, 2948109, 8124774, 12751651, 6, 24657163, 24525728, 1234567890, 1337);

        List<Integer> pares = num.stream()
            .filter(numerospares -> numerospares % 2 == 0)
            .collect(Collectors.toList());        

        System.out.println("Lista somente com pares: " + pares);
        System.out.println(" ");


        System.out.println("/:=== Atividade - 2: ===:/");
        List<String> nome = Arrays.asList("robert", "jose", "caio", "vinicius"); //verificar com meu nome (Não trocar aqui) 

        List<String> maiusculo = nome.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());

        System.out.println("Lista com nomes em maiúsculo: " + maiusculo);
        System.out.println(" ");


        System.out.println("/:=== Atividade - 3: ===:/");
        List<String> palavrasUnicas = Arrays.asList("se", "talvez", "hoje", "sabado", "se", "quarta", "sabado"); //não imprime "se" (verificar)

        Map<String, Long> quantPalavra = palavrasUnicas.stream()
            .collect(Collectors.groupingBy(texto -> texto, Collectors.counting()));

        System.out.println("Quantidade de palavras: " + quantPalavra);
        System.out.println(" ");


        System.out.println("/:=== Atividade - 4: ===:/"); //Classe separada 
        List<Produto> prods = Arrays.asList( new Produto("Jabuticaba", 300.00), new Produto("PS5", 123.00),  new Produto("produto", 1.00),  new Produto("Teste", 90.00));

        List<Produto> produtosCaros = prods.stream()
            .filter(produto -> produto.getPreco() > 100.00)
            .collect(Collectors.toList());

        System.out.println("Produtos acima de R$ 100,00: ");
        produtosCaros.forEach(produto -> System.out.println(produto.getNome() + " R$" + produto.getPreco()));
        System.out.println(" ");
        

        System.out.println("/:=== Atividade - 5: ===:/");
        double total = prods.stream()
            .mapToDouble(Produto::getPreco)
            .sum();
        
        System.out.println("Soma de todos os produtos: " + total);
        System.out.println(" ");


        System.out.println("/:=== Atividade - 6: ===:/");
        List<String> lingProg = Arrays.asList("Java", "Python", "C", "JavaScript", "Ruby");

        List<String> listaLing = lingProg.stream()
            .sorted((ling1, ling2) -> Integer.compare(ling1.length(), ling2.length()))
            .collect(Collectors.toList()); 
                                                      
        System.out.println("Linguagens ordenadas pela quantiade de caracters: " + listaLing);
        System.out.println(" ");
    }
}
