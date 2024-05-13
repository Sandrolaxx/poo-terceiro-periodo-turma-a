package primeirobi.exemplos.aula8;

public class MainBancoDados {
    
   public static void main(String[] args) {
    Postgres pg = new Postgres();
    //Oracle oracle = new Oracle();

    salvar(pg);
    }

    public static void salvar(IBancoDados impletacao) {
    impletacao.salvar();
    }
}

