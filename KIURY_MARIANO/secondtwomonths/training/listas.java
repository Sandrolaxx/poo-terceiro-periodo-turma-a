import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.HashMap;
import java.util.Map;

public class listas {

    public static void main(String[] args) {


        // ----------List-----------


        List<String> nomes = new ArrayList<>();
        String aluno = "Kauã";

        // Adiciona elementos
        nomes.add(aluno);
        nomes.add("Gabriel Schiestl");
        nomes.add("Hebernald");
        nomes.add("Cleiton");
        nomes.add("Leonardo");
        nomes.add("A");
        nomes.add("a");

        // Iterando nos valores
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Removendo por indice
        nomes.remove(5);
        // Removendo referência
        nomes.remove(aluno);

        // Removendo com base em condição
        nomes.removeIf(item -> item.contains("l"));

        System.out.println("\nLista sem L");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        String[] nomes2 = new String[40];

        // lenght --> tamanho total do vetor -- 40
        for (int i = 0; i < nomes2.length; i++) {
        }

        // size --> quantidade de elementos da lista -- ex: 5
        for (int i = 0; i < nomes.size(); i++) {
            // Acessando valor por indice
            System.out.println(nomes.get(i));
        }

        // Acessando valor por indice
        System.out.println(nomes.get(4));



        // ----------Map-----------


        Map<String, String> mapaContas = new HashMap<>();

        // Adicionando nossas chaves e seus respectivos valores
        mapaContas.put("23123", "Saldo incorreto, valor 40.00 divergente");
        mapaContas.put("23343", null);
        mapaContas.put("1233", "Saldo conta incorreto valor 29.49");
        mapaContas.put("231232", null);

        // Iteração nas chaves
        for (String key : mapaContas.keySet()) {
            System.out.println(key);
        }

        System.out.println("\n");
        // Exemplo e iteração com classe que possue a chave e valor
        mapaContas.entrySet()
                .forEach(ks -> {
                    System.out.println("Minha chave:" + ks.getKey());
                    System.out.println("Meu valor:" + ks.getValue());
                });



        // ----------Queue-----------


        Queue<Integer> fila = new LinkedList<>();

        fila.add(2);
        fila.add(53);
        fila.add(11);
        fila.add(43);
        fila.add(84);

        // Lê o primeiro elemento da fila
        System.out.println(fila.peek());

        // Fila de nomes com implementação que respeita ordem natural
        // Ordem natural de String - Alfabetica
        Queue<String> nomesAle = new PriorityQueue<>();

        nomesAle.add("Gabriel Schiestl");
        nomesAle.add("Hebernald");
        nomesAle.add("Cleiton");
        nomesAle.add("Leonardo");

        // Printando lista
        nomesAle.forEach(nome -> System.out.println(nome));

        // Mesma coisa do exemplo acima*
        for (String nome : nomesAle) {
            System.out.println(nome);
        }



        // ----------Queue-----------



        Set<String> nomesSemOrdenacao = new HashSet<>();

        nomesSemOrdenacao.add("Kauã");
        nomesSemOrdenacao.add("Gabriel Schiestl");
        nomesSemOrdenacao.add("Hebernald");
        nomesSemOrdenacao.add("Cleiton");
        nomesSemOrdenacao.add("A");
        nomesSemOrdenacao.add("a");

        for (String nome : nomesSemOrdenacao) {
            System.out.println(nome);
        }

        System.out.println(nomesSemOrdenacao.size());

        nomesSemOrdenacao.forEach(item -> System.out.println(item));
    }
}