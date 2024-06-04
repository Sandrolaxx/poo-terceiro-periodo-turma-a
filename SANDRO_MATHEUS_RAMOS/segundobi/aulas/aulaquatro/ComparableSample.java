package segundobi.aulas.aulaquatro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class ComparableSample {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Civic", "Honda", 2008));
        cars.add(new Car("350z", "Nissan", 2006));
        cars.add(new Car("GT-R", "Nissan", 2012));
        cars.add(new Car("Supra", "Toyota", 2004));

        System.out.println("Sem ordenação:");
        cars.forEach(car -> System.out.println(car.getName() + " - " + car.getYear()));

        // Ordenando
        // Collections.sort(cars);
        cars = cars.stream().sorted().toList();

        System.out.println("\nOrdenado padrão da classe(ano):");
        cars.forEach(car -> System.out.println(car.getName() + " - " + car.getYear()));
    }

}
