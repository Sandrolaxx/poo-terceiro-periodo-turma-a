package segundobi.exemplos.auladois;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
    
    public static void main(String[] args) {
        
        List<String> nomes = new ArrayList<>();
        String aluno = "Kauã";

        nomes.add(aluno);
        nomes.add("Gabriel");
        nomes.add("Hebernald");
        nomes.add("Cleiton");
        nomes.add("Leonardo");
        nomes.add("A");
        nomes.add("a");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        // nomes.remove(5);
        // nomes.remove(aluno);

        nomes.removeIf(item -> item.contains ("l"));
        //nome.stream().
        System.out.println("\n Lista sem L");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
