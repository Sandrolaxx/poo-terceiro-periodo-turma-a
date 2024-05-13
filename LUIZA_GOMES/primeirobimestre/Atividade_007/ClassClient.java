package Atividade_007;

public class ClassClient {

    private String name;
    private int age;
    private String city;
    private String ngbh;
    private String street;

    public ClassClient(String name, int age, String city, String ngbh, String street) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.ngbh = ngbh;
        this.street = street;
    }

    void apresentarse() {
        System.out.println("cliente: " + name + "\nidade: " + age);
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
}
