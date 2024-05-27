package segundobim.testes.tipos_collections;

import java.util.ArrayList;
import java.util.List;

public class TestList {

    public static void main(String[] args) {

                
        List<String> nome  = new ArrayList<String>();

        nome.add("João");
        nome.add("Vitar");
        nome.add("John");
        nome.add("Marlos");
        
        // nome.removeIf(item -> item.contains("o")); // exclui os itens que possuem a letra "o";
        //System.out.println("Lista sem o");

        //nome.remove(0); // remove por índice
        //nome.remove(aluno); // remove por object

        for (String name : nome) {
            System.out.println(name);
            
        }

    }
    
}
