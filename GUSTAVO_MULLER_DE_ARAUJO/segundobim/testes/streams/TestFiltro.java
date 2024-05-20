package segundobim.testes.streams;

import java.util.ArrayList;
import java.util.List;

public class TestFiltro {
    public static void main(String[] args) {

    List<Integer> numeros = new ArrayList<Integer>();

    numeros.add(1);
    numeros.add(2);
    numeros.add(3);
    numeros.add(4);
    numeros.add(5);

    System.out.println("Numeros da lista:");
    numeros.forEach(System.out::println); // forEach (para cada elemento da lista) // // 

    System.out.println("Números pares:");
    numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println); 


    }
}
