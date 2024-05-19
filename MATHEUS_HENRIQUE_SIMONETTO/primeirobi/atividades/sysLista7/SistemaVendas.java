package primeirobi.atividades.sysLista7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaVendas {
    private List<Item> catalogo = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        boolean running = true;
        while (running) {
            System.out.println("\n--- Menu de Vendas ---");
            System.out.println("1. Cadastrar Item");
            System.out.println("2. Listar Itens");
            System.out.println("3. Criar Pedido");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
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
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
        scanner.close();
    }

    private void cadastrarItem() {
        System.out.print("Digite o ID do item: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome do item: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o tipo do item: ");
        String tipo = scanner.nextLine();
        System.out.print("Digite o preço do item: ");
        double preco = scanner.nextDouble();
        catalogo.add(new Item(id, nome, tipo, preco));
        System.out.println("Item cadastrado com sucesso.");
    }

    private void listarItens() {
        if (catalogo.isEmpty()) {
            System.out.println("Não há itens cadastrados.");
            return;
        }
        catalogo.forEach(Item::display);
    }

    private void criarPedido() {
        if (catalogo.isEmpty()) {
            System.out.println("Não há itens disponíveis para adicionar a um pedido.");
            return;
        }

        System.out.print("Digite o nome da empresa parceira: ");
        String parceria = scanner.nextLine();
        Pedido pedido = new Pedido(parceria);

        int itemId;
        do {
            listarItens();
            System.out.print("Digite o ID do item para adicionar ao pedido (0 para finalizar): ");
            itemId = scanner.nextInt();
            scanner.nextLine();
            if (itemId == 0) {
                break; 
            }

            // Busca manual pelo item sem usar stream diretamente no filtro
            Item item = null;
            for (Item i : catalogo) {
                if (i.getId() == itemId) {
                    item = i;
                    break;
                }
            }

            if (item != null) {
                pedido.addItem(item);
                System.out.println("Item adicionado ao pedido.");
            } else {
                System.out.println("Item não encontrado.");
            }
        } while (itemId != 0);

        pedido.displayPedido();
    }

    public static void main(String[] args) {
        new SistemaVendas().run();
    }
}
