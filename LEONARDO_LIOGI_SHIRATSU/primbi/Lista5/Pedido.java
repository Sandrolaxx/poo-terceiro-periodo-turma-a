package primbi.Lista5;

import java.util.Date;

public class Pedido {
    int id;
    Date dataCriacao;
    Date dataPagamento;
    Date dataVencimentoReserva;
    cliente cliente;
    vendedor vendedor;
    loja loja;
    Item[] itens;


    public Date getDataVencimentoReserva() {
        return this.dataVencimentoReserva;
    }




    public Pedido(int id, Date dataCriacao, cliente cliente, vendedor vendedor, loja loja, Item[] itens) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
        this.itens = itens;
        this.dataVencimentoReserva = new Date(dataCriacao.getTime() + 3 * 24 * 60 * 60 * 1000);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getValor();
        }
        return total;
    }

    public String gerarDescricaoVenda() {
        return "Data de criação: " + dataCriacao + "\nValor total do pedido: " + calcularValorTotal();
    }
}