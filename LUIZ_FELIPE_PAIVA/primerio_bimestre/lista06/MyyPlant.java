package LUIZ_FELIPE_PAIVA.primerio_bimestre.lista06;

import java.util.Date;

public class MyyPlant {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("João", 30, "Myy Plant", "São Paulo", "Centro", "Rua A", 1500.0);
        Cliente cliente1 = new Cliente("Maria", 45, "São Paulo", "Jardins", "Avenida B", 34, "casa");
        Gerente gerente1 = new Gerente("Antônio", 50, "Myy Plant", "São Paulo", "Perdizes", "Rua C", 5000.0);
        Endereco endereco1 = new Endereco("São Paulo", "São Paulo", "Centro", 123, "Próximo à Praça da Sé");
        Loja loja = new Loja("Myy Plant", "Floricultura Myy Plant", "987957321");
        Item item1 = new Item(12345, "Girassol", "Planta", 20.0);
        Item item2 = new Item(67890, "Vaso Decorativo Grande", "Vaso", 30.0);

        loja.adicionarVendedor(vendedor1);
        loja.adicionarCliente(cliente1);
        loja.adicionarGerente(gerente1);
        loja.adicionarEndereco(endereco1);
        loja.adicionarItem(item1);
        loja.adicionarItem(item2);

        System.out.println("INFORMAÇÕES DA LOJA\n");
        loja.apresentarSe();
        System.out.println("\nINFORMAÇÕES DO GERENTE DA LOJA");
        gerente1.apresentarSe();
        System.out.println("MÉDIA DO SEU SALÁRIO: R$" + gerente1.calcularMedia());
        System.out.println("SEU BÔNUS: R$ " + gerente1.calcularBonus());

        System.out.println("\nINFORMAÇÕES DO VENDEDOR");
        vendedor1.apresentarSe();
        System.out.println("MÉDIA DO SEU SALÁRIO: " + vendedor1.calcularMedia());
        System.out.println("SEU BÔNUS: " + vendedor1.calcularBonus());

        System.out.println("\nINFORMAÇÕES DO CLIENTE");
        cliente1.apresentarSe();

        System.out.println("\nINFORMAÇÕES DOS ITENS");
        item1.gerarDescricao();
        item2.gerarDescricao();

        System.out.println("\nINFORMAÇÕES DOS PEDIDOS");
        ProcessaPedido processador = new ProcessaPedido();
        processador.processar(1, new Date(), cliente1, vendedor1, loja);
        processador.testarConfirmarPagamento();

        processarPedidoFicticio(loja);
    }

    public static void processarPedidoFicticio(Loja loja) {

        int idPedido = 2;
        Date dataCriacao = new Date();
        Cliente cliente = new Cliente("Pedro", 35, "São Paulo", "Vila Madalena", "Rua D", 67, "casa");
        Vendedor vendedor = new Vendedor("Ana", 28, "Myy Plant", "São Paulo", "Jardim Paulista", "Rua E", 1300.0);
        
        ProcessaPedido processador = new ProcessaPedido();
        processador.processar(idPedido, dataCriacao, cliente, vendedor, loja);
    }
}
