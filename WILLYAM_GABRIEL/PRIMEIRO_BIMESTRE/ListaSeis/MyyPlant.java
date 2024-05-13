package ListaSeis;

import java.util.Date;

public class MyyPlant {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("CLEBER", 25, "MY PLANT'S", "CASCAVEL", "CASCAVEL VELHO", "RUA ROMA", 1200.0);
        Cliente cliente1 = new Cliente("DONA NEIDE", 64, "CASCAVEL", "PARQUE VERDE", "RUA IPÊ");
        Gerente gerente1 = new Gerente("SENHOR OTÁVIO", 58, "MY PLANT'S", "CASCAVEL", "PAULO GODOY", "RUA BRUSQUE", 4550.50);
        Endereco endereco1 = new Endereco("PARANÁ", "CASCAVEL", "CENTRO", 141, "PROXIMA A PREFEITURA");
        Loja loja = new Loja("MY PLANT'S", "FLORICULTURA MY PLANT'S", "123456789");
        Item item1 = new Item(42625, "CACTO-BOLA-DE-NEVE", "PLANTA", 10.00);
        Item item2 = new Item(72642, "VASO DE BARRO - MÉDIO", "VASO", 15.00);

        loja.adicionarVendedor(vendedor1);
        loja.adicionarCliente(cliente1);
        loja.adicionarGerente(gerente1);
        loja.adicionarEndereco(endereco1);
        loja.adicionarItem(item1);
        loja.adicionarItem(item2);

        System.out.println("================================================");
        System.out.println("INFORMAÇÕES DA LOJA");
        loja.apresentarSe();
        System.out.println("================================================");

        System.out.println("================================================");
        System.out.println("INFORMAÇÕES DO GERENTE DA LOJA");
        gerente1.apresentarSe();
        System.out.println("MÉDIA DO SEU SALÁRIO: R$" + gerente1.calcularMedia());
        System.out.println("SEU BÔNUS: R$ " + gerente1.calcularBonus());
        System.out.println("================================================");

        System.out.println("================================================");
        System.out.println("INFORMAÇÕES DO VENDEDOR");
        vendedor1.apresentarSe();
        System.out.println("MÉDIA DO SEU SALÁRIO: " + vendedor1.calcularMedia());
        System.out.println("SEU BÔNUS: " + vendedor1.calcularBonus());
        System.out.println("================================================");

        System.out.println("================================================");
        System.out.println("INFORMAÇÕES DO CLIENTE");
        cliente1.apresentarSe();
        System.out.println("================================================");

        System.out.println("================================================");
        System.out.println("INFORMAÇÕES DOS ITENS");
        item1.gerarDescricao();
        item2.gerarDescricao();
        System.out.println("================================================");

        System.out.println("================================================");
        System.out.println("INFORMAÇÕES DOS PEDIDOS");
        ProcessaPedido processador = new ProcessaPedido();
        processador.processar(1, new Date(), cliente1, vendedor1, loja);
        processador.testarConfirmarPagamento();
        System.out.println("================================================");

        processarPedidoFicticio(loja);
    }

    public static void processarPedidoFicticio(Loja loja) {

        int idPedido = 2;
        Date dataCriacao = new Date();
        Cliente cliente = new Cliente("DONA NEIDE", 64, "CASCAVEL", "PARQUE VERDE", "RUA IPÊ");
        Vendedor vendedor = new Vendedor("CLEBER", 25, "MY PLANT'S", "CASCAVEL", "CASCAVEL VELHO", "RUA ROMA", 1200.0);
        
        ProcessaPedido processador = new ProcessaPedido();
        processador.processar(idPedido, dataCriacao, cliente, vendedor, loja);
    }
}
