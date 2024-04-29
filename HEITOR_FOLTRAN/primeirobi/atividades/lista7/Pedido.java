package primeirobi.atividades.lista7;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int id;
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    private Cliente cliente;
    private Vendedor vendedor;
    private Loja loja;
    private List<Item> itens;

    public Pedido(int id, Date dataCriacao, Date dataPagamento, Cliente cliente, Vendedor vendedor, Loja loja) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.dataPagamento = dataPagamento;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) { 
        itens.add(item);
    }


    public void removerItem(Item item) {
        itens.remove(item);
    }


    public List<Item> getItens() { 
        return itens;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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



    private void calcularDataVencimentoReserva() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataCriacao);
        calendar.add(Calendar.DAY_OF_MONTH,3);
        this.dataVencimentoReserva = calendar.getTime();
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getValor();
        }
        return total;
    }

    public String gerarDescricaoVenda() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formatter.format(dataCriacao);
        return "Data do pedido: " + dataFormatada + "\nValor total: " + calcularValorTotal();
    }
}

