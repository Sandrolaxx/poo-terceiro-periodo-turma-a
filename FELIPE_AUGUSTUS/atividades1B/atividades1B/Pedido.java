package atividades1B;

import java.util.Date;

public class Pedido {
    private int id;
    private Date dataCriacao;
     Date dataPagamento;
     Date dataDeVencimento;
     Cliente cliente;
     Vendedor vendedor;
     Loja loja;
    private Item[] itens;
    private Date dataVencimentoReserva;

    public Pedido(int id, Date dataCriacao, Cliente cliente, Vendedor vendedor, Loja loja, Item[] itens) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
        this.itens = itens;

        long tresDias = 3 * 24 * 60 * 60 * 1000; // 3 dias em milissegundos
        this.dataVencimentoReserva = new Date(dataCriacao.getTime() + tresDias);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getValor();
        }
        return total;
    }

    public void gerarDescricaoVenda() {
        System.out.println("Pedido criado em: " + dataCriacao);
        System.out.println("Valor total do pedido: " + calcularValorTotal());
    }

    public Date getDataVencimentoReserva() {
        return dataVencimentoReserva;
    }

    public int getId() {
        return id;
    }
}
