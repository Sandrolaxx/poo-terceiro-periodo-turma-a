package segundobi.aulas.aulaseis;

public class ProcessaPedidoComLog extends ProcessaPedido {
    
    public void processaComLog(Pedido pedido) {

        processa(pedido);

        System.out.println("Pedido id:" + pedido.getId() + " criado.");

    }

}
