package segundobimestre.aulas.aulaDois;

import java.util.HashMap;
import java.util.Map;

public class MapSample {
    public static void main(String[] args) {

        Map<String, String> mapaConta = new HashMap<>();

        mapaConta.put("p1", "nu");
        mapaConta.put("p2", "nu");
        mapaConta.put("j1", "nu");
        mapaConta.put("p1", "nu");
        mapaConta.put("p1", "nu");

        for (String key : mapaConta.keySet()) {
            System.out.println(key);
        }

        mapaConta.entrySet().forEach(ks -> {
            System.out.println("minha chave" + ks.getKey());
            System.out.println("meu valor" + ks.getValue());
        });
    }
}
