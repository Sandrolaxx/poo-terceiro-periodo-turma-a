package segundobi.listas.lista1;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Atv4 {

    public static void main(String[] args) {
        
        Queue<String> animes = new PriorityQueue<>(Comparator.naturalOrder());
        // String[] listaOrdenada;
       

        animes.add("Steins;Gate");
        animes.add("Black clover");
        animes.add("Hunter x hunter");
        animes.add("One piece");
        animes.add("Jojo's bizarre adventure");

       while (!animes.isEmpty()) {
        System.out.println(animes.poll());
       }
    }
}
