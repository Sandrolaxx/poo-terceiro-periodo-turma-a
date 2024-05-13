package primeirobi.exemplos.aulasete;

public class Andorinha extends Ave {

    String cor;
    public void apresentarSe( String nome){
        System.out.println(nome);
    }

    @Override
    public void bicar() {
       System.out.println("nao estou bicando");
    }
    public void apresentarSe(){

    }
}