package ListaSeis;

import java.util.Date;

public class ProcessaPedido {
    public void processar(int idPedido, Date dataCriacao, Cliente cliente, Vendedor vendedor, Loja loja) {
        Pedido pedido = new Pedido(idPedido, dataCriacao, cliente, vendedor, loja);
        pedido.gerarDescricaoVenda();
    }

    private boolean confirmarPagamento(Date dataVencidaReserva) {
        Date dataAtual = new Date();
        return !dataAtual.after(dataVencidaReserva);
    }

    public void testarConfirmarPagamento() {
        Date dataCriacao = new Date(System.currentTimeMillis() - (2 * 24 * 60 * 60 * 1000));
        Date dataVencimentoReserva = new Date(dataCriacao.getTime() + (3 * 24 * 60 * 60 * 1000));
        System.out.println("A RESERVA ESTÁ VENCIDA? " + !confirmarPagamento(dataVencimentoReserva));
    }
}