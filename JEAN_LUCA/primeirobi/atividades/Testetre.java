package primeirobi.atividades;
public class Testetre {


    public static void main(String[] args) {
        //  matriz 1
        int[][] matriz1 = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 95}
        };

        //  matriz 2
        int[][] matriz2 = {
            {5, 8, 12},
            {16, 19, 14},
            {25, 30, 35}
        };

        //  95 da matriz 1
        System.out.println("Elemento 95 da matriz 1: " + matriz1[2][2]);

        //  14 da matriz 2
        System.out.println("Elemento 14 da matriz 2: " + matriz2[1][2]);

        // Criando matriz 3 para armazenar a soma de matriz1 e matriz2
        int[][] matriz3 = new int[3][3];

        // Realizando a soma de matriz1 e matriz2 e armazenando em matriz3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        //  (matriz3)
        System.out.println("Matriz resultante da soma:");
        printMatriz(matriz3);

        // Realizando a multiplicação escalar por 4 da matriz 2 e armazenando em uma nova matriz
        int[][] matriz4 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz4[i][j] = matriz2[i][j] * 4;
            }
        }

        //(matriz4)
        System.out.println("Matriz resultante da multiplicação escalar por 4:");
        printMatriz(matriz4);
    }

    // Método para imprimir uma matriz
    public static void printMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "");
            }
            System.out.println();
        }
    }
}
