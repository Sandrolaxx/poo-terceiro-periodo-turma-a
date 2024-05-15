package primeirobi.exemplos.aula8;

public class Postgres implements IBancoDados{

    @Override
    public void salvar() {

        System.out.println("Salvando no PG");
    }

    @Override
    public void buscar() {

        System.out.println("Buscando no PG");
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando no PG");
    }

    @Override
    public void deletar() {
        System.out.println("Deletando no PG");
    }
    
}
