package segundobi.aulas.aula2;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
    
    public static void main(String[] args) {
        
        List<String> nomes = new ArrayList<>();
        String aluno = "Kauã";

        nomes.add(aluno);
        nomes.add("Roberto");
        nomes.add("Clebim");
        nomes.add("Jhonny Rivers");
        nomes.add("Mano Brown");
        nomes.add("a");
        nomes.add("A");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.remove(5);
        nomes.remove(aluno);

        nomes.removeIf(item -> item.contains("l")); // remove os elementos da lista que possuem
    }
}
