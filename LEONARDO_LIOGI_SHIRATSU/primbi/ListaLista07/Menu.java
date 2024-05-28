package primbi.ListaLista07;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Pedido> listaPedidos = new ArrayList<>();
    private static List<Item> listaItens = new ArrayList<>();
    private static Cliente cliente = new Cliente("João Mão De Prata", 30, "São Paulo", "Centro", "Rua A");
    private static Funcionario vendedor = new Funcionario("Adão Macetador", 36, "São Paulo", "Bairro X", "Rua B", "NightcityMyplant");

    public static void main(String[] args) {
        ItensDefault();

        int opcao;
        do {
            System.out.println("\n1. Cadastrar cliente");
            System.out.println("2. Cadastrar funcionário");
            System.out.println("3. Listar itens");
            System.out.println("4. Realizar pedido");
            System.out.println("5. Mostrar informações de um pedido");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Cadastro de cliente realizado.");
                    break;
                case 2:
                    System.out.println("Cadastro de funcionário realizado.");
                    break;
                case 3:
                    System.out.println("\nLista de pedido:");
                    for (Item item : listaItens) {
                        System.out.println("Nome: " + item.getNome() + ", Preço: " + item.getPreco());
                    }
                    break;
                case 4:
                    realizarPedido();
                    break;
                case 5:
                    mostrarPedido();
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private static void ItensDefault() {
        listaItens.add(new Item("Item 1", 10.0));
        listaItens.add(new Item("Item 2", 15.0));
    }

    private static void realizarPedido() {
        System.out.println("\n SELECIONE OS ITENS ");
        System.out.println("Escolha os itens (separados por vírgula):");
        for (int i = 0; i < listaItens.size(); i++) {
            System.out.println((i + 1) + ". " + listaItens.get(i).getNome());
        }
        scanner.nextLine();
        String escolhaItensStr = scanner.nextLine();
        String[] escolhaItensArray = escolhaItensStr.split(","); //
        List<Item> itensSelecionados = new ArrayList<>();  
        for (String escolhaItem : escolhaItensArray) {
            int escolha = Integer.parseInt(escolhaItem.trim());
            if (escolha >= 1 && escolha <= listaItens.size()) {
                itensSelecionados.add(listaItens.get(escolha - 1));
            }
        }
        if (!itensSelecionados.isEmpty()) {
            String nomeLoja = "Myplantt";
            Pedido novoPedido = new Pedido(listaPedidos.size() + 1, new Date(), cliente, vendedor, itensSelecionados, nomeLoja);
            listaPedidos.add(novoPedido);
            ProcessaPedido processador = new ProcessaPedido(novoPedido.getId(), novoPedido.getDataCriacao(), novoPedido.getCliente(), novoPedido.getVendedor(), novoPedido.getItens(), nomeLoja);
            processador.processar();
        } else {
            System.out.println("Nenhum item selecionado.");
        }
    }

    private static void mostrarPedido() {
        System.out.print("Digite o ID do pedido que deseja consultar: ");
        int idPedido = scanner.nextInt();
        boolean encontrado = false;
        for (Pedido pedido : listaPedidos) {
            if (pedido.getId() == idPedido) {
                encontrado = true;
                System.out.println("\n INFORMAÇÕES DO PEDIDO ");
                System.out.println("ID do Pedido: " + pedido.getId());
                System.out.println("Data e Hora de Criação: " + pedido.getDataCriacao());
                System.out.println("Cliente: " + pedido.getCliente().getNome());
                System.out.println("Vendedor: " + pedido.getVendedor().getNome());
                System.out.println("Loja: " + pedido.getNomeLoja());
                System.out.println("Data de Vencimento: " + new Date(pedido.getDataCriacao().getTime() + 3 * 24 * 60 * 60 * 1000));
                System.out.println("Itens:");
                for (Item item : pedido.getItens()) {
                    System.out.println("- " + item.getNome() + ", Preço: " + item.getPreco());
                }
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Pedido não encontrado.");
        }
    }
}