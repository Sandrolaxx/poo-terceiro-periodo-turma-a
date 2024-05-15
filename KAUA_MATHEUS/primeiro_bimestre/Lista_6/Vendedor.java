package KAUA_MATHEUS.primeiro_bimestre.Lista_6;

import java.util.ArrayList;

public class Vendedor extends Endereco{

    // Criação de Atributos
    String name;
    int age;
    Loja Store;
    float base_wage, average, bonus;
    float[] wage_received;

    // Criação do acesso de Vendedor
    public Vendedor(String name, int age, Loja Store,
    String state, String number, String complement,
    String city, String neighborhood, String street,
                    float[] wage_received, float base_wage) 
    {
        // Criação de Propriedades
        this.name = name; 
        this.age = age; 
        this.Store = Store;
        this.city = city; 
        this.neighborhood = neighborhood;
        this.street = street;
        this.complement = complement;
        this.state = state;
        this.number = number;
        this.wage_received = wage_received; 
        this.base_wage = base_wage;
        this.bonus = 0;
        this.average = 0;
    }

    // Criação do método "apresentarSe"
    void apresentarSe() {
        System.out.printf("Olá eu me chamo \u001B[32m%s!\u001B[m e tenho \u001B[32m%d\u001B[m anos!\n", this.name, this.age);
        System.out.printf("Trabalho na loja \u001B[32m%s\u001B[m\n", this.Store.fantasy_name);

        return;
    }

    float calcularMedia(){   
        for (int i = 0; i < this.wage_received.length; i++) {
            this.average += this.wage_received[i];   
        }
        this.average /= this.wage_received.length;
        return this.average;
    }

    float calcularBonus(){   
        this.bonus = this.base_wage * 0.2f;
        return this.bonus;
    }

}
