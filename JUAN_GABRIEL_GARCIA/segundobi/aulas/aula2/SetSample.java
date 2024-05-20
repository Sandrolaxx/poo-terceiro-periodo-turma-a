package segundobi.aulas.aula2;

import java.util.HashSet;
import java.util.Set;

import javax.sound.sampled.SourceDataLine;

public class SetSample {

    public static void main(String[] args) {
        
        Set<String> nomesSemOrdenacao = new HashSet<>();

        nomesSemOrdenacao.add("Roberto");
        nomesSemOrdenacao.add("Clebim");
        nomesSemOrdenacao.add("Jhonny Rivers");
        nomesSemOrdenacao.add("Mano Brown");

        for (String nome : nomesSemOrdenacao) {
            System.out.println(nome);
        }

        System.out.println(nomesSemOrdenacao.size());
        
    }    
}
