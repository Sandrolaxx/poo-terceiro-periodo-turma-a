package atividades1B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atv3 {
    private static List<Sale> sales = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display the menu
            displayMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    totalPriceCalculation(scanner);
                    break;
                case 2:
                    calculateChange(scanner);
                    break;
                case 3:
                    displaySalesHistory();
                    break;
                case 4:
                    System.out.println("Saindo do aplicativo...");
                    break;
                default:
                    System.out.println("Escolha inválida. Por favor, tente novamente.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Display the menu
    private static void displayMenu() {
        System.out.println("\n[1] - Calcular preço total");
        System.out.println("[2] - Calcular troco");
        System.out.println("[3] - Histórico de vendas");
        System.out.println("[4] - Sair");
        System.out.print("Digite sua escolha: ");
    }

    // Total price calculation
    private static void totalPriceCalculation(Scanner scanner) {
        System.out.print("Digite a quantidade de plantas: ");
        int quantity = scanner.nextInt();
        System.out.print("Digite o preço por unidade: ");
        double pricePerUnit = scanner.nextDouble();
        double totalPrice = applySpecialDiscount(quantity, pricePerUnit);
        System.out.printf("O preço total é: %.2f\n", totalPrice);
        recordSale(quantity, totalPrice);
    }

    // Apply special discount
    private static double applySpecialDiscount(int quantity, double pricePerUnit) {
        if (quantity >= 10) {
            double discount = pricePerUnit * 0.05;
            return quantity * (pricePerUnit - discount);
        } else {
            return calculateTotalPrice(quantity, pricePerUnit);
        }
    }

    // Calculate total price
    private static double calculateTotalPrice(int quantity, double pricePerUnit) {
        return quantity * pricePerUnit;
    }

    // Calculate change
    private static void calculateChange(Scanner scanner) {
        System.out.print("Digite o valor pago pelo cliente: ");
        double amountPaid = scanner.nextDouble();
        System.out.print("Digite o custo total da compra: ");
        double totalCost = scanner.nextDouble();
        double change = calculateTotalCost(amountPaid, totalCost);
        System.out.printf("O troco é: %.2f\n", change);
    }

    // Calculate total cost
    private static double calculateTotalCost(double amountPaid, double totalPrice) {
       return amountPaid - totalPrice;
    }

    // Record a sale
    private static void recordSale(int quantity, double totalPrice) {
        Sale sale = new Sale(quantity, totalPrice);
        sales.add(sale);
        System.out.println("Venda registrada com sucesso:");
        System.out.println("Quantidade de plantas: " + quantity);
        System.out.printf("Preço total: %.2f\n", totalPrice);
    }

    // Display sales history
    private static void displaySalesHistory() {
        System.out.println("Histórico de vendas:");
        for (Sale sale : sales) {
            System.out.println("Quantidade de plantas: " + sale.quantity());
            System.out.printf("Preço total: %.2f\n", sale.totalPrice());
            System.out.println("-------------------------");
        }
    }

    // Class Sale
    public record Sale(int quantity, double totalPrice) {
    }
}