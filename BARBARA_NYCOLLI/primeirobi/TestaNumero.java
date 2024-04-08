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
                    "[8] - Sair");
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
                    continuar = false;
                    System.out.println("Programa encerrado");
                    break;

                default:
                    System.out.println("Inválido, tente novamente");
                    break;
            }
        }
        scan.close();
    }

    static void calcularPrecoTotal(Numero n, Scanner scan, HashMap<String, Double> historico) {
     
    }

    static void calcularTroco(Numero n, Scanner scan, HashMap<String, Double> historico) {
  
    }

    static void calcularValorAPagar(Numero n, Scanner scan, HashMap<String, Double> historico) {
      
    }

    static void calcularDiasEmMeses(Scanner scan, HashMap<String, Double> historico) {
        
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
  
    }
}
