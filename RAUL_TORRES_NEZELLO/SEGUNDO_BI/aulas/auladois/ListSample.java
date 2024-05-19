package SEGUNDO_BI.aulas.auladois;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Rau");
        nomes.add("Predo");
        nomes.add("Ragael");

        for( String nome : nomes){
            System.out.println(nome);
        }

        nomes.remove(2);

        nomes.removeIf(item -> item.contains("l"));

    }
}
