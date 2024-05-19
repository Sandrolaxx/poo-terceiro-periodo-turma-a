package primeirobimestre.Primeirobimestre.Listas;

import java.util.Scanner;

public class listadois {

    // Função para calcular o total da compra
    public static int calcularTotal(int[] vetorTotal) {
        int total = 0;
        for (int valor : vetorTotal) {
            total += valor;
        }
        return total;
    }

    // Função para calcular o troco
    public static int calcularTroco(int[] vetorTotal, int[] vetorZ) {
        int troco = 0;
        for (int i = 0; i < vetorTotal.length; i++) {
            troco += vetorZ[i] - vetorTotal[i];
        }
        return troco;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorX = new int[3];
        int[] vetorY = new int[3];
        int[] vetorZ = new int[3];
        int[] vetorTotal = new int[3];
        int menu;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a quantidade de compras que você comprou:");
            vetorX[i] = scanner.nextInt();

            System.out.println("Digite o preço do produto:");
            vetorY[i] = scanner.nextInt();

            vetorTotal[i] = vetorY[i] * vetorX[i];

            System.out.println("Digite o valor recebido do cliente:");
            vetorZ[i] = scanner.nextInt();

            if (vetorX[i] >= 10) {
                vetorTotal[i] = (int) (vetorTotal[i] * 0.95); // Aplicar desconto de 5%
            }
        }

        do {
            System.out.println("Entre com uma opção:");
            System.out.println("1 - Calcular o total da compra");
            System.out.println("2 - Calcular seu troco");
            System.out.println("3 - Registrar venda");
            System.out.println("4 - Sair");

            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("O total da sua compra é: " + calcularTotal(vetorTotal));
                    break;
                case 2:
                    System.out.println("O troco é: " + calcularTroco(vetorTotal, vetorZ));
                    break;
                case 3:
                    // Registrar venda
                    System.out.println("Registrando venda.");
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (menu != 4);

        scanner.close();
    }
}
