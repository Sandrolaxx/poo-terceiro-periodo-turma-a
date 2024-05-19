package segundo_bimestre.auladois;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
    public static void main(String[] args) {
        List <String> nomes = new ArrayList<>();
        nomes.add("Messi");
        nomes.add("Joel");
        nomes.add("Jose");
        nomes.add("e");
        nomes.add("a");


        for (String nome : nomes) {
            System.out.println(nome);
            
        }
    }
}
