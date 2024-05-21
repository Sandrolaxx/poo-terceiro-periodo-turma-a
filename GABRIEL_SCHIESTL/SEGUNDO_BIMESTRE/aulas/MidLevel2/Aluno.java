package SEGUNDO_BIMESTRE.aulas.MidLevel2;

public class Aluno {

    String name;

    Integer age;

    public Aluno (String name, Integer age){

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
    
}
