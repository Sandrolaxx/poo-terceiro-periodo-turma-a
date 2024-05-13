package atividades1B;

import java.util.Date;

public class Pedido {
     int Id;
     Date dataCriacao;
     Date dataPagamento;
     Date Datadevencimento;
     Cliente cliente;
     Vendedor vendedor;
     Loja loja;
     Item[] itens;
     Date dataVencimentoReserva;

    public Pedido(int id, Date dataCriacao, Cliente cliente, Vendedor vendedor, Loja loja, Item[] itens) {
        this.Id = id;
        this.dataCriacao = dataCriacao;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
        this.itens = itens;

        long tresDias = 3 * 24 * 60 * 60 * 1000; 
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
        
        throw new UnsupportedOperationException("Unimplemented method 'getDataVencimentoReserva'");
    }

    public String getId() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }
}
