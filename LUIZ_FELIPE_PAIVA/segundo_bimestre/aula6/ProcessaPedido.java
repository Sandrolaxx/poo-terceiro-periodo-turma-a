package segundo_bimestre.aula6;

public class ProcessaPedido {
        public void Processa (Pedido pedido){
            EnviarEmail enviarEmail = new EnviarEmail();
            PgRepository pgRepo = new PgRepository();

            boolean pedidoSalvdoDB= pgRepo.salvar(pedido);

            if (pedido.isValido() && salvar(pedido)){

            }

        }

    public boolean salvar (Pedido pedido){
        PgConection con = new PgConection("url.banco");

        return true;
    }

    public void enviarEmailPedidoConfirmado(Pedido pedido)
{

}
}
