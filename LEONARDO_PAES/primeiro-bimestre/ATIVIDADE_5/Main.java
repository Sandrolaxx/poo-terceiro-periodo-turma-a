package ATIVIDADE_5;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Testes das classes
        testarCliente();
        testarEndereco();
        testarGerente();
        testarItem();
        testarLoja();
        testarPedido();
        testarProcessaPedido();
        testarVendedor();
    }

    private static void testarCliente() {
        System.out.println("Teste da classe Cliente:");
        Cliente cliente = new Cliente("João", 30, "São Paulo", "Centro", "Rua A");
        cliente.apresentarSe();
    }

    private static void testarEndereco() {
        System.out.println("\nTeste da classe Endereco:");
        Endereco endereco = new Endereco("SP", "São Paulo", "Centro", "123", "Ap 101");
        endereco.apresentarLogradouro();
    }

    private static void testarGerente() {
        System.out.println("\nTeste da classe Gerente:");
        Gerente gerente = new Gerente("Maria", 35, "Loja 1", "São Paulo", "Centro", "Rua B", 3000,
                List.of(3000.0, 3100.0, 3200.0));
        System.out.println("Bônus do gerente: " + gerente.calcularBonus());
    }

    private static void testarItem() {
        System.out.println("\nTeste da classe Item:");
        Item item = new Item(1, "Caneta", "Material de Escritório", 2.5);
        item.geraDescricao();
    }

    private static void testarLoja() {
        System.out.println("\nTeste da classe Loja:");
        Loja loja = new Loja("Loja 1", "Empresa XYZ", "123456789", "São Paulo", "Centro", "Rua A");
        System.out.println("Nome Fantasia: " + loja.nomeFantasia);
        loja.contarClientes();
        loja.contarVendedores();
    }

    private static void testarPedido() {
        System.out.println("\nTeste da classe Pedido:");
        Cliente cliente = new Cliente("João", 30, "São Paulo", "Centro", "Rua A");
        Vendedor vendedor = new Vendedor("Pedro", 25, "Loja 1", "São Paulo", "Centro", "Rua B", 2000,
                List.of(2000.0, 2100.0, 2200.0));
        Loja loja = new Loja("Loja 1", "Empresa XYZ", "123456789", "São Paulo", "Centro", "Rua A");
        Item item = new Item(1, "Caneta", "Material de Escritório", 2.5);
        List<Item> itens = List.of(item);
        Pedido pedido = new Pedido(1, new Date(), cliente, vendedor, loja, itens);
        pedido.gerarDescricaoVenda();
    }

    private static void testarProcessaPedido() {
        System.out.println("\nTeste da classe ProcessaPedido:");
        Cliente cliente = new Cliente("João", 30, "São Paulo", "Centro", "Rua A");
        Vendedor vendedor = new Vendedor("Pedro", 25, "Loja 1", "São Paulo", "Centro", "Rua B", 2000,
                List.of(2000.0, 2100.0, 2200.0));
        Loja loja = new Loja("Loja 1", "Empresa XYZ", "123456789", "São Paulo", "Centro", "Rua A");
        Item item = new Item(1, "Caneta", "Material de Escritório", 2.5);
        List<Item> itens = List.of(item);
        ProcessaPedido processador = new ProcessaPedido();
        processador.processar(cliente, vendedor, loja, itens);
    }

    private static void testarVendedor() {
        System.out.println("\nTeste da classe Vendedor:");
        Vendedor vendedor = new Vendedor("Pedro", 25, "Loja 1", "São Paulo", "Centro", "Rua B", 2000,
                List.of(2000.0, 2100.0, 2200.0));
        System.out.println("Média dos salários recebidos: " + vendedor.calcularMedia());
        System.out.println("Bônus: " + vendedor.calcularBonus());
    }
}
