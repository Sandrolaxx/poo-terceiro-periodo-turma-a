package segundobi.aulas.auladois;

import java.util.ArrayList;
import java.util.List;

public class ListSample {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Gabriel");
        nomes.add("Juan");
        nomes.add("Kaua");
        nomes.add("João");
        nomes.add("Gustavo");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("-----------");

        nomes.remove("João");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.removeIf(item -> item.contains("u"));

        System.out.println("\nLista sem U");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}