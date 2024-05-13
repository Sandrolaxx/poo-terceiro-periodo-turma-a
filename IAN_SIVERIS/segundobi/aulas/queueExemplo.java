package segundobi.aulas;

import java.util.PriorityQueue;
import java.util.Queue;

public class queueExemplo {
    public static void main(String[] args) {
        Queue<String> namesQueue = new LinkedList<>();

        List<String> listnames = Arrays.asList("Alice", "Bob", "cole", "Dale", "Eric", "Frank");
        Queue<String> queueNames = new LinkedList<>(listNames);
        System.out.println(queueNames);

        //Adiciona elemento ao final da fila
        queueNamesTwo.add("Mary");
        queueNamesTwo.add("John");

        //Retorna e remove o primeiro elemento da fila
        queueNamesTwo.poll();

        Queue<String> queuePriority = new PriorityQueue<>();

        queueNames.add("Dale");
        queueNames.add("Bob");
        queueNames.add("Alice");
        queueNames.add("Eric");
        queueNames.add("Cole");
        queueNames.add("John");
       
    }
}
