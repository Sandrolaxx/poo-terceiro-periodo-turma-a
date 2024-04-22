package primeirobi.Exemplos.AulaInterface;

public class Postgres implements IBancoDados {

    @Override
    public void salvar() {
        System.out.println("Salvando o PG");
    }

    @Override
    public void buscar() {
        System.out.println("Buscando no PG");
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando o PG");
    }

    @Override
    public void deletar() {
        System.out.println("Deletando do PG");

    }
}
