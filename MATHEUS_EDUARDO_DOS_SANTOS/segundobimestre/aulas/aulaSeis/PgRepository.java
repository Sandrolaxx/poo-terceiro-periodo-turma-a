package segundobimestre.aulas.aulaSeis;

public class PgRepository {
    
    public boolean salvar() {
        PgConnection con = new PgConnection("url.banco");

        return true;
    }

    public boolean salvar(Pedido pedido) {
        throw new UnsupportedOperationException("Unimplemented method 'salvar'");
    }
}
