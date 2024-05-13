package segundobimestre.aulas.aulaDois;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        String aluno = "Meu";

        nomes.add("cleber");
        nomes.add("joao");
        nomes.add("matheu");
        nomes.add("eu");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.remove(3);
        nomes.remove(aluno);

        nomes.removeIf(item -> item.contains("l"));

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
