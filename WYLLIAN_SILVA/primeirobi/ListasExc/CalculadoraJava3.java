package primeirobi.ListasExc;

import java.util.Scanner;
import java.util.ArrayList;

public class CalculadoraJava3 {

    static double[][] vendaDiaMes = new double[30][12];

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
                    calendarioVendas(scanner);
                case 5:
                    System.out.println("Saindo da calculadora");
                    break;
                default:
                System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        scanner.close();

    }

    public static void menuopcoes() {

        System.out.println("1 - Calcular preço total");
        System.out.println("2 - Calcular troco");
        System.out.println("3 - Registro de vendas");
        System.out.println("4 - Calendário de vendas");
        System.out.println("5 - Sair da calculadora");
    }

    public static void precototal(Scanner scanner) {

        System.out.println("Quantas plantas foram compradas?");
        int x = scanner.nextInt();

        System.out.println("Qual o valor da planta?");
        int y = scanner.nextInt();
        
        System.out.println("Qual é o dia? (1-30)");
        int diaCalendario = scanner.nextInt();

        System.out.println("Qual é o mês? (1-12)");
        int mesCalendario = scanner.nextInt();

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
        registro.add(new Venda(x,precoplanta, descontoVenda, diaCalendario, mesCalendario));
        registrarVendasCalendario(diaCalendario, mesCalendario, precoplanta);

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
            System.out.println("Quantidade de vendas: " +venda.quant+ ", Valor das vendas: " +venda.valorVenda+ ", Descontos aplicados: " +venda.descontoTotal+ ", Data: " +venda.diaCalendario+ "/" +venda.mesCalendario);
        }
    }

    public static void registrarVendasCalendario(int diaCalendario, int mesCalendario, double valorVenda) {
        vendaDiaMes[diaCalendario - 1][mesCalendario - 1] += valorVenda;
    }

    public static void calendarioVendas(Scanner scanner) {

        System.out.println("Digite o dia (1-30):");
        int diaCalendario = scanner.nextInt();
        System.out.println("Digite o mês (1-12):");
        int mesCalendario = scanner.nextInt();

        if (diaCalendario >= 1 && diaCalendario <=30 && mesCalendario >= 1 && mesCalendario <= 12) {
            double vendasCalentarioTotal = vendaDiaMes[diaCalendario - 1][mesCalendario -1];
            System.out.println("Vendas no dia " +diaCalendario+ "do mês " +mesCalendario+ "foram: R$ " +vendasCalentarioTotal);
        }else{
            System.out.println("Erro: dia ou mês estão invalidos");
        }
    }
    
    static class Venda {
        int quant;
        double valorVenda;
        double descontoTotal;
        int diaCalendario;
        int mesCalendario;


        public Venda(int quant, double valorVenda, double descontoTotal, int diaCalendario, int mesCalendario) {
        this.quant = quant;
        this.valorVenda = valorVenda;
        this.descontoTotal = descontoTotal;
        this.diaCalendario = diaCalendario;
        this.mesCalendario = mesCalendario;

        }
    }
    
}
