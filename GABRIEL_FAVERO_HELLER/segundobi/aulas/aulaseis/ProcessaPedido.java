package segundobi.aulas.aulaseis;

import java.util.concurrent.locks.Condition;

public class ProcessaPedido {
    
    public void processa(Pedido pedido){

    EnviarEmail enviarEmail = new EnviarEmail();
    PgRepository pgRepo = new PgRepository();

    boolean pedidoSalvoDB = pgRepo.salvar(pedido);

    if (pedido.isValido() && pedidoSalvoDB){
        enviarEmail.enviarEmailConfimacao(pedido);

    }

    System.out.println("Pedido id:" + pedido.getId() + " criado.");
}
}
