package BIM1.Lista5Lojas;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private String id;
    Date dataCriacao;
    private long tresDias = 3*86400000l;
    Date dataPagamento;
    Date dataVencimento;
    private Cliente cliente;
    private Vendedor vendedor;
    private Loja loja;
     ArrayList <Integer> listaItens;

    public Pedido(String id, Date dataCriacao, Date dataPagamento, long dataVencimento, Cliente cliente,
            Vendedor vendedor, Loja loja, ArrayList<Integer> listaItens) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.dataPagamento = dataPagamento;
        this.dataVencimento = new Date (dataCriacao.getTime()+tresDias);
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
        this.listaItens = listaItens;
    }
    public int calcularValorTotal(){
        int valTot=0;
        for (int item : listaItens ){
            valTot += item;
        }
        return valTot;
    }
    public void gerarDescricaoVenda(){
        System.out.println("Decrição pedido:");
        System.out.println("Data pedido: " + dataCriacao);
        System.out.println("Valor total: " + calcularValorTotal());

    }

    public Date DataCriacao(){
        return dataCriacao;
    }
    
    public Date DataVencimento(){
        return dataVencimento;
    }
    
}
