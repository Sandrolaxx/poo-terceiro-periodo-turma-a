import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Lista2 
{
    public static void main(String[] args) 
    {
        //-----Atividade Um
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        List<Integer> listNumbers = numbers.stream()
            .filter(number -> number % 2 == 0)
            .collect(Collectors.toList());
        System.out.println(listNumbers);

        //-----Atividade Dois
        List<String> nomes = Arrays.asList("roberto","josé","caio","vinicius");

        List<String> nomesMaiusculo = nomes.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        nomesMaiusculo.forEach(System.out::println);

        //-----Atividade Três
        List<String> palavras = Arrays.asList("se","talvez","hoje","sábado","se","quarta","sábado");

        List<String> listaPalavras = palavras.stream()
            .distinct()
            .collect(Collectors.toList());
        System.out.println(listaPalavras);

        //-----Atividade Quatro - tive bastante problemas com esse exercício
        Produto café = new Produto("Pack 20 unidades - Melita 8,99 ", 179.8);
        
        Produto arroz = new Produto("Pack 5 unidades - Tio João 11,99 ", 59.95);

        Produto feijão = new Produto("Pack 10 unidades - Pontarollo 4,99 ", 49.9);

        Produto trigo = new Produto("Pack 5 unidades - Anaconda 18,99 ", 94.95);

        Produto açúcar = new Produto("Pack 5 unidades - Cristal 14,99 ", 74.95);
        //Cria o produto

        List<Produto> produtos = new ArrayList<>();
        produtos.add(café);
        produtos.add(arroz);
        produtos.add(feijão);
        produtos.add(trigo);
        produtos.add(açúcar);
        //Cria lista de produtos

        List<Produto> filtro = produtos.stream()
            .filter(produto -> produto.getPreço() > 100.00)
            .collect(Collectors.toList());

        filtro.forEach(System.out::println);
        
        //-----Atividade Cinco
        Double soma = produtos.stream()
            .map(Produto::getPreço)
            .reduce(0.0,(a, b) -> a + b);
        System.out.println("A soma dos produtos resulta em " + soma);

        //-----Atividade Seis
        List<String> linguagens = Arrays.asList("Java","Python","C","JavaScript","Ruby");

        List<String> linguagensOrdenadas = linguagens.stream()
            .sorted(Comparator.comparingInt(String::length))
            .collect(Collectors.toList());
        System.out.println(linguagensOrdenadas);

        //-----Atividade Seis - tentativa anterior
        /*List<String> linguagens = Arrays.asList("Java","Python","C","JavaScript","Ruby");
            Collections.sort(linguagens);
        System.out.println(linguagens);*/
    }    
}
//Qual a diferença entre ArrayList para Arrays.asList?
//Quando eu tenho uma Queue e crio uma PriorityQueue, o que acontece com a queue anterior? Eu preciso reinserir todos os dados?
//Como usar "contains"?
//Como usar "skip"?
//É possível utilizar duas operações terminais em sequência?
//Por que para imprimir um resultado após um método precisa ser dessa forma? "filtro.forEach(System.out::println);"