package SEGUNDO_BI.aulas.auladois;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();

        fila.add(2);
        fila.add(24);
        fila.add(11);
        fila.add(43);
        fila.add(84);

        System.out.println(fila.peek());

        Queue<String> nomes = new PriorityQueue<>();

        nomes.add("Predo");
        nomes.add("Rau");
        nomes.add("Ragael");

        // nomes.forEach(nomes -> );
    }
}
