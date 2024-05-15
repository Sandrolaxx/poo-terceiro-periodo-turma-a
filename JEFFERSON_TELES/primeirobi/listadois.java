package primeirobi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class listadois {

    private static final Scanner scanner = new Scanner(System.in);
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static final int MAX_VENDAS = 100; 
    private static Venda[] vendas = new Venda[MAX_VENDAS];
    private static int numVendas = 0; 

    public static void main(String[] args) {
        exibirMenu();
    }

    private static void exibirMenu() {
        System.out.println("\n-MENUZINHO-\n");
        System.out.println("1. CALCULAR PRECO TOTAL");
        System.out.println("2. CALCULAR TROCO");
        System.out.println("3. DESCONTO ESPECIAL");
        System.out.println("4. REGISTRAR VENDA");
        System.out.println("5. SAIR");

        System.out.println("INSIRA A OPCAO DESEJADA:");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                calculaoPrecoTotal();
                break;
            case 2:
                calculaoTroco();
                break;
            case 3:
                descontoEspecial();
                break;
            case 4:
                registroVendas();
                break;
            case 5:
                System.out.println("VALEU POR USAR A CALCULADORA");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        if (opcao != 5) {
            exibirMenu();
        }
    }

    private static void calculaoPrecoTotal() {
        System.out.println("INSIRA A QUANTIDADE DE PLANTA:");
        int quantidade = scanner.nextInt();

        System.out.println("INSIRA O PRECO DA PLANTA:");
        double precounitario = scanner.nextDouble();

        double precototal = quantidade * precounitario;

        if (quantidade > 10) {
            precototal *= 0.95; 
        }

        System.out.printf("O PRECO TOTAL DA VENDA E: R$ %s\n", df.format(precototal));
    }

    private static void calculaoTroco() {
        System.out.println("QUANTO QUE O CLIENTE PAGOU:");
        double valorpg = scanner.nextDouble();

        System.out.println("QUANTO DEU A COMPRA?");
        double valortotal = scanner.nextDouble();

        double troco = valorpg - valortotal;

        System.out.printf("VOCE TEM QUE VOLTAR PARA O CLIENTE: R$ %s\n", df.format(troco));
    }

    private static void descontoEspecial() {
        System.out.println("INSIRA A QUANTIDADE DE PLANTAS");
        int quantidade = scanner.nextInt();

        if (quantidade > 10) {
            System.out.println("DESCONTO DE 5% APLICADO");
        } else {
            System.out.println("NENHUM DESCONTO DISPONIVEL");
        }
    }

    private static void registroVendas() {
        if (numVendas < MAX_VENDAS) {
            System.out.println("INSIRA A QUANTIDADE DE PLANTAS VENDIDAS:");
            int quantidade = scanner.nextInt();

            System.out.println("INSIRA O VALOR DA VENDA");
            double valorVenda = scanner.nextDouble();

            System.out.println("INSIRA O DESCONTO APLICADO:");
            double desconto = scanner.nextDouble();

            vendas[numVendas] = new Venda(quantidade, valorVenda, desconto);
            numVendas++;

            System.out.println("SUA VENDA FOI REGISTRADA!");
        } else {
            System.out.println("IMPOSSIVEL ADICONAR MAIS VENDAS, LIMITE ATINGIDO");
        }
    }

     public static class Venda {
        int quantidade;
        double valorVenda;
        double desconto;

        public Venda(int quantidade, double valorVenda, double desconto) {
            this.quantidade = quantidade;
            this.valorVenda = valorVenda;
            this.desconto = desconto;
        }
    }
}
