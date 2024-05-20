package lista1;

import java.util.HashSet;
import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {

        /* 
        HashSet<Integer> numeros = new HashSet<Integer>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        System.out.println(numeros);
        */

        int oEscolhido;
        Scanner scanner = new Scanner(System.in);
        
        HashSet<Integer> numeros = new HashSet<Integer>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(2);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(4);
        numeros.add(1);
        numeros.add(9);

        System.out.println("Insira um número de 1 a 10:");
            oEscolhido = scanner.nextInt();

        if(numeros.contains(oEscolhido)){
            System.out.println("\nO conjunto contém o número que você inseriu :)");
        }
        else{
            System.out.println("\nO conjunto NÃO contém o número que você inseriu :(");
        }

    }
}
