package KAUA_MATHEUS.primeiro_bimestre.Lista_7;
import java.util.Date;

import javax.xml.crypto.Data;

public class ProcessaPedido{
    
    private Pedido order;

    public void setPedido(Pedido order){
        this.order = order;
    }

    private boolean confirmarPagamento(){
        order.vencimento = (order.dataVencimento.getTime()/order.day) - (order.dataCriacao.getTime()/order.day);
        if (order.vencimento > 3) {
            return true;
        }
        else{
            
            return false;
        }
    }

    public void checagemAgendamento(){
        if (confirmarPagamento()) {
            System.out.printf("Sua reserva venceu há %d dias!\n", order.vencimento);
        }
        else{
            System.out.printf("Seja bem-vindo ao estabelecimento!\n");
        }

    }
        

}
