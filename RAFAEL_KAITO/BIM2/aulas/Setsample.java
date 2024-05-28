package BIM2.aulas;

import java.util.HashSet;
import java.util.Set;

public class Setsample {
    public static void main(String[] args) {
        Set<String> nomesSemOrdenacao = new HashSet<>();

        nomesSemOrdenacao.add("Viado");
        nomesSemOrdenacao.add("Imposto");
        nomesSemOrdenacao.add ("Fidu");

        for (String nome : nomesSemOrdenacao){
            System.out.println(nome);
        }

        System.out.println(nomesSemOrdenacao.size());
        nomesSemOrdenacao.forEach(item -> System.out.println(item));
    }
}
