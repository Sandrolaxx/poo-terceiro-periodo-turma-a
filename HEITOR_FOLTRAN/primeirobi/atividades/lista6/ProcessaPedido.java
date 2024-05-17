package primeirobi.atividades.lista6;

import java.util.Date;

public class ProcessaPedido {
    public void processar(Pedido pedido) {
        confirmarPagamento(pedido);
    }

    private void confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        if (pedido.getDataVencimentoReserva().after(dataAtual)) {
            System.out.println("Pagamento confirmado, pedido com id: " + pedido.getId());
        } else {
            System.out.println("Reserva vencida do pedido com id: " + pedido.getId());
        }
    }
}