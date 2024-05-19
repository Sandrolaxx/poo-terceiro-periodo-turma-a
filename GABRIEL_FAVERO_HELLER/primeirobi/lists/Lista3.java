package primeirobi.lists;

import java.util.Scanner;

public class Lista3 {

    public static int tamanho = 100;
    public static int contador = 0;
    public static int quantidadeRegistro[] = new int[tamanho];
    public static double precoRegistro[] = new double[tamanho];
    public static double descontoRegistro[] = new double[tamanho];
    public static double matrizDiaMes[][] = new double[12][30];
    public static int dia = 0;
    public static int mes = 0;
    public static double valor = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    calcularPrecoTotal(scanner);
                    break;
                case 2:
                    calcularTroco(scanner);
                    break;
                case 3:
                    registroVendas();
                    break;
                case 4:
                    registrarDiaMes(scanner);
                    break;
                case 5:
                    registroDiaMes(scanner);
                    break;
                case 6:
                    System.out.println("\nPrograma finalizado");
                    break;
                default:
                    System.out.println("\nOpção inválida");
                    break;
            }
        } while (opcao != 6);
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n[1] - Calcular preço total");
        System.out.println("[2] - Calcular troco");
        System.out.println("[3] - Registro de vendas");
        System.out.println("[4] - Registrar valor em dia e mês específico");
        System.out.println("[5] - Registro do valor do dia e mês específico");
        System.out.println("[6] - Sair");
        System.out.print("\nEscolha uma opção: ");
    }

    private static void calcularPrecoTotal(Scanner scanner) {
        System.out.print("\nQuantidade da planta: ");
        quantidadeRegistro[contador] = scanner.nextInt();
        System.out.print("Preço unitário da planta: ");
        precoRegistro[contador] = scanner.nextDouble();
        double precoTotal = quantidadeRegistro[contador] * precoRegistro[contador];
        double desconto = 0;
        if (quantidadeRegistro[contador] < 10) {
            System.out.println("Preço total: R$ " + precoTotal);
        } else {
            desconto = precoTotal * 0.95;
            System.out.println("Preço total com desconto: R$ " + desconto);
        }
        descontoRegistro[contador] = desconto;
        contador++;
    }

    private static void calcularTroco(Scanner scanner) {
        System.out.print("\nValor recebido: ");
        double valorRecebido = scanner.nextDouble();
        System.out.print("Valor total da compra: ");
        double valorTotalCompra = scanner.nextDouble();
        double troco = valorRecebido - valorTotalCompra;
        System.out.println("Troco: R$ " + troco);
    }

    private static void registroVendas() {
        for (int i = 0; i < contador; i++) {
            System.out.println("\nRegistro: " + i);
            System.out.println("Quantidade da planta: " + quantidadeRegistro[i]);
            System.out.println("Preço unitário da planta: " + precoRegistro[i]);
            System.out.println("Preço total: R$ " + precoRegistro[i] * quantidadeRegistro[i]);
            System.out.println("Preço total com desconto: R$ " + descontoRegistro[i]);
        }
    }

    private static void registrarDiaMes(Scanner scanner) {
        System.out.println("Qual o dia do mês que deseja registrar? (1-30)");
        dia = scanner.nextInt();
        while (dia < 1 || dia > 30) {
            System.out.println("Inválido! Por favor, insira um dia entre 1 e 30:");
            dia = scanner.nextInt();
        }
        System.out.println("Qual o mês do ano que deseja registrar? (1-12)");
        mes = scanner.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.println("Inválido! Por favor, insira um mês entre 1 e 12:");
            mes = scanner.nextInt();
        }
        System.out.println("Qual o valor a ser armazenado no dia " + dia + " do mês " + mes + "?");
        valor = scanner.nextDouble();
        matrizDiaMes[mes - 1][dia - 1] = valor;
    }

    private static void registroDiaMes(Scanner scanner) {
        System.out.println("Qual o dia do mês que deseja consultar? (1-30)");
        dia = scanner.nextInt();
        while (dia < 1 || dia > 30) {
            System.out.println("Inválido! Por favor, insira um dia entre 1 e 30:");
            dia = scanner.nextInt();
        }
        System.out.println("Qual o mês do ano que deseja consultar? (1-12)");
        mes = scanner.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.println("Inválido! Por favor, insira um mês entre 1 e 12:");
            mes = scanner.nextInt();
        }
        if (matrizDiaMes[mes - 1][dia - 1] == 0) {
            System.out.println("Não há nenhum registro de valor salvo nesse dia!");
        } else {
            System.out.println(
                    "O valor armazenado no dia " + dia + " do mês " + mes + " é: R$" + matrizDiaMes[mes - 1][dia - 1]);
        }
    }
}