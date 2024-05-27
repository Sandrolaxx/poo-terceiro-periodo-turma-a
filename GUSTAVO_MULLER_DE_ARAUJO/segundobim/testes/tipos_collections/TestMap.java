package segundobim.testes.tipos_collections;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {

    Map<String,Integer> veiculos = new HashMap<>(); //nao permite duplicados key, value;

    veiculos.put("BMW", 9);
    veiculos.put("Corsa", 10);
    veiculos.put("Gol", 7);
    veiculos.put("Mercedes", 5);

    for (String chave : veiculos.keySet()) {
        System.out.println("Valor chave: " + chave);
        
    }

    //System.out.println(veiculos.size()); // da o tamanho de veiculos;

   // System.out.println(veiculos.get("BMW")); // puxa a quantidade de veículos BMW;

}

}


