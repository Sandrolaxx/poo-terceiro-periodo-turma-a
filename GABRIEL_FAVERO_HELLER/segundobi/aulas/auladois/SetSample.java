package segundobi.aulas.auladois;

import java.util.HashSet;
import java.util.Set;

public class SetSample {

    public static void main(String[] args) {

        Set<String> nomeSemOrdenacao = new HashSet<>();

        nomeSemOrdenacao.add("Gabriel");
        nomeSemOrdenacao.add("Juan");
        nomeSemOrdenacao.add("Kaua");

        for (String nome : nomeSemOrdenacao) {
            System.out.println(nome);
        }
    }
}