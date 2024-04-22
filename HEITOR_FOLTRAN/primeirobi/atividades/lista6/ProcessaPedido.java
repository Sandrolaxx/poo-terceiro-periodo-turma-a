package primeirobi.atividades.lista6;

import java.util.Date;

public class ProcessaPedido {

    public void processar(int idPedido, Date dataAtual, Cliente cliente, Vendedor vendedor, Loja loja, Item[] itens) {
        Date dataCriacao = new Date();
        Pedido pedido = new Pedido(idPedido, dataCriacao, cliente, vendedor, loja, itens);

        if (!verificarReservaVencida(pedido)) {
            confirmarPagamento(pedido);
        } else {
            System.out.println("Reserva vencida. Não é possível confirmar o pagamento.");
        }
    }

    private boolean verificarReservaVencida(Pedido pedido) {
        Date dataAtual = new Date();
        return dataAtual.after(pedido.getDataVencimentoReserva());
    }

    private void confirmarPagamento(Pedido pedido) {
        System.out.println("Pagamento confirmado para o pedido com ID: " + pedido.getId());
    }
}