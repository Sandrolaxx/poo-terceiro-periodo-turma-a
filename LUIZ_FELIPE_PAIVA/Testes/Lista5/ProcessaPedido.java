package Testes.Lista5;

import java.util.Date;
import java.util.List;

public class ProcessaPedido {
    
    public Pedido processar(int id, Cliente cliente, Vendedor vendedor, Loja loja, List<Item> itens) {
        Date dataCriacao = new Date();
        Pedido pedido = new Pedido(id, dataCriacao, cliente, vendedor, loja, itens);
        return pedido;
    }

    private boolean confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        if (dataAtual.before(pedido.getDataVencimentoReserva())) {
            pedido.setDataPagamento(dataAtual);
            return true;
        } else {
            return false;
        }
    }

    public void testarConfirmacaoPagamento(Pedido pedido) {
        if (confirmarPagamento(pedido)) {
            System.out.println("Pagamento confirmado para o pedido ID: " + pedido.getId());
        } else {
            System.out.println("Reserva vencida para o pedido ID: " + pedido.getId());
        }
    }
}
