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
            pedido.setDataPagamento(dataAtual); 
        }
        else{
            System.out.println("Pagamento pendente");
        }
    }
    private boolean confirmarPagamento(){
        Date dataVencimento = pedido.getDataVencimento();
        if (dataVencimento == null) {
           
            return false;

        }
        return dataAtual.after(dataVencimento);
    }

}
