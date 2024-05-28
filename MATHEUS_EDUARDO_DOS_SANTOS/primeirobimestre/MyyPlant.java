package primeirobimestre;

import java.util.Scanner;

public class MyyPlant {
    private static double descontoEspecial = 0.05;
    private static double[][] vendasPorDiaEMes = new double[12][30];
    private static Vendedor[] vendedores = new Vendedor[3]; 
    private static Cliente[] clientes = new Cliente[2]; 
    private static Loja loja; 

    public static void main(String[] args) {
        inicializarDados(); 

        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calcularPrecoTotal(scanner);
                    break;
                case 2:
                    registrarVenda(scanner);
                    break;
                case 3:
                    calcularTroco(scanner);
                    break;
                case 4:
                    exibirRegistroDeVendas();
                    break;
                case 5:
                    buscarVendasPorDiaEMes(scanner);
                    break;
                case 6:
                    apresentarVendedores();
                    break;
                case 7:
                    apresentarClientes();
                    break;
                case 8:
                    loja.apresentarSe();
                    break;   
                case 9:
                    System.out.println("Saindo...");
                    break; 
                default:
                    System.out.println("Opção inválida! Escolha novamente.");
            }
        } while (opcao != 9);

        scanner.close();
    }

    public static void inicializarDados() {
        vendedores[0] = new Vendedor("João", 30, "Loja A", "Cidade A", "Bairro A", "Rua A", 2500.00);
        vendedores[1] = new Vendedor("Maria", 28, "Loja A", "Cidade A", "Bairro A", "Rua A", 2600.00);
        vendedores[2] = new Vendedor("Pedro", 35, "Loja A", "Cidade A", "Bairro A", "Rua A", 2700.00);

        clientes[0] = new Cliente("Carlos", 45, "Cidade B", "Bairro B", "Rua B");
        clientes[1] = new Cliente("Ana", 32, "Cidade B", "Bairro B", "Rua B");

        loja = new Loja("Loja A", "Razão Social A", "123456789", "Cidade A", "Bairro A", "Rua A", vendedores, clientes);
    }

    public static void exibirMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("[1] - Calcular Preço Total");
        System.out.println("[2] - Registrar Venda");
        System.out.println("[3] - Calcular Troco");
        System.out.println("[4] - Exibir Registro de Vendas");
        System.out.println("[5] - Buscar Vendas por Dia e Mês");
        System.out.println("[6] - Apresentar Vendedores");
        System.out.println("[7] - Apresentar Clientes");
        System.out.println("[8] - Apresentar Loja");
        System.out.println("[9] - Sair");
    }

    public static void calcularPrecoTotal(Scanner scanner) {
        System.out.println("Digite a quantidade da planta:");
        int quantidade = scanner.nextInt();
        System.out.println("Digite o preço unitário da planta:");
        double precoUnitario = scanner.nextDouble();
        double precoTotal;
        if (quantidade > 10) {
            precoTotal = quantidade * precoUnitario * (1 - descontoEspecial);
            System.out.println("Preço total com desconto especial: R$" + precoTotal);
        } else {
            precoTotal = quantidade * precoUnitario;
            System.out.println("Preço total: R$" + precoTotal);
        }
    }

    public static void registrarVenda(Scanner scanner) {
        System.out.println("Digite o número do mês (1-12):");
        int mes = scanner.nextInt();
        System.out.println("Digite o número do dia (1-30):");
        int dia = scanner.nextInt();
        System.out.println("Digite o valor total da venda:");
        double valorVenda = scanner.nextDouble();

        if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= 30) {
            vendasPorDiaEMes[mes - 1][dia - 1] += valorVenda;
            System.out.println("Venda registrada para o dia " + dia + " do mês " + mes + ".");
        } else {
            System.out.println("Data inválida!");
        }
    }

    public static void calcularTroco(Scanner scanner) {
        System.out.println("Digite o valor recebido pelo cliente:");
        double valorRecebido = scanner.nextDouble();
        System.out.println("Digite o valor total da compra:");
        double valorTotal = scanner.nextDouble();

        double troco = valorRecebido - valorTotal;
        System.out.println("Troco a ser dado ao cliente: R$" + troco);
    }

    public static void exibirRegistroDeVendas() {
        System.out.println("Registro de Vendas:");
        for (int mes = 0; mes < 12; mes++) {
            for (int dia = 0; dia < 30; dia++) {
                double vendasDiaEMes = vendasPorDiaEMes[mes][dia];
                if (vendasDiaEMes > 0) {
                    System.out.println("Mês " + (mes + 1) + ", Dia " + (dia + 1) + ": R$" + vendasDiaEMes);
                }
            }
        }
    }

    public static void buscarVendasPorDiaEMes(Scanner scanner) {
        System.out.println("Digite o número do mês (1-12):");
        int mes = scanner.nextInt();
        System.out.println("Digite o número do dia (1-30):");
        int dia = scanner.nextInt();

        if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= 30) {
            double vendasDiaEMes = vendasPorDiaEMes[mes - 1][dia - 1];
            System.out.println("Vendas para o dia " + dia + " do mês " + mes + ": R$" + vendasDiaEMes);
        } else {
            System.out.println("Data inválida!");
        }
    }

    public static void apresentarVendedores() {
        System.out.println("--- Vendedores ---");
        for (Vendedor vendedor : vendedores) {
            vendedor.apresentarSe();
            System.out.println();
        }
    }

    public static void apresentarClientes() {
        System.out.println("--- Clientes ---");
        for (Cliente cliente : clientes) {
            cliente.apresentarSe();
            System.out.println();
        }
    }

}