package BIM2.aulas.lista2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class MainLista2 {
    //atv 1 -------------------------------------


    public static void listarPares() {
    List<Integer> numeros = List.of(1,2,3,4,5,6,7,8);
   
    System.out.println("\n ------------- \n");
    System.out.println("Lista apenas pares");

    numeros.stream()
        .filter(numero -> numero % 2 == 0)
        .forEach(System.out::println);
}

    //atv 2 ------------------------------------ 

    public static void listarMaiusculos() {
    List<String> nomesitos = List.of("roberto", "josé", "caio", "vinicius");

    System.out.println("\n ------------- \n");
    System.out.println("Nome próprio é com letra maiúscula painho");

    nomesitos.stream()
        .map(nome -> Character.toUpperCase(nome.charAt(0)) + nome.substring(1))
        .forEach(System.out::println);
    }

    //atv 3 ------------------------------------

    public static void listarPalavras() {
    List<String> dicionario = List.of("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado"); 
    
    System.out.println("\n ------------- \n");
    System.out.println("Quantas vezes na lista ?\n");

    Map<String, Long> contador = dicionario.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        contador.forEach((palavra, quant) -> System.out.println("\n"+ palavra + ": " + quant));
    }
    //atv 4 ------------------------------------

    public static List<Produto> listarPrecos() {
    List<Produto> produtos = List.of(
        new Produto("Vinil: Blonde - Frank Ocean ", 1100.00),
        new Produto("Vinil: Tim Maia 1973 - Tim Maia ", 99.90),
        new Produto("Vinil: Definitely Maybe - Oasis ", 800.00),
        new Produto("Agulha para toca disco ", 80.00),
        new Produto("TocaDisco: LP60 audiotechnica ", 1800.00)
    );
        List<Produto> acima100 = produtos.stream()
        .filter(produto -> produto.getPreco() > 100.0)
        .collect(Collectors.toList());

    System.out.println("\n ------- London Calling Discos ------ \n");
    System.out.println("Lista produtos por mais de 100 pila\n");
    acima100.forEach(produto -> System.out.println("\n"+produto.getNome() + ": " + produto.getPreco()));

    return produtos;
 
    }
    //atv 5 ------------------------------------

    public static double somarPrecos(List<Produto> produtos) {
        return produtos.stream()
        .mapToDouble(Produto::getPreco)
        .sum();//esse sum é muito meta
        
    }

    //atv 6 ------------------------------------

    public static void listarLinguagens() {
    List<String> linguagens = List.of("Java", "Python", "C", "JavaScript", "Ruby");
        
    System.out.println("\n ------------- \n");
    System.out.println("Lista linguagens por número de caracteres");

    linguagens.stream()
        .sorted((linguagi1, linguagi2) -> Integer.compare(linguagi1.length(), linguagi2.length()))
        .forEach(System.out::println);

    }
    //main -------------------------------------

public static void main(String[] args) {
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");


    Scanner scanner = new Scanner(System.in);
    int opc;
    List<Produto> todosProdutos = listarPrecos();
    do{
    System.out.println("\n ------------- \n");
    System.out.println("Testar atividades:\n [1] Os pares\n [2] Os nomes\n [3] O dicionário\n [4] Loja de Discos\n [5] Loja de Discos pt2\n [6] As linguagens \n [7]Já deu, tmj");
    opc = scanner.nextInt();
    switch (opc) {
        case 1:
            listarPares();
            break;
        case 2:
            listarMaiusculos();
           break;
        case 3:
            listarPalavras();
            break;
        case 4:
            listarPrecos();
            break;
        case 5:
            double somaPrecos = somarPrecos(todosProdutos);
            System.out.println("\nSoma dos preços de todos os produtos: " + somaPrecos);
            break;
        case 6:
            listarLinguagens();
            break;
        case 7:
            System.out.println("Parei");
            break;
        default:
            System.out.println("Opção inválida");
            break;
    }
    }while(opc!=7);
}
}

