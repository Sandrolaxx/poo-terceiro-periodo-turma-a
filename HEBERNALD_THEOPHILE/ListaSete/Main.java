package ListaSete;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final ArrayList<Item> ITENS = new ArrayList<>();

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
            final int opcao = SCANNER.nextInt();
            SCANNER.nextLine(); 

            switch (opcao) {
                case 1:
                    
                    break;
                case 2:
                    
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
        SCANNER.close();
    }

    private static void cadastrarItem() {
        System.out.print("Nome do Item: ");
        final String nome = SCANNER.nextLine();
        System.out.print("Tipo do Item: ");
        final String tipo = SCANNER.nextLine();
        System.out.print("Valor do Item: ");
        final double valor = SCANNER.nextDouble();
        SCANNER.nextLine(); 
        final int id = ITENS.size() + 1; 
        final Item item = new Item(id, nome, tipo, valor);
        ITENS.add(item);
        System.out.println("Item cadastrado com sucesso!");
    }

    private static void listarItens() {
        if (ITENS.isEmpty()) {
            System.out.println("Nenhum item cadastrado.");
            return;
        }
        System.out.println("Itens disponíveis:");
        ITENS.forEach(System.out::println);
    }

    private static void criarPedido() {
        
        System.out.println("Funcionalidade de criar pedido ainda não implementada.");
    }
}