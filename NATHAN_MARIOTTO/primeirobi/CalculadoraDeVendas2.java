import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraDeVendas2 {

    // Estrutura para armazenar os registros de vendas
    static ArrayList<Venda> registrosDeVendas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu:");
            System.out.println("1 - Registrar Venda");
            System.out.println("2 - Exibir Registros de Vendas");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    registrarVenda(scanner);
                    break;
                case 2:
                    exibirRegistrosDeVendas();
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

    private static void registrarVenda(Scanner scanner) {
        System.out.print("Informe a quantidade da planta: ");
        int quantidade = scanner.nextInt();
        System.out.print("Informe o preço unitário da planta: ");
        double precoUnitario = scanner.nextDouble();

        double precoTotal = quantidade * precoUnitario;
        double descontoAplicado = 0;
        if (quantidade > 10) {
            descontoAplicado = precoTotal * 0.05; // 5% de desconto
            precoTotal -= descontoAplicado;
        }

        // Adicionando registro de venda
        registrosDeVendas.add(new Venda(quantidade, precoUnitario, precoTotal, descontoAplicado));

        System.out.println("Preço total da venda (com desconto, se aplicável): " + precoTotal);
        if (descontoAplicado > 0) {
            System.out.println("Desconto aplicado: " + descontoAplicado);
        }
    }

    private static void exibirRegistrosDeVendas() {
        if (registrosDeVendas.isEmpty()) {
            System.out.println("Não há registros de vendas.");
            return;
        }
        for (Venda venda : registrosDeVendas) {
            System.out.println(venda);
        }
    }

    // Classe interna para representar uma venda
    static class Venda {
        int quantidade;
        double precoUnitario;
        double precoTotal;
        double descontoAplicado;

        public Venda(int quantidade, double precoUnitario, double precoTotal, double descontoAplicado) {
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
            this.precoTotal = precoTotal;
            this.descontoAplicado = descontoAplicado;
        }

        @Override
        public String toString() {
            return "Venda [quantidade=" + quantidade + ", precoUnitario=" + precoUnitario + ", precoTotal=" + precoTotal
                    + ", descontoAplicado=" + descontoAplicado + "]";
        }
    }
}
