import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.time.LocalDate;

public class ex3 {

    private static ArrayList<Venda> registrosDeVendas = new ArrayList<>();
    private static Map<Integer, Double> vendasPorDia = new HashMap<>();
    private static Map<Integer, Double> vendasPorMes = new HashMap<>();
    private static final double DESCONTO_PADRAO = 0.05;
    private static final int QUANTIDADE_MIN_DESCONTO = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu:");
            System.out.println("1 - Registrar Venda");
            System.out.println("2 - Exibir Registros de Vendas");
            System.out.println("3 - Exibir Quantidade Total de Vendas por Dia e Mês");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = obterOpcaoValida(scanner);

            switch (opcao) {
                case 1:
                    registrarVenda(scanner);
                    break;
                case 2:
                    exibirRegistrosDeVendas();
                    break;
                case 3:
                    exibirQuantidadeTotalDeVendasPorDiaEMes();
                    break;
                case 4:
                    continuar = false;
                    break;
            }
        }

        scanner.close();
        System.out.println("Obrigado por usar a calculadora. Até mais!");
    }

    private static int obterOpcaoValida(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Opção inválida! Por favor, tente novamente.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void registrarVenda(Scanner scanner) {
        System.out.print("Informe a quantidade da planta: ");
        int quantidade = obterInteiroPositivo(scanner);
        System.out.print("Informe o preço unitário da planta: ");
        double precoUnitario = obterDoublePositivo(scanner);

        double precoTotal = quantidade * precoUnitario;
        double descontoAplicado = 0;
        if (quantidade > QUANTIDADE_MIN_DESCONTO) {
            descontoAplicado = precoTotal * DESCONTO_PADRAO;
            precoTotal -= descontoAplicado;
        }

        registrosDeVendas.add(new Venda(quantidade, precoUnitario, precoTotal, descontoAplicado));

        LocalDate dataAtual = LocalDate.now();
        int dia = dataAtual.getDayOfMonth();
        int mes = dataAtual.getMonthValue();
        vendasPorDia.put(dia, vendasPorDia.getOrDefault(dia, 0.0) + precoTotal);
        vendasPorMes.put(mes, vendasPorMes.getOrDefault(mes, 0.0) + precoTotal);

        System.out.println("Preço total da venda (com desconto, se aplicável): " + precoTotal);
        if (descontoAplicado > 0) {
            System.out.println("Desconto aplicado: " + descontoAplicado);
        }
    }

    private static int obterInteiroPositivo(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int valor = scanner.nextInt();
                if (valor > 0) {
                    return valor;
                }
            }
            System.out.println("Por favor, insira um número inteiro positivo válido.");
            scanner.next();
        }
    }

    private static double obterDoublePositivo(Scanner scanner) {
        while (true) {
            if (scanner.hasNextDouble()) {
                double valor = scanner.nextDouble();
                if (valor > 0) {
                    return valor;
                }
            }
            System.out.println("Por favor, insira um número decimal positivo válido.");
            scanner.next();
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

    private static void exibirQuantidadeTotalDeVendasPorDiaEMes() {
        System.out.println("Quantidade total de vendas por dia:");
        for (Map.Entry<Integer, Double> entry : vendasPorDia.entrySet()) {
            System.out.println("Dia " + entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nQuantidade total de vendas por mês:");
        for (Map.Entry<Integer, Double> entry : vendasPorMes.entrySet()) {
            System.out.println("Mês " + entry.getKey() + ": " + entry.getValue());
        }
    }

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
