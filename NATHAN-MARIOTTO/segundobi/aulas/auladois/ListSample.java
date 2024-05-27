package segundobi.aulas.auladois;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
    
    public static void main(String[] args) {
        
        List<String> nomes = new ArrayList<>();
        String aluno = "Kauã";
        
        //Adiciona elementos
        nomes.add(aluno);
        nomes.add("Gabriel Schiestl");
        nomes.add("Hebernald");
        nomes.add("Cleiton");
        nomes.add("Leonardo");
        nomes.add("A");
        nomes.add("a");
        
        //Iterando nos valores
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        //Removendo por indice
        nomes.remove(5);
        //Removendo referência
        nomes.remove(aluno);

        //Removendo com base em condição
        nomes.removeIf(item -> item.contains("l"));
        
        System.out.println("\nLista sem L");
        
        for (String nome : nomes) {
            System.out.println(nome);
        }

        String[] nomes2 = new String[40];

        //lenght --> tamanho total do vetor -- 40
        for (int i = 0; i < nomes2.length; i++) {
        }
        
        //size --> quantidade de elementos da lista -- ex: 5
        for (int i = 0; i < nomes.size(); i++) {
            //Acessando valor por indice
            System.out.println(nomes.get(i));
        }
        
        //Acessando valor por indice
        System.out.println(nomes.get(4));
    }

}