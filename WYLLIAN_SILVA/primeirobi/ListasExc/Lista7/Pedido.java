package primeirobi.ListasExc.Lista7;

import java.util.Date;

public class Pedido {
    private Integer id;
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    private Item[] items;

    public Pedido(Integer id, Item[] items) {
        Long msDia = 86400000L;
        Long tresDias = new Date().getTime() + (3 * msDia);

        this.id = id;
        this.dataCriacao = new Date();
        this.dataVencimentoReserva = new Date(tresDias);
        this.items = items;
    }

    public Integer getId() {
        return id;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimentoReserva() {
        return dataVencimentoReserva;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
}
