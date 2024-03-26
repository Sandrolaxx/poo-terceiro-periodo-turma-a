import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CalculadoraDeVendas3 {

    static List<Venda> registrosDeVendas = new ArrayList<>();
    static Map<Integer, Double> vendasPorDia = new HashMap<>();
    static Map<Integer, Double> vendasPorMes = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    enum MenuOption {
        REGISTRAR_VENDA(1), EXIBIR_REGISTROS(2), EXIBIR_TOTAL_VENDAS(3), SAIR(4);

        final int option;

        MenuOption(int option) {
            this.option = option;
        }

        static MenuOption fromInt(int option) {
            for (MenuOption mo : MenuOption.values()) {
                if (mo.option == option) {
                    return mo;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1 - Registrar Venda");
            System.out.println("2 - Exibir Registros de Vendas");
            System.out.println("3 - Exibir Quantidade Total de Vendas por Dia e Mês");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            MenuOption selectedOption = MenuOption.fromInt(opcao);

            if (selectedOption == null) {
                System.out.println("Opção inválida! Por favor, tente novamente.");
                continue;
            }

            switch (selectedOption) {
                case REGISTRAR_VENDA:
                    registrarVenda();
                    break;
                case EXIBIR_REGISTROS:
                    exibirRegistrosDeVendas();
                    break;
                case EXIBIR_TOTAL_VENDAS:
                    exibirQuantidadeTotalDeVendasPorDiaEMes();
                    break;
                case SAIR:
                    continuar = false;
                    break;
            }
        }

        System.out.println("Obrigado por usar a calculadora. Até mais!");
        scanner.close();
    }

    private static void registrarVenda() {
        System.out.print("Digite o dia da venda: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês da venda: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o valor da venda: ");
        double valor = scanner.nextDouble();

        Venda venda = new Venda(dia, mes, valor);
        registrosDeVendas.add(venda);

        vendasPorDia.merge(dia, valor, Double::sum);
        vendasPorMes.merge(mes, valor, Double::sum);
    }

    private static void exibirRegistrosDeVendas() {
        if (registrosDeVendas.isEmpty()) {
            System.out.println("Nenhuma venda registrada.");
            return;
        }

        for (Venda venda : registrosDeVendas) {
            System.out.printf("Dia: %d, Mês: %d, Valor: %.2f\n", venda.getDia(), venda.getMes(), venda.getValor());
        }
    }

    private static void exibirQuantidadeTotalDeVendasPorDiaEMes() {
        System.out.println("Total de vendas por dia:");
        vendasPorDia.forEach((dia, total) -> System.out.printf("Dia %d: %.2f\n", dia, total));

        System.out.println("Total de vendas por mês:");
        vendasPorMes.forEach((mes, total) -> System.out.printf("Mês %d: %.2f\n", mes, total));
    }

    static class Venda {
        int dia;
        int mes;
        double valor;

        public Venda(int dia, int mes, double valor) {
            this.dia = dia;
            this.mes = mes;
            this.valor = valor;
        }

        public int getDia() {
            return dia;
        }

        public int getMes() {
            return mes;
        }

        public double getValor() {
            return valor;
        }
    }
}
