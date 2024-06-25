package aulas.aula2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {
    
    public static void main(String[] args) {
        
        Queue<Integer> fila = new LinkedList<>();

        fila.add(2);
        fila.add(24);
        fila.add(65);
        fila.add(3);
        fila.add(9);

        System.out.println(fila.peek());

        Queue<String> nomes = new PriorityQueue<>();

        nomes.add("Pedro");
        nomes.add("Raul Torres");
        nomes.add("Rafael Kaito");
        nomes.add("Leonardo");
        nomes.add("Maicon");
        
    }

}
