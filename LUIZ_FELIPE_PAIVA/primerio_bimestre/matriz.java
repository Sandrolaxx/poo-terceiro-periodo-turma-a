package primerio_bimestre;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número de clientes: ");
        int numeroClientes = scanner.nextInt();

        double[][] vendasPorDiaMes = new double[12][30];

        for (int i = 0; i < numeroClientes; i++) {
            int dia = 1;
            int mes = 1;
            double custoTotal = 0.0;
            System.out.print("\nInforme o número do mês para registrar a compra do cliente " + (i + 1) + " (1 - 12): ");
            mes = scanner.nextInt();
            System.out.print("Informe o dia do mês para registrar a compra do cliente " + (i + 1) + " (1 - 30): ");
            dia = scanner.nextInt();

            System.out.print("\nInforme a quantidade de itens que o cliente " + (i + 1) + " irá comprar: ");
            int quantidadeItens = scanner.nextInt();

            System.out.print("Informe o preço unitário dos itens para o cliente " + (i + 1) + ": ");
            double precoItem = scanner.nextDouble();

            System.out.print("Informe o valor pago pelo cliente " + (i + 1) + ": ");
            double pagamento = scanner.nextDouble();

            System.out.println("\nEscolha a operação desejada:");
            System.out.println("[1] - Calcular o custo total\n[2] - Calcular o troco\n[3] - Mostrar histórico de vendas\n[4] - Histórico mensal e/ou anual\n[5] - Sair\n");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    custoTotal = quantidadeItens * precoItem;
                    if (quantidadeItens >= 10) {
                        System.out.println("A compra do cliente " + (i + 1) + " terá desconto.");
                        double custoComDesconto = custoTotal * 0.95;
                        System.out.println("O custo da compra (com desconto) do cliente " + (i + 1) + " foi: R$ " + custoComDesconto);
                        vendasPorDiaMes[mes - 1][dia - 1] += custoComDesconto;
                    } else {
                        System.out.println("O custo total da compra (sem desconto) do cliente " + (i + 1) + " foi: R$ " + custoTotal);
                        vendasPorDiaMes[mes - 1][dia - 1] += custoTotal;
                    }
                    break;

                case 2:
                    double divida = pagamento - (quantidadeItens * precoItem);
                    if (divida < 0) {
                        System.out.println("O cliente " + (i + 1) + " deve dinheiro.");
                        System.out.println("O cliente " + (i + 1) + " está devendo: R$ " + divida);
                    } else if (divida > 0) {
                        System.out.println("O valor do troco para o cliente " + (i + 1) + " é de: R$ " + Math.abs(divida));
                    } else {
                        System.out.println("Não é necessário entregar troco.");
                    }
                    break;

                case 3:
                    System.out.println("Histórico de vendas dos clientes");

                    for (int j = 0; j < numeroClientes; j++) {
                        System.out.println("Cliente " + (j + 1) + ": ");
                        System.out.println("Quantidade de itens vendidos: " + quantidadeItens);
                        System.out.println("Valor da venda: R$ " + custoTotal);

                        if (quantidadeItens >= 10) {
                            double desconto = custoTotal * 0.05; 
                            System.out.println("Desconto aplicado: R$ " + desconto);
                            System.out.println("Valor com desconto: R$ " + (custoTotal - desconto));
                        } else {
                            System.out.println("Desconto aplicado: R$ 0.00");
                        }
                        System.out.println(); 
                    }
                    break;

                case 4:
                    System.out.println("Histórico mensal e/ou anual");

                    System.out.print("\nInforme o número do mês (1 - 12): ");
                    mes = scanner.nextInt();
                    System.out.print("Informe o dia do mês (1 - 30): ");
                    dia = scanner.nextInt();

                    if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= 30) {
                        double vendasTotais = vendasPorDiaMes[mes - 1][dia - 1];
                        System.out.println("Vendas totais do dia " + dia + ", do mês " + mes + ": R$ " + vendasTotais);
                    } else {
                        System.out.println("Mês ou dia inválidos.");
                    }
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Erro: Operação inválida.");
                    break;
            }
    }
    scanner.close();
}
}
