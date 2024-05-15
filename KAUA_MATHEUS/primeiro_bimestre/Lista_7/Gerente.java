package KAUA_MATHEUS.primeiro_bimestre.Lista_7;

public class Gerente implements Pessoa{

    private String name;
    private int age;
    private float base_wage;
    private float[] wage_received;

    private Endereco address;
    private Loja store;

    public void setPessoa(String name, int age, Endereco address,
    float base_wage, float[] wage_received, Loja store){
        this.name = name;
        this.age = age;
        this.address = address;
        this.base_wage = base_wage;
        this.wage_received = wage_received;
        this.store = store;
    }

    public void apresentarSe(){
        System.out.printf("Olá, meu nome é %s!\n", this.name);
        System.out.printf("Idade: %d\n", this.age);
    }

    public void enderecoApresenta(){
        System.out.printf("Rua %s, %s - %s\n", address.street, 
        address.neighborhood, address.city);
    }

    @Override
    public float calcular_bonus() {
        return base_wage * 0.35f;
    }

    @Override
    public float calcular_media() {
        float median = 0;

        for (int i = 0; i < wage_received.length; i++) {
            median = median + wage_received[i];
        }
        return median / wage_received.length;
    }

}
