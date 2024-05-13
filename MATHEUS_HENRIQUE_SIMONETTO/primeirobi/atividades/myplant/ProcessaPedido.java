package primeirobi.atividades.myplant;

import java.util.ArrayList;
import java.util.Date;

public class ProcessaPedido {
    public void processar(int id, Date dataCriacao, Cliente cliente, Vendedor vendedor, String loja, ArrayList<Item> itens) {
        Pedido pedido = new Pedido(id, dataCriacao, cliente, vendedor, loja, itens);
        if (!confirmarPagamento(pedido)) {
            System.out.println("Pagamento não confirmado. Reserva vencida.");
        }
    }

    private boolean confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        return dataAtual.before(pedido.getDataVencimentoReserva());
    }

    public void processar(int id, Date dataCriacao, primeirobi.atividades.myyplant.Cliente cliente,
            primeirobi.atividades.myyplant.Vendedor vendedor, String loja, ArrayList<Item> itens) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processar'");
    }
}
