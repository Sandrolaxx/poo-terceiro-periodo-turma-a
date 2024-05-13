package KAUA_MATHEUS.primeiro_bimestre.Lista_6;
import java.util.Date;

import javax.xml.crypto.Data;

public class Pedido {

    Long day = 86400000l;

    String id;
    Date dataCriacao, dataVencimento;
    Cliente client;
    Vendedor seller;
    Loja store;
    Item[] itens;
    float soma;
    long vencimento;


    public Pedido(String id, Cliente client, Vendedor seller,
                  Loja store, Item[] itens, Date dataCriacao, 
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
        for (int i = 0; i < itens.length; i++) {
            soma += itens[i].value;
        }
        return soma;
    }

    void gerarDescricaoVenda(){
        soma = 0;
        soma = calculaValorTotal();
        System.out.printf("O valor é: %.2f\nData de criação: %s\n", soma, dataCriacao);
    }

}
