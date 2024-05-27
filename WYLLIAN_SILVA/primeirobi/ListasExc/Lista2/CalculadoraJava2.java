package primeirobi.ListasExc;

import java.util.Scanner;
import java.util.ArrayList;

public class CalculadoraJava2 {

    static ArrayList<Venda> registro = new ArrayList<>();
    
    public static void main(String[] args) {

        System.out.println("Selecionea sua opção");
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {

            menuopcoes();
            opcao = scanner.nextInt();

            switch (opcao){

                case 1:
                    precototal(scanner);
                    break;
                case 2:
                    trocototal(scanner);
                    break;
                case 3:
                    registroVendas(scanner);
                    break;
                case 4:
                    System.out.println("Saindo da calculadora");
                    break;
                default:
                System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        scanner.close();

    }

    public static void menuopcoes() {

        System.out.println("1 - Calcular preço total");
        System.out.println("2 - Calcular troco");
        System.out.println("3 - Registro de vendas");
        System.out.println("4 - Sair da calculadora");
    }

    public static void precototal(Scanner scanner) {

        System.out.println("Quantas plantas foram compradas?");
        int x = scanner.nextInt();

        System.out.println("Qual o valor da planta?");
        int y = scanner.nextInt();

        double precoplanta = x * y;
        double descontoVenda = 0;

        if (x > 10) {
            descontoVenda = precoplanta * 0.05;
            precoplanta -= descontoVenda;
            System.out.println("Desconto de 5% foi aplicado");
            System.out.println("Total da venda com o desconto ficou: R$" +precoplanta);
        }else{
            System.out.println("O preço total ficou: R$" +precoplanta);
        }
        registro.add(new Venda(x,precoplanta, descontoVenda));
    }

    public static void trocototal(Scanner scanner) {

        System.out.println("Qual foi o valor total da compra?");
        int z = scanner.nextInt();

        System.out.println("Qual foi o valor pago?");
        int n = scanner.nextInt();

        double troco = n - z;
        
        if (troco >= 0){

        System.out.println("O troco ficou: R$" +troco);

        }else{
            System.out.println("Valor insuficiente");
        }
    }

    public static void registroVendas(Scanner scanner) {
        System.out.println("Abrindo o registro de vendas...");
        for (Venda venda : registro) {
            System.out.println("Quantidade de vendas: " +venda.quant+ ", Valor das vendas: " +venda.valorVenda+ ", Descontos aplicados: " +venda.descontoTotal);
        }
    }
    
    static class Venda {
        int quant;
        double valorVenda;
        double descontoTotal;

        public Venda(int quant, double valorVenda, double descontoTotal) {
        this.quant = quant;
        this.valorVenda = valorVenda;
        this.descontoTotal = descontoTotal;
        }
    }

}


