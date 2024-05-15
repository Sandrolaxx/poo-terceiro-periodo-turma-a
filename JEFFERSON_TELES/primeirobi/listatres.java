package primeirobi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class listatres {

    private static final Scanner scanner = new Scanner(System.in);
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static final int MAX_VENDAS = 100;
    public static Venda[] vendas = new Venda[MAX_VENDAS];
    public static int numVendas = 0;
    private static final double[][] vendasMensais = new double[30][12];

    public static void main(String[] args) {
        exibirMenu();
    }

    private static void exibirMenu() {
        System.out.println("\n-MENUZINHO-\n");
        System.out.println("1. CALCULAR PRECO TOTAL");
        System.out.println("2. CALCULAR TROCO");
        System.out.println("3. DESCONTO ESPECIAL");
        System.out.println("4. REGISTRAR VENDA");
        System.out.println("5. SALVAR VENDAS TOTAIS DO DIA");
        System.out.println("6. BUSCAR VENDAS TOTAIS POR DIA E MÊS");
        System.out.println("7. SAIR");

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
                salvarVendasTotais();
                break;
            case 6:
                buscarVendasPorDiaMes();
                break;
            case 7:
                System.out.println("VALEU POR USAR A CALCULADORA");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        if (opcao != 7) {
            exibirMenu();
        }
    }

    private static void calculaoPrecoTotal() {
        
    }

    private static void calculaoTroco() {
        
    }

    private static void descontoEspecial() {
       
    }

    private static void registroVendas() {
        
    }

    private static void salvarVendasTotais() {
        System.out.println("INSIRA O DIA DO MES PARA SALVAR A VENDA, DIA 1 A 30:");
        int dia = scanner.nextInt() - 1; 

        System.out.println("INSIRA O MES DE 1 A 12:");
        int mes = scanner.nextInt() - 1;

        System.out.println("INSIRA A QUANTIDADE TOTAL DE VENDAS PARA O DIA");
        double vendas = scanner.nextDouble();

        vendasMensais[dia][mes] = vendas;
        System.out.println("VENDAS TOTAIS DO DIA SALVA");
    }

    private static void buscarVendasPorDiaMes() {
        System.out.println("INSIRA O DIA DO MES DE 1 A 30:");
        int dia = scanner.nextInt() - 1;

        System.out.println("INSIRA O MES DE 1 A 12:");
        int mes = scanner.nextInt() - 1;

        double vendas = vendasMensais[dia][mes];

        if (vendas != 0) {
            System.out.printf("VENDA TORAL DO DIA %d MES %d: %s\n", dia + 1, mes + 1, df.format(vendas));
        } else {
            System.out.println("NENHUMA VENDA ENCONTRADA");
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
