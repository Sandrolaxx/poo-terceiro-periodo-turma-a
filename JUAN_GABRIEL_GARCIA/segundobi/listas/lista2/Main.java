package segundobi.listas.lista2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    
    public static void main(String[] args) {
        

        // System.out.println("Atividade 1:");

        // List<Integer> num = new ArrayList<>();

        // num.add(4);
        // num.add(7);
        // num.add(1);
        // num.add(12);
        // num.add(33);
        // num.add(6);
        // num.add(3);
        // num.add(9);

        // List<Integer> numPar = num.stream()
        //         .filter(par -> par % 2 == 0)
        //         .collect(Collectors.toList());

        // System.out.println(numPar);
        // System.out.println();
    

        // System.out.println("Atividade 2:");

        // List<String> nomes = new ArrayList<>();

        // nomes.add("roberto");
        // nomes.add("josé");
        // nomes.add("caio");
        // nomes.add("vinicius");

        // List<String> nomesCaixaAlta = nomes.stream()
        //             .map(upperCase -> upperCase.toUpperCase())
        //             .collect(Collectors.toList());

        // System.out.println(nomesCaixaAlta);
        // System.out.println();


        // System.out.println("Atividade 3:");

        // List<String> palavras = new ArrayList<>();

        // palavras.add("se");
        // palavras.add("talvez");
        // palavras.add("hoje");
        // palavras.add("sábado");
        // palavras.add("se");
        // palavras.add("quarta");
        // palavras.add("sábado");

        // Map<String, Long> qnt = palavras.stream()
        //             .collect(Collectors.groupingBy(palavra -> palavra, Collectors.counting()));

        // qnt.forEach((palavra, count) -> System.out.println(palavra + " - " + count));
        // System.out.println();


        // System.out.println("Atividade 4:");

        // List<Produto> produtos = new ArrayList<>();
        //     produtos.add(new Produto("prato", 20));
        //     produtos.add(new Produto("copo", 7));
        //     produtos.add(new Produto("cimento", 200));
        //     produtos.add(new Produto("banana", 721));

        // List<Produto> maiorQueCem = produtos.stream()
        //             .filter(x -> x.getPreco() > 100)
        //             .collect(Collectors.toList());
                            
        // for (Produto produto : maiorQueCem) {
            
        //     System.out.println(produto.getNome());
        //     System.out.println();
        // } 
        
        
        // System.out.println("Atividade 5:");

        // List<Produto> produtos = new ArrayList<>();
        //     produtos.add(new Produto("prato", 20));
        //     produtos.add(new Produto("copo", 7));
        //     produtos.add(new Produto("cimento", 200));
        //     produtos.add(new Produto("banana", 721));

        // Integer soma = produtos.stream()
        //             .map(num -> num.getPreco())
        //             .reduce(0, (total, valor) -> total + valor);

        // System.out.println(soma);
        // System.out.println();

        System.out.println("Atividade 6:");

        List<String> linguagens = new ArrayList<>();

        linguagens.add("Java");
        linguagens.add("C");
        linguagens.add("JavaScript");
        linguagens.add("Ruby");

        List<String> listaOrdenada = linguagens.stream()
                    .sorted( (l1, l2) -> Integer.compare(l1.length(), l2.length()))
                    .collect(Collectors.toList());

                    System.out.println(listaOrdenada);
    }
}
