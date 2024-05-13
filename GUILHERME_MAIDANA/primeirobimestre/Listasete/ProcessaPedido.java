package primeirobimestre.Listasete;
import java.util.Date;
import java.util.List;



public class ProcessaPedido {
    public void processar(int idPedido, Date dataCriacao, Cliente cliente, Vendedor vendedor, Loja loja, List<Item> itens) {
        Pedido pedido = new Pedido(idPedido, dataCriacao, cliente, vendedor, loja, itens);
        boolean pagamentoConfirmado = confirmarPagamento(pedido);
        if (pagamentoConfirmado) {
            System.out.println("Pedido processado com sucesso!");
        } else {
            System.out.println("Não foi possível processar o pedido devido à reserva vencida.");
        }
    }

    private boolean confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        if (dataAtual.before(pedido.calcularDataVencimentoReserva())) {
            
            pedido.setDataPagamento(dataAtual);
            return true;
        } else {
            return false;
        }
    }

    public void apresentarSe(int idPedido, Date dataCriacao, Cliente cliente, Vendedor vendedor, Loja loja, List<Item> itens) {
        Pedido pedido = new Pedido(idPedido, dataCriacao, cliente, vendedor, loja, itens);
        System.out.println("Pedido ID: " + idPedido);
        System.out.println("Data de Criação: " + dataCriacao);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Loja: " + loja.getNome());
        System.out.println("Itens do Pedido:");
        for (Item item : itens) {
            item.gerarDescricao();
        }
        System.out.println("Valor Total do Pedido: " + pedido.calcularValorTotal());
    }

    public static void main(String[] args) {
       
        Date dataCriacao = new Date(System.currentTimeMillis() - 2 * 24 * 60 * 60 * 1000);
        Cliente cliente = new Cliente("Jeff");
        Vendedor vendedor = new Vendedor("Altair");
        Loja loja = new Loja("myy Plant", null, null, null, null, null);
        Item[] itens = {new Item(1, "Produto 1", "Tipo 1", 100.0)};
        ProcessaPedido processador = new ProcessaPedido();
        processador.apresentarSe(1, dataCriacao, cliente, vendedor, loja, itens);

        Date dataCriacao2 = new Date(System.currentTimeMillis() - 4 * 24 * 60 * 60 * 1000);
        ProcessaPedido processador2 = new ProcessaPedido();
        processador2.apresentarSe(2, dataCriacao2, cliente, vendedor, loja, itens);
    }

    private void apresentarSe(int idPedido, Date dataCriacao, Cliente cliente, Vendedor vendedor, Loja loja,
            Item[] itens) {
    }
}
