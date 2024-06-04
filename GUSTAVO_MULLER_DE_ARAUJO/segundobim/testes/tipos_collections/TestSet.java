package segundobim.testes.tipos_collections;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

    public static void main(String[] args) {

        Set<String> nomesSemOrdem = new HashSet<>();

        nomesSemOrdem.add("Vitor");
        nomesSemOrdem.add("Miguel");
        nomesSemOrdem.add("Carlão");
        nomesSemOrdem.add("Elizy");

        for(String nomes : nomesSemOrdem){
            System.out.println(nomes);
        }

        System.out.println(nomesSemOrdem.size());
        nomesSemOrdem.remove("Carlão");

     

        /* if(nomesSemOrdem.add("Vitor")) {
            System.out.println("Vitor adicionado");
        }

        if(!nomesSemOrdem.add("Vitor")) {
            System.out.println("Vitor já existe");

        }

        else {
            System.out.println("Vitor não adicionado");
        }

        if (nomesSemOrdem.add("Miguel")) {
            System.out.println("Miguel adicionado");
        }

        if(!nomesSemOrdem.add("Miguel")) {
            System.out.println("Miguel já existe");

        }

        nomesSemOrdem.remove("Miguel");
        nomesSemOrdem.clear();

        if(nomesSemOrdem.isEmpty()) {
            System.out.println("Lista vazia");
        } 
        */

        
    }
    
}
