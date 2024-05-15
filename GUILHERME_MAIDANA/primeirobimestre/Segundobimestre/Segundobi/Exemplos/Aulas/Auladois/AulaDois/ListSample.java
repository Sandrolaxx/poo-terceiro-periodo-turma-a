package primeirobimestre.Segundobimestre.Segundobi.Exemplos.Aulas.Auladois.AulaDois;

import java.util.List;
import java.util.ArrayList;
public class ListSample {
    public static void main(String[] args) {
        String aluno = "Guilherme";
         List<String> nomes = new ArrayList<>();
         nomes.add(aluno);
        nomes.add("Jean");
        nomes.add("Jefferson");
        nomes.add("Will");
        nomes.add("A");
        nomes.add("a");
        for (String nome : nomes){
            System.out.println(nome);
        }

        //nomes.remove(5);
       // nomes.remove(aluno);
        nomes.removeIf(item -> item.contains("l"));
        System.out.println("\n Lista sem L" );

        for (String nome : nomes){
            System.out.println(nome);
        }



    }
}
