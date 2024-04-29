package primeirobi.atividades;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculadoraGab3 {
    private static Map<String, Double> vendasPorDia = new HashMap<>();
    private static Map<String, Double> vendasPorMes = new HashMap<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option;

        do {
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Registrar Venda");
            System.out.println("[4] - Buscar Vendas por Dia e Mês");
            System.out.println("[5] - Sair");

            System.out.print("Escolha uma opção: ");
            try {
                option = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido.");
                option = 0; // Definir como 0 para repetir o loop
                continue;
            }

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
                    buscarVendas(input);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 5);

        input.close();
    }

    public static void calculateTotalPrice(Scanner input) {
        System.out.print("Digite a quantidade da planta vendida: ");
        int quantity = input.nextInt();

        System.out.print("Digite o preço unitário da planta: ");
        double unitPrice = input.nextDouble();

        double totalPrice = quantity * unitPrice;

        // Verifica se tm desconto especial
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
        System.out.println("Digite o dia, mês e valor da venda (separados por espaço): ");
        try {
            String[] vendaInfo = input.nextLine().split(" ");
            if (vendaInfo.length != 3) {
                System.out.println("Por favor, insira todos os campos.");
                return;
            }
            String keyDia = vendaInfo[0] + "-" + vendaInfo[1];
            double valorVenda = Double.parseDouble(vendaInfo[2]);

            vendasPorDia.put(keyDia, vendasPorDia.getOrDefault(keyDia, 0.0) + valorVenda);
            vendasPorMes.put(vendaInfo[1], vendasPorMes.getOrDefault(vendaInfo[1], 0.0) + valorVenda);
        } catch (NumberFormatException e) {
            System.out.println("Valor da venda inválido. Por favor, insira um número válido.");
        }
    }

    public static void buscarVendas(Scanner input) {
        System.out.println("Digite o dia e mês (formato: dia mês): ");
        String[] buscaInfo = input.nextLine().split(" ");
        if (buscaInfo.length != 2) {
            System.out.println("Por favor, insira o dia e o mês.");
            return;
        }
        String keyDia = buscaInfo[0] + "-" + buscaInfo[1];
        double valorVendasDia = vendasPorDia.getOrDefault(keyDia, 0.0);
        System.out.println("Vendas no dia " + keyDia + ": " + valorVendasDia);

        String keyMes = buscaInfo[1];
        double valorVendasMes = vendasPorMes.getOrDefault(keyMes, 0.0);
        System.out.println("Vendas no mês " + keyMes + ": " + valorVendasMes);
    }
}
