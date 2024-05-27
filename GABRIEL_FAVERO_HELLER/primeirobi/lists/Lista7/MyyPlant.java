package primeirobi.lists.Lista7;

import java.util.Scanner;
import java.util.Date;

public class MyyPlant {

    private static Scanner scanner = new Scanner(System.in);
    private static Date data = new Date();
    private static Loja loja1;
    private static Vendedor vendedor1;
    private static Cliente cliente1;
    private static Gerente gerente1;
    private static Item[] items = new Item[10];
    private static Item[] pedido = new Item[10];

    public static void main(String[] args) {

        int option;
        do {
            System.out.println("\n======= MENU =======");
            System.out.println("Funcionalidades principais:");
            System.out.println("[1] - Cadastrar item");
            System.out.println("[2] - Criar pedido");
            System.out.println("[3] - Listar itens");
            System.out.println("====================");
            System.out.println("Funcionalidades extras");
            System.out.println("[4] - Cadastrar cliente");
            System.out.println("[5] - Cadastrar gerente");
            System.out.println("[6] - Cadastrar vendedor");
            System.out.println("[7] - Cadastrar loja");
            System.out.println("====================");
            System.out.println("[0] - Sair do sistema");
            System.out.println("====================\n");
            
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    cadastrarItem();
                    break;
                    
                case 2:
                    criarPedido(cliente1, loja1, vendedor1, items);
                    break;
                    
                case 3:
                    listarItems();
                    break;

                case 4:
                    cliente1 = cadastrarCliente();
                    break;
                    

                case 5:
                    gerente1 = cadastrarGerente();
                    break;

                case 6:
                    vendedor1 = cadastrarVendedor();
                    break;
                
                case 7:
                    loja1 = cadastrarLoja();
                    break;

                default:
                    System.out.println("Saindo do sistema...");
                    break;
            }
        } while (option < 8 && option > 0);
    }

    static void cadastrarItem() {
        System.out.println("Id: ");
        String id = scanner.next();
        System.out.println("Nome: ");
        String nome = scanner.next();
        System.out.println("Tipo: ");
        String tipo = scanner.next();
        System.out.println("Valor: ");
        double valor = scanner.nextDouble();
        for (int i = 0; i <= items.length; i++) {
            if (items[i] == null) {
                items[i] = new Item(id, nome, tipo, valor);
                break;
            }
        }   
    }

    static void criarPedido(Cliente cliente1, Loja loja1, Vendedor vendedor1, Item[] items) {
        int y = 0;
        int i = 0;
        int[] quantidade = new int[100];
        boolean confirm = true;
        if (items[y] == null) {
            return;
        }
        do {
            System.out.println("Id do item: ");
            for (y = 0; y <= items.length; y++) {
                if (items[y] == null) {
                    break;
            }
            System.out.println((y + 1) + " - " + items[y].getNome());
        }
        pedido[i] = items[(scanner.nextInt() - 1)];
        System.out.println("Quantidade do item: ");
        quantidade[i] = scanner.nextInt();
        System.out.println("Para mais itens: ");
        System.out.println("[1] - Sim ");
        System.out.println("[0] - Não ");
        confirm = scanner.nextInt() == 1 ? true : false;
        i++;
        } while (confirm);
        ProcessaPedido pedido1 = new ProcessaPedido(quantidade, pedido, cliente1, vendedor1, loja1, data, 0, 0);
        System.out.println("Pedido finaliazdo!");
        System.out.println("R$ " + pedido1.getValorTotal());
    }

    static void listarItems() {
        if (items[0] == null) {
            System.out.println("Nenhum item cadastrado!");
        } else {
            for (int i = 0; i < items.length; i++) {
                if (items[i] == null) {
                    break;
                }
                System.out.println(items[i].getId() + " - " + items[i].getNome() + " - " + items[i].getTipo() + " - " + items[i].getValor());
            }
        }
    }

    static Cliente cadastrarCliente() {
        System.out.println("Nome: ");
        String nome = scanner.next();
        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        Cliente cliente1 = new Cliente(nome, idade);
        return cliente1;
    }

    private static Gerente cadastrarGerente() {
        System.out.println("Nome: ");
        String nome = scanner.next();
        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        System.out.println("Salário ");
        double salario = scanner.nextDouble();
        Gerente gerente1 = new Gerente(nome, idade, salario);
        return gerente1;
    }

    private static Vendedor cadastrarVendedor() {
        System.out.println("Nome: ");
        String nome = scanner.next();
        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        System.out.println("Salário");
        double salario = scanner.nextDouble();
        Vendedor vendedor1 = new Vendedor(nome, idade, salario);
        return vendedor1;
    }

    private static Loja cadastrarLoja() {
        System.out.println("Nome fantasia: ");
        String nomeFantasia = scanner.next();
        System.out.println("Razão social:");
        String razaoSocial = scanner.next();
        System.out.println("Cnpj: ");
        String cnpj = scanner.next();
        Loja loja1 = new Loja(nomeFantasia, razaoSocial, cnpj);
        return loja1;
    }
}