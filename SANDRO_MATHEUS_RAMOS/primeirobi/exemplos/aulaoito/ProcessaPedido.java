package primeirobi.exemplos.aulaoito;

import java.util.Date;

public class ProcessaPedido {

    Integer ids = 0;
    
    public Pedido processa(Integer id, Item[] itens) {
        Pedido pedido = new Pedido();

        pedido.setId(ids++);
        pedido.setDataCriacao(new Date());
        pedido.setItems(itens);

        return pedido;
    }
    
    public void confirmarPagamento(Pedido pedido) {
        pedido.setDataPagamento(new Date());
    }

}
