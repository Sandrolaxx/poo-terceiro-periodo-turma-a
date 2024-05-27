package primeirobi.aulasete;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import primeirobi.Cliente;
import primeirobi.Loja;
import primeirobi.Vendedor;
import primeirobi.aulaseis.Endereco;
import primeirobi.aulaseis.Item;
import primeirobi.aulaseis.Pedido;

public class listasete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pedido> pedidos = new ArrayList<>();
        List<Item> itens = new ArrayList<>();

        int opcao;
        do {
            exibirMenu();
            opcao = lerOpcao(scanner);

            switch (opcao) {
                case 1:
                    criarPedido(pedidos, itens, scanner);
                    break;
                case 2:
                    criarPedidoDadosFalsos(pedidos);
                    break;
                case 3:
                    adicionarPedidoManualmente(pedidos, scanner);
                    break;
                case 4:
                    cadastrarItens(scanner, itens);
                    break;
                case 5:
                    listarItens(itens);
                    break;
                case 6:
                    processarPedido(pedidos, scanner);
                    break;
                case 7:
                    System.out.println("PROGRAMA FINALIZADO.");
                    break;
                default:
                    System.out.println("OPCAO INVALIDA.");
                    break;
            }
        } while (opcao != 7);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("- MENUZINHO -");
        System.out.println("1-CRIAR PEDIDO");
        System.out.println("2-CRIAR PEDIDO COM DADOS FAKES");
        System.out.println("3-ADICIONAR PEDIDO FAKE MANUALMENTE");
        System.out.println("4-CADASTRO DE ITENS");
        System.out.println("5-LISTAR ITENS");
        System.out.println("6-PROCESSAR PEDIDO");
        System.out.println("7-SAIR");
    }

    private static int lerOpcao(Scanner scanner) {
        System.out.print("ESCOLHA UMA OPCAO:");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("OPCAO INVALIDA.");
            scanner.nextLine();
            return 0;
        }
    }

    private static void criarPedido(List<Pedido> pedidos, List<Item> itens, Scanner scanner) {
        if (itens.isEmpty()) {
            System.out.println("NENHUM ITEM DISPONIVEL PARA CRIAR O PEDIDO.");
            return;
        }

        System.out.println("- ITENS DISPONÍVEIS -");
        for (Item item : itens) {
            System.out.println(item.getId() + ": " + item.getNome() + " - " + item.getValor());
        }

        System.out.print("SELECIONE O ID DO ITEM QUE DESEJA COMPRAR:");
        int idItemEscolhido = scanner.nextInt();
        scanner.nextLine();

        Item itemEscolhido = null;
        for (Item item : itens) {
            if (item.getId() == idItemEscolhido) {
                itemEscolhido = item;
                break;
            }
        }

        if (itemEscolhido == null) {
            System.out.println("ITEM SELECIONADO NAO ENCONTRADO.");
            return;
        }

        Cliente cliente = new Cliente("Nome do Cliente");
        Endereco enderecoLoja = new Endereco("PR", "Cascavel", "Centro", "8455500", "FAG");
        Loja loja = new Loja("Loja 1", enderecoLoja);
        Vendedor vendedor = new Vendedor("Jeff");
        List<Item> itensPedido = new ArrayList<>();
        itensPedido.add(itemEscolhido);
        Pedido novoPedido = new Pedido(pedidos.size() + 1, new Date(), cliente, vendedor, loja, itensPedido);
        pedidos.add(novoPedido);
        System.out.println("PEDIDO CRIADO COM O ITEM SELECIONADO.");
    }

    private static void criarPedidoDadosFalsos(List<Pedido> pedidos) {
        Cliente cliente = new Cliente("ALTAIR");
        Endereco enderecoLoja = new Endereco("PR", "Cascavel", "Centro", "8455500", "FAG");
        Loja loja = new Loja("Loja 2", enderecoLoja);
        Vendedor vendedor = new Vendedor("JEFF");
        List<Item> itens = new ArrayList<>();
        itens.add(new Item(1, "CAMISA", "ROUPA", 52.0));
        itens.add(new Item(2, "CALCA", "ROUPA", 79.0));
        Pedido novoPedido = new Pedido(pedidos.size() + 1, new Date(), cliente, vendedor, loja, itens);
        pedidos.add(novoPedido);
        System.out.println("PEDIDO COM DADOS FALSOS CRIADO.");
    }

    private static void adicionarPedidoManualmente(List<Pedido> pedidos, Scanner scanner) {
        System.out.print("ID DO PEDIDO:");
        int idPedido = scanner.nextInt();
        scanner.nextLine();
        System.out.print("NOME DO CLIENTE:");
        String nomeCliente = scanner.nextLine();
        System.out.print("NOME DO VENDEDOR:");
        String nomeVendedor = scanner.nextLine();
        Cliente cliente = new Cliente(nomeCliente);
        Vendedor vendedor = new Vendedor(nomeVendedor);
        Pedido novoPedido = new Pedido(idPedido, new Date(), cliente, vendedor, null, null);
        pedidos.add(novoPedido);
        System.out.println("PEDIDO ADICIONADO MANUALMENTE.");
    }

    private static void cadastrarItens(Scanner scanner, List<Item> itens) {
        System.out.println("- CADASTRO DE ITENS -");
        System.out.print("ID DO ITEM:");
        int idItem = scanner.nextInt();
        scanner.nextLine();
        System.out.print("NOME DO ITEM:");
        String nomeItem = scanner.nextLine();
        System.out.print("TIPO DE ITEM:");
        String tipoItem = scanner.nextLine();
        System.out.print("VALOR DO ITEM:");
        double valorItem = scanner.nextDouble();
        scanner.nextLine();
        itens.add(new Item(idItem, nomeItem, tipoItem, valorItem));
        System.out.println("ITEM CADASTRADO COM SUCESSO.");
    }

    private static void listarItens(List<Item> itens) {
        System.out.println("- LISTA DE ITENS -");
        if (itens.isEmpty()) {
            System.out.println("NEHUM ITEM CADASTRADO.");
        } else {
            for (Item item : itens) {
                System.out.println(item.getDescription());
            }
        }
    }

    private static void processarPedido(List<Pedido> pedidos, Scanner scanner) {
        if (pedidos.isEmpty()) {
            System.out.println("NENHUM PEDIDO DISPONIVEL PARA PROCESSAR.");
            return;
        }

        System.out.println("- PEDIDOS DISPONÍVEIS -");
        for (Pedido pedido : pedidos) {
            System.out.println("ID: " + pedido.getIdPedido() + " - CLIENTE: " + pedido.getCliente().getNome());
        }

        System.out.print("SELECIONE O ID DO PEDIDO QUE DESEJA PROCESSAR: ");
        int idPedidoEscolhido = scanner.nextInt();
        scanner.nextLine();

        Pedido pedidoEscolhido = null;
        for (Pedido pedido : pedidos) {
            if (pedido.getIdPedido() == idPedidoEscolhido) {
                pedidoEscolhido = pedido;
                break;
            }
        }

        if (pedidoEscolhido == null) {
            System.out.println("PEDIDO SELECIONAOD NAO ENCONTRADO.");
            return;
        }

        pedidoEscolhido.apresentarSe();
    }
}
