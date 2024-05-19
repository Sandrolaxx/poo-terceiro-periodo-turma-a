package primeirobi.floricultura;

import java.util.Scanner;

public class exercicio1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("[1] - Calcular Preço Total \n[2] - Calcular Troco\n[3] - Sair");
           
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    calcularPrecoTotal(scanner);
                    break;
                case 2:
                    calcularTroco(scanner);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void calcularPrecoTotal(Scanner scanner) {
        System.out.print("Quantidade da planta: ");
        int quantidade = scanner.nextInt();

        System.out.print("Preço unitário da planta: ");
        double precoUnitario = scanner.nextDouble();

        double precoTotal = quantidade * precoUnitario;

        System.out.println("Preço total: " + precoTotal);
    }

    private static void calcularTroco(Scanner scanner) {
        System.out.print("Valor recebido: ");
        double valorRecebido = scanner.nextDouble();

        System.out.print("Valor total da compra: ");
        double valorTotalCompra = scanner.nextDouble();

        double troco = valorRecebido - valorTotalCompra;

        System.out.println((troco >= 0) ? "Troco: " + troco : "Valor insuficiente. Cliente precisa pagar mais.");
    }
}