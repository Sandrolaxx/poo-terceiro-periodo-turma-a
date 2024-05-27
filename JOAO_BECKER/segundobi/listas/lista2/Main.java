package segundobi.listas.lista2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //ATV 1

        System.out.println("Atividade 1:");
        List<Integer> numerosInteiros = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(retornarPares(numerosInteiros));

        //ATV 2

        System.out.println("\nAtividade 2:");
        List<String> nomes = List.of("roberto", "josé", "caio", "vinicius");
        System.out.println(retornarMaiusculo(nomes));

        //ATV 3

        System.out.println("\nAtividade 3:");
        List<String> palavras =  List.of("se", "talvez", "hoje","sábado", "se", "quarta", "sábado");
        verificarRepeticao(palavras);

        //ATV 4

        System.out.println("\nAtividade 4:");
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Celular", 2000d));
        produtos.add(new Produto("Mesa", 500d));
        produtos.add(new Produto("Casaco", 80d));
        produtos.add(new Produto("Energetico", 12d));
        System.out.println(filtrarProduto(produtos));

        //ATV 5
        
        System.out.println("\nAtivadade 5:");
        System.out.println("R$"+precoTotal(produtos));


        //ATV 6

        System.out.println("\nAtivadade 6:");
        List<String> liguagens = List.of("Java", "Python", "C", "JavaScript", "Ruby");
        System.out.println(OrdenarTamanho(liguagens));

    }

    public static List<Integer> retornarPares(List<Integer> lista){
        List<Integer> numerosPares = lista.stream()
            .filter(numero -> numero % 2 == 0)
            .toList();
        return numerosPares;
    }

    public static List<String> retornarMaiusculo(List<String> lista){
        List<String> listaMaiuscula = lista.stream()
            .map(palavras -> palavras.toUpperCase())
            .toList();
        return listaMaiuscula;
    }

    public static void verificarRepeticao(List<String> lista){
        Map<String, Long> listaContar = lista.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); 
        listaContar.forEach((palavra,quantidade) -> 
        System.out.println("'" + palavra + "' aparece " + quantidade + " vez(es)"));
        
    }

    public static List<Produto> filtrarProduto(List<Produto> lista){
        List<Produto> filtro = lista.stream()
        .filter(produto -> produto.getPreco() > 100)
        .toList();
        return filtro;
    }

    public static Double precoTotal(List<Produto> lista){
        Double somaTotal = filtrarProduto(lista).stream()
            .map(produto -> produto.getPreco())
            .reduce(0d,(valor,produto)->valor+produto);
        return somaTotal;
    }

    public static List<String> OrdenarTamanho(List<String> lista){
        List<String> listaOrdenada =  lista.stream()
        .sorted((linguagem1, linguagem2) -> Integer.compare(linguagem1.length(),linguagem2.length()))
        .toList();
        return listaOrdenada;
    }
    
}

