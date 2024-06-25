package primeirobi.exemplos.aulaoito;

public class Postgres implements IBancoDados {

    @Override
    public void salvar() {
        System.out.println("Salvando no PG");
    }
    
    @Override
    public void buscar() {
        System.out.println("Busca no PG");
    }
    
    @Override
    public void atualizar() {
        System.out.println("Atualizar no PG");
    }
    
    @Override
    public void deletar() {
        System.out.println("Deletar no PG");
    }
    
}
