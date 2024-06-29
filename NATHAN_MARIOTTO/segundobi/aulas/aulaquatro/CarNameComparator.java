package segundobi.aulas.aulaquatro;

import java.util.Comparator;

public class CarNameComparator implements Comparator<Car> {

    @Override
    public int compare(Car firstCar, Car secondCar) {
        return firstCar.getName().compareTo(secondCar.getName());
    }
    
}
