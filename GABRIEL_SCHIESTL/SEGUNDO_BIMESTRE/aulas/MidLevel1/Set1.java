package SEGUNDO_BIMESTRE.aulas.MidLevel1;

import java.util.HashSet;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {

        Set<String> nomesSemOrdenacao = new HashSet<>();

        nomesSemOrdenacao.add("Gabriel");
        nomesSemOrdenacao.add("Kaua");
        nomesSemOrdenacao.add("Juan");

        for(String nome : nomesSemOrdenacao){
            System.out.println(nome);
        }
    }
}