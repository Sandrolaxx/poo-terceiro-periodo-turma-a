package primeirobi.atividades.sysLista6;

import java.util.Date;

public class ProcessaPedido {
    public void processar(Pedido pedido) {
        if (new Date().before(pedido.getDataVencimentoReserva())) {
            if (!pedido.isPagamentoConfirmado()) {
                confirmarPagamento(pedido);
            } else {
                System.out.println("Pagamento já foi confirmado para o pedido com ID: " + pedido.id);
            }
        } else {
            System.out.println("Reserva vencida, pedido não pode ser confirmado.");
        }
    }

    private void confirmarPagamento(Pedido pedido) {
        pedido.setDataPagamento(new Date());  // Simula o pagamento no momento atual
        System.out.println("Pagamento confirmado para o pedido com ID: " + pedido.id);
    }
}
