package SEGUNDO_BIMESTRE.listas.lista1;

import java.util.Map;
import java.util.HashMap;

public class Ex5 {

    public static void main(String[] args) {
        Map<String, String> hardware = new HashMap<>();

        hardware.put("Processador", "R5 1600");
        hardware.put("Placa de video", "GTX 1650");
        hardware.put("Placa mae", "AsRock A320");
        hardware.put("RAM", "2x8GB HyperX 3000MHz");
        hardware.put("Armazenamento", "SSD 120GB, HD 320GB, HD 1TB");

        for (Map.Entry<String, String> entry : hardware.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
