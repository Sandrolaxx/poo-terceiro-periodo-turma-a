package exemplos;

public class AulaTres {

    public static void main(String[] args) {

        int[][] matrizDeclarada;
        int[][] matrizUm = new int[3][3];
        int[][] matrizDois = new int[][] { { 34, 14, 29, 33 }, { 62, 11, 73, 98 } };
        int[] vetor = new int[] { 23, 43, 65 };

        // System.out.println(matrizDois[1][1]);

        // for (int i = 0; i < vetor.length; i++) {
        // System.out.println("passou");

        // if (i == 1) {
        // continue;
        // }

        // System.out.println("passou AQUI!");
        // }

        // System.out.println("finalizou");

        System.out.print("[");
        for (int linha = 0; linha < matrizDois.length; linha++) {
            for (int coluna = 0; coluna < matrizDois[linha].length; coluna++) {
                System.out.print(coluna == 0 ? "" : ", ");
                System.out.print(matrizDois[linha][coluna]);
            }

            System.out.print(linha != matrizDois.length - 1 ? "\n" : "");
        }
        
        System.out.print("]");
    }

}
