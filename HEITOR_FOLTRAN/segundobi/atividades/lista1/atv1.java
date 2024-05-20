package lista1;

import java.util.ArrayList;
import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        /* 
        ArrayList<String> coleguinhas = new ArrayList<String>();

        coleguinhas.add("Will");
        coleguinhas.add("Cleiton");
        coleguinhas.add("João");
        coleguinhas.add("Felipe");
        coleguinhas.add("Luís");

        System.out.println("H - " + (coleguinhas));
        */

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> coleguinhas = new ArrayList<String>();
    
        String meuNome;
        String colega;

        System.out.println("\nQual é o seu nome?");
            meuNome = scanner.nextLine();

        String inicial = meuNome.substring(0,1);

        System.out.println("\nInsira o nome dos seus 5 coleguinhas favoritos");
        for (int i = 0; i < 5; i++){
            colega = scanner.nextLine();
            coleguinhas.add(colega);
        }
            
        System.out.println("\n" + inicial + " - " + coleguinhas);

    }
}
