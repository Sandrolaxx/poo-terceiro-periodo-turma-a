package segundobimestre.aulas.aulaDois;

import java.util.Queue;

import java.util.LinkedList;

public class QueueSample {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();

        fila.add(2);
        fila.add(3);
        fila.add(5);
        fila.add(8);

        System.out.println(fila.peek());
    }
}
