package segundobi.aulas.aulaseis;

public class ProcessaPedidoComLog extends ProcessaPedido {
    
    public void processarComLog(Pedido pedido){

        processa(pedido);

        System.out.println("Pedido id:" + pedido.getId() + " criado.");
    }
}
