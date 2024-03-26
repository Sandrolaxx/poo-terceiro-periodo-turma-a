package primeirobi.ListasExc;

import java.util.Scanner;
import java.util.ArrayList;
public class ExcMatriz {
    public static void main(String[] args) {
        int [][] Matriz1 = {{31, 27, 4},
                            {44, 32, 95},
                            {9, 16, 56}
                            };

        int [][] Matriz2 = {{10, 88, 12},
                            {38, 32, 73},
                            {14, 21, 52}
                            };
        int linha = 0;
        int coluna = 0;
        int linha1 = 0;
        int coluna1 = 0;

        for (linha = 0 ; linha < Matriz1.length ; linha++){
            for (coluna = 0 ; coluna < Matriz1[linha].length ; coluna++){
                System.out.println("Elemento na posição ["+linha+"]["+coluna+"] da Matriz 1: " +Matriz1[1][2]);
            }
        }

        for (linha1 = 0 ; coluna1 < Matriz2.length ; coluna1++){
            for (coluna1 = 0 ; coluna1 < Matriz2[linha1].length ; coluna1++){
            System.out.println("Elemento na posição ["+linha1+"]["+coluna1+"] da Matriz 2: " +Matriz2[2][0]);
            }
        }

        int somaMatriz = Matriz1 + Matriz2;
        System.out.println("Soma dos valores das duas matrizes" +somaMatriz);
    }
    
}
