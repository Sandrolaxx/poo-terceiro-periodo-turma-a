package primeirobi.Exemplos.AulaInterface;

public class Oracle implements IBancoDados{

    @Override
    public void salvar() {
        System.out.println("Salvando o Oracle");
    }

    @Override
    public void buscar() {
        System.out.println("Buscando no Oracle");
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando o Oracle");
    }

    @Override
    public void deletar() {
        System.out.println("Deletando do Oracle");

    }    
}
