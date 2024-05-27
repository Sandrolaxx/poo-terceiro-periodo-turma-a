import java.util.Scanner;

public class CalculadoraDeVendas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu:");
            System.out.println("1 - Calcular Preço Total");
            System.out.println("2 - Calcular Troco");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calcularPrecoTotal(scanner);
                    break;
                case 2:
                    calcularTroco(scanner);
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, tente novamente.");
            }
        }

        scanner.close();
        System.out.println("Obrigado por usar a calculadora. Até mais!");
    }

    private static void calcularPrecoTotal(Scanner scanner) {
        System.out.print("Informe a quantidade da planta: ");
        int quantidade = scanner.nextInt();
        System.out.print("Informe o preço unitário da planta: ");
        double precoUnitario = scanner.nextDouble();

        double precoTotal = quantidade * precoUnitario;
        System.out.println("Preço total da venda: " + precoTotal);
    }

    private static void calcularTroco(Scanner scanner) {
        System.out.print("Valor recebido do cliente: ");
        double valorRecebido = scanner.nextDouble();
        System.out.print("Valor total da compra: ");
        double valorTotal = scanner.nextDouble();

        double troco = valorRecebido - valorTotal;
        System.out.println("Troco a ser dado ao cliente: " + troco);
    }
}
