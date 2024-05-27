package segundobimestre;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
public class Maindois 
{
    public static void main(String[] args)
    {
        //atividade 1 inicio//
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);

        List<Integer> numerosPares = numeros.stream()
            .filter(numero -> numero % 2 == 0)
            .collect(Collectors.toList());
        
        System.out.println("Numeros pares: " + numerosPares);  
        //atividade 1 final//
        
        //atividade 2 inicio//
        List<String> nomes = new ArrayList<>();
        nomes.add("roberto");
        nomes.add("jose");
        nomes.add("caio");
        nomes.add("vinicius");

        List<String> nomesUpercase = nomes.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        
        System.out.println("Nomes em maiusculo: " + nomesUpercase);
        //atividade 2 final// 
        
        //atividade 3 inicio//
        List<String> palavras = new ArrayList<>();
        palavras.add("se");
        palavras.add("talvez");
        palavras.add("hoje");
        palavras.add("sabado");
        palavras.add("se");
        palavras.add("quarta");
        palavras.add("sabado");

        Map<String, Long> contagemPalavras = palavras.stream()
            .collect(Collectors.groupingBy(palavra -> palavra, Collectors.counting())); //'Collectors.groupingBy(palavra -> palavra)' agrupa as palavras iguais - 'Collectors.couting()' conta qnts vezes cada palavra aparece no grupo

        contagemPalavras.forEach((palavra, contagem) -> System.out.println(palavra + ": " + contagem));     
        //atividade 3 final//

        //ativide 4  inicio//
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Produto A", 150.0));
        produtos.add(new Produto("Produto a", 90.0));
        produtos.add(new Produto("Produto C", 200.0));
        produtos.add(new Produto("Produto D", 50.0));

        List<Produto> produtosFiltrados = produtos.stream()
            .filter(produto -> produto.getPreco() > 100.0)
            .collect(Collectors.toList());

        System.out.println("Produtos mais caros que 100.0 reais: ");
        produtosFiltrados.forEach(System.out::println);
        //atividade 5 início
        double somaTotal = produtos.stream()
            .mapToDouble(Produto::getPreco)
            .sum();
        System.out.println("Soma total: R$" + somaTotal);
        //atividade 5 final
        //atividade 4 final
        
        //atividade 6 inicio//
        List<String> linguagens = new ArrayList<>();
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("C");
        linguagens.add("JavaScript");
        linguagens.add("Ruby");

        List<String> linguagensOrdenadas = linguagens.stream()
            .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))//ordena do menor pro maior com s1 e s2, pra ser maior por menor seria s2, s1
            .collect(Collectors.toList());

        linguagensOrdenadas.forEach(System.out::println);
        //aatividade 6 final//     
    }
}
