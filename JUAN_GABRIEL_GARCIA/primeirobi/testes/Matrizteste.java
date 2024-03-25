package primeirobi.testes;

import java.util.Scanner;

public class Matrizteste {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[][] matriz_a = new int[3][3];

        
        for (int l = 0; l < matriz_a.length; l++) {
        
            for (int c = 0; c < matriz_a.length; c++) {
                
                System.out.println("Coloque um valor para a posição ("+ l + " , " + c +")");
                matriz_a[l][c] = scan.nextInt();
            }
        }

        for (int l = 0; l < matriz_a.length; l++) {
            for (int c = 0; c < matriz_a.length; c++) {
                System.out.print(matriz_a[l][c] + " ");
            }
            System.out.println();
        }
    }
}
