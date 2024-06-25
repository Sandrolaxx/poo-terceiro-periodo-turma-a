package Testes.MyPlant;
import java.util.Scanner;

public class Registro {
    static int totalPlantasVendidas = 0;
    static double totalValorVendas = 0;
    static double totalDescontos = 0;
    

    public static void main(String[] args) {
        boolean sair = false;
        Scanner scanner = new Scanner(System.in);
        

        while (!sair) {
            
    
        System.out.println("Escolha uma das 4 opções:\n Opção 1 = Calcular preço total  \n Opção 2 = Calcular troco  \n Opção 3 = Registro de Vendas \n Opção 4 = Sair");

        int opcao = scanner.nextInt();

        switch (opcao) {
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
               sair = true;

            default:
                System.out.println("Opção inválida");
                break;
        }

    }
    scanner.close();
    }

    private static void calcularPrecoTotal(Scanner scanner) {
        System.out.println("Informe o número de plantas");
        int quantidadePlantas = scanner.nextInt();
        System.out.println("Informe o preço da planta");
        double precoPlanta = scanner.nextDouble();
        double valorTotal = quantidadePlantas * precoPlanta;


        if (quantidadePlantas >= 10) {
            double desconto = 0.05 * valorTotal;
            valorTotal -= desconto;
            totalDescontos += desconto;
        }


        totalPlantasVendidas += quantidadePlantas;
        totalValorVendas += valorTotal;

        System.out.println("O valor total foi " + valorTotal);
    }

    private static void calcularTroco(Scanner scanner) {
        if (totalPlantasVendidas > 0 && totalValorVendas > 0) {
            System.out.println("Informe o valor total pago pelo cliente");
            double precoTotal = scanner.nextDouble();
            double valorTotal = totalValorVendas;
    
            double troco = precoTotal - valorTotal;
            System.out.println("O valor total do troco será: " + troco);
        } else {
            System.out.println("Nenhuma venda registrada ainda.");
        }
    }

    private static void exibirRegistroVendas() {
        System.out.println("Registro de Vendas:");
        System.out.println("Quantidade de plantas vendidas: " + totalPlantasVendidas);
        System.out.println("Valor total de vendas: " + totalValorVendas);
        System.out.println("Total de descontos aplicados: " + totalDescontos);
    }
}


