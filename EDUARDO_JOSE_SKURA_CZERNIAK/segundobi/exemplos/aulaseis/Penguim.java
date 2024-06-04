package segundobi.exemplos.aulaseis;

import javax.management.RuntimeErrorException;

public class Penguim extends Ave{
    
    @Override
    public void voar() {
    throw new RuntimeErrorException(null, "Num tenho sinhora");
    }
}
