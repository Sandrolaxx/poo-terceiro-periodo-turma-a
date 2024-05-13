package segundobi.aulas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class exempliLista {
    public static void main(String[] args) {
        List<String> liststrings = new ArrayList<String>();
        liststrings.add("One");
        liststrings.add("Two");
        System.out.println(liststrings);

        List<object> listAnything - new ArrayList<Object>();
        List<object> listWords - new ArrayList<String>();

        List<Integer> listNumbers2 = list.of(1, 2, 3, 4, 5, 6);

        liststrings.add(1, "Four");
        liststrings.remove(2);

        String element = liststrings.get(1);
        Number number = listNumbers2.get(3);

        LinkedList<Number> numbers = new Linkedlist<Number>();
        //Adiciona elementos pra lista
        //Pegar o primeiro e o ultimo elemento
        Number first = numbers.getFirst();
        Number lasr = numbers.getLast();

        if (listStrings.contains("One")){
            System.out.println("Elemento encontrado");
        } else {
            System.out.println("Nao encontrado");
        }
    }
}
