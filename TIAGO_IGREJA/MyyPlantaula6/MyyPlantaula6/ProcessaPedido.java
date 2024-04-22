import java.util.Date;

public class ProcessaPedido {
    public void processar(Pedido pedido) {
        System.out.println("Processando pedido...");
        pedido.gerarDescricaoVenda();
    }

    @SuppressWarnings("unused")
    private boolean confirmarPagamento(Pedido pedido) {
        Date now = new Date();
        return now.before(pedido.getDataVencimentoReserva());
    }
}
