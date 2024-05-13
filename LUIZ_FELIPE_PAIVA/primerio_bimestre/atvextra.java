package primerio_bimestre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atvextra {
    static List<Pedido> listaPedidos = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma das 4 opções:\n Opção 1 = Calcular preço total  \n Opção 2 = Calcular troco  \n Opção 3 = Registro de Vendas \n Opção 4 = Sair");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                calcularPrecoTotal(scanner);
                break;

            case 2:
                calcularTroco(scanner);
                break;

            case 3:
                exibirRegistroVendas();
                break;

            case 4:
                System.out.println("Encerrando programa");
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }

        scanner.close();
    }

    private static void calcularPrecoTotal(Scanner scanner) {
        System.out.println("Informe o número de plantas");
        int quantidadePlantas = scanner.nextInt();
        System.out.println("Informe o preço da planta");
        double precoPlanta = scanner.nextDouble();
        double valorTotal = quantidadePlantas * precoPlanta;

        if (quantidadePlantas > 10) {
            double desconto = 0.05 * valorTotal;
            valorTotal -= desconto;
        }

        listaPedidos.add(new Pedido(quantidadePlantas, valorTotal));
        System.out.println("O valor total foi " + valorTotal);
    }

    private static void calcularTroco(Scanner scanner) {
        System.out.println("Informe o número de plantas");
        int quantidadePlantas = scanner.nextInt();
        System.out.println("Informe o preço da planta");
        double precoPlanta = scanner.nextDouble();
        System.out.println("Informe o valor total pago pelo cliente");
        double precoTotal = scanner.nextDouble();
        double valorTotal = quantidadePlantas * precoPlanta;

        double troco = precoTotal - valorTotal;
        System.out.println("O valor total do troco será: " + troco);
    }

    private static void exibirRegistroVendas() {
        System.out.println("Registro de Vendas:");
        System.out.println("Quantidade de plantas vendidas: " + listaPedidos.stream().mapToInt(Pedido::getQuantidadePlantas).sum());
        System.out.println("Valor total de vendas: " + listaPedidos.stream().mapToDouble(Pedido::getValorTotal).sum());
        System.out.println("Total de descontos aplicados: " + listaPedidos.stream().mapToDouble(Pedido::getDesconto).sum());
    }

    static class Pedido {
        private int quantidadePlantas;
        private double valorTotal;
        private double desconto;

        public Pedido(int quantidadePlantas, double valorTotal) {
            this.quantidadePlantas = quantidadePlantas;
            this.valorTotal = valorTotal;
            if (quantidadePlantas > 10) {
                this.desconto = 0.05 * valorTotal;
                this.valorTotal -= this.desconto;
            }
        }

        public int getQuantidadePlantas() {
            return quantidadePlantas;
        }

        public double getValorTotal() {
            return valorTotal;
        }

        public double getDesconto() {
            return desconto;
    
        }
    }
}
