package PRIMEIRO_BIMESTRE.lists.Lista6.lista6;

public class Vendedor extends Endereco {
    private String name;
    private Integer age;
    private Loja store;
    private double baseSalary;
    private double[] receivedSalary = new double[3];

    public Vendedor(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.baseSalary = salary;
    }

    public void presentation() {
        System.out.println("Ola, sou o(a) vendedor(a) ".concat(name)
                .concat(" tenho " + age + " anos e trabalho na loja " + this.store.getPopularName()));
    }

    public void calculateAverage() {
        double average = 0;
        for (double value : receivedSalary) {
            average += value;
        }

        System.out.println("A media de salarios: " + (average / 3));
    }

    public void calculateBonus() {
        double bonus = 0;
        bonus = baseSalary * 0.2;
        System.out.println("O bonus salarial: " + bonus);
    }
}
