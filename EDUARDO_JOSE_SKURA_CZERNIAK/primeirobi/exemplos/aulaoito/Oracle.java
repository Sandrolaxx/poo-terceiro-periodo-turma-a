package primeirobi.exemplos.aulaoito;

public class Oracle implements IBancoDados{
    
    @Override
    public void salvar() {
        System.out.println("Salvando no Oracle");
    }

    @Override
    public void buscar() {
        System.out.println("Buscando no Oracle");
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando no Oracle");
    }

    @Override
    public void deletar() {
        System.out.println("Deletando no Oracle");
    }
}
