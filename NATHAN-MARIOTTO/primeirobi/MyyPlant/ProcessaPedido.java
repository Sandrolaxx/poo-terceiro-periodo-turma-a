

import java.util.Date;

public class ProcessaPedido {
    public void processar(Pedido pedido) {
        System.out.println("Processando pedido...");
        pedido.gerarDescricaoVenda();
        if (confirmarPagamento(pedido)) {
            System.out.println("Pagamento confirmado.");
        } else {
            System.out.println("Pagamento não pode ser confirmado. A data de vencimento da reserva já passou.");
        }
    }

    private boolean confirmarPagamento(Pedido pedido) {
        Date now = new Date();
        // Supõe-se que há um método getter para dataVencimentoReserva
        return now.before(pedido.getDataVencimentoReserva());
    }
}
