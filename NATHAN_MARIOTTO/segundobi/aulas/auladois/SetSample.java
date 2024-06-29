package segundobi.aulas.auladois;

import java.util.HashSet;
import java.util.Set;

public class SetSample {

    public static void main(String[] args) {
        
        Set<String> nomesSemOrdenacao = new HashSet<>();

        nomesSemOrdenacao.add("Kauã");
        nomesSemOrdenacao.add("Gabriel Schiestl");
        nomesSemOrdenacao.add("Hebernald");
        nomesSemOrdenacao.add("Cleiton");
        nomesSemOrdenacao.add("A");
        nomesSemOrdenacao.add("a");

        for (String nome : nomesSemOrdenacao) {
            System.out.println(nome);
        }

        System.out.println(nomesSemOrdenacao.size());
        
        nomesSemOrdenacao.forEach(item -> System.out.println(item));
    }

}
