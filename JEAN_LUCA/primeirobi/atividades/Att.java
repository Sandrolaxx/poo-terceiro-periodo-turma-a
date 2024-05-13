package primeirobi.atividades;

import java.util.Scanner;

public class Att {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("[1] calcular Preço Total");
            System.out.println("[2] calcular Troco");
            System.out.println("[3] sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    calcularPrecoTotal(scanner);
                    break;
                case 2:
                    calcularTroco(scanner);
                    break;
                case 3:
                    System.out.println("saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
        scanner.close();
    }

    private static void calcularPrecoTotal(Scanner scanner) {
        System.out.println("digite a quantidade da planta?");
        int quantidade = scanner.nextInt();
        System.out.println("digite o preço da planta?");
        float precoUnitario = scanner.nextFloat();
        float precoTotal = quantidade * precoUnitario;
        System.out.println("O preço total da venda é; R$ " + precoTotal);
    }

    private static void calcularTroco(Scanner scanner) {
        System.out.println("digite o valor recebido pelo cliente:  ");
        float valorRecebido = scanner.nextFloat();
        System.out.println("digite o valor total da compra: ");
        float valorTotal = scanner.nextFloat();
        float troco = valorRecebido - valorTotal;
        if (troco < 0) {
            System.out.println("O valor recebido é insuficiente!");
        } else {
            System.out.println("O troco a ser dado ao cliente é: R$" + troco);
        }
    }
}