package BIM1.Lista5Lojas;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private String id;
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimento;
    private Cliente cliente;
    private Vendedor vendedor;
    private Loja loja;
    private Item item;
    private ArrayList <Item> listaItens;
    private ArrayList<Item> listaItensPedido;

    public Pedido(String id, Date dataCriacao, Date dataPagamento, Cliente cliente,
            Vendedor vendedor, Loja loja, ArrayList<Item> listaItensPedido) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.dataPagamento = dataPagamento;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
        this.listaItensPedido = listaItensPedido;
        
        this.listaItens = new ArrayList<>();
        long tresDias = 3 * 86400000l; 
        this.dataVencimento = new Date(dataCriacao.getTime() + tresDias);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataVencimento(){
        return dataVencimento;
    }
    
    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public ArrayList<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<Item> listaItens) {
        this.listaItens = listaItens;
    }

    public float calcularValorTotal(){
        float valTot= 0.0f;
        for (Item item : listaItensPedido ){
            valTot += item.getValor();
        }
        return valTot;
    }
    public void gerarDescricaoVenda(){
        System.out.println("Decrição pedido:");
        System.out.println("Descrição do pedido:");
        System.out.println("ID do pedido: " + id);
        System.out.println("Data de criação: " + dataCriacao);
        System.out.println("Data de vencimento: " + dataVencimento);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Vendedor: " + vendedor.getNome()); 
        System.out.println("Loja: " + loja.getNomeLoja()); 
        System.out.println("Valor total: " + calcularValorTotal());

    }
    public void imprimirPedido() {
        System.out.println("Descrição do pedido:");
        System.out.println("ID do pedido: " + id);
        System.out.println("Data de criação: " + dataCriacao);
        System.out.println("Data de vencimento: " + dataVencimento);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Loja: " + loja.getNomeLoja());
        System.out.println("Itens do Pedido:");
        for (Item item : listaItensPedido) {
            System.out.println("- " + item.getNome() + ", " + item.getTipo() + ", R$ " + item.getValor());
        }
        System.out.println("Valor total: " + calcularValorTotal());
    }


    public ArrayList<Item> getListaItensPedido() {
        return listaItensPedido;
    }


    public void setListaItensPedido(ArrayList<Item> listaItensPedido) {
        this.listaItensPedido = listaItensPedido;
    }

}
