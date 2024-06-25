package segundobi.aulas.aula6;

public class ProcessaPedidoComLog extends ProcessaPedido{

    public void processaComLog(Pedido pedido) {

        processa(pedido);

        System.out.println("Pedido id: " + pedido.getId() + " criado");
    }
}
