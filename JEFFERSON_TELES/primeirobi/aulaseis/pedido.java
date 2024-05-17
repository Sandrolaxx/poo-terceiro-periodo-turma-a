package primeirobi.aulaseis;

import java.util.Date;
import java.util.List;

import primeirobi.Cliente;
import primeirobi.Loja;
import primeirobi.Vendedor;

public class Pedido {
    private int id;
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    private Cliente cliente;
    private Vendedor vendedor;
    private Loja loja;
    private List<Item> itens;

    public Pedido(int id, Date dataCriacao, Cliente cliente, Vendedor vendedor, Loja loja, List<Item> itens) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
        this.itens = itens;
        calcularDataVencimentoReserva();
    }

    Date calcularDataVencimentoReserva() {
        long tresDias = 3 * 24 * 60 * 60 * 1000;
        return this.dataVencimentoReserva = new Date(this.dataCriacao.getTime() + tresDias);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getValor();
        }
        return total;
    }

    public void gerarDescricaoVenda() {
        System.out.println("DATA DE CRIACAO: " + dataCriacao);
        System.out.println("VALOR TOTAL DO PEDIDO: " + calcularValorTotal());
    }

    public void apresentarSe() {
        System.out.println("ID DO PEDIDO: " + id);
        System.out.println("DATA DE CRIACAO: " + dataCriacao);
        System.out.println("DATA DE PAGAMENTO: " + dataPagamento);
        System.out.println("DATA DE VENCIMENTO DA RESERVA: " + dataVencimentoReserva);
        System.out.println("CLIENTE: " + cliente.getNome());
        System.out.println("VENDEDOR: " + vendedor.getNome());
        System.out.println("LOJA: " + loja.getNome());
        System.out.println("ITENS DO PEDIDO:");
        for (Item item : itens) {
            item.gerarDescricao();
        }
        System.out.println("VALOR TOTAL DO PEDIDO: " + calcularValorTotal());
    }

    public void setDataPagamento(Date dataAtual) {
        this.dataPagamento = dataAtual;
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

    public int getIdPedido() {
        return id;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public List<Item> getItens() {
        return itens;
    }
}
