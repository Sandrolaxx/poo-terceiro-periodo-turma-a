package primeirobi.lists.Lista6;

import java.util.Date;

public class ProcessaPedido {

    @SuppressWarnings({ "deprecation" })
    public Pedido processar(String nome, String id, double valor, Cliente cliente, Vendedor vendedor, Loja loja, Date dataCriacao,
            int diaPagamento, int mesPagamento) {

        // for (int i = 0; i < valores.length; i++) {
        //     if (valores[i] == 0) {
        //         valores[i] = valor;
        //     }
        // }

        Pedido pedido = new Pedido();

        pedido.id = id;
        pedido.cliente = cliente;
        pedido.vendedor = vendedor;
        pedido.loja = loja;
        pedido.dataCriacao = dataCriacao;
        pedido.diaPagamento = diaPagamento;
        pedido.mesPagamento = mesPagamento;
        pedido.dataPagamento = new Date(124, mesPagamento - 1, diaPagamento);
        // pedido.dataVencimentoReserva = new Date(this.dataCriacao.getTime() + (3 * 86400000));

        return pedido;

    }

    private boolean confirm() {

        Date agora = new Date();

        // if (agora.getTime() > dataVencimentoReserva.getTime()) {
        //     return false;
        // }

        return true;
    }
}