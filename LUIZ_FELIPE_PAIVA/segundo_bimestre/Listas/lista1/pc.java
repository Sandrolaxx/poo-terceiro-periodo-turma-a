package segundo_bimestre.Listas.lista1;

import java.util.HashMap;
import java.util.Map;

public class pc {
    public static void main(String[] args) {
        Map<String, String> configuracoesHardware = new HashMap<>();

        configuracoesHardware.put("Processador", "Ryzen 7 7800x3d");
        configuracoesHardware.put("Placa de vídeo", "RTX 3060TI");
        configuracoesHardware.put("Placa mãe", "X670-E Plus");
        configuracoesHardware.put("Memória RAM", "2x16GB XPG Lancer 6000MHz");
        configuracoesHardware.put("Armazenamento SSD", "1TB NVMe"); 

        imprimirConfiguracoes(configuracoesHardware);
    }

    public static void imprimirConfiguracoes(Map<String, String> configuracoes) {
        System.out.println("Configurações de Hardware:");
        for (Map.Entry<String, String> entry : configuracoes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

