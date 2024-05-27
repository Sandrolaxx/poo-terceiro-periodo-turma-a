package segundobim.testes.tipos_collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue { //Queue;

    public static void main(String[] args) {

        Queue <Integer> fila = new LinkedList<>();

        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.add(5);

        System.out.println(fila.peek()); // pega o primeiro elemento;

       Queue <String> nomes = new PriorityQueue<>();

       nomes.add("Bart");
       nomes.add("John");
       nomes.add("Lisa");
       nomes.add("Homer");

       for(String name : nomes) {
        System.out.println(name);
       }

        
    }
    
}
