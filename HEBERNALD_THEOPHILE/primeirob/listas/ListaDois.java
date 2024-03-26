import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDois {

    private static List<Venda> regisDeVendas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            exibirMenu();
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    calPrecoTotal(scanner);
                    break;
                case 2:
                    registVenda(scanner);
                    break;
                case 3:
                    System.out.println("Obrigado por usar a calculadora da Dona Gabrielinha");
                    break;
                default:
                    System.out.println("Opção inválida.Escolha uma opção válida");
            }
        } while (escolha != 3);

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("\n==== Menu ====");
        System.out.println("[1] - Calcular Preço Total");
        System.out.println("[2] - Registrar Venda");
        System.out.println("[3] - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void calPrecoTotal(Scanner scanner) {
        System.out.print("Digitar a quantidade da planta vendida: ");
        int qtidade = scanner.nextInt();

        System.out.print("Digitar o preço unitário da planta: ");
        double precUnitario = scanner.nextDouble();

        double precTotal = qtidade * precUnitario;

        if (qtidade > 10) {
            double desconto = precTotal * 0.05;
            precTotal -= desconto;
            System.out.println("Desconto especial de 5% aplicado!");
        }

        System.out.println("Preço total da venda: R$" + precTotal);
    }

    public static void registVenda(Scanner scanner) {
        System.out.print("Digitar a quantidade da planta vendida: ");
        int qtidade = scanner.nextInt();

        System.out.print("Digitar o preço unitário da planta: ");
        double precUnitario = scanner.nextDouble();

        double precTotal = qtidade * precUnitario;
        double desconto = 0.0;

        if (qtidade > 10) {
            desconto = precTotal * 0.05;
            precTotal -= desconto;
            System.out.println("Desconto especial de 5% aplicado!");
        }

        regisDeVendas.add(new Venda(qtidade, precTotal, desconto));
        System.out.println("Venda registrada com sucesso!");
    }

    static class Venda {
        int qtidade;
        double valVenda;
        double descontoAplicado;

        public Venda(int qtidade, double valVenda, double descontoAplicado) {
            this.qtidade = qtidade;
            this.valVenda = valVenda;
            this.descontoAplicado = descontoAplicado;
        }
    }
}

 