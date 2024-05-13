package primeirobimestre.ListaSeis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Aulaseis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pedido> pedidos = new ArrayList<>();
        List<Item> itens = new ArrayList<>();

        int opcao;
        do {
            System.out.println("- Menu -");
            System.out.println("1-Adicionar Produto");
            System.out.println("2-Criar Pedido");
            System.out.println("3-Testar Gerente");
            System.out.println("4-Criar Pedido Fake");
            System.out.println("5-Adicionar Pedido Fake");
            System.out.println("6-Sair");
            
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Opção inválida.");
                scanner.nextLine();
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    System.out.print("ID Do Item:");
                    int idItem = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome Do Item:");
                    String nomeItem = scanner.nextLine();
                    System.out.print("Tipo Do Item:");
                    String tipoItem = scanner.nextLine();
                    System.out.print("Valor:");
                    double valorItem = scanner.nextDouble();
                    scanner.nextLine();
                    itens.add(new Item(idItem, nomeItem, tipoItem, valorItem));
                    System.out.println("Item Adicionado.");
                    break;
                case 2:
                    criarPedido(pedidos, itens);
                    break;
                case 3:
                    break;
                case 4:
                    criarPedidoDadosFalsos(pedidos);
                    break;
                case 5:
                    adicionarPedidoManualmente(pedidos, scanner);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Erro");
                    break;
            }
        } while (opcao != 6);

        scanner.close();
    }

    private static void criarPedido(List<Pedido> pedidos, List<Item> itens) {
        Cliente cliente = new Cliente("MaiMai");
        Endereco enderecoLoja = new Endereco("PR", "Cascavel", "Floresta", "1407", "casa");
        Loja loja = new Loja("Loja A", enderecoLoja);
        Vendedor vendedor = new Vendedor("Maidana");
        Pedido pedido = new Pedido(pedidos.size() + 1, new Date(), cliente, vendedor, loja, itens);
        pedidos.add(pedido);
        System.out.println("Pedido Feito.");
        itens.clear();
    }

    private static void criarPedidoDadosFalsos(List<Pedido> pedidos) {
        Cliente cliente = new Cliente("Ana");
        Endereco enderecoLoja = new Endereco("PR", "Cascavel", "Interlagos", "622", "Casa");
        Loja loja = new Loja("Loja B", enderecoLoja);
        Vendedor vendedor = new Vendedor("Jean Bagre");
        List<Item> itens = new ArrayList<>();
        itens.add(new Item(1, "Planta", "Arvore", 5.0));
        itens.add(new Item(2, "Rosa", "Flor", 8.0));
        Pedido pedido = new Pedido(pedidos.size() + 1, new Date(), cliente, vendedor, loja, itens);
        pedidos.add(pedido);
        System.out.println("Pedido Falso Criado.");
    }

    private static void adicionarPedidoManualmente(List<Pedido> pedidos, Scanner scanner) {
        System.out.print("ID Do Pedido:");
        int idPedido = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome Do Cliente:");
        String nomeCliente = scanner.nextLine();
        System.out.print("Nome Do Vendedor:");
        String nomeVendedor = scanner.nextLine();
        Cliente cliente = new Cliente(nomeCliente);
        Vendedor vendedor = new Vendedor(nomeVendedor);
        Pedido pedido = new Pedido(idPedido, new Date(), cliente, vendedor, null, null);
        pedidos.add(pedido);
        System.out.println("Pedido Adiconado Manualmente.");
    }
}