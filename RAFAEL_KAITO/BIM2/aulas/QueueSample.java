package BIM2.aulas;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        fila.add(2);
        fila.add(53);
        fila.add(11);
        fila.add(43);
        fila.add(84);

        System.out.println(fila.peek());

        Queue<String> nomesQueue = new PriorityQueue<>();
        nomesQueue.add("Viado");
        nomesQueue.add("Imposto");
        nomesQueue.add ("Fidu");
        nomesQueue.add ("Fornicas");
        nomesQueue.add ("Yakisoba");

        System.out.println(nomesQueue.size());
        nomesQueue.forEach(item -> System.out.println(item));


    }
}
