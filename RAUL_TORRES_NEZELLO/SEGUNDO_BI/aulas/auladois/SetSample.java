package SEGUNDO_BI.aulas.auladois;

import java.util.HashSet;
import java.util.Set;

public class SetSample {

    public static void main(String[] args) {
        Set<String> nomesSemOrdenacao = new HashSet<>();

        nomesSemOrdenacao.add("Rau");
        nomesSemOrdenacao.add("Predo");
        nomesSemOrdenacao.add("Ragael");

        for (String nome : nomesSemOrdenacao){
                System.out.println(nome);
            }

        System.out.println(nomesSemOrdenacao.size());
        nomesSemOrdenacao.forEach(item -> System.out.println(item));
    }
}