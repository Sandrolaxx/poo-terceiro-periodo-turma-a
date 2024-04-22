package primeirobi.Exemplos.AulaInterface;

public class TesteOito {
    
    public static void main(String[] args) {
        Postgres pg = new Postgres();
        Oracle oracle = new Oracle();

        pg.salvar();
        oracle.salvar();
    }

    public static void salvar(IBancoDados implementacao) {
        implementacao.salvar();
    }
}
