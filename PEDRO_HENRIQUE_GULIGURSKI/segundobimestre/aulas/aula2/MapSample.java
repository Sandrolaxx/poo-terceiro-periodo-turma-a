package aulas.aula2;

import java.util.HashMap;
import java.util.Map;

public class MapSample {
    
    public static void main(String[] args) {
        
        Map<String, Integer> veiculos = new HashMap<>();

        veiculos.put("Gol", 10);
        veiculos.put("Mercedes", 2);
        veiculos.put("Audi", 8);
        veiculos.put("Ford", 4);

        System.out.println("Total de vículos: " + veiculos.size());

        // System.out.println("Valor do Gol: " + veiculos.get("Gol"));

        for (String key : veiculos.keySet()) {
            System.out.println(key);
        }
        System.out.println();

        veiculos.entrySet()
            .forEach(ks -> {
                System.out.println("Chave: " + ks.getKey());
                System.out.println("Valor: " + ks.getValue());
            });
            System.out.println();

        System.out.println(veiculos.entrySet());

    }

}
