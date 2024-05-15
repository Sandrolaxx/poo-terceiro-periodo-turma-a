// Criar uma classe Pedido com:
// - Atributos, id, dataCriacao, dataPagamento, dataVencimentoReserva(a reserva vence depois de 3 dias da criação do pedido),, 
// cliente, vendedor, Loja e array de itens.
// - Método calcularValorTotal, retorna o valor total do pedido.
// - Método gerarDescricaoVenda, retorna o print informando a data de criação do pedido e seu valor total.

package exercises.sistemadonagabriela6;

import java.util.Date;

public class Pedido {
    
    private int id;
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    private Cliente Cliente;
    private Vendedor Vendedor;
    private Loja Loja;
    private Item[] Itens;
    private double valorTotal = 0;
    
    // Métodos 

    void calcularValorTotal(){

        System.out.println("\n\tPedido");

        for (int i = 0; i < Itens.length; i++) {
            System.out.println("\n Item: " +Itens[i].getNome()+ ". Valor: R$" +Itens[i].getValor());
            
            valorTotal += Itens[i].getValor();
        }
    }

    void gerarDescricao(){

        System.out.println("\n\tDescrição");
        System.out.println("\nO Pedido foi criado no dia: " +dataCriacao);
        System.out.println("O valor total do pedido é de: R$" +valorTotal);
    }

    // Geters e Seters

    public Pedido(Integer id, Item[] itens){

        Long msDia = 86400000l;
        Long tresdias = new Date().getTime() + (3*msDia);

        this.dataCriacao = new Date();
        this.dataVencimentoReserva = new Date(tresdias);
        this.Itens = itens;
    }

    public int getId() {
        return id;
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
        return Cliente;
    }

    public void setCliente(Cliente cliente) {
        Cliente = cliente;
    }

    public Vendedor getVendedor() {
        return Vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        Vendedor = vendedor;
    }

    public Loja getLoja() {
        return Loja;
    }

    public void setLoja(Loja loja) {
        Loja = loja;
    }

    public Item[] getItens() {
        return Itens;
    }

    public void setItens(Item[] itens) {
        Itens = itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

}