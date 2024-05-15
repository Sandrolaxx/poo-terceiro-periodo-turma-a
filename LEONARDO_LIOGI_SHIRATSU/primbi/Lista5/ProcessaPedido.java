package primbi.Lista5;

import java.util.Date;

public class ProcessaPedido extends Pedido {

    public ProcessaPedido(int id, Date dataCriacao, cliente cliente, vendedor vendedor, loja loja, Item[] itens) {
        super(id, dataCriacao, cliente, vendedor, loja, itens);
    }

    public void processarPedido() {
        gerarDescricaoVenda();

        if (!confirmarPagamento()) {
            System.out.println("Reserva vencida ou data atual superior ao vencimento da reserva.");
            return;
        }

        Date dataAtual = new Date();
        Date dataVencimento = getDataVencimentoReserva();
        if (dataAtual.before(dataVencimento)) {
            System.out.println("Pedido processado com sucesso em: " + dataAtual);
            System.out.println("Reserva válida.");
        } else {
            System.out.println("Reserva expirada, não foi possível processar o pedido.");
        }
    }

    private boolean confirmarPagamento() {
        Date dataAtual = new Date();
        return dataAtual.before(getDataVencimentoReserva());
    }
}