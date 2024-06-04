// 5. Criar uma classe Pedido com:
// - Atributos, id, dataCriacao, dataPagamento, dataVencimentoReserva(a reserva vence depois de 3 dias da criação do pedido),, cliente, vendedor, Loja e array de itens.
// - Método calcularValorTotal, retorna o valor total do pedido.
// - Método gerarDescricaoVenda, retorna o print informando a data de criação do pedido e seu valor total. 


import java.util.Date;

public class Pedido {

    private Integer id;

    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    private Item[] itens;
    
    public Pedido(Integer id, Item[] itens){

        Long msDia = 86400000l;
        Long tresdias = new Date().getTime() + (3*msDia);

        this.dataCriacao = new Date();
        this.dataVencimentoReserva = new Date(tresdias);
        this.itens = itens;
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

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimentoReserva() {
        return dataVencimentoReserva;
    }

    
    void calcularValorTotal(){

    }

    void gerarDescricaoVenda(){
        
    }
}
