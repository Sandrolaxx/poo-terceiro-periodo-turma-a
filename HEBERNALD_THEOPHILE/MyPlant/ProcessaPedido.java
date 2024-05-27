package MyPlant;

import java.util.Date;

public class ProcessaPedido {
    public void processar(int idPedido, Date dataCriacao, Cliente cliente, Vendedor vendedor, String loja, Item[] itens) {
        Pedido pedido = new Pedido(idPedido, dataCriacao, cliente, vendedor, loja, itens);
        confirmarPagamento(pedido);
    }

    private void confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        if (dataAtual.before(pedido.getDataVencimentoReserva())) {
            System.out.println("Pagamento confirmado. Reserva válida.");
        } else {
            System.out.println("Pagamento não confirmado. Reserva vencida.");
        }
    }
}
