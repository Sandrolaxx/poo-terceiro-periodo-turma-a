package primeirobi.exemplos;

public class AulaTrês {
    public static void main(String[] args) {
        int[][] matriz = new int[][] {{32,14},{62,11}};
        System.out.println(matriz[0][0]); // 32
        System.out.println(matriz[0][1]); // 14
        System.out.println(matriz[1][0]); // 62
        System.out.println(matriz[1][1]); // 11

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Linha " + i + " e Coluna " + j + " é de " + matriz[i][j]);
            }
        }
    }
}
