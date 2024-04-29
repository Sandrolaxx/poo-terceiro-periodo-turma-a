package ListaSete;

import java.time.LocalDate;

public class ProcessaPedido {
    public void processar(Pedido pedido) {
        System.out.println("Processando pedido...");
        pedido.gerarDescricaoVenda();
    }

    private boolean confirmarPagamento(Pedido pedido) {
        LocalDate agora = LocalDate.now();
        return agora.isBefore(pedido.getDataVencimentoReserva());
    }
}
