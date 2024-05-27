package primeirobi.ListasExc.Lista6Nova;

import java.util.Date;

public class Pedido {
    private int id;
    private String nome;
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    private Cliente cliente;
    private Vendedor vendedor;
    private Loja loja;

    public Pedido(int id, String nome, Date dataCriacao, Date dataPagamento, Date dataVencimentoReserva, Cliente cliente, Vendedor vendedor, Loja loja) {
        this.id = id;
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.dataPagamento = dataPagamento;
        this.dataVencimentoReserva = dataVencimentoReserva;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public Date getDataVencimentoReserva() {
        return dataVencimentoReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Loja getLoja() {
        return loja;
    }

    public double calcularValorTotal() {
        return 0.0; //VERIFICAR DPS
    }

    public void gerarDescricaoVenda() {
        System.out.println("Nome do Pedido: " + nome);
        System.out.println("Pedido ID: " + id);
        System.out.println("Data de Criação: " + dataCriacao);
        System.out.println("Nome do Cliente: " + cliente.getNome());
        System.out.println("Nome do Vendedor: " + vendedor.getNome());
        System.out.println("Nome da Loja: " + loja.getnomeLoja());
    }
}
