package KAUA_MATHEUS.primeiro_bimestre.Lista_6;

public class Cliente implements Pessoa{

    private String name;
    private int age;

    private Endereco address;
    private Loja store;

    public void setPessoa(String name, int age, 
    Endereco address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void apresentarSe(){
        System.out.printf("Olá, meu nome é %s!\n", this.name);
        System.out.printf("Idade: %d\n", this.age);
    }

    public void enderecoApresenta(){
        System.out.printf("Rua %s, %s - %s\n", address.street, 
        address.neighborhood, address.city);
    }

}
