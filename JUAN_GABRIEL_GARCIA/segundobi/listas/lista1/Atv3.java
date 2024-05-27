package segundobi.listas.lista1;

import java.util.HashSet;
import java.util.Set;
// import java.util.LinkedList;
// import java.util.Queue;

public class Atv3 {
    

    public static void main(String[] args) {
        
        Set<String> jogosZerados = new HashSet<>();

        jogosZerados.add("Lies of P");
        jogosZerados.add("Lies of P");
        jogosZerados.add("Elden ring");
        jogosZerados.add("Dying light");
        jogosZerados.add("Hades");
        jogosZerados.add("Dark souls 3");
        jogosZerados.add("Hollow knight");
        jogosZerados.add("Hollow knight");
        
        for (String lista : jogosZerados) {
            
            System.out.println(lista);
        }
        
    }
}
