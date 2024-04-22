package MyPlant;

import java.util.Date;

public class Pedido {
    private int id;
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    private Cliente cliente;
    private Vendedor vendedor;
    private String loja;
    private Item[] itens;

    public Pedido(int id, Date dataCriacao, Cliente cliente, Vendedor vendedor, String loja, Item[] itens) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
        this.itens = itens;

        // Definir data de vencimento da reserva (3 dias após a criação do pedido)
        long tresDiasEmMillis = 3 * 24 * 60 * 60 * 1000; // 3 dias em milissegundos
        this.dataVencimentoReserva = new Date(dataCriacao.getTime() + tresDiasEmMillis);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item item : itens) {
            valorTotal += item.getValor();
        }
        return valorTotal;
    }

    public String gerarDescricaoVenda() {
        StringBuilder descricao = new StringBuilder();
        descricao.append("Data de criação do pedido: ").append(dataCriacao).append("\n");
        descricao.append("Valor total do pedido: ").append(calcularValorTotal()).append("\n");
        return descricao.toString();
    }

    public int getId() {
        return id;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public Date getDataVencimentoReserva() {
        return dataVencimentoReserva;
    }

    public String getLoja() {
        return loja;
    }
}
