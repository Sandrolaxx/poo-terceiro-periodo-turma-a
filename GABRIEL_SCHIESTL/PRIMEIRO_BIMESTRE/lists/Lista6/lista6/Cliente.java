package PRIMEIRO_BIMESTRE.lists.Lista6.lista6;

public class Cliente extends Endereco {
    private String name;
    private Integer age;

    public Cliente(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void presentation() {
        System.out.println("Ola, sou o(a) ".concat(name)
                .concat(" e tenho ") + age + " anos");
    }
}
