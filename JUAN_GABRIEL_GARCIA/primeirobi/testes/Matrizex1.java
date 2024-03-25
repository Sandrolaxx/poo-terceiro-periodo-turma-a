package primeirobi.testes;

import java.util.Scanner;

public class Matrizex1 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[][] matriz_1 = new int[][] { {31, 27, 4 }, {44, 32, 95}, {9, 16, 56}};
        int[][] matriz_2 = new int[][] { {10, 88, 12 }, {38, 32, 73}, {14, 21, 52}};
        int[][] matriz_3 = new int[3][3];
        int[][] matriz_4 = new int[3][3];

        System.out.println(matriz_1[1][2]);
        System.out.println(matriz_2[2][0]);

        for (int l = 0; l < matriz_1.length; l++) {
        
            for (int c = 0; c < matriz_1.length; c++) {
                
                matriz_3[l][c] = matriz_1[l][c] + matriz_2[l][c];
            }
        }
        System.out.println();

        for (int l = 0; l < matriz_1.length; l++) {
        
            for (int c = 0; c < matriz_1.length; c++) {
                
                System.out.print(matriz_3[l][c] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int l = 0; l < matriz_1.length; l++) {
        
            for (int c = 0; c < matriz_1.length; c++) {
                
                matriz_4[l][c] = matriz_2[l][c] * 4;
            }
        }

        for (int l = 0; l < matriz_1.length; l++) {
        
            for (int c = 0; c < matriz_1.length; c++) {
                
                System.out.print(matriz_4[l][c] + " ");
            }
            System.out.println();
        }
    }
}
