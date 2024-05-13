package KAUA_MATHEUS.primeiro_bimestre.Lista_6;

public abstract class Pessoa{
    
    protected String name;
    protected int age;
    Endereco endereco;

    void setPessoa(String name, int age, Endereco endereco){
        this.name = name;
        this.age = age;
        this.endereco = endereco;
    }

    void apresentarSe(){
        System.out.printf("Olá, meu nome é %s!\n", this.name);
        System.out.printf("Idade: %d\n", this.age);
    }

    void enderecoApresenta(){
        System.out.printf("Rua %s, %s - %s\n", this.street, this.neighborhood, this.city);
    }
}
