package lista1;

import java.util.HashSet;
import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        HashSet<String> voce = new HashSet<String>();

        String jogosZerados;

        System.out.println("Quais são os jogos que você já zerou? (insira -1 para sair)");

        while (true){
            jogosZerados = scanner.nextLine();

            if (jogosZerados.equalsIgnoreCase("-1")){
                break;
            }
            voce.add(jogosZerados);
        }

        System.out.println("\nLista dos seus jogos zerados:");
        for (String jogos : voce){
            System.out.println(jogos);
        }

        System.out.println("\n");
    }
}



