package primeirobimestre.Segundobimestre.Segundobi.Exemplos.Aulas.Auladois;
import java.util.Set; 
import java.util.HashSet; 

public class SetSample {
    public static void main(String[] args) {
        Set<String> nomesSemOrdenacao = new HashSet<>() ; 

        nomesSemOrdenacao.add("Guilherme");
        nomesSemOrdenacao.add("Jean");
        nomesSemOrdenacao.add("Jefferson");
        nomesSemOrdenacao.add("Will");
        nomesSemOrdenacao.add("A");
        nomesSemOrdenacao.add("a");
        /*nomesSemOrdenacao.clear; //Limpa o conjunto de elementos
         nomesSemOrdenacao.remove;// remove um elemento*/

         
        for (String  nome : nomesSemOrdenacao) {
            System.out.println(nome);
    }
        System.out.println(nomesSemOrdenacao.size());

        
}   
}