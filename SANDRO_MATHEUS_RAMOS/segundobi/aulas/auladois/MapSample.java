package segundobi.aulas.auladois;

import java.util.HashMap;
import java.util.Map;

public class MapSample {

    public static void main(String[] args) {
        
        Map<String, String> mapaContas = new HashMap<>();

        //Adicionando nossas chaves e seus respectivos valores
        mapaContas.put("23123", "Saldo incorreto, valor 40.00 divergente");
        mapaContas.put("23343", null);
        mapaContas.put("1233", "Saldo conta incorreto valor 29.49");
        mapaContas.put("231232", null);

        //Iteração nas chaves
        for (String key : mapaContas.keySet()) {
            System.out.println(key);
        }

        System.out.println("\n");
        //Exemplo e iteração com classe que possue a chave e valor
        mapaContas.entrySet()
                .forEach(ks -> {
                    System.out.println("Minha chave:" + ks.getKey());
                    System.out.println("Meu valor:" + ks.getValue());
                });
    }

}
