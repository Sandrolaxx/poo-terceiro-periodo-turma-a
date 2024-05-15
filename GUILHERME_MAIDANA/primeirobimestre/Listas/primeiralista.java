package primeirobimestre.Listas;
import java.util.Scanner;

public class primeiralista {

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
        

        System.out.println("Entre com uma opção. 1 para calcular o total da compra, 2 para calcular seu troco, 3 para sair");
        menu = scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.println("O total da sua compra é: " + calcularTotal(vetorTotal));
                break;
            case 2:
                System.out.println("O troco é: " + calcularTroco(vetorTotal, vetorZ));
                break;
            case 3:
                System.out.println("Saindo do programa.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
        scanner.close();
    }
}
