package training;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class aula3 {
    
    public static void main(String[] args) {
        
    

        // Stream API --------------


        List<String> sacolaFrutas = new ArrayList<>();

        sacolaFrutas.add("banana");
        sacolaFrutas.add("maca");
        sacolaFrutas.add("pera");
        sacolaFrutas.add("uva");

        
        for (String nome : sacolaFrutas) {
            System.out.println(nome);
        }


        List<String> sacola2 = sacolaFrutas.stream()
            .filter(fruta -> fruta.equals("banana"))
            .map( fruta -> fruta.concat("fruta top ein"))
            //.toList();                          // Para versão java 11
            //.collect(Collectors.toList());    // Para demais versões
            

        System.out.println("\n Nova lista");

            for (String nome : sacola2) {
                System.out.println(nome);
            }

            boolean existeBanana = sacolaFrutas.stream()
            .anyMatch("banana");        // Pergunta se tem banana na lista
            //.allMatch("banana");      // Pergunta se todos os itens são bananas
        }
}
