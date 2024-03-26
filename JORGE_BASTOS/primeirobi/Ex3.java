package primeirobi;
import java.util.Scanner;

public class Ex3 {

    private static double[] vendasPorDia = new double[30]; 
    private static double[] vendasPorMes = new double[12]; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean opcao = false;
        int x;
        do {
            System.out.println("\nMenu:\n");
            System.out.println("1 Calcular Preço");
            System.out.println("2 Calcular Troco");
            System.out.println("3 Registro de Vendas");
            System.out.println("4 Consultar Vendas do Dia");
            System.out.println("5 Consultar Vendas do Mês");
            System.out.println("6 Sair");
            System.out.print("Escolha uma opção: ");
            x = scanner.nextInt();
            switch (x) {
                case 1:
                    calcPreco();
                    break;
                case 2:
                    calcTroco();
                    break;
                case 3:
                    registVenda();
                    break;
                case 4:
                    consultarVendasDia();
                    break;
                case 5:
                    consultarVendasMes();
                    break;
                case 6:
                    opcao = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (!opcao);
    }

    public static void calcPreco() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade do produto: ");
        int quantidade = scanner.nextInt();
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        double precoTot = quantidade * preco;
        if (quantidade > 10)
            precoTot *= 0.95;
        System.out.println("O preço total é: R$ " + precoTot);
    }

    public static void calcTroco() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor recebido pelo cliente: ");
        double valRecebido = scanner.nextDouble();
        System.out.print("Digite o valor total da compra: ");
        double valTotal = scanner.nextDouble();
        double troco = valRecebido - valTotal;
        if (troco < 0) {
            System.out.println("Valor recebido insuficiente.");
        } else {
            System.out.println("O troco a ser dado ao cliente é: R$ " + troco);
        }
    }

    public static void registVenda() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de produtos vendidos: ");
        int quantidade = scanner.nextInt();
        System.out.print("Digite o valor da venda: ");
        double valorVenda = scanner.nextDouble();
        double valorTotal = quantidade * valorVenda;
        if (quantidade > 10)
            valorTotal *= 0.95;
        System.out.println("Venda registrada: " + quantidade + " produtos vendidos por R$ " + valorTotal);

        int dia = getCurrentDay();
        vendasPorDia[dia] += valorTotal;

        int mes = getCurrentMonth();
        vendasPorMes[mes] += valorTotal;
    }

    public static void consultarVendasDia() {
        int dia = getCurrentDay();
        if (vendasPorDia[dia] != 0) {
            System.out.println("Total de vendas do dia " + dia + ": R$ " + vendasPorDia[dia]);
        } else {
            System.out.println("Não houve vendas registradas para o dia " + dia + ".");
        }
    }

    public static void consultarVendasMes() {
        int mes = getCurrentMonth();
        if (vendasPorMes[mes] != 0) {
            System.out.println("Total de vendas do mês " + mes + ": R$ " + vendasPorMes[mes]);
        } else {
            System.out.println("Não houve vendas registradas para o mês " + mes + ".");
        }
    }

    public static int getCurrentDay() {
        return 25; 
    }

    public static int getCurrentMonth() {
        return 3; 
    }
}
