package segundobi.aulas.aulaseis;

public class Pinguim extends Ave {
    
    @Override
    public void voar() {
        throw new RuntimeException("Não sei voar man!");
    }

}
