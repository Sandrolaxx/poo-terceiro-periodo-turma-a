package aulas.aula2;

import java.util.HashSet;
import java.util.Set;

public class SetSample {
    
    public static void main(String[] args){

        Set<String> nomesSemOrdenacao = new HashSet<>();

        nomesSemOrdenacao.add("Pedro");
        nomesSemOrdenacao.add("Raul Torres");
        nomesSemOrdenacao.add("Rafael Kaito"); // Retorna true caso tiver sucesso, caso contrário, retorna false

        for (String nome : nomesSemOrdenacao) {
            System.out.println(nome);
        }

        System.out.println(nomesSemOrdenacao.size());
        nomesSemOrdenacao.forEach(item -> System.out.println(item));

    }

}
