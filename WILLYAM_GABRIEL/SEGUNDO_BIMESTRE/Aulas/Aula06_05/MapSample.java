package SEGUNDO_BIMESTRE.Aulas.Aula06_05;

import java.util.HashMap;
import java.util.Map;

public class MapSample {
    public static void main(String[] args) {
        
        Map<String, String> mapaContas = new HashMap<>();

 
        mapaContas.put("12345", "null 1");
        mapaContas.put("12345", "null 2");
        mapaContas.put("54321", "null 3");
        mapaContas.put("98765", "null 4");

        System.out.println(mapaContas.get("12345"));
    }
}
