package primeirobimestre.atividade6;

import primeirobimestre.atividade5.Cliente;
import primeirobimestre.atividade5.Loja;
import primeirobimestre.atividade5.Vendedor;

public class ProcessaPedido {
    
    int idPedido = 1;
    public Pedido processar(Cliente cliente, Vendedor vendedor, Loja loja,Item[] itens){
        Pedido pedido = new Pedido(idPedido, cliente, vendedor, loja, itens);
        idPedido++;
        System.out.println(pedido.gerarDescricaoVenda());
        return pedido;
    }

    public Pedido confirmarPagamento(Pedido pedido){
        pedido.setDataPagamento();
        return pedido;
    }

}
