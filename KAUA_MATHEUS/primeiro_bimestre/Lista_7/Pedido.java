package KAUA_MATHEUS.primeiro_bimestre.Lista_6;
import java.util.Date;
import java.util.List;

import javax.xml.crypto.Data;

public class Pedido {

    Long day = 86400000l;

    int id;
    Date dataCriacao, dataVencimento;

    Cliente client;
    Vendedor seller;

    Loja store;
    List<Item> itens;
    
    float soma;
    long vencimento;


    // public Pedido(int id, Cliente client, Vendedor seller,
    //               Loja store, List<Item> itens, Date dataCriacao, 
    //               Date dataVencimento){
    //     this.id = id;
    //     this.client = client;
    //     this.seller = seller;
    //     this.store = store;
    //     this.itens = itens;
    //     this.dataCriacao = dataCriacao;
    //     this.dataVencimento = dataVencimento;
    // }

    public void setPedido(int id, Cliente client, Vendedor seller,
    Loja store, List<Item> itens, Date dataCriacao, 
    Date dataVencimento){
        this.id = id;
        this.client = client;
        this.seller = seller;
        this.store = store;
        this.itens = itens;
        this.dataCriacao = dataCriacao;
        this.dataVencimento = dataVencimento;
    }

    float calculaValorTotal(){
        soma = 0;
        for (int i = 0; i < itens.size(); i++) {
            soma = soma + itens.get(i).getValue();
        }
        return soma;
    }

    void gerarDescricaoVenda(){
        soma = 0;
        soma = calculaValorTotal();
        System.out.printf("O valor é: %.2f\nData de criação: %s\n", soma, dataCriacao);
    }

    void listarItens(){
        System.out.printf("Existem %d itens cadastrados! \n\n", itens.size());

        for (int i = 0; i < itens.size(); i++) {
            itens.get(i).gerarDescricao();
        }

    }

}
