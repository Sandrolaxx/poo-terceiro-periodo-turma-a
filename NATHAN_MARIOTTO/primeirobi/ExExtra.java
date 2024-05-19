import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Venda {
    int quantidade;
    double valorVenda;
    double desconto;

    Venda(int quantidade, double valorVenda, double desconto) {
        this.quantidade = quantidade;
        this.valorVenda = valorVenda;
        this.desconto = desconto;
    }

    double getValorVenda() {
        return valorVenda;
    }
}

public class ExExtra {
    private static final List<Venda> registroVendas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("[1] - Calcular e Registrar Venda");
            System.out.println("[2] - Visualizar Registro de Vendas");
            System.out.println("[3] - Visualizar Soma dos Valores dos Pedidos");
            System.out.println("[4] - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calcularERegistrarVenda(scanner);
                    break;
                case 2:
                    visualizarRegistros();
                    break;
                case 3:
                    visualizarSomaValoresPedidos();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (opcao != 4);
        scanner.close();
    }

    private static void calcularERegistrarVenda(Scanner scanner) {
        System.out.print("Digite a quantidade da planta: ");
        int quantidade = scanner.nextInt();
        System.out.print("Digite o preço unitário da planta: ");
        double precoUnitario = scanner.nextDouble();

        double precoTotal = quantidade * precoUnitario;
        double desconto = 0;

        if (quantidade > 10) {
            desconto = precoTotal * 0.05; // Desconto de 5%
            precoTotal -= desconto;
            System.out.println("Desconto especial aplicado!");
        }

        System.out.printf("O preço total da venda, com desconto, é: R$%.2f\n", precoTotal);
        registroVendas.add(new Venda(quantidade, precoTotal, desconto));
    }

    private static void visualizarRegistros() {
        if (registroVendas.isEmpty()) {
            System.out.println("Não há vendas registradas.");
            return;
        }

        System.out.println("Registro de Vendas:");
        registroVendas.forEach(venda -> 
            System.out.printf("Quantidade: %d, Valor da Venda: R$%.2f, Desconto: R$%.2f\n", 
                              venda.quantidade, venda.valorVenda, venda.desconto));
    }

    private static void visualizarSomaValoresPedidos() {
        double somaTotal = registroVendas.stream()
                                         .mapToDouble(Venda::getValorVenda)
                                         .reduce(0, Double::sum);
        System.out.printf("A soma total dos valores dos pedidos é: R$%.2f\n", somaTotal);
    }
}
