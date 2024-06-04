package segundobi.exemplos.auladois;

// import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {

    public static void main(String[] args) {
        
        // Queue<Integer> fila = new LinkPriorityQueueedList<>();

        // fila.add(42);
        // fila.add(3);
        // fila.add(16);
        // fila.add(65);
        // fila.add(98);

        //fila.peek();

        // System.out.println(fila.peek());

        Queue<String> nomes = new PriorityQueue<>();       

        nomes.add("Gabriel");
        nomes.add("Hebernald");
        nomes.add("Cleiton");
        nomes.add("Leonardo");
        nomes.add("A");
        nomes.add("a");

        nomes.forEach(nome -> System.out.println(nome));



        //stream.le.sserafim();
    }
    
}
