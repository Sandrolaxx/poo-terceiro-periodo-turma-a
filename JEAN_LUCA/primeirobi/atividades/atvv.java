package primeirobi.atividades;
import java.util.HashMap;
import java.util.Scanner;

public class atvv {
    static class Venda {
        int quantidade;
        float valorVenda;
        float desconto;

        public Venda(int quantidade, float valorVenda, float desconto) {
            this.quantidade = quantidade;
            this.valorVenda = valorVenda;
            this.desconto = desconto;
        }
    }

    static Venda[] vendas = new Venda[100];
    static int contadorVendas = 0;
    static HashMap<String, Float> vendasDiarias = new HashMap<>();
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("[1] Calcular Desconto Especial");
            System.out.println("[2] Registrar Venda");
            System.out.println("[3] Calcular Preço Total");
            System.out.println("[4] Calcular Troco");
            System.out.println("[5] Salvar Vendas Diárias");
            System.out.println("[6] Buscar Vendas Diárias");
            System.out.println("[7] Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    calcularDescontoEspecial(scanner);
                    break;
                case 2:
                    registrarVenda(scanner);
                    break;
                case 3:
                    calcularPrecoTotal(scanner);
                    break;
                case 4:
                    calcularTroco(scanner);
                    break;
                case 5:
                    salvarVendasDiarias(scanner);
                    break;
                case 6:
                    buscarVendasDiarias(scanner);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 8);
        scanner.close();
    }

    private static void calcularDescontoEspecial(Scanner scanner) {
        System.out.println("digite a quantidade de plantas:");
        int quantidade = scanner.nextInt();
        System.out.println("digite o preço por planta:");
        float precoUnitario = scanner.nextFloat();
        if (quantidade > 10) {
            float desconto = 0.05f * (quantidade * precoUnitario);
            System.out.println("desconto aplicado: R$" + desconto);
        } else {
            System.out.println("sem desconto aplicado.");
        }
    }

    private static void registrarVenda(Scanner scanner) {
        System.out.println("digite a quantidade de plantas vendidas:");
        int quantidade = scanner.nextInt();
        System.out.println("digite o valor total da venda:");
        float valorVenda = scanner.nextFloat();
        float desconto = calcularDesconto(quantidade, valorVenda);
        vendas[contadorVendas++] = new Venda(quantidade, valorVenda, desconto);
        System.out.println("venda registrada com sucesso!");
    }

    private static float calcularDesconto(int quantidade, float valorVenda) {
        if (quantidade > 10) {
            return 0.05f * valorVenda;
        } else {
            return 0;
        }
    }

    private static void calcularPrecoTotal(Scanner scanner) {
        System.out.println("digite a quantidade de plantas:");
        int quantidade = scanner.nextInt();
        System.out.println("digite o preço por planta:");
        float precoUnitario = scanner.nextFloat();
        float precoTotal = quantidade * precoUnitario;
        System.out.println("O preço total da venda é: R$" + precoTotal);
    }

    private static void calcularTroco(Scanner scanner) {
        System.out.println("Digite o valor recebido pelo cliente:");
        float valorRecebido = scanner.nextFloat();
        System.out.println("Digite o valor total da compra:");
        float valorTotal = scanner.nextFloat();
        float troco = valorRecebido - valorTotal;
        if (troco < 0) {
            System.out.println("O valor recebido é insuficiente!");
        } else {
            System.out.println("O troco a ser dado ao cliente é: R$" + troco);
        }
    }

    private static void salvarVendasDiarias(Scanner scanner) {
        System.out.println("Digite o dia e mês (formato dd-MM):");
        String data = scanner.next();
        System.out.println("Digite o valor total das vendas:");
        float valorTotal = scanner.nextFloat();
        vendasDiarias.put(data, valorTotal);
        System.out.println("Vendas diárias salvas com sucesso!");
    }

    private static void buscarVendasDiarias(Scanner scanner) {
        System.out.println("Digite o dia e mês para buscar (formato dia-Mes):");
        String data = scanner.next();
        if (vendasDiarias.containsKey(data)) {
            System.out.println("Total de vendas para o dia " + data + ": R$" + vendasDiarias.get(data));
        } else {
            System.out.println("Não tem vendas registradas para o dia " + data);
        }
    }

    
    }

