package primeirobi.lists.Lista7;

import java.util.Date;

public class Pedido {

    private String id, 
        nome;
    private Cliente cliente;
    private Vendedor vendedor;
    private Loja loja;
    private int diaPagamento;
    private int mesPagamento;
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    private double valorTotal;
    private String[] items = new String[100];

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public int getDiaPagamento() {
        return diaPagamento;
    }

    public void setDiaPagamento(int diaPagamento) {
        this.diaPagamento = diaPagamento;
    }

    public int getMesPagamento() {
        return mesPagamento;
    }

    public void setMesPagamento(int mesPagamento) {
        this.mesPagamento = mesPagamento;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
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

    public void setDataVencimentoReserva(Date dataVencimentoReserva) {
        this.dataVencimentoReserva = dataVencimentoReserva;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    void gerarDescricaoVenda() {
        System.out.println(dataCriacao + ", Valor total: " + valorTotal);
    }
}