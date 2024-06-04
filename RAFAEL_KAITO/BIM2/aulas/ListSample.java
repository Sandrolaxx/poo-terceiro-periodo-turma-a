package BIM2.aulas;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Viado");
        nomes.add("Imposto");
        nomes.add ("Fidu");
        nomes.add ("Fornicas");
        nomes.add ("Yakisoba");

        for (String nome:nomes){
            System.out.println(nome);
        }

        //nomes.remove(5);
        nomes.removeIf(item -> item.contains("s"));

        System.out.println("Lista sem s ");
        System.out.println(nomes);
    }
}
