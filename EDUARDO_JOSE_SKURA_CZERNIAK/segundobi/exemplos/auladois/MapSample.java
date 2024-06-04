package segundobi.exemplos.auladois;

import java.util.HashMap;
import java.util.Map;

public class MapSample {

    public static void main(String[] args) {
        
        Map<String, String> mapaContas = new HashMap<>();

        //Pessoa gabrielHeller = new Pessoa();

       // mapaPessoasNomeExotico.put("p1", gabrielHeller);

        mapaContas.put("2123", "1");
        mapaContas.put("3311", "2");
        mapaContas.put("2121323", "saldo");
        mapaContas.put("1111", "3");

        //System.out.println(mapaContas.get("2123"));

        for (String key : mapaContas.keySet()) {
            System.out.println(key);
        }

    //     mapaContas.entrySet()
    //         .forEach(ks -> {
    //             System.out.println("minha chave" + ks.getKey()
    //             System.out.println("meu valor" + ks.getValue()
    //         });
    // }


    }
}
