package Atividade_007;

import java.util.List;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        while (true) {

            System.out.println("---------> menu <---------");
            System.out.println(">escolha uma opcao<");
            System.out.println("(1) cliente");
            System.out.println("(2) endereco");
            System.out.println("(3) gerente");
            System.out.println("(4) item");
            System.out.println("(5) loja");
            System.out.println("(6) pedido");
            System.out.println("(7) processar pedido");
            System.out.println("(8) vendedor");
            System.out.println("(9) sair");
            System.out.println("---------> '-' <---------");

            int op = scanner.nextInt();

            switch (op) {
                case 1:
                    cliente();

                    break;

                case 2:
                    endereco();

                    break;

                case 3:
                    gerente();

                    break;
                case 4:
                    item();

                    break;

                case 5:
                    loja();

                    break;

                case 6:
                    pedido();

                    break;

                case 7:
                    processarPedido();

                    break;

                case 8:
                    vendedor();

                    break;

                case 9:
                    scanner.close();
                    System.exit(0);
                    break;

                default:

            }

        }

    }

    private static void cliente() {
        System.out.println("classe cliente: ");
        ClassClient cliente = new ClassClient("joao", 30, "sao paulo", "centro", "rua1");
        cliente.apresentarse();
    }

    private static void endereco() {
        System.out.println("classe endereço");
        ClassEndereco endereco = new ClassEndereco("parana", "cascavel", "bairro1", "n.169", "casa");
        endereco.apresentarLogradouro();
    }

    private static void gerente() {
        System.out.println("classe endereco");
        ClassGerente gerente = new ClassGerente("gabi", 22, "campina", "bairro2", "rua2", 2500, "Supremo",
                List.of(2500.0, 2640.6));
        gerente.apresentarse();
    }

    private static void item() {
        System.out.println("classe item");
        ClassItem item1 = new ClassItem("25", "item1", "decoracao", 26.99);
        item1.gerarDescricao();

        ClassItem item2 = new ClassItem("26", "item", "decoracao", 28.99);
        item2.gerarDescricao();

        ClassItem item3 = new ClassItem("27", "item3", "variados", 25.99);
        item3.gerarDescricao();

    }

    private static void loja() {
        System.out.println("classe loja");
        ClassShop loja1 = new ClassShop("supremo", "supremo eletronicos", 35622, "campina", "bairro3", "rua3",
                List.of("cliente1, cliente2"), List.of("vendedor1, vendedor2"));
        loja1.countCustomer();
        loja1.countSeller();
    }

    private static void pedido() {
        System.out.println("classe pedido");

        long currentTimeMillis = System.currentTimeMillis();

        ClassPedido pedido = new ClassPedido(1, new Date(currentTimeMillis),
                new Date(currentTimeMillis),
                new Date(currentTimeMillis + (3 * 86400000)),
                "cliente1", "vendedor1", "loja", List.of(10.0, 20.0, 30.0));

        System.out.println("criação do pedido: " + pedido.getDataCriacao());
        System.out.println("total do pedido: " + pedido.calcularValorTotal());
        pedido.gerarDescricaoVenda();
    }

    private static void processarPedido() {
        System.out.println("processar pedido");

        ClassProcessaPedido processador = new ClassProcessaPedido();

        Date dataVencimentoFutura = new Date(System.currentTimeMillis() + (3 * 86400000));

        processador.processar(1, new Date(), dataVencimentoFutura, dataVencimentoFutura, "Cliente 1", "Vendedor 1",
                "Loja 1", List.of(10.0, 20.0, 30.0));
    }

    private static void vendedor() {
        System.out.println("classe vendedor");
        ClassSeller vendedor1 = new ClassSeller("vendedor1", 35, "campina", "bairro3", "rua3", 2500.0, "2500",
                List.of(12.0, 12.0));
        vendedor1.apresentarse();

    }
}
