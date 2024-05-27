package primeirobi.ListasExc.Lista6Nova;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class GestaoEmpresaMain {
    private static ArrayList<Item> itens = new ArrayList<>();
    private static ArrayList<Pedido> pedidos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarItem();
                    break;
                case 2:
                    criarPedido();
                    break;
                case 3:
                    if (pedidos.isEmpty()) {
                        System.out.println("Não existem pedidos ainda.");
                    } else {
                        listarPedidos();
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("/:=== Menu de Gestão da Empresa ===:/");
        System.out.println("1 - Adicionar item");
        System.out.println("2 - Criar pedido");
        System.out.println("3 - Pedidos");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarItem() {
        System.out.println("Digite o ID do item:");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Digite o nome do item:");
        String nome = scanner.nextLine();
        System.out.println("Digite o tipo do item:");
        String tipo = scanner.nextLine();
        System.out.println("Digite o valor do item:");
        double valor = scanner.nextDouble();
        scanner.nextLine(); 

        Item item = new Item(id, nome, tipo, valor);
        itens.add(item);
        System.out.println("Item adicionado com sucesso!");
    }

    private static void criarPedido() {
        if (itens.isEmpty()) {
            System.out.println("Adicione um item primeiro.");
            return;
        }

        System.out.println("Digite o ID do item a ser pedido:");
        int idItem = scanner.nextInt();
        scanner.nextLine(); 

        Item itemPedido = null;
        for (Item item : itens) {
            if (item.getId() == idItem) {
                itemPedido = item;
                break;
            }
        }

        if (itemPedido == null) {
            System.out.println("Item não encontrado.");
            return;
        }

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite o nome do vendedor:");
        String nomeVendedor = scanner.nextLine();
        System.out.println("Digite o nome da loja:");
        String nomeLoja = scanner.nextLine();

        Date dataCriacao = new Date();
        Date dataVencimentoReserva = new Date(dataCriacao.getTime() + 3 * 24 * 60 * 60 * 1000);
        Cliente cliente = new Cliente(nomeCliente, 0, "", "", "");
        Vendedor vendedor = new Vendedor(nomeVendedor, 0, null, "", "", "", 0);
        Loja loja = new Loja(nomeLoja, "", "", "", "", "");
        Pedido pedido = new Pedido(idItem, itemPedido.getNome(), dataCriacao, null, dataVencimentoReserva, cliente, vendedor, loja);

        pedidos.add(pedido);
        System.out.println("Pedido criado com sucesso!");
    }

    private static void listarPedidos() {
        System.out.println("/:=== Lista de Pedidos ===:/");
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss yyyy");
        for (Pedido pedido : pedidos) {
            pedido.gerarDescricaoVenda();
            System.out.println("Pedido ID: " + pedido.getId() + ", Data de Criação: " + dateFormat.format(pedido.getDataCriacao()) +
                    ", Valor Total: R$" + pedido.calcularValorTotal());
        }
    }
}
