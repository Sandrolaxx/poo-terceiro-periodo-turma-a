package SEGUNDO_BIMESTRE.aulas.SOLID;

public class ProcessaPedido {
    
    public void processa(Pedido pedido) {

        EnviarEmail enviarEmail = new EnviarEmail();
        PgRepository pgRepository = new PgRepository();

        Boolean pedidoSalvoDB = pgRepository.salvar(pedido);

        if(pedido.isValido() && pedidoSalvoDB) {

            enviarEmail.enviarEmailConfirmacao(pedido);

        }
    }
}

