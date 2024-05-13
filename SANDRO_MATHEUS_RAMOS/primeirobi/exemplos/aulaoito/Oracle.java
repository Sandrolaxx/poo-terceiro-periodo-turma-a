package primeirobi.exemplos.aulaoito;

public class Oracle implements IBancoDados {

    @Override
    public void salvar() {
        System.out.println("Salvando no Oracle");
    }
    
    @Override
    public void buscar() {
        System.out.println("Busca no Oracle");
    }
    
    @Override
    public void atualizar() {
        System.out.println("Atualizar no Oracle");
    }
    
    @Override
    public void deletar() {
        System.out.println("Deletar no Oracle");
    }
    
}
