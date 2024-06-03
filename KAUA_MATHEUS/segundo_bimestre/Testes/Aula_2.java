import java.util.*;
public class Aula_2{
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Mathues");
        nomes.add("pedro");
        

        Map <Integer, String> mapaN = new HashMap<Integer, String>();
        
        mapaN.put(0, "valor");

        System.out.println(mapaN.get(0));

        mapaN.put(0, "valor2");

        
        System.out.println(mapaN.get(0));

        nomes.clear();

        if(nomes.isEmpty()){
            System.out.println("O array está vazio!");
        }

    }
}