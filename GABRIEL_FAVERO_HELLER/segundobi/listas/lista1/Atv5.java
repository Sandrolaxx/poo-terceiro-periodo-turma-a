package segundobi.listas.lista1;

import java.util.Map;
import java.util.HashMap;

public class Atv5 {
    /*
     * Atv5 -Crie um método que crie uma estrutura que permita salvar as
     * configurações de hardware da sua máquina, exemplo: "Processador" :
     * "i5 7500U". Faça isso para no mínimo 5 peças e imprima a peça e seu
     * respectivo valor.
     */
    public static void main(String[] args) {
        Map<String, String> hardware = new HashMap<>();

        hardware.put("Placa de video", "NVIDIA GeForce GTX 1060 6GB");
        hardware.put("Processador", "Intel(R) Core(TM) i5-7600 CPU @ 3.50GHz");
        hardware.put("Memória RAM", "16,0 GB (2x8GB HyperX 3000MHz)");
        hardware.put("Armazenamento", "SSD 256GB, HDD 1TB");
        hardware.put("Placa mãe", "ASUSTeK COMPUTER INC. H110M-K");

        for (Map.Entry<String, String> entry : hardware.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}