package primeirobi.atividades.sysLista6;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando endereços
        Endereco enderecoVendedor = new Endereco("SP", "São Paulo", "Centro", "Rua das Flores", "123", "Apartamento 101");
        Endereco enderecoCliente = new Endereco("SP", "São Paulo", "Jardim Paulista", "Avenida Paulista", "2000", "Bloco B");

        // Criando pessoas
        Vendedor vendedor = new Vendedor("João Silva", 35, "Myy Plant", enderecoVendedor, 3000.00, new double[]{3200.00, 3400.00, 3600.00});
        Cliente cliente = new Cliente("Maria Santos", 29, enderecoCliente);
        Gerente gerente = new Gerente("Lucas Pereira", 40, "Myy Plant", enderecoVendedor, 5000.00, new double[]{5200.00, 5400.00, 5600.00});

        // Criando itens e pedido
        Item item1 = new Item(1, "Planta da Amazônia", "Planta", 150.00);
        Item item2 = new Item(2, "Vaso Decorativo", "Acessório", 100.00);

        Pedido pedido = new Pedido(101, new Date(), cliente, vendedor, "Myy Plant");
        pedido.addItem(item1);
        pedido.addItem(item2);

        // Processando o pedido
        ProcessaPedido processador = new ProcessaPedido();
        processador.processar(pedido);

        // Apresentações
        vendedor.apresentarSe();
        cliente.apresentarSe();
        gerente.apresentarSe();

        // Descrições e cálculos
        item1.gerarDescricao();
        item2.gerarDescricao();

        pedido.gerarDescricaoVenda();
        System.out.println("Bônus do Vendedor: R$" + vendedor.calcularBonus());
        System.out.println("Bônus do Gerente: R$" + gerente.calcularBonus());

        // Apresentar endereços
        enderecoVendedor.apresentarLogradouro();
        enderecoCliente.apresentarLogradouro();
    }
}
