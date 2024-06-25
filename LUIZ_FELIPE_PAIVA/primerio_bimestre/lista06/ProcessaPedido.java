package primerio_bimestre.lista06;

import java.util.Date;

public class ProcessaPedido {
    public void processar(int idPedido, Date dataCriacao, Cliente cliente, Vendedor vendedor, Loja loja) {
        Pedido pedido = new Pedido(idPedido, dataCriacao, cliente, vendedor, loja);
        pedido.gerarDescricaoVenda();
    }

    private boolean confirmarPagamento(Date dataVencimentoReserva) {
        Date dataAtual = new Date();
        return dataAtual.before(dataVencimentoReserva);
    }

    public void testarConfirmarPagamento() {
        Date dataCriacao = new Date(System.currentTimeMillis() - (2 * 24 * 60 * 60 * 1000)); // Data de criação há 2 dias atrás
        Date dataVencimentoReserva = new Date(dataCriacao.getTime() + (3 * 24 * 60 * 60 * 1000)); // Vencimento da reserva em 3 dias após a criação
        System.out.println("A reserva ainda está válida? " + confirmarPagamento(dataVencimentoReserva));
    }
}
