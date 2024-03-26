package primeirobi.atividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atividadeExtra01 {
    // Lista para armazenar as vendas realizadas
    private static List<Venda> registroVendas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option;

        do {
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Registrar Venda");
            System.out.println("[4] - Sair");

            System.out.print("Escolha uma opção: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    calculateTotalPrice(input);
                    break;
                case 2:
                    calculateChange(input);
                    break;
                case 3:
                    registrarVenda(input);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 4);

        input.close();
    }

    public static void calculateTotalPrice(Scanner input) {
        System.out.print("Digite a quantidade da planta vendida: ");
        int quantity = input.nextInt();

        System.out.print("Digite o preço unitário da planta: ");
        double unitPrice = input.nextDouble();

        double totalPrice = quantity * unitPrice;

        // Verifica se tem desconto especial
        if (quantity > 10) {
            double discount = 0.05 * totalPrice;
            totalPrice -= discount;
            System.out.println("Desconto Especial de 5% aplicado!");
        }

        System.out.println("O preço total é: " + totalPrice);
    }

    public static void calculateChange(Scanner input) {
        System.out.print("Digite o valor recebido pelo cliente: ");
        double amountReceived = input.nextDouble();

        System.out.print("Digite o valor total da compra: ");
        double totalAmount = input.nextDouble();

        double change = amountReceived - totalAmount;
        System.out.println("O troco a ser dado ao cliente é: " + change);
    }

    public static void registrarVenda(Scanner input) {
        System.out.print("Digite a quantidade de plantas vendidas: ");
        int quantidade = input.nextInt();

        System.out.print("Digite o preço total da venda: ");
        double precoTotal = input.nextDouble();

        // Adiciona a venda ao registro
        registroVendas.add(new Venda(quantidade, precoTotal));

        System.out.println("Venda registrada com sucesso!");
    }

    public static double somarTotalVendas() {
        return registroVendas.stream()
                .mapToDouble(Venda::getPrecoTotal)
                .sum();
    }
}

class Venda {
    private int quantidade;
    private double precoTotal;

    public Venda(int quantidade, double precoTotal) {
        this.quantidade = quantidade;
        this.precoTotal = precoTotal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }
}
