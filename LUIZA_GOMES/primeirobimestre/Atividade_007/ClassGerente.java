package Atividade_007;

import java.util.List;

public class ClassGerente extends ClassSeller {

    public ClassGerente(String name, int age, String city, String ngbh, String street, double baseSalary, String shop,
            List<Double> received) {
        super(name, age, city, ngbh, street, baseSalary, shop, received);

    }

    @Override
    public void calcularBonus() {

        System.out.println("Bonus: " + baseSalary * 0.35);

    }

    

}
