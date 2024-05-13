package SEGUNDO_BIMESTRE.listas.lista1;

import java.util.List;
import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<String>();

        nomes.add("Juan");
        nomes.add("Kaua");
        nomes.add("Favero");
        nomes.add("Muller");
        nomes.add("Joao");

        for (String nome : nomes) {
            System.out.println("G - " + nome);
        }

    }
}
