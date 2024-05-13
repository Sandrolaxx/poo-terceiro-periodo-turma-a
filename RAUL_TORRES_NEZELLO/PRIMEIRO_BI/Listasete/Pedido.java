package PRIMEIRO_BI.Listasete;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int id;
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    private List<Cliente> clientes; 
    private List<Vendedor> vendedores;
    private  Loja loja;
    private List<Item> itens;
    private List<Item> itensPedido;
    private double valorTotal;

    public Pedido(int id, Date dataCriacao, Date dataPagamento, Date dataVencimentoReserva, Cliente cliente, Vendedor vendedor, Loja loja, List<Item> itensPedido){
        this.id = id;
        this.dataCriacao = new Date ();
        this.dataPagamento = new Date ();
        this.dataVencimentoReserva = calcularDataVencimentoReserva();
        this.vendedores = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.itensPedido = new ArrayList<>();
        this.itensPedido.addAll(itensPedido);
    }

    public Date calcularDataVencimentoReserva() {
        long msDia = 86400000L;
        long tresDias = dataCriacao.getTime() + (3 * msDia);
        return new Date(tresDias);
    }
    public int getid(){
        return id;
    }
    public Date getDataPagamento(){
        return dataPagamento;
    }
    public Date getDataCriacao(){
        return dataCriacao;
    }

    public Date getDataVencimentoReserva(){
        return dataVencimentoReserva;
    }

    public double calcularValorTotal(){
        valorTotal = 0;
        for (Item item : itensPedido) {
            valorTotal += item.getPreco();
        }
        return valorTotal;
    }
    public void gerarDescricaoVenda(){
            System.out.println("Data de criação do pedido: " + dataCriacao+"\nValor Total: "+calcularValorTotal());

    }
}
