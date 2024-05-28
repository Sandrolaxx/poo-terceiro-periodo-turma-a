package SEGUNDO_BIMESTRE.Aulas.Aula06_05;

import java.util.*;;

public class QueueSample {
    public static void main(String[] args) {
        
        Queue<Integer> fila = new LinkedList<>();

        fila.add(2);
        fila.add(4);
        fila.add(6);
        fila.add(8);
        fila.add(10);


       System.out.println(fila.peek());

       Queue<String> nomes = new PriorityQueue<>();

       nomes.add("AAA");
       nomes.add("BBB");
       nomes.add("CCC");
       nomes.add("ABC");
       nomes.add("abc");

       nomes.forEach(nome -> System.out.println(nome));

       

    }
}
