package primeirobi.Exercicio6;
import java.util.Date;

public class ProcessarPedido {

    public void processar(Integer id,Item[] items){
        id=id;
        items=items;
        System.out.println(id);
        System.out.println(items);
    }

    boolean confirmarPagamento(Date dataCriacao,Date dataVencimentoReserva){
        if(dataCriacao.getTime()<dataVencimentoReserva.getTime()){
            return true;  
        }else{
            return false;
        }
    }

}

