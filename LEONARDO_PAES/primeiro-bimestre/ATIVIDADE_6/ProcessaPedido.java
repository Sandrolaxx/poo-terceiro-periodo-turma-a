package ATIVIDADE_6;

import java.util.List;
import java.util.Date;

public class ProcessaPedido {

    public void processar(int idPedido, Date dataCriacao, Date dataPagamento, Date dataVencimento, String cliente,
            String vendedor, String loja, List<Double> valorItens) {
        // Criação do pedido
        Pedido pedido = new Pedido(idPedido, dataCriacao, dataPagamento, dataVencimento, cliente, vendedor, loja,
                valorItens);

        // Confirmação do pagamento
        confirmarPagamento(pedido);
    }

    private void confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        if (pedido.getDataVencimento().after(dataAtual)) {
            System.out.println("Pagamento confirmado para o pedido com ID: " + pedido.getId());
        } else {
            System.out.println("Pedido com ID " + pedido.getId() + " está vencido. Pagamento não pode ser confirmado.");
        }
    }
}
