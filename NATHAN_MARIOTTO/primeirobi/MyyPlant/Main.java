

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Item> itens = new ArrayList<>();

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMyy Plant Management System");
            System.out.println("1. Adicionar Vendedor");
            System.out.println("2. Adicionar Cliente");
            System.out.println("3. Criar Pedido");
            System.out.println("4. Cadastro de Itens");
            System.out.println("5. Listar Itens");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (opcao) {
                case 1:
                    // Implementação existente
                    break;
                case 2:
                    // Implementação existente
                    break;
                case 3:
                    criarPedido();
                    break;
                case 4:
                    cadastrarItem();
                    break;
                case 5:
                    listarItens();
                    break;
                case 6:
                    continuar = false;
                    System.out.println("Encerrando o programa. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }
        scanner.close();
    }

    private static void cadastrarItem() {
        System.out.print("Nome do Item: ");
        String nome = scanner.nextLine();
        System.out.print("Tipo do Item: ");
        String tipo = scanner.nextLine();
        System.out.print("Valor do Item: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        int id = itens.size() + 1; // Simple ID generation
        Item item = new Item(id, nome, tipo, valor);
        itens.add(item);
        System.out.println("Item cadastrado com sucesso!");
    }

    private static void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("Nenhum item cadastrado.");
            return;
        }
        System.out.println("Itens disponíveis:");
        itens.forEach(System.out::println);
    }

    private static void criarPedido() {
        // Implementação simplificada para exemplo
        System.out.println("Funcionalidade de criar pedido ainda não implementada.");
    }
}
