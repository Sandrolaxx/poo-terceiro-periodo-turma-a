package segundobi.listas.lista1;

import java.util.List;
import java.util.ArrayList;

public class Atv1 {
    /*
     * Atv1 - Criar um ArrayList de strings e adicione os nomes de cinco dos seus
     * colegas favoritos da turma.
     * Em seguida, itere sobre a lista e imprima a inicial do seu nome + " - " +
     * cada nome da lista.
     */
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<String>();

        nomes.add("Gabriel");
        nomes.add("Gustavo");
        nomes.add("João");
        nomes.add("Juan");
        nomes.add("Kauã");

        for (String nome : nomes) {
            System.out.println("G - " + nome);
        }
    }
}