package Atividade_007;

import java.util.List;

public class ClassSeller { // Com os atributos nome, idade, Loja, cidade, bairro, rua, salarioBase e
                           // salarioRecebido.

    private String name;
    private int age;
    private String city;
    private String ngbh;
    private String street;
    protected double baseSalary;
    private String shop;
    private List<Double> received;

    public ClassSeller(String name, int age, String city, String ngbh, String street, double baseSalary, String shop,
            List<Double> received) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.ngbh = ngbh;
        this.street = street;
        this.baseSalary = baseSalary;
        this.shop = shop;
        this.received = received;
    }

    public void apresentarse() {
        System.out.println("vendedor: " + name + "\nidade: " + age + "\nloja: " + shop);

    }

    public void calcularMedia() {
        double total = 0;

        for (double salario : received) {
            total += salario;
        }
        Double media = total / received.size();

        System.out.println("Media: " + media);
    }

    public void calcularBonus() {

        System.out.println("Bonus: " + baseSalary * 0.2);
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNgbh() {
        return ngbh;
    }

    public void setNgbh(String ngbh) {
        this.ngbh = ngbh;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public List<Double> getReceived() {
        return received;
    }

    public void setReceived(List<Double> received) {
        this.received = received;
    }

}
