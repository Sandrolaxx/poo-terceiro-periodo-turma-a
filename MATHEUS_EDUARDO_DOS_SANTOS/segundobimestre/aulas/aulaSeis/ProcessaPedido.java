package segundobimestre.aulas.aulaSeis;

public class ProcessaPedido {

    public void processa(Pedido pedido) {

        EnviarEmail enviarEmail = new EnviarEmail();
        PgRepository pgRepo = new PgRepository();

        boolean pedidoSalvoDB = pgRepo.salvar(pedido);

        if (pedido.isValido() && pedidoSalvoDB) {
            enviarEmail.enviarEmail(pedido);
        }
    }    

}
