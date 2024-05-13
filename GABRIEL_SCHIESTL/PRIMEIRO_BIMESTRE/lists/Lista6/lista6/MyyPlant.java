package PRIMEIRO_BIMESTRE.lists.Lista6.lista6;

import java.util.Scanner;
import java.util.Date;

public class MyyPlant {

    private static Scanner sc = new Scanner(System.in);
    private static Date date = new Date();
    private static Loja l1;
    private static Vendedor v1;
    private static Cliente c1;
    private static Gerente g1;
    private static Item[] items = new Item[10];
    private static Item[] order = new Item[10];

    public static void main(String[] args) {

        int option;
        do {
            System.out.println("1 - Inserir cliente");
            System.out.println("2 - Inserir gerente");
            System.out.println("3 - Inserir vendedor");
            System.out.println("4 - Inserir loja");
            System.out.println("5 - Inserir item");
            System.out.println("6 - Criar pedido");
            System.out.println("7 - Listar itens");
            System.out.println("Qualquer numero - sair do sistema");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    c1 = insertCustomer();
                    break;

                case 2:
                    g1 = insertManager();
                    break;

                case 3:
                    v1 = insertSeller();
                    break;

                case 4:
                    l1 = insertStore();
                    break;

                case 5:
                    insertItem();
                    break;

                case 6:
                    createOrder(c1, l1, v1, items);
                    break;

                case 7:
                    listItems();
                    break;

                default:
                    System.out.println("Saindo do sistema...");
                    break;
            }
        } while (option < 8 && option > 0);
    }

    static Cliente insertCustomer() {

        System.out.println("Digite o nome do cliente");
        String name = sc.next();
        System.out.println("Digite a idade do cliente");
        int age = sc.nextInt();
        Cliente c1 = new Cliente(name, age);
        return c1;
    }

    static Gerente insertManager() {
        System.out.println("Digite o nome do gerente");
        String name = sc.next();
        System.out.println("Digite a idade do gerente");
        int age = sc.nextInt();
        System.out.println("Digite o salario do gerente");
        float salary = sc.nextInt();
        Gerente g1 = new Gerente(name, age, salary);
        return g1;
    }

    static Vendedor insertSeller() {
        System.out.println("Digite o nome do vendedor");
        String name = sc.next();
        System.out.println("Digite a idade do vendedor");
        int age = sc.nextInt();
        System.out.println("Digite o salario do vendedor");
        float salary = sc.nextInt();
        Vendedor v1 = new Vendedor(name, age, salary);
        return v1;
    }

    static void insertItem() {
        System.out.println("Digite o nome do produto");
        String name = sc.next();
        System.out.println("Digite o tipo do produto");
        String type = sc.next();
        System.out.println("Digite o ID do produto");
        String id = sc.next();
        System.out.println("Digite o preco do produto");
        float price = sc.nextFloat();
        for (int i = 0; i <= items.length; i++) {
            if (items[i] == null) {
                items[i] = new Item(name, type, id, price);
                break;
            }
        }
    }

    static Loja insertStore() {
        System.out.println("Digite o nome fantasia da loja:");
        String popularName = sc.next();
        System.out.println("Digite a razao social da loja:");
        String socialReason = sc.next();
        System.out.println("Digite o cnpj da loja:");
        String cnpj = sc.next();
        Loja l1 = new Loja(popularName, socialReason, cnpj);
        return l1;
    }

    static void createOrder(Cliente c1, Loja l1, Vendedor v1, Item[] items) {
        int y = 0;
        int i = 0;
        int[] quantity = new int[100];
        boolean confirm = true;
        if (items[y] == null) {
            return;
        }
        do {
            System.out.println("Escolha um item conforme a numeracao: ");
            for (y = 0; y <= items.length; y++) {
                if (items[y] == null) {
                    break;
                }
                System.out.println((y + 1) + " - " + items[y].getName());
            }
            order[i] = items[(sc.nextInt() - 1)];
            System.out.println("Qual a quantidade deste item?");
            quantity[i] = sc.nextInt();
            System.out.println("Inserir mais um item no pedido?\n1 - sim\n2 - nao");
            confirm = sc.nextInt() == 1 ? true : false;
            i++;
        } while (confirm);
        ProcessaPedido o1 = new ProcessaPedido(quantity, order, c1, v1, l1, date, 0, 0);
        System.out.println("Pedido realizado com sucesso!");
        System.out.println("R$" + o1.getTotalPrice());
    }

    static void listItems() {
        if (items[0] == null) {
            System.out.println("Nao ha itens cadastrados.");
        } else {
            for (int i = 0; i < items.length; i++) {
                if (items[i] == null) {
                    break;
                }
                System.out.println(items[i].getId() + " - " + items[i].getName() + " - R$" + items[i].getPrice());
            }
        }
    }
}
