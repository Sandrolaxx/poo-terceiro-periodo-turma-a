package segundobimestre.aulas.aulaDois;

import java.util.Set;
import java.util.HashSet;

public class SetSample {
    public static void main(String[] args) {

        Set <String> nomes = new HashSet<>();

        nomes.add("matheu");
        nomes.add("lucio");
        nomes.add("carlo");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println(nomes.size());
    }
}
