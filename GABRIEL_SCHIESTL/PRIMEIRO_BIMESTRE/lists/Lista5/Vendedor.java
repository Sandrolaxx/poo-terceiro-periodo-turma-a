package PRIMEIRO_BIMESTRE.lists.Lista5;

public class Vendedor {
    String name;
    Integer age;
    Loja store;
    String city;
    String  block;
    String street;
    double baseSalary;
    double[] receivedSalary = new double[3];

    public void presentation(){
        System.out.println("Ola, sou o(a) vendedor(a) ".concat(name)
        .concat(" tenho " + age + " anos e trabalho na loja " + this.store.popularName));
    }

    public void calculateAverage(){
        double average = 0;
        for (double value : receivedSalary) {
            average += value;
        }

        System.out.println("A media de salarios: " + (average/3));
    }

    public void calculateBonus(){
        double bonus = 0;
        bonus = baseSalary * 0.2;
        System.out.println("O bonus salarial: " + bonus);
    }
}
