package segundobimestre.aulas.aulaSeis;

public class ProcesaPedidoLog extends ProcessaPedido {
    
    public void procesaPedidoLog(Pedido pedido){

        processa(pedido);
        System.out.println("pedido id"+ pedido.getId() + "criado");
    }
}
