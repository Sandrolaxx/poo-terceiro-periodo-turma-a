package SEGUNDO_BIMESTRE.Aulas.Aula06_05;

import java.util.HashSet;
import java.util.Set;

public class SetSample {
     public static void main(String[] args) {
        
        Set<String> nomesSemOrdenacao = new HashSet<>();

        nomesSemOrdenacao.add("AAA");
        nomesSemOrdenacao.add("BBB");
        nomesSemOrdenacao.add("CCC");
        nomesSemOrdenacao.add("ABC");
        nomesSemOrdenacao.add("abc");



        System.out.println("________________________");
        for (String nome : nomesSemOrdenacao){
            System.out.println(nome);
        }



        System.out.println("________________________");
        System.out.println(nomesSemOrdenacao.size());
        System.out.println("________________________");



        System.out.println("________________________");
        nomesSemOrdenacao.forEach(item -> System.out.println(item));
        System.out.println("________________________");

        

     }
}
