package primeirobi;
import java.util.HashMap;
import java.util.Scanner;

public class TestaNumero {
    public static void main(String[] args) {
        Numero n = new Numero();
        HashMap<String, Double> historico = new HashMap<>();
        HashMap<String, Double> vendasPorDia = new HashMap<>();

        boolean continuar = true;
        Scanner scan = new Scanner(System.in);

        while (continuar) {
            int escolha;

            System.out.println("Menu Console:\n" +
                    "[1] - Calcular Preço Total\n" +
                    "[2] - Calcular Troco\n" +
                    "[3] - Calcular Valor a Pagar\n" +
                    "[4] - Calcular Quantidade de Dias em um Número de Meses\n" +
                    "[5] - Salvar Venda Diária\n" +
                    "[6] - Consultar Vendas por Dia\n" +
                    "[7] - Consultar Histórico\n" +
                    "[8] - Apresentar Vendedor\n" +
                    "[9] - Apresentar Cliente\n" +
                    "[10] - Calcular Média de Salários Recebidos\n" +
                    "[11] - Calcular Bônus do Vendedor\n" +
                    "[12] - Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scan.nextInt();

            switch (escolha) {
                case 1:
                    calcularPrecoTotal(n, scan, historico);
                    break;

                case 2:
                    calcularTroco(n, scan, historico);
                    break;

                case 3:
                    calcularValorAPagar(n, scan, historico);
                    break;

                case 4:
                    calcularDiasEmMeses(scan, historico);
                    break;

                case 5:
                    salvarVendaDiaria(scan, vendasPorDia);
                    break;

                case 6:
                    consultarVendasPorDia(scan, vendasPorDia);
                    break;

                case 7:
                    consultarHistorico(historico);
                    break;

                case 8:
                    apresentarVendedor();
                    break;

                case 9:
                    apresentarCliente();
                    break;

                case 10:
                    calcularMediaSalariosRecebidos();
                    break;

                case 11:
                    calcularBonusVendedor();
                    break;

                case 12:
                    continuar = false;
                    System.out.println("Programa encerrado");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
        }
        scan.close();
    }

    static void calcularPrecoTotal(Numero n, Scanner scan, HashMap<String, Double> historico) {
        System.out.println("Digite o preço unitário do produto: ");
        double precoUnitario = scan.nextDouble();
        System.out.println("Digite a quantidade comprada: ");
        int quantidade = scan.nextInt();

        double precoTotal = n.multiplicacao(precoUnitario, quantidade);
        System.out.println("Preço total: " + precoTotal);

        // Registrando o preço total no histórico
        historico.put("Preço Total", precoTotal);
    }

    static void calcularTroco(Numero n, Scanner scan, HashMap<String, Double> historico) {
        System.out.println("Digite o valor pago pelo cliente: ");
        double valorPago = scan.nextDouble();
        System.out.println("Digite o valor da compra: ");
        double valorCompra = scan.nextDouble();

        double troco = n.subtracao(valorPago, valorCompra);
        System.out.println("Troco: " + troco);

        // Registrando o troco no histórico
        historico.put("Troco", troco);
    }

    static void calcularValorAPagar(Numero n, Scanner scan, HashMap<String, Double> historico) {
        System.out.println("Digite o valor a ser pago: ");
        double valor = scan.nextDouble();
        System.out.println("Digite o desconto (em porcentagem): ");
        double desconto = scan.nextDouble();

        double valorComDesconto = n.subtracao(valor, n.multiplicacao(valor, desconto / 100));
        System.out.println("Valor a pagar com desconto: " + valorComDesconto);

        // Registrando o valor a pagar com desconto no histórico
        historico.put("Valor a Pagar com Desconto", valorComDesconto);
    }

    static void calcularDiasEmMeses(Scanner scan, HashMap<String, Double> historico) {
        System.out.println("Digite o número de meses: ");
        int meses = scan.nextInt();

        int dias = meses * 30; // Considerando todos os meses com 30 dias
        System.out.println("Quantidade de dias em " + meses + " meses: " + dias);

        // Registrando a quantidade de dias no histórico
        historico.put("Dias em Meses", (double) dias);
    }

    static void salvarVendaDiaria(Scanner scan, HashMap<String, Double> vendasPorDia) {
        System.out.println("Digite o mês da venda: ");
        int mes = scan.nextInt();
        System.out.println("Digite o dia da venda: ");
        int dia = scan.nextInt();
        System.out.println("Digite o valor da venda: ");
        double valorVenda = scan.nextDouble();

        String chave = mes + "/" + dia;
        if (vendasPorDia.containsKey(chave)) {
            double vendasTotais = vendasPorDia.get(chave) + valorVenda;
            vendasPorDia.put(chave, vendasTotais);
        } else {
            vendasPorDia.put(chave, valorVenda);
        }

        System.out.println("Venda diária salva com sucesso!");
    }

    static void consultarVendasPorDia(Scanner scan, HashMap<String, Double> vendasPorDia) {
        System.out.println("Digite o mês da venda: ");
        int mes = scan.nextInt();
        System.out.println("Digite o dia da venda: ");
        int dia = scan.nextInt();

        String chave = mes + "/" + dia;
        if (vendasPorDia.containsKey(chave)) {
            double vendasTotais = vendasPorDia.get(chave);
            System.out.println("Vendas totais para o dia " + dia + " do mês " + mes + ": " + vendasTotais);
        } else {
            System.out.println("Não há vendas registradas para o dia " + dia + " do mês " + mes);
        }
    }

    static void consultarHistorico(HashMap<String, Double> historico) {
        System.out.println("Histórico:");
        for (String key : historico.keySet()) {
            System.out.println(key + ": " + historico.get(key));
        }
    }

    static void apresentarVendedor() {
        // Implementação do método apresentarVendedor
    }

    static void apresentarCliente() {
        // Implementação do método apresentarCliente
    }

    static void calcularMediaSalariosRecebidos() {
        // Implementação do método calcularMediaSalariosRecebidos
    }

    static void calcularBonusVendedor() {
        // Implementação do método calcularBonusVendedor
    }
}
