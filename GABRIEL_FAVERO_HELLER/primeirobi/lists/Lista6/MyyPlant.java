package primeirobi.lists.Lista6;

import java.util.Scanner;
import java.util.Date;

public class MyyPlant {

    private static Scanner scanner = new Scanner(System.in);
    private static Date date = new Date();
    private static Loja loja1;
    private static Vendedor vendedor1;
    private static Cliente cliente1;
    private static Gerente gerente1;
    private static Item item1;

    public static void main(String[] args) {

        int option;
        do {
            System.out.println("\n1 - Inserir cliente");
            System.out.println("2 - Inserir gerente");
            System.out.println("3 - Inserir vendedor");
            System.out.println("4 - Inserir loja");
            System.out.println("5 - Inserir item");
            System.out.println("6 - Criar pedido");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    cliente1 = inserirCliente();
                    break;

                case 2:
                    gerente1 = inserirGerente();
                    break;

                case 3:
                    vendedor1 = inserirVendedor();
                    break;

                case 4:
                    loja1 = inserirLoja();
                    break;

                case 5:
                    item1 = inserirItem();
                    criarPedido(cliente1, loja1, vendedor1, item1);
                    break;

                case 6:
                    if (item1 == null) {
                        System.out.println("\nErro: Nenhum item foi inserido.");
                        break;
                    }
                    criarPedido(cliente1, loja1, vendedor1, item1);
                    break;

                default:
                    System.out.println("Saindo...");
                    break;
            }
        } while (option < 7 && option > 0);
    }

    private static Cliente inserirCliente() {

        System.out.println("Insira o nome do cliente");
        String nome = scanner.next();
        System.out.println("Insira a idade do cliente");
        int idade = scanner.nextInt();
        Cliente cliente1 = new Cliente(nome, idade);
        return cliente1;
    }

    private static Gerente inserirGerente() {
        System.out.println("Insira o nome do gerente");
        String nome = scanner.next();
        System.out.println("Insira a idade do gerente");
        int idade = scanner.nextInt();
        System.out.println("Insira o salário do gerente");
        double salario = scanner.nextDouble();
        Gerente gerente1 = new Gerente(nome, idade, salario);
        return gerente1;
    }

    private static Vendedor inserirVendedor() {
        System.out.println("Insira o nome do vendedor");
        String nome = scanner.next();
        System.out.println("Insira a idade do vendedor");
        int idade = scanner.nextInt();
        System.out.println("Insira o salário do vendedor");
        double salario = scanner.nextDouble();
        Vendedor vendedor1 = new Vendedor(nome, idade, salario);
        return vendedor1;
    }

    private static Item inserirItem() {
        System.out.println("Insira o nome do produto");
        String nome = scanner.next();
        System.out.println("Insira o tipo do produto");
        String tipo = scanner.next();
        System.out.println("Insira o ID do produto");
        String id = scanner.next();
        System.out.println("Insira o preço do produto");
        double valor = scanner.nextDouble();
        Item item1 = new Item(nome, tipo, id, valor);
        return item1;
    }

    private static Loja inserirLoja() {
        System.out.println("Insira o nome fantasia da loja:");
        String nomeFantasia = scanner.next();
        System.out.println("Insira a razão social da loja:");
        String razaoSocial = scanner.next();
        System.out.println("Insira o CNPJ da loja:");
        String cnpj = scanner.next();
        Loja loja1 = new Loja(nomeFantasia, razaoSocial, cnpj);
        return loja1;
    }

    private static void criarPedido(Cliente cliente1, Loja loja1, Vendedor vendedor1, Item item1) {
        ProcessaPedido processaPedido = new ProcessaPedido();
        Pedido pedido1 = processaPedido.processar(item1.nome, item1.id, item1.valor, cliente1, vendedor1, loja1, date,
                0, 0);
        System.out.println("\nPedido criado com sucesso!\n");
        System.out.println("Nome do produto: " + pedido1.items[1]);
        System.out.println("ID do pedido: " + pedido1.id);
        System.out.println("Preço do produto: " + pedido1.valorTotal);
        System.out.println("Cliente: " + pedido1.cliente.nome);
        System.out.println("Vendedor: " + pedido1.vendedor.nome);
        System.out.println("Loja: " + pedido1.loja.nomeFantasia);
        System.out.println("Data de criação do pedido: " + pedido1.dataCriacao);
    }
}