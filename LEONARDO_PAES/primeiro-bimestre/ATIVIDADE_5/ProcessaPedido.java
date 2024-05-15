package ATIVIDADE_5;

import java.util.Date;
import java.util.List;

public class ProcessaPedido {
    public void processar(Cliente cliente, Vendedor vendedor, Loja loja, List<Item> itens) {
        Pedido pedido = new Pedido(1, new Date(), cliente, vendedor, loja, itens);
        if (confirmarPagamento(pedido.getDataCriacao(), pedido.getDataVencimentoReserva())) {
            System.out.println("Pedido processado com sucesso!");
        } else {
            System.out.println("Não foi possível processar o pedido devido à falta de pagamento.");
        }
    }

    private boolean confirmarPagamento(Date dataCriacao, Date dataVencimentoReserva) {
        Date dataAtual = new Date();
        return dataAtual.before(dataVencimentoReserva);
    }

}
