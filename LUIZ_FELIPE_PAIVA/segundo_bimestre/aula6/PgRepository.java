package segundo_bimestre.aula6;

public class PgRepository {
    public boolean salvar (Pedido pedido){
        PgConection con = new PgConection("url.banco");

        return true;
    }
}
