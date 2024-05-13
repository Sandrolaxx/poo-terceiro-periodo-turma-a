package primeirobi.exemplos.aulasete;

public class Andorinha extends Ave {
    
    String cor;

    public void apresentarAnd() {
        System.out.println("OIIII ALOOOO, quem tá falando? piu piu me chamo " + nome);
    }

    @Override 
    public void bicar(){
        System.out.println("Não quero vei!");
    }
}
