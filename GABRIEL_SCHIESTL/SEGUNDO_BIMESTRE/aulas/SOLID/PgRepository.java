package SEGUNDO_BIMESTRE.aulas.SOLID;

public class PgRepository {
    
    public boolean salvar(Pedido pedido) {

        PgConnection con = new PgConnection("banco.url");

        return true;

    }

}
