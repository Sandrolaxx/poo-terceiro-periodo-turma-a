package ATIVIDADE_5;

import java.util.Date;
import java.util.List;

public class Pedido {
    @SuppressWarnings("unused")
    private int id;
    private Date dataCriacao;
    @SuppressWarnings("unused")
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    @SuppressWarnings("unused")
    private Cliente cliente;
    @SuppressWarnings("unused")
    private Vendedor vendedor;
    @SuppressWarnings("unused")
    private Loja loja;
    private List<Item> itens;

    public Pedido(int id, Date dataCriacao, Cliente cliente, Vendedor vendedor, Loja loja, List<Item> itens) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.dataPagamento = null;
        this.dataVencimentoReserva = new Date(dataCriacao.getTime() + (86400000) * 3);
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
        this.itens = itens;
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getValor();
        }
        return total;
    }

    public void gerarDescricaoVenda() {
        System.out.println("Data de Criação: " + dataCriacao);
        System.out.println("Valor Total: " + calcularValorTotal());
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public Date getDataVencimentoReserva() {
        return dataVencimentoReserva;
    }
}
