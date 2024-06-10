package segundobi.aulas.aulaseis;

public class PgRepository {
    
    public boolean salvar(Pedido pedido) {
        PgConnection con = new PgConnection("url.banco");

        return true;
    }

}
