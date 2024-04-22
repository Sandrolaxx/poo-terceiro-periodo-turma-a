package BIM1.Lista5Lojas;

import java.util.Date;

public class ProcessaPedido {
    private Pedido pedido;
    private Date dataAtual;
    
    public ProcessaPedido(Pedido pedido) {
        this.pedido = pedido;
        this.dataAtual = new Date();
    }

    public void processar(){
        if(confirmarPagamento()){
            System.out.println("Pagamento confirmado");
        }
        else{
            System.out.println("Pagamento pendente");
        }
    }
    private boolean confirmarPagamento(){
        if (pedido.DataVencimento() == null) {
           
            return false;

        }
        return dataAtual.after(pedido.DataVencimento());
    }

}
