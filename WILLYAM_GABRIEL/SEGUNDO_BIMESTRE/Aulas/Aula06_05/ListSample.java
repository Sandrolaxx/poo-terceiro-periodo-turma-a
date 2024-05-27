package SEGUNDO_BIMESTRE.Aulas.Aula06_05;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
    public static void main(String[] args) {
        
        List<String> nomes = new ArrayList<>();



        nomes.add("AAA");
        nomes.add("BBB");
        nomes.add("CCC");
        nomes.add("ABC");
        nomes.add("awc");

        System.out.println("________________________");
        for (String nome : nomes){
            System.out.println(nome);
        }


        nomes.removeIf(item -> item.contains("w"));

        
        System.out.println("________________________");
        for (String nome : nomes){
            System.out.println(nome);
        }

        System.out.println("\nLista sem W");


    }
}
