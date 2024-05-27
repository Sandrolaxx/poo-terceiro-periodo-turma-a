package ATIVIDADE_6;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Testar Cliente");
            System.out.println("2. Testar Endereco");
            System.out.println("3. Testar Gerente");
            System.out.println("4. Testar Item");
            System.out.println("5. Testar Loja");
            System.out.println("6. Testar Pedido");
            System.out.println("7. Testar Processa Pedido");
            System.out.println("8. Testar Vendedor");
            System.out.println("9. Sair");

            System.out.print("\nEscolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    testarCliente();
                    break;
                case 2:
                    testarEndereco();
                    break;
                case 3:
                    testarGerente();
                    break;
                case 4:
                    testarItem();
                    break;
                case 5:
                    testarLoja();
                    break;
                case 6:
                    testarPedido();
                    break;
                case 7:
                    testarProcessaPedido();
                    break;
                case 8:
                    testarVendedor();
                    break;
                case 9:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        }
    }

    private static void testarCliente() {
        System.out.println("Teste da classe Cliente:");
        Cliente cliente = new Cliente("João", 30, "São Paulo", "Centro", "Rua A");
        cliente.apresentarse();

    }

    private static void testarEndereco() {
        System.out.println("\nTeste da classe Endereco:");
        Endereco endereco = new Endereco("SP", "São Paulo", "Centro", "123", "Ap 101");
        endereco.apresentarLogradouro();
    }

    private static void testarGerente() {
        System.out.println("\nTeste da classe Gerente:");
        Gerente gerente = new Gerente("Maria", 35, "Loja 1", "São Paulo", "Centro",
                "Rua B", 3000,
                List.of(3000.0, 3100.0, 3200.0));
        gerente.apresentarse();
        System.out.println("Media: " + gerente.calcularMedia());
        System.out.println("Bônus do gerente: " + gerente.calcularBonus());
    }

    private static void testarItem() {
        System.out.println("\nTeste da classe Item:");
        Item Item1 = new Item(1, "Caneta", "Material de Escritório", 2.5);
        Item Item2 = new Item(2, "Lapis", "Material de Escritório", 1.25);
        Item1.gerarDescricao();
        Item2.gerarDescricao();
    }

    private static void testarLoja() {
        System.out.println("\nTeste da classe Loja:");
        Loja loja = new Loja("Loja 1", "Empresa XYZ", "123456789", "São Paulo",
                "Centro", "Rua A",
                List.of("Carla", "Paula", "Rafaela"), List.of("Carla", "Paula", "Rafaela"));
        System.out.println("Numero de Clientes: " + loja.contarClientes());
        System.out.println("Numero de Vendedores: " + loja.contarVendedores());

    }

    private static void testarPedido() {
        System.out.println("Teste da classe Pedido:");

        // Obtendo a data atual em milissegundos
        long currentTimeMillis = System.currentTimeMillis();

        // Criando um novo pedido
        Pedido pedido = new Pedido(1, new Date(currentTimeMillis), // Data de criação
                new Date(currentTimeMillis), // Data de pagamento (usando a mesma data decriação neste exemplo)
                new Date(currentTimeMillis + (3 * 86400000)), // Data de vencimento (3 diasapós a data de criação)
                "Cliente 1", "Vendedor 1", "Loja 1", List.of(10.0, 20.0, 30.0));

        System.out.println("Data de criação do pedido: " + pedido.getDataCriacao());
        System.out.println("Valor total do pedido: " + pedido.calcularValorTotal());
        pedido.gerarDescricaoVenda();
    }

    private static void testarProcessaPedido() {

        // Criação de uma instância de ProcessaPedido
        ProcessaPedido processador = new ProcessaPedido();

        // Criação de uma data de vencimento no futuro
        Date dataVencimentoFutura = new Date(System.currentTimeMillis() + (3 * 86400000)); // Adiciona 3 dia

        // Teste com uma data de vencimento futura
        processador.processar(1, new Date(), dataVencimentoFutura, dataVencimentoFutura, "Cliente 1", "Vendedor 1",
                "Loja 1",
                List.of(10.0, 20.0, 30.0));

        // Teste com uma data de vencimento passada
        Date dataVencimentoPassada = new Date(System.currentTimeMillis() - 86400000); // Subtrai 1 dia
        processador.processar(2, new Date(), dataVencimentoFutura, dataVencimentoPassada, "Cliente 2", "Vendedor 2",
                "Loja 2",
                List.of(15.0, 25.0, 35.0));

    }

    private static void testarVendedor() {
        System.out.println("\nTeste da classe Vendedor:");
        Vendedor vendedor = new Vendedor("Pedro", 25, "Loja 1", "São Paulo", "Centro", "Rua B", 2000,
                List.of(2000.0, 2100.0, 2200.0));
        System.out.println("Média dos salários recebidos: " + vendedor.calcularMedia());
        System.out.println("Bônus: " + vendedor.calcularBonus());
    }

}
