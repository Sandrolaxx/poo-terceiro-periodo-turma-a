package primeirobimestre.Segundobimestre.Segundobi.Exemplos.Aulas.Auladois;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {
    public static void main(String[] args) {
        
        Queue<Integer>  fila = new LinkedList<>();

            fila.add(2);
            fila.add(11);
            fila.add(53);
            fila.add(20);
            fila.add(80);

            System.out.println(fila.peek()); // Retorna o elemento do topo

            Queue<String>  nomes = new PriorityQueue<>();

                
                nomes.add("Jean");
                nomes.add("Jefferson");
                nomes.add("Will");
                nomes.add("Maidana");
                for (String nome : nomes){
                    System.out.println(nome);
                }
                

    }
}
