package PRIMEIRO_BIMESTRE.lists.Lista6.lista6;

public class Gerente extends Endereco {

    private String name;
    private int age;
    private Loja store;
    private float baseSalary;
    private float[] receivedSalary = { 2000f, 2350f, 2237f };

    public Gerente(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.baseSalary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Loja getStore() {
        return store;
    }

    public void setStore(Loja store) {
        this.store = store;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public float[] getReceivedSalary() {
        return receivedSalary;
    }

    public void setReceivedSalary(float[] receivedSalary) {
        this.receivedSalary = receivedSalary;
    }

    public void presentation() {
        System.out.println("Ola, sou o(a) gerente(a) ".concat(name)
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
        bonus = baseSalary * 0.35;
        System.out.println("O bonus salarial: " + bonus);
    }
}
