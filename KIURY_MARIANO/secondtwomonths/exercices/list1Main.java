package exercices;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.HashMap;
import java.util.Map;
// import java.util.Scanner;

public class list1Main{

    public static void main(String[] args) {

        // ATIVIDADE 1
        // Criar um ArrayList de strings e adicione os nomes de cinco dos seus colegas favoritos da turma.
        // Em seguida, itere sobre a lista e imprima a inicial do seu nome + " - " + cada nome da lista.


        // Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        // Adicionando nomes manualmente
        // for (int i = 0; i < 5; i++) {
        // System.out.println("\n Nome " + (i+1) + ":");
        // nomes.add(scanner.next());
        // }

        nomes.add("Kiury");
        nomes.add("Woyciechowski");
        nomes.add("Mariano");
        nomes.add("Ferdinando");
        nomes.add("Elisboa");

        System.out.println("\n Imprimindo os nomes: ");

        for (String nome : nomes) {
            System.out.println("M - " + nome);
        }


        // ATIVIDADE 2
        // Crie um HashSet de números inteiros e adicione alguns números repetidos.
        // Verifique se o conjunto contém um número específico e imprima o resultado.


        Set<Integer> numerosInteiros = new HashSet<>();

        numerosInteiros.add(1);
        numerosInteiros.add(2);
        numerosInteiros.add(3);
        numerosInteiros.add(3);
        numerosInteiros.add(4);
        numerosInteiros.add(5);
        numerosInteiros.add(5);
        numerosInteiros.add(5);

        for (Integer numero : numerosInteiros) {
            if (numero == 3) {
                System.out.println("\n Número específico presente.\n");

            }
        }

        System.out.println("Imprimindo os números.");
        numerosInteiros.forEach(item -> System.out.println(item));
       

        // ATIVIDADE 3
        // Escreva um método que receba uma lista de strings contendo os jogos que você já zerou.
        // Caso tenha zerado mais de uma vez, adicione o nome do jogo para cada vez. Após criar a lista de jogos zerados,
        // retorne uma nova lista contendo apenas as strings únicas (sem duplicatas).


        List<String> gamesReset = new ArrayList<>();
        Set<String> listaNova = new HashSet<>();

        gamesReset.add("Minecraft");
        gamesReset.add("Mortal Kombat");
        gamesReset.add("Mortal Kombat");
        gamesReset.add("Need For Speed");
        gamesReset.add("God of War");

        System.out.println("\n Imprimindo lista original: ");

        for (String game : gamesReset) {
            System.out.println(game);
            listaNova.add(game);
        }

        System.out.println("\n Imprimindo lista sem duplicatas: ");

        for (String game : listaNova) {
            System.out.println(game);
        }


        // ATIVIDADE 4
        // Crie um método que utilize PriorityQueue para ordenar uma lista com o
        // nome dos cinco melhores animes/filme
        // que você já viu em ordem alfabética. Em seguida, imprima a lista ordenada.


        Queue<String> listaAnimes = new PriorityQueue<>();
        Queue<String> listaOrdenada = new PriorityQueue<>();

        listaAnimes.add("Fullmetal Alchemist: Brotherhood");
        listaAnimes.add("Demon Slayer");
        listaAnimes.add("Death Note");
        listaAnimes.add("One Piece");
        listaAnimes.add("Attack on Titan");

        int tamanho = listaAnimes.size();

        for (int i = 0; i < tamanho; i++) {
            listaOrdenada.add(listaAnimes.poll());
        }

        System.out.println("\n Lista ordenada:");

        for (String anime : listaOrdenada) {
            System.out.println(anime);
        }


        // ATIVIDADE 5
        // Crie um método que crie uma estrutura que permita salvar as
        // configurações de hardware da sua máquina,
        // exemplo: "Processador" : "i5 7500U". Faça isso para no mínimo 5 peças e
        // imprima a peça e seu respectivo valor.


        Map<String, String> mapaMaquina = new HashMap<>();

        mapaMaquina.put("Monitor", "Samsung Odyssey 49 QLED, 120 Hz, Ultra Wide");
        mapaMaquina.put("Gabinete", "Rise Mode Glass 06X Frost, Mid Tower");
        mapaMaquina.put("Processador", "AMD Ryzen 7 5700G, 3.8GHz");
        mapaMaquina.put("Memória", "16GB DIMM DDR4 3200Mhz FURY");
        mapaMaquina.put("Armazenamento", "PICHAU ROVER, 512GB");
        mapaMaquina.put("Fonte", "ASUS ROG Loki SFX-L 1000W");
        mapaMaquina.put("Placa de video", "RTX 4060 8GB GDDR6 128BIT GALAX ");

        System.out.println("\n Meu PC:");

        mapaMaquina.entrySet()
                .forEach(chaveValor -> {
                    System.out.println(chaveValor.getKey() + ": " + chaveValor.getValue());
                    System.out.println();
                });
    }
}