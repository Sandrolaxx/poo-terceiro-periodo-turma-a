package PRIMEIRO_BI.Listasete;

import java.util.Date;
import java.util.List;

public class ProcessaPedido {
    public Pedido processar(int idPedido, Date dataCriacao, Date dataPagamento, Date dataVencimentoReserva, Cliente cliente, Vendedor vendedor, Loja loja, List<Item> itensPedido) {
        Pedido pedido = new Pedido(idPedido, dataCriacao, dataPagamento, dataVencimentoReserva, cliente, vendedor, loja, itensPedido);
        confirmarPagamento(pedido);
        pedido.gerarDescricaoVenda();
        return pedido;
        }
    private static Pedido confirmarPagamento(Pedido pedido){
        Date dataVencimento = pedido.getDataVencimentoReserva();
        Date dataCriacao = pedido.getDataCriacao();

        if (dataCriacao.before(dataVencimento)) {
            System.out.println("Pagamento confirmado.");
        } else {
            System.out.println("A reserva está vencida. Não é possível confirmar o pagamento.");
        }
        return pedido;

}
}  
