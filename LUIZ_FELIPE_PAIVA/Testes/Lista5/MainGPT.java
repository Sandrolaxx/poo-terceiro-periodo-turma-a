package Testes.Lista5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainGPT {
    private static List<Item> itens = new ArrayList<>();
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Vendedor> vendedores = new ArrayList<>();
    private static Loja loja = new Loja("My Plant", 123456789, "My Plant Store");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarDados();
        exibirMenu();
    }

    private static void inicializarDados() {
        // Adiciona alguns itens, clientes e vendedores iniciais
        itens.add(new Item(12615, "Samambaia", "Planta", 29.90));
        itens.add(new Item(12616, "Cacto", "Planta", 15.00));
        clientes.add(new Cliente("Isabelly Ferrari", 27));
        vendedores.add(new Vendedor("Mateus", 26, "My Planta 01", 1800.0));
    }

    private static void exibirMenu() {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Item");
            System.out.println("2. Listar Itens");
            System.out.println("3. Criar Pedido");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    cadastrarItem();
                    break;
                case 2:
                    listarItens();
                    break;
                case 3:
                    criarPedido();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

    private static void cadastrarItem() {
        System.out.print("Digite o ID do item: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        System.out.print("Digite o nome do item: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a descrição do item: ");
        String descricao = scanner.nextLine();

        System.out.print("Digite o preço do item: ");
        double preco = scanner.nextDouble();

        itens.add(new Item(id, nome, descricao, preco));
        System.out.println("Item cadastrado com sucesso!");
    }

    private static void listarItens() {
        System.out.println("\nItens cadastrados:");
        for (Item item : itens) {
            System.out.println("ID: " + item.getId() + ", Nome: " + item.getNome() + ", Preço: R$ " + item.getValor());
        }
    }

    private static void criarPedido() {
        System.out.println("\nClientes:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i).getNome());
        }
        System.out.print("Escolha o cliente pelo número: ");
        int clienteIndex = scanner.nextInt() - 1;

        System.out.println("\nVendedores:");
        for (int i = 0; i < vendedores.size(); i++) {
            System.out.println((i + 1) + ". " + vendedores.get(i).getNome());
        }
        System.out.print("Escolha o vendedor pelo número: ");
        int vendedorIndex = scanner.nextInt() - 1;

        List<Item> itensPedido = new ArrayList<>();
        int itemOpcao;
        do {
            listarItens();
            System.out.print("Escolha o item pelo ID ou 0 para finalizar: ");
            itemOpcao = scanner.nextInt();
            if (itemOpcao != 0) {
                for (Item item : itens) {
                    if (item.getId() == itemOpcao) {
                        itensPedido.add(item);
                        System.out.println("Item adicionado ao pedido!");
                        break;
                    }
                }
            }
        } while (itemOpcao != 0);

        if (!itensPedido.isEmpty()) {
            ProcessaPedido processaPedido = new ProcessaPedido();
            Pedido pedido = processaPedido.processar(
                1, clientes.get(clienteIndex), vendedores.get(vendedorIndex), loja, itensPedido);
            pedido.gerarDescricaoVenda();
            processaPedido.testarConfirmacaoPagamento(pedido);
        } else {
            System.out.println("Nenhum item adicionado ao pedido.");
        }
    }
}
