
    import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

package primeirobi;

public class exercicio7  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Item> itens = new ArrayList<>(); 
        
        while (true) { 
            exibirMenu();
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    cadastrarItem(scanner, itens);
                    break;
                case 2:
                    listarItens(itens);
                    break;
                case 3:
                    processarPedido(scanner, itens);
                    break;
                case 4:
                    System.out.println("Saindo..."); 
                    scanner.close(); 
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static void exibirMenu() {
        System.out.println("\nMenu:\n");
        System.out.println("1. Cadastrar Item");
        System.out.println("2. Listar Itens");
        System.out.println("3. Processar Pedido");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void cadastrarItem(Scanner scanner, List<Item> itens) {
        System.out.print("Digite o nome do item: ");
        String nome = scanner.next();
        System.out.print("Digite o preço do item: ");
        double preco = scanner.nextDouble();
        itens.add(new Item(nome, preco));
        System.out.println("Item cadastrado com sucesso.");
    }

    public static void listarItens(List<Item> itens) {
        if (itens.isEmpty()) {
            System.out.println("Nenhum item cadastrado.");
        } else {
            System.out.println("Itens cadastrados:");
            for (Item item : itens) {
                System.out.println(item);
            }
        }
    }

    public static void processarPedido(Scanner scanner, List<Item> itens) {
        if (itens.isEmpty()) {
            System.out.println("Nenhum item cadastrado. Cadastre itens antes de processar um pedido.");
            return;
        }
        System.out.println("Itens disponíveis:");
        for (int i = 0; i < itens.size(); i++) {
            System.out.println((i + 1) + ". " + itens.get(i));
        }
        System.out.print("Escolha o número do item que deseja comprar: ");
        int escolha = scanner.nextInt();
        if (escolha < 1 || escolha > itens.size()) {
            System.out.println("Opção inválida.");
            return;
        }
        Item itemEscolhido = itens.get(escolha - 1);
        System.out.print("Digite a quantidade do item selecionado: ");
        int quantidade = scanner.nextInt();
        double precoTotal = itemEscolhido.getPreco() * quantidade;
        System.out.println("Pedido processado: " + quantidade + " " + itemEscolhido.getNome() + "(s) por R$ " + precoTotal);
    }
}

class Item {
    private String nome;
    private double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }
}


