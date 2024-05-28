public class Main {
    public static void main(String[] args) {
        // Definindo as matrizes
        int[][] matriz1 = {{31, 27, 4}, {44, 32, 95}, {38, 32, 73}};
        int[][] matriz2 = {{10, 88, 12}, {9, 16, 56}, {14, 21, 52}};

        // Printando os elementos específicos
        System.out.println("Elemento de valor 95 da matriz 1: " + matriz1[1][2]);
        System.out.println("Elemento de valor 14 da matriz 2: " + matriz2[2][0]);

        // Somando as matrizes e criando matriz3
        int[][] matriz3 = new int[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Printando a matriz resultante da soma
        System.out.println("Matriz resultante da soma da matriz 1 com a matriz 2:");
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[0].length; j++) {
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        }

        // Realizando a multiplicação escalar por 4 da matriz 2 e criando nova matriz
        int[][] matriz2_mult_escalar = new int[matriz2.length][matriz2[0].length];
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz2_mult_escalar[i][j] = matriz2[i][j] * 4;
            }
        }

        // Printando a nova matriz resultante da multiplicação escalar
        System.out.println("Nova matriz resultante da multiplicação escalar por 4 da matriz 2:");
        for (int i = 0; i < matriz2_mult_escalar.length; i++) {
            for (int j = 0; j < matriz2_mult_escalar[0].length; j++) {
                System.out.print(matriz2_mult_escalar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
