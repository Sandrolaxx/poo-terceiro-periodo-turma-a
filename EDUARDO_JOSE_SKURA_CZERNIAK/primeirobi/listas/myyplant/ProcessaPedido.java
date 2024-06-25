package primeirobi.listas.myyplant;

import java.util.Date;

public class ProcessaPedido {

    Date dataCriacao;

    Integer ids = 0;
    
    //List<Pedido> pedidos = new ArrayList<>

    Integer sequence = 0;


    public Pedido processa(Item[] items) {
        //Pedido pedido = new Pedido(;
        //pedido.set
        System.out.println("O pedido foi processado em " + dataCriacao);

        Pedido pedido = new Pedido(sequence++, items);
        return pedido;
    }

    public Pedido confirmarPagamento(Pedido pedido) {
            pedido.setDataPagamento(new Date());

            return pedido;
    }
    
    public void metodoProcessar( ){
    }


}
