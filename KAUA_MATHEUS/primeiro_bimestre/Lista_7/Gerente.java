package KAUA_MATHEUS.primeiro_bimestre.Lista_6;

public class Gerente extends Vendedor{

    public Gerente(String name, int age, Loja Store, String state, 
    String number, String complement, String city, 
    String neighborhood, String street, 
    float[] wage_received, 
    float base_wage) {
        super(name, age, Store, state, number, complement,
        city, neighborhood, street, wage_received, base_wage);
        //TODO Auto-generated constructor stub
    }

    @Override
    float calcularBonus() {
        return base_wage * 0.35f;
    }

    /*
     * 1. Crie um classe Gerente:
        - Com os atributos nome, idade, Loja, cidade, bairro, rua, salarioBase e salarioRecebido.
        - Atributo salarioRecebido DEVE armazenar no mínimo três valores de lançamentos de salário.(Pode colocar no código os valores*)
        - Métodos apresentarse calcularMedia e calcularBonus.
        - Método apresentarse deve printar o nome, idade e Loja.
        - calcularMedia deve trazer a média dos salários.
        - calcularBonus onde a fórmula é [salarioBase * 0.35].
     */


    

}
