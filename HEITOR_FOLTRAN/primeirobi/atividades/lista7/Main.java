package primeirobi.atividades.lista7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static void cadastrarNovoItem(List<Item> listaItens, Scanner scanner) {
        System.out.println("\n___CADASTRO DE ITEM___");
        System.out.print("\nInsira o ID do item: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("\nInsira o nome do item: ");
        String nome = scanner.nextLine();

        System.out.print("\nQual o tipo do item?(fruta, árvore, talher, etc): ");
        String tipo = scanner.nextLine();

        System.out.print("\nInsira o valor do item: ");
        double valor = scanner.nextDouble();

        Item novoItem = new Item(id, nome, tipo, valor);
        listaItens.add(novoItem);

        System.out.println("\nItem cadastrado");
    }


    private static void listarItens(List<Item> listaItens) {
        System.out.println("\n___ITENS CADASTRADOS___");
        for (Item item : listaItens) {
            System.out.println(item);
        }
    }


    private static void criarPedido(List<Item> listaItens, List<Pedido> listaPedidos, Scanner scanner) {
        System.out.println("\n___CRIAÇÃO DE PEDIDO___");
        
        System.out.println("\nSelecione os itens que você dejesa comprar:");

        for (int i = 0; i < listaItens.size(); i++) {
            System.out.println((i + 1) + ". " + listaItens.get(i));
        }

        
        System.out.print("\nInsira o número do item (insira qualquer valor negativo para sair): ");
        int opcaoItem;


        List<Item> itensSelecionados = new ArrayList<>();
        while ((opcaoItem = scanner.nextInt()) >= 0) {
            if (opcaoItem >= 1 && opcaoItem <= listaItens.size()) {
                Item itemSelecionado = listaItens.get(opcaoItem - 1);
                itensSelecionados.add(itemSelecionado);
                System.out.println("\n" + itemSelecionado.getNome() + " selecionado(a).");
            } else {
                System.out.println("\nOpção inválida. Tente novamente.");
            }
            System.out.print("\nQual é o número do próximo item?: ");
        }


        if (!itensSelecionados.isEmpty()) {
            System.out.println("\nPedido criado com os itens:");
            for (Item item : itensSelecionados) {
                System.out.println(item);
            }
        } else {
            System.out.println("Pedido não foi criado");
        }
    }

    
    public static void main(String[] args) {

        List<Item> listaItens = new ArrayList<>();
        List<Pedido> listaPedidos = new ArrayList<>();
        
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n|MENU:\n|[1] Cadastrar novo item\n|[2] Listar itens cadastrados\n|[3] Criar pedido\n|[4] Sair");
            int opcao = scanner.nextInt();
    
            switch (opcao) {
                case 1:
                    cadastrarNovoItem(listaItens, scanner);
                    break;
    
                case 2:
                    listarItens(listaItens);
                    break;
                
                case 3:
                    criarPedido(listaItens, listaPedidos, scanner);
                    break;
                
                
                case 4:
                    System.out.println("\nSAINDO DO PROGRAMA");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("\nOPÇÃO INVÁLIDA!");
                    break;
            }
            
            System.out.println("--------------------------------------------");
        } 
    }
}

