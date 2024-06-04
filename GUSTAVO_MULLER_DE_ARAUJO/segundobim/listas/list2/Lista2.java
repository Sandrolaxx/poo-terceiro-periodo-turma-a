package segundobim.listas.list2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lista2 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int escolha;

        System.out.println("Menu");
        System.out.println("Insira o número referente a opção que deseja");
        System.out.println("1. Números pares.");
        System.out.println("2. Letras maiúsculas.");
        System.out.println("3. Quantas vezes cada palavra aparece.");
        System.out.println("4. Preços maiores que 100 reais. Soma dos produtos");
        System.out.println("5. Menor para maior.");

        escolha = scanner.nextInt();

        switch (escolha) {
            case 1:

                //ATIVIDADE 1

                List<Integer> numeros = new ArrayList<Integer>();

                numeros.add(1);
                numeros.add(234);
                numeros.add(2);
                numeros.add(1441);
                numeros.add(5312);
                numeros.add(3240);
                numeros.add(520);
                numeros.add(658);

                // Criando lista nova "pares" para armazenar os valores modificados;
                List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0) // filter realiza a filtragem, que, por meio da função lambda (n -> n % 2 ==0) filtra apenas os numeros pares anteriormente adicionados
                .toList(); //usado toList para coletar na variavel pares os valores anteriormente filtrados, no caso os valores pares;
                pares.forEach(System.out::println); // "para cada numero da lista "pares", imprima-o"; 
                break;

            case 2:

                //ATIVIDADE 2

                List<String> nomes = new ArrayList<String>();

                nomes.add("roberto");
                nomes.add("josé");
                nomes.add("caio");
                nomes.add("vinicuis");

                // Criando lista nova "nomesMaiusculos" para armazenar os valores modificados;
                List<String> nomesMaiusculos = nomes.stream() // cria-se uma lista nova para realizar as alterações desejadas;
                .map(String::toUpperCase) // .map transforma os elementos;
                .toList(); // coleta os valores e adiciona na lista nomesMaiusculos;
                System.out.println("Nomes maiúsculos:");
                System.out.println(nomesMaiusculos);
                break;

            case 3:

                //ATIVIDADE 3 **

                List<String> palavras = new ArrayList<String>();

                palavras.add("se");
                palavras.add("talvez");
                palavras.add("hoje");
                palavras.add("sábado");
                palavras.add("se");
                palavras.add("quarta");
                palavras.add("sábado");

                Map<String, Long> palavrasRepetidas = palavras.stream()
                .collect(Collectors.groupingBy(palavra -> palavra, Collectors.counting()));
                palavrasRepetidas.forEach((palavra, quantidade) -> System.out.println(palavra + ":" + quantidade));
                break;

            case 4:

            //ATIVIDADE 4 E 5

                List<Produto> produtos = List.of(

                        new Produto("Madeira", 21.00),
                        new Produto("Coca-Cola", 5.00),
                        new Produto("Doritos", 25.00),
                        new Produto("Sofá", 2500.00));

                produtos.stream()
                        .filter(produto -> produto.getPreco() < 100.00) // aplica um filtro para pegar apenas os produtos col valor abaixo de 100 reais;
                        .map(Produto::getNome) // getNome pega o nome de cada objeto Produto, que passou pelo filtro anterior;
                        // "para cada produto, chame o método getNome"
                        .forEach(System.out::println); // "para cada produto menor que 100, imprima o nome dele"

                Double totalProdutos = produtos.stream() // atribui a soma dos preços à variável totalProdutos do tipo Double;
                        .map(produto -> produto.getPreco()) // pra cada produto da stream, usa o getPreco() para obter o preço do produto;
                        .reduce(0.0, Double::sum); // reduce itera sobre o cada elemento da stream, iniciando por 0.0 e adiciona cada preço do produto usando o Double::sum;
                System.out.println("\nValor total dos produtos: " + totalProdutos);
                break;

            case 5:

                //ATIVIDADE 6

                List<String> words = new ArrayList<String>();
                words.add("Java");
                words.add("Python");
                words.add("C");
                words.add("JavaScript");
                words.add("Ruby");

                // Criando lista nova "wordCrescente" para armazenar os valores modificados;
                List<String> wordCrescente = words.stream()
                .sorted(Comparator.comparing(String::length)) // ordena os elementos da stream words;
                // Comparator define a ordem dos elementos;
                //comparing é um método da classe Comparator que cria um comparador;
                //String::length é uma referência length da classe String, onde essas strings serão comparadas pelo tamanho;
                
                .toList(); // coleta os valores na "wordCrescente"
                System.out.println(wordCrescente); // imprime os valores armazenados dentro da lista "wordCrescente";
                break;

            default:
                System.out.println("Opção Inválida");
                break;

        }
        scanner.close();
    }

    // classe Produto
    
    static class Produto {

        private String nome;

        private double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

    }

}
