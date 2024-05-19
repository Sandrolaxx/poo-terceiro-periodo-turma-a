package SEGUNDO_BIMESTRE.aulas.MidLevel1;

import java.util.Queue;
import java.util.LinkedList;

public class Queue1 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("A");
        fila.add("B");
        fila.add("C");

        System.out.println(fila.peek());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.isEmpty());
    }
}
