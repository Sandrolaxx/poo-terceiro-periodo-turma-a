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
        // Implementação anterior
    }

    public static void calculateChange(Scanner input) {
        // Implementação anterior
    }

    public static void registrarVenda(Scanner input) {
        // Implementação anterior

        // Atualização dos registros de vendas por dia e por mês
        String keyDia = input.next() + "-" + input.next();
        double valorVenda = input.nextDouble();

        vendasPorDia.put(keyDia, vendasPorDia.getOrDefault(keyDia, 0.0) + valorVenda);

        String keyMes = input.next();
        vendasPorMes.put(keyMes, vendasPorMes.getOrDefault(keyMes, 0.0) + valorVenda);
    }

    public static void buscarVendas(Scanner input) {
        System.out.print("Digite o dia e mês (formato: dia-mês): ");
        String keyDia = input.next();
        double valorVendasDia = vendasPorDia.getOrDefault(keyDia, 0.0);
        System.out.println("Vendas no dia " + keyDia + ": " + valorVendasDia);

        System.out.print("Digite o mês: ");
        String keyMes = input.next();
        double valorVendasMes = vendasPorMes.getOrDefault(keyMes, 0.0);
        System.out.println("Vendas no mês " + keyMes + ": " + valorVendasMes);
    }
}
