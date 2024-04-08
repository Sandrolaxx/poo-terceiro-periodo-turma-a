package ITALLO_INGRATI_MARCORIN.primeirobi.exercicio3;
import java.util.Scanner;
public class Floricultura3 {
    static double[][] vendas = new double[12][30];
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean opcao = false;
            int x;
            do {
                System.out.println("\nMenu:\n");
                System.out.println("1 Calcular Preço");
                System.out.println("2 Calcular Troco");
                System.out.println("3 Registro de Vendas");
                System.out.println("4 Quantidade Total de Vendas");
                System.out.println("5 Sair");
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
                        qtdTotVendas();
                        break;
                    case 5:
                        opcao = true;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } while (!opcao);
        }
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
        System.out.print("Digite o número do mês (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Digite o dia do mês (1-30): ");
        int dia = scanner.nextInt();
        System.out.print("Digite a quantidade de produtos vendidos: ");
        int quantidade = scanner.nextInt();
        System.out.print("Digite o valor da venda: ");
        double valorVenda = scanner.nextDouble();
        vendas[mes - 1][dia - 1] += valorVenda;
        System.out.println("Venda registrada: " + quantidade + " produtos vendidos por R$ " + valorVenda + " no dia " + dia + " do mês " + mes);
    }
    public static void qtdTotVendas() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do mês (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Digite o dia do mês (1-30): ");
        int dia = scanner.nextInt();
        double totalVendas = vendas[mes - 1][dia - 1];
        System.out.println("Quantidade total de vendas para o dia " + dia + " do mês " + mes + ": R$ " + totalVendas);
    }
}