package primeirobi.lists.Lista7;

import java.util.Date;

public class ProcessaPedido extends Pedido {
    private Item[] pedido;
    private double total = 0;

    @SuppressWarnings({ "deprecation" })
    public ProcessaPedido(int[] quantidade, Item[] pedido, Cliente cliente, Vendedor vendedor, Loja loja, Date dataCriacao, int diaPagamento, int mesPagamento) {
        this.pedido = pedido;

        for (int i = 0; i < pedido.length; i++) {
            if (pedido[i] == null) {
                break;
            }
            total += pedido[i].getValor() * quantidade[i];
        }
        setValorTotal(total);
        setCliente(cliente);
        setVendedor(vendedor);
        setLoja(loja);
        setDataCriacao(dataCriacao);
        setDiaPagamento(diaPagamento);
        setMesPagamento(mesPagamento);
        setDataPagamento(new Date(124, mesPagamento - 1, diaPagamento));
        setDataVencimentoReserva(new Date(this.getDataCriacao().getTime() + (3 * 86400000)));
    }

    private boolean confirm() {

        Date agora = new Date();

        if (agora.getTime() > getDataVencimentoReserva().getTime()) {
            return false;
        }
        return true;
    }
}