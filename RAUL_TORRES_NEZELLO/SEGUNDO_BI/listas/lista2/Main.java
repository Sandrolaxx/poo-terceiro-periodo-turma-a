package SEGUNDO_BI.listas.lista2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)){
           
            //Atividade 1
            List<Integer> numeros = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));


            List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());


            System.out.println(numerosPares);


            //Atividade 2
            List<String> nomes = new ArrayList<>(Arrays.asList("roberto","jose","caio","vinicius"));


            List<String> nomesMaiusculo = nomes.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());


            System.out.println(nomesMaiusculo);


            //Atividade 3
            List<String> palavras = new ArrayList<>(Arrays.asList("se", "talvez", "hoje", "sabado", "se", "quarta", "sabado"));


            Map<String, Integer> contagemPalavras = palavras.stream()
                .collect(Collectors.groupingBy(palavra -> palavra, Collectors.summingInt(e -> 1)));
           
            contagemPalavras.forEach((palavra, contagem) -> System.out.println(palavra + ": " + contagem));


            //Atividade 4
            class Produto{
                String nome;
                Double preco;


                public Produto (String nome, Double preco){
                    this.nome = nome;
                    this.preco = preco;
                }


                public double getPreco() {
                    return preco;
                }


                @Override
                public String toString() {
                    return "Produto [nome=" + nome + ", preco=" + preco + "]";
                }


               
            }
            List<Produto> produtos = Arrays.asList(
            new Produto("Produto1", 90.0),
            new Produto("Produto2", 150.0),
            new Produto("Produto3", 30.0),
            new Produto("Produto4", 120.0)
            );


            List<Produto> produtosCaros = produtos.stream()
                .filter(produto -> produto.getPreco()>100)
                .collect(Collectors.toList());


            produtosCaros.forEach(System.out::println);


            //Atividade 5
            double somaProdutos = produtos.stream()
                .mapToDouble(Produto :: getPreco)
                .sum();
               
            System.out.println(somaProdutos);


            //Atividade 6
            List<String> linguagens = new ArrayList<>(Arrays.asList("Java", "Python", "C", "JavaScript", "Ruby"));


            List<String> tamanhoLinguagens = linguagens.stream()
                .sorted((p1,p2) -> Integer.compare(p1.length(),p2.length()))
                .collect(Collectors.toList());
           
            System.out.println(tamanhoLinguagens);
        }
    }
}



