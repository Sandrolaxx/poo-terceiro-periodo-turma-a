package GABRIEL_SCHIESTL.PRIMEIRO_BIMESTRE.prova;

public class Aluno {

    private String name;
    private int register, age;

    public Aluno(String name, int age, int register) {
        this.setName(name);
        this.setAge(age);
        this.setRegister(register);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegister() {
        return register;
    }

    public void setRegister(int register) {
        this.register = register;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
