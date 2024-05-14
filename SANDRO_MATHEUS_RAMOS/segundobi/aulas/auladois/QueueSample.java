package segundobi.aulas.auladois;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {
    
    public static void main(String[] args) {
        
        //Criando fila de inteiros
        Queue<Integer> fila = new LinkedList<>();
        
        fila.add(2);
        fila.add(53);
        fila.add(11);
        fila.add(43);
        fila.add(84);
        
        //Lê o primeiro elemento da fila
        System.out.println(fila.peek());
        
        //Fila de nomes com implementação que respeita ordem natural
        //Ordem natural de String - Alfabetica
        Queue<String> nomes = new PriorityQueue<>();

        nomes.add("Gabriel Schiestl");
        nomes.add("Hebernald");
        nomes.add("Cleiton");
        nomes.add("Leonardo");

        //Printando lista
        nomes.forEach(nome -> System.out.println(nome));

        //Mesma coisa do exemplo acima*
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

}
