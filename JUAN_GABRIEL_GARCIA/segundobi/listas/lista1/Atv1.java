package segundobi.listas.lista1;

import java.util.ArrayList;
import java.util.List;

public class Atv1 {
    
    public static void main(String[] args) {
        
        List<String> nomes = new ArrayList<>();

        nomes.add("Juan");
        nomes.add("Kaua");
        nomes.add("Gustavo");
        nomes.add("Joao");
        nomes.add("Gabriel");

        for (String lista : nomes) {
            char incial = lista.charAt(0);
            
            System.out.println("J - " + lista);

            // System.out.println(incial + "J - " + lista);
        }
    }
}
