package primeirobi.exemplos.aulasete;

public class Andorinha extends Ave {
    
    String cor;

    @Override
    public void bicar() {
        System.out.println("Não estou bicando.");
    }

    public void apresentarse(String nome) {
        System.out.println(nome);
    }

    public void apresentarse() {
        System.out.println("Apresentando...");
    }


}
