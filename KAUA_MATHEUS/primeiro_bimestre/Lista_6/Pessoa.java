package KAUA_MATHEUS.primeiro_bimestre.Lista_6;

public abstract class Pessoa extends Endereco{
    
    protected String name;
    protected int age;

    void setPessoa(String name, int age, String city,
                   String neighborhood, String street){
        this.name = name;
        this.age = age;
        this.city = city;
        this.neighborhood = neighborhood;
        this.street = street;
    }

    void apresentarSe(){
        System.out.printf("Olá, meu nome é %s!\n", this.name);
        System.out.printf("Idade: %d\n", this.age);
    }

    void enderecoApresenta(){
        System.out.printf("Rua %s, %s - %s\n", this.street, this.neighborhood, this.city);
    }

    public abstract double getBonificacao();
}
