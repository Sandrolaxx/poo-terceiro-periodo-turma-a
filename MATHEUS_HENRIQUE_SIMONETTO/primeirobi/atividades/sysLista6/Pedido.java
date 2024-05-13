package primeirobi.atividades.sysLista6;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    int id;
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    private Cliente cliente;
    private Vendedor vendedor;
    private String loja;
    private ArrayList<Item> itens;

    public Pedido(int id, Date dataCriacao, Cliente cliente, Vendedor vendedor, String loja) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
        this.itens = new ArrayList<>();
        // Define a data de vencimento da reserva como 3 dias após a criação do pedido
        this.dataVencimentoReserva = new Date(dataCriacao.getTime() + (3 * 24 * 60 * 60 * 1000)); 
    }

    public void addItem(Item item) {
        this.itens.add(item);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : this.itens) {
            total += item.getValor();
        }
        return total;
    }

    public void gerarDescricaoVenda() {
        System.out.println("Pedido criado em: " + this.dataCriacao + ", Valor total: R$" + calcularValorTotal());
    }

    public Date getDataVencimentoReserva() {
        return this.dataVencimentoReserva;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public boolean isPagamentoConfirmado() {
        return this.dataPagamento != null;
    }
}
