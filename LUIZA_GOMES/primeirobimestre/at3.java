package primeirobimestre;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class at3 {

    static int totalPlantasVendidas = 0;
    static double totalValorVenda = 0;
    static double totalDescontoAplicado = 0;
    static Map<Integer, Map<Integer, Integer>> vendasPorMesDia = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            exibirMenu();
            escolha = scanner.nextInt();

            switch (escolha) {
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
                    exibirVendasPorMesDia(scanner);
                    break;
                case 5:
                    System.out.println("Obrigado por utilizar a calculadora de vendas!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

        } while (escolha != 5);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n*** Menu da Calculadora de Vendas ***");
        System.out.println("[1] - Calcular Preço Total");
        System.out.println("[2] - Calcular Troco");
        System.out.println("[3] - Exibir Registro de Vendas");
        System.out.println("[4] - Exibir Vendas por Mês e Dia");
        System.out.println("[5] - Sair");
        System.out.print("Escolha a opção desejada: ");
    }

    private static void calcularPrecoTotal(Scanner scanner) {
        System.out.print("Digite a quantidade de plantas vendidas: ");
        int quantidade = scanner.nextInt();
        totalPlantasVendidas += quantidade;

        System.out.print("Digite o preço unitário da planta: ");
        double precoUnitario = scanner.nextDouble();

        double precoTotal = quantidade * precoUnitario;
        if (quantidade > 10) {
            double desconto = precoTotal * 0.05;
            precoTotal -= desconto;
            totalDescontoAplicado += desconto;
        }
        totalValorVenda += precoTotal;

        // Atualizar as vendas por mês e dia
        int dia = java.time.LocalDate.now().getDayOfMonth();
        int mes = java.time.LocalDate.now().getMonthValue();

        Map<Integer, Integer> vendasPorDia = vendasPorMesDia.getOrDefault(mes, new HashMap<>());
        vendasPorDia.put(dia, vendasPorDia.getOrDefault(dia, 0) + quantidade);
        vendasPorMesDia.put(mes, vendasPorDia);

        System.out.println("O preço total da venda é: R$" + precoTotal);
    }

    private static void calcularTroco(Scanner scanner) {
        System.out.print("Digite o valor recebido pelo cliente: R$");
        double valorRecebido = scanner.nextDouble();

        System.out.print("Digite o valor total da compra: R$");
        double valorTotalCompra = scanner.nextDouble();

        double troco = valorRecebido - valorTotalCompra;
        System.out.println("O troco a ser dado ao cliente é: R$" + troco);
    }

    private static void exibirRegistroVendas() {
        System.out.println("\n*** Registro de Vendas ***");
        // Exibe o registro de vendas
    }

    private static void exibirVendasPorMesDia(Scanner scanner) {
        System.out.println("\n*** Buscar Vendas por Mês e Dia ***");
        System.out.print("Digite o mês (1 a 12): ");
        int mes = scanner.nextInt();
        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        Map<Integer, Integer> vendasPorDia = vendasPorMesDia.getOrDefault(mes, new HashMap<>());
        int vendas = vendasPorDia.getOrDefault(dia, 0);

        System.out.println("Total de vendas no dia " + dia + " do mês " + mes + ": " + vendas);
    }
}
