package segundo_bimestre.ListasAulas.lista1;

import java.util.ArrayList;
    
public class colega {
    public static void main(String[] args) {
        
        ArrayList<String> colegas = new ArrayList<>();
       
        colegas.add("Cleiton");
        colegas.add("Matheus");
        colegas.add("Willyam");
        colegas.add("Leonardo");
        colegas.add("Felipe");

        String meuNome = "Luiz";
        for (String nome : colegas) {
            System.out.println(meuNome.charAt(0) + " - " + nome);
        }
    }
}

