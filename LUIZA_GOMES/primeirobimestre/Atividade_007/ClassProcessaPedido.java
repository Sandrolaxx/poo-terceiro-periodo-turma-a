package Atividade_007;

import java.util.List;
import java.util.Date;

public class ClassProcessaPedido {

    private int id;
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimento;
    private String cliente;
    private String vendedor;
    private String loja;
    private List<Double> valorItens;

    public void Pedido(int id, Date dataCriacao, Date dataPagamento, Date dataVencimento, String cliente,
            String vendedor, String loja, List<Double> valorItens) {
        this.id = id;
        this.dataCriacao = new Date(dataCriacao.getTime());
        this.dataPagamento = new Date(dataPagamento.getTime());
        this.dataVencimento = new Date(dataVencimento.getTime());
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
        this.valorItens = valorItens;
    }

    public Double calcularValorTotal() {
        double total = 0.0;
        for (Double valor : valorItens) {
            total += valor;
        }
        return total;
    }

    public void gerarDescricaoVenda() {
        System.out.println("Data de Criação do Pedido: " + dataCriacao);
        System.out.println("Valor Total do Pedido: " + calcularValorTotal());
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

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public List<Double> getValorItens() {
        return valorItens;
    }

    public void setValorItens(List<Double> valorItens) {
        this.valorItens = valorItens;
    }

    public void processar(int idPedido, Date dataCriacao, Date dataPagamento, Date dataVencimento, String cliente,
            String vendedor, String loja, List<Double> valorItens) {
        // Criação do pedido
        ClassPedido pedido = new ClassPedido(idPedido, dataCriacao, dataPagamento, dataVencimento, cliente, vendedor,
                loja,
                valorItens);

        // Confirmação do pagamento
        confirmarPagamento(pedido);
    }

    private void confirmarPagamento(ClassPedido pedido) {
        Date dataAtual = new Date();
        if (pedido.getDataVencimento().after(dataAtual)) {
            System.out.println("Pagamento confirmado para o pedido com ID: " + pedido.getId());
        } else {
            System.out.println("Pedido com ID " + pedido.getId() + " está vencido. Pagamento não pode ser confirmado.");
        }
    }
}