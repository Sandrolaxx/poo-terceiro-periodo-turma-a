package SEGUNDO_BIMESTRE.aulas.SOLID;

public class ProcessaPedidoComLog extends ProcessaPedido {
    
    public void processaComLog(Pedido pedido){

        processa(pedido);

        System.out.println("Pedido " + pedido.getId() + " criado");

    }
}
