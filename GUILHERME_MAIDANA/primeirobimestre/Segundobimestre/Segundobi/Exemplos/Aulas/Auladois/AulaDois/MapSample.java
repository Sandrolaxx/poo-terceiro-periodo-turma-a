package primeirobimestre.Segundobimestre.Segundobi.Exemplos.Aulas.Auladois.AulaDois;

import java.util.HashMap;
import java.util.Map;

public class MapSample {
    public static void main(String[] args) {
        Map<String, String> mapaPessoas = new HashMap<>();

    
        mapaPessoas.put("2323", "null2" );
        mapaPessoas.put("2425", "null3" );
        mapaPessoas.put("2526", "null4" );
        mapaPessoas.put("2627", "null5" );
        mapaPessoas.put("2829", "null6");
        System.out.println(mapaPessoas.get("2323"));

        for (String key : mapaPessoas.keySet()) {
            System.out.println(key);
        }

        mapaPessoas.entrySet()
            .forEach(ks ->  {
                System.out.println("Minha chave" + ks.getKey());
                System.out.println("Minha chave" + ks.getValue());
            }); 
    }
}
