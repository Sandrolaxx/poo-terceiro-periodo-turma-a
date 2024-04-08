package primeirobi;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Olá");

        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            exibirMenu();
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    calcularPrecoTotal(scanner);
                    break;
                case 2:
                    calcularTroco(scanner);
                    break;
                case 3:
                    System.out.println("Obrigado por usar a calculadora!");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha uma opção válida.");
            }
        } while (escolha != 3);

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("\n==== Menu ====");
        System.out.println("[1] - Calcular Preço Total");
        System.out.println("[2] - Calcular Troco");
        System.out.println("[3] - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void calcularPrecoTotal(Scanner scanner) {
        System.out.print("Digite a quantidade da planta que foi vendida: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço unitário da planta: ");
        double precoUnitario = scanner.nextDouble();

        double precoTotal = quantidade * precoUnitario;
        System.out.println("Preço total da venda: R$" + precoTotal);
    }

    public static void calcularTroco(Scanner scanner) {
        System.out.print("Digite o valor total da compra: R$");
        double valorTotal = scanner.nextDouble();

        System.out.print("Digite o valor recebido pelo cliente: R$");
        double valorRecebido = scanner.nextDouble();

        double troco = valorRecebido - valorTotal;
        if (troco >= 0) {
            System.out.println("Troco a ser dado ao cliente: R$" + troco);
        } else {
            System.out.println("O valor recebido é insuficiente para pagar a compra.");
        }
    }
}
