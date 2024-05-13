package segundobi.aulas;

import java.util.Set;

public class aula2 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("ian");
        names.add("joao");

        if(names.add("joao")) {
            System.out.println("joao foi adicionado ao Set");

        }
        if (!names.add("ian")) {
            System.out.println("ian ja esta adicionado ao set");

        }
        if (names.remove("joao")) {
            System.out.println("joao foi removido");
        }
        if (names.isEmpty()) {
            System.out.println("O set esta vazio");
        } else {
            System.out.println("O set nao esta vazio");
        }

        //remove os elementos do set
        names.clear();

        if(names.isEmpty()){
            System.out.println("O set esta vazio");
        }

    }

}
