package segundobi.listas.lista1;

import java.util.HashMap;
import java.util.Map;

public class Atv5 {
    
    public static void main(String[] args) {
        
        Map<String, String> config = new HashMap<>();

        config.put("Processador", "i7-11800H");
        config.put("Placa de vídeo", "RTX 3050");
        config.put("RAM", "8gb");
        config.put("Armazenamento", "SSD 512");
        config.put("Tela", "FullHD - 144hz");

        for (String key : config.keySet()) {
            
            System.out.println(key + " - " + config.get(key));
        }
    }
}
