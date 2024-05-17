package Atividade_007;

//- Método calcularValorTotal, retorna o valor total do pedido.
//- Método gerarDescricaoVenda, retorna o print informando a data de criação do pedido e seu valor total.
import java.util.List;
import java.util.Date;

public class ClassPedido {
    private int id;
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimento;
    private String client;
    private String seller;
    private String shop;
    private List <Double> valorItens;

    //construtor
    public ClassPedido(int id, Date dataCriacao, Date dataPagamento, Date dataVencimento, String client, String seller,
            String shop, List<Double> valorItens) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.dataPagamento = dataPagamento;
        this.dataVencimento = dataVencimento;
        this.client = client;
        this.seller = seller;
        this.shop = shop;
        this.valorItens = valorItens;
    }

    //metodo criado pra calcular o total do pedido. **colocar "()" no final do nome do metodo na hora de chama-lo para ser lido
    public Double calcularValorTotal() {
        double total = 0.0;
        for (Double valor : valorItens) {
            total += valor;
        }
        return total;
    }

    public void gerarDescricaoVenda(){
        System.out.println("data de criacao: " + dataCriacao + "\nvalor total: " + calcularValorTotal());
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

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public List<Double> getValorItens() {
        return valorItens;
    }

    public void setValorItens(List<Double> valorItens) {
        this.valorItens = valorItens;
    }

    
    
}
