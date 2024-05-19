package lista1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> configuracoes = new HashMap<>();

        String[] partes = {"Processador", "Placa de vídeo", "Memória RAM", "SSD", "HD"};

        for (String parte : partes){
            System.out.print(parte + ": ");
            String nome = scanner.nextLine();
            configuracoes.put(parte, nome);
        }

        System.out.println("\nA máquina:\n");
        
        for (Map.Entry<String, String> pecas : configuracoes.entrySet()){
            System.out.println(pecas.getKey() + ": " + pecas.getValue());
        }
        System.out.println("\n");
    }
}
