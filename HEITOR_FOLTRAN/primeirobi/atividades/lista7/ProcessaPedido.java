package primeirobi.atividades.lista7;

import java.util.Date;
import java.util.List;

public class ProcessaPedido {

    public Pedido processar(int idPedido, List<Item> itensSelecionados, Cliente cliente, Vendedor vendedor, Loja loja) {
        Pedido pedido = new Pedido(idPedido, new Date(), null, cliente, vendedor, loja);
        
        for (Item item : itensSelecionados) {
            pedido.adicionarItem(item);
        }

        return pedido;
    }

    public void confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        if (pedido.getDataVencimentoReserva().after(dataAtual)) {
            System.out.println("Pagamento confirmado, pedido com id: " + pedido.getId());
        } else {
            System.out.println("Reserva vencida do pedido com id: " + pedido.getId());
        }
    }
}