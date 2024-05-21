package BIM2.aulas;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
public class MapSample {
    public static void main(String[] args) {
        Map <String, Integer> veiculos = new HashMap<>();
       
        veiculos.put ("Volkswagen", 10);
        veiculos.put ("Ford", 5);
        veiculos.put ("Renault", 19);
        veiculos.put ("Honda", 13);
    
        System.out.println("Total veiculos: " + veiculos.size());

        System.out.println(veiculos.get("Honda"));

        //for (String key : veiculos.keySet){
         //   System.out.println(key);
        //}
    }
}
