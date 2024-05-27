package SEGUNDO_BIMESTRE.aulas.MidLevel1;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();

        nomes.add("Sim");
        nomes.add("Nao");
        nomes.add("Talvez");
        nomes.add("Siiiim");
        nomes.add("Naaaao");

        for(String nome : nomes){
            System.out.println(nome);
        }

        System.out.println("---------");

        nomes.remove("Nao");

        for(String nome : nomes){
            System.out.println(nome);
        }

        nomes.removeIf(item -> item.contains("T"));

        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
