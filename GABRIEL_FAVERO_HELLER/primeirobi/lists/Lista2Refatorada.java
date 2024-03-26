package primeirobi.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista2Refatorada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        List<Sale> sales = new ArrayList<>();

        do {
            exibirMenu();
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    calcularPrecoTotal(sales, scanner);
                    break;
                case 2:
                    calcularTotalVendas(sales);
                    break;
                case 3:
                    registroVendas(sales);
                    break;
                case 4:
                    System.out.println("\nPrograma finalizado");
                    break;
                default:
                    System.out.println("\nOpção inválida");
                    break;
            }

        } while (opcao != 4);
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n[1] - Registrar venda");
        System.out.println("[2] - Calcular total de vendas");
        System.out.println("[3] - Registro vendas");
        System.out.println("[4] - Sair");
    }

    private static void calcularPrecoTotal(List<Sale> sales, Scanner scanner) {
        System.out.print("\nQuantidade de plantas: ");
        int quantidade = scanner.nextInt();
        System.out.print("Preço unitário da planta: ");
        double preco = scanner.nextDouble();
        double precoTotal = quantidade * preco;
        double desconto = 0;
        if (quantidade < 10) {
            System.out.println("Preço total: R$ " + precoTotal);
        } else {
            desconto = 0.05;
            precoTotal = (preco * quantidade) - (preco * quantidade * 0.05);
            System.out.println("Preço com desconto é R$ " + precoTotal);
        }
        Sale sale = new Sale(quantidade, preco, precoTotal, desconto);
        sales.add(sale);
        System.out.println("Venda realizada com sucesso!");
    }

    private static void calcularTotalVendas(List<Sale> sales) {
        double total = sales.stream()
                .mapToDouble(Sale::getPrecoTotal)
                .reduce(0, Double::sum);
        System.out.printf("Total de vendas: R$ %.2f%n", total);
    }

    private static void registroVendas(List<Sale> sales) {
        System.out.println("\nRegistro de vendas:");
        sales.forEach(System.out::println);
    }
}

class Sale {
    private final int quantidade;
    private final double preco;
    private final double precoTotal;
    private final double desconto;

    public Sale(int quantidade, double preco, double precoTotal, double desconto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.precoTotal = precoTotal;
        this.desconto = desconto;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public String toString() {
        return String.format("\nQuantidade: %d \nPreço Unitário: R$ %.2f \nDesconto: %.0f%% \nPreço total: R$ %.2f",
                quantidade, preco, desconto * 100, precoTotal);
    }
}