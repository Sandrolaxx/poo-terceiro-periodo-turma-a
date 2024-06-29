package primeirobi.listas.listaseis;

public class TesteListaSeis {

    public static void main(String[] args) {

        Cliente cli = new Cliente();

        cli.setNome("Sandrolax");
        cli.setIdade(25);
        cli.setEndereco(new Endereco());

        Vendedor vendedorUm = new Vendedor();

        vendedorUm.setNome("Cleber");
        vendedorUm.setIdade(18);
        vendedorUm.setEndereco(new Endereco());

        Loja lojaUm = new Loja();

        lojaUm.setRazaoSocial("NU Pagamentos");
        lojaUm.setNomeFantasia("Nubank");
        lojaUm.setCnpj("1231233459034");
        lojaUm.setClientes(new Cliente[] { cli });
        lojaUm.setEndereco(new Endereco());
        lojaUm.setVendedores(new Vendedor[] { vendedorUm });

        Item item = new Item();

        item.setId(1);
        item.setNome("Flor azul");
        item.setValor(34.50);

        ProcessaPedido processaPedido = new ProcessaPedido();
        Item [] items = new Item[] { item };

        Pedido pedidoCriado = processaPedido.processa(items, "valor random");
    
        pedidoCriado = processaPedido.confirmarPagamento(pedidoCriado);

        System.out.println(pedidoCriado.getDataPagamento());
        System.out.println(pedidoCriado.getDataVencimentoReserva());
    }

}
