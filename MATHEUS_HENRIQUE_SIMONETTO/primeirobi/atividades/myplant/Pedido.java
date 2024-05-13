package primeirobi.atividades.myplant;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int id;
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    private Cliente cliente;
    private Vendedor vendedor;
    private String loja;
    private ArrayList<Item> itens;

    public Pedido(int id, Date dataCriacao, Cliente cliente, Vendedor vendedor, String loja, ArrayList<Item> itens) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.dataVencimentoReserva = new Date(dataCriacao.getTime() + (3 * 24 * 60 * 60 * 1000)); // Adicionando 3 dias em milissegundos
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
        System.out.println("Pedido ID: " + id);
        System.out.println("Data de Criação: " + dataCriacao);
        System.out.println("Valor Total: " + calcularValorTotal());
    }

    public Date getDataVencimentoReserva() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDataVencimentoReserva'");
    }
}
