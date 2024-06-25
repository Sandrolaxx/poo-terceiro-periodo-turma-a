package aulas.aula2;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
    
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        // String aluno = "Macaco";

        nomes.add("Pedro");
        nomes.add("Raul Torres");
        nomes.add("Rafael Kaito");
        nomes.add("Leonardo");
        nomes.add("Maicon");

        for (String nome : nomes){
            System.out.println(nome);
        }

        // nomes.remove(2);
        // nomes.remove(aluno);
        
        nomes.removeIf(item -> item.contains("l"));
        // nomes.stream()

        for (String nome : nomes){
            System.out.println(nome);
        }
    }
}
