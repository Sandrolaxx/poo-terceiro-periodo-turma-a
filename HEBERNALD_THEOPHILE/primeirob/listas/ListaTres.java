package primeirob.listas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ListaTres {

    private static Map<String, Map<Integer, Integer>> vendasPorMes = new HashMap<>();
    private static List<Venda> registrosDeVendas = new ArrayList<>();

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
                    regisVenda(scanner);
                    break;
                case 3:
                    exibirRegisDeVendas();
                    break;
                case 4:
                    salvVendasPorMes(scanner);
                    break;
                case 5:
                    buscVdasPorMes(scanner);
                    break;
                case 6:
                    System.out.println("Muito Obrigado por usar a calculadora da Dona Gabrielinha!");
                    break;
                default:
                    System.out.println("Opção inválida.escolha uma opção válida.");
            }
        } while (escolha != 6);

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("\n==== Menu ====");
        System.out.println("[1] - Calc Preço Total");
        System.out.println("[2] - Regist Venda");
        System.out.println("[3] - Exibir Registros de Vendas");
        System.out.println("[4] - Salv Vendas por Mês");
        System.out.println("[5] - Buscar Vendas por Mês");
        System.out.println("[6] - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void calPrecoTotal(Scanner scanner) {
        System.out.print("Digite a qtidade da planta vendida: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço unitário da planta: ");
        double precoUnitario = scanner.nextDouble();

        double precoTotal = quantidade * precoUnitario;

        if (quantidade > 10) {
            double desconto = precoTotal * 0.05;
            precoTotal -= desconto;
            System.out.println("Desconto especial de 5% aplicado!");
        }

        System.out.println("Preço total da venda: R$" + precoTotal);
    }

    public static void regisVenda(Scanner scanner) {
        System.out.print("Digite a quantidade da planta vendida: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço unitário da planta: ");
        double precoUnitario = scanner.nextDouble();

        double precoTotal = quantidade * precoUnitario;
        double desconto = 0.0;

        if (quantidade > 10) {
            desconto = precoTotal * 0.05;
            precoTotal -= desconto;
            System.out.println("Desconto especial de 5% aplicado!");
        }

        registrosDeVendas.add(new Venda(quantidade, precoTotal, desconto));
        System.out.println("Venda registrada com sucesso!");
    }

    public static void exibirRegisDeVendas() {
        if (registrosDeVendas.isEmpty()) {
            System.out.println("Nenhuma venda registrada.");
        } else {
            System.out.println("=== Registros de Vendas ===");
            for (Venda venda : registrosDeVendas) {
                System.out.println("Quantidade: " + venda.quantidade + ", Preço Total: R$" + venda.valorVenda + ", Desconto Aplicado: R$" + venda.descontoAplicado);
            }
        }
    }

    public static void salvVendasPorMes(Scanner scanner) {
        System.out.print("Digite o mês '1 a 12': ");
        int mes = scanner.nextInt();

        System.out.print("Digite o dia '1 a 30': ");
        int dia = scanner.nextInt();

        System.out.print("Digite a quantidade de vendas realizadas nesse dia: ");
        int quantidade = scanner.nextInt();

        String chaveMes = Integer.toString(mes);

        if (!vendasPorMes.containsKey(chaveMes)) {
            vendasPorMes.put(chaveMes, new HashMap<>());
        }

        Map<Integer, Integer> vendasPorDia = vendasPorMes.get(chaveMes);
        vendasPorDia.put(dia, quantidade);

        System.out.println("Vendas salvas com sucesso!");
    }

    public static void buscVdasPorMes(Scanner scanner) {
        System.out.print("Digite o mês '1 a 12': ");
        int mes = scanner.nextInt();

        System.out.print("Digite o dia '1 a 30': ");
        int dia = scanner.nextInt();

        String chaveMes = Integer.toString(mes);

        if (vendasPorMes.containsKey(chaveMes)) {
            Map<Integer, Integer> vendasPorDia = vendasPorMes.get(chaveMes);
            if (vendasPorDia.containsKey(dia)) {
                int quantidade = vendasPorDia.get(dia);
                System.out.println("Qtidade de vendas para o dia " + dia + " do mês " + mes + ": " + quantidade);
            } else {
                System.out.println("Nenhum venda registrada para o dia " + dia + " do mês " + mes + ".");
            }
        } else {
            System.out.println("Nenhum venda registrada para o mês " + mes + ".");
        }
    }

    static class Venda {
        int quantidade;
        double valorVenda;
        double descontoAplicado;

        public Venda(int quantidade, double valorVenda, double descontoAplicado) {
            this.quantidade = quantidade;
            this.valorVenda = valorVenda;
            this.descontoAplicado = descontoAplicado;
        }
    }
}
