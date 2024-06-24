package Testes.Lista5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Loja loja1 = new Loja("My Plant", 123456789, "My Plant Store");

        System.out.println("\nLoja: ");
        loja1.apresentarSe();
        Endereco endereloja1 = new Endereco("Centro", 124, "Loja 01");
        endereloja1.apresentarLogradouro();

        // System.out.println("Informe o bairro do vendedor 1 ");
        // String bairrovendedor1 = scanner.nextLine(); 
        // Joga a variavel bairrovendedor1 dentro do construtor de endereço.
        Vendedor vendedor1 = new Vendedor("Mateus", 26, "My Planta 01", 1800.0);
        System.out.println("\nVendedor 1: ");
        Endereco enderecoVendedor1 = new Endereco("Centro", 124, "Loja 01");
        vendedor1.apresentarSe();
        enderecoVendedor1.apresentarLogradouro();
        vendedor1.calcularMedia();
        vendedor1.calcularBonus();
        loja1.adicionarVendedor();

        Vendedor vendedor2 = new Vendedor("João", 30, "My Planta 02", 2000.0);
        System.out.println("\nVendedor 2: ");
        Endereco enderecoVendedor2 = new Endereco("Parque Verde", 69, "Loja 02");
        vendedor2.apresentarSe();
        enderecoVendedor2.apresentarLogradouro();
        vendedor2.calcularMedia();
        vendedor2.calcularBonus();
        loja1.adicionarVendedor();

        Cliente cliente1 = new Cliente("Isabelly Ferrari", 27);
        System.out.println("\nCliente 1: ");
        Endereco enderecocliente1 = new Endereco("Cascavel Velho", 633, "Andar 14");
        cliente1.apresentarSe();
        enderecocliente1.apresentarLogradouro();
        loja1.adicionarCliente();


        Cliente cliente2 = new Cliente("Carlos Silva", 35);
        Endereco enderecocliente2 = new Endereco("Nova Cidade", 26, "Casa");
        System.out.println("\nCliente 2: ");
        cliente2.apresentarSe();
        enderecocliente2.apresentarLogradouro();
        loja1.adicionarCliente();

        Gerente gerente1 = new Gerente("Rogério", 36, "My Planta 01", 3500.0);
        System.out.println("\nGerente 1: ");
        Endereco enderecogerente1 = new Endereco("Centro", 124, "Loja 01");
        gerente1.apresentarSe();
        enderecogerente1.apresentarLogradouro();
        gerente1.calcularMedia();
        gerente1.calcularBonus();


        System.out.println("\nContagens: ");
        loja1.contarClientes();
        loja1.contarVendedores();

        System.out.println("\nCriando pedido fictício:");
        List<Item> itensPedido = new ArrayList<>();
        itensPedido.add(new Item(12615, "Samambaia", "Planta", 29.90));
        itensPedido.add(new Item(12616, "Cacto", "Planta", 15.00));

        ProcessaPedido processaPedido = new ProcessaPedido();
        Pedido pedido = processaPedido.processar(1, cliente1, vendedor1, loja1, itensPedido);
        pedido.gerarDescricaoVenda();
        processaPedido.testarConfirmacaoPagamento(pedido);
    }
}


