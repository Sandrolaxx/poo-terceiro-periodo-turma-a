package primeirobi.exemplos.aulasete;

public class Andorinha extends Ave {
    
    String cor;

    public void apresentarse() {
        System.out.println("Apresentando...");
    }

    @Override
    public void bicar() {
        System.out.println("Não estou bicando.");
    }

}