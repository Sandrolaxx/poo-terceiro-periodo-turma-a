package PRIMEIRO_BIMESTRE.lists.Lista5;

public class Cliente {
    String name;
    Integer age;
    String city;
    String block;
    String street;

    public void presentation(){
        System.out.println("Ola, sou o(a) ".concat(name)
        .concat(" e tenho ") + age + " anos");
    }
}
