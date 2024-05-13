package segundobim.listas.list1;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Anime {

    // ATV 4 Crie um método que utilize PriorityQueue
    // para ordenar uma lista com o nome dos cinco melhores animes/filmes que
    // você já viu em ordem alfabética.
    // Em seguida, imprima a lista ordenada.

    public void insereAnimeNome() {
        Scanner scanner = new Scanner(System.in);

        PriorityQueue<String> animes = new PriorityQueue<>();

        int qntd = 5;
        System.out.println("Digite seus " + qntd + " animes favoritos:");
        

        for (int i = 0; i < 5; i++) {
            String nome = scanner.nextLine();
            animes.add(nome);
        }

        System.out.println("Animes: ");
        while (!animes.isEmpty()) {
            System.out.println(animes.poll());
        }
        scanner.close();
    }

}

