package segundobi.aulas.aulaquatro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorSample {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Civic", "Honda", 2008));
        cars.add(new Car("350z", "Nissan", 2006));
        cars.add(new Car("GT-R", "Nissan", 2012));
        cars.add(new Car("Supra", "Toyota", 2004));

        System.out.println("Sem ordenação:");
        cars.forEach(car -> System.out.println(car.getName() + " - " + car.getYear()));

        CarNameComparator nameComparator = new CarNameComparator();

        // Ordenando com ordenador personalizado
        // Collections.sort(cars, nameComparator);
        cars.sort(nameComparator);

        System.out.println("\nOrdenado por nome:");
        cars.forEach(car -> System.out.println(car.getName() + " - " + car.getYear()));

    }

}
