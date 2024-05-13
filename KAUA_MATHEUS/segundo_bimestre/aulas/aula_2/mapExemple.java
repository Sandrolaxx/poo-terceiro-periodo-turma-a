import java.util.*;

public class mapExemple{

    public static void main(String[] args){
        // Implementação de Map
        Map <Integer, String> mapaTest = new HashMap<>();
        mapaTest.put(0, "Kauã");
        mapaTest.put(2, "Matheus");
        mapaTest.put(1, "João");
        mapaTest.put(24, "Henrique");

        System.out.println(mapaTest.get(2));

        // Printando Chaves - Note que os valores saem ordenados
        System.out.println("Printando as Chaves existentes " + mapaTest.keySet());

        // Printado valores
        System.out.println("\nPrintando os valores das chaves " + mapaTest.values());

        System.out.printf("\nRetorna os valores e chaves de um mapa!\n");
        System.out.println(mapaTest.entrySet());

    }
}