// 1. Crie um classe Gerente:
// - Com os atributos nome, idade, Loja, cidade, bairro, rua, salarioBase e salarioRecebido.
// - Atributo salarioRecebido DEVE armazenar no mínimo três valores de lançamentos de salário.(Pode colocar no código os valores*)
// - Métodos apresentarse calcularMedia e calcularBonus.
// - Método apresentarse deve printar o nome, idade e Loja.
// - calcularMedia deve trazer a média dos salários.
// - calcularBonus onde a fórmula é [salarioBase * 0.35].

import java.util.ArrayList;

public class Gerente extends Pessoa {
    
    private Loja Loja = new Loja();
    private double salarioBase;
    private ArrayList<Float> salarioRecebido = new ArrayList<>();

    void apresentarse(){
        System.out.println("Cliente: " +getNome()+ ", idade: " +getIdade()+ ". Loja: " +Loja.getNomeFantasia());
    }

    void calcularMedia(){
        
        float media = 0;

        for (int i = 0; i < salarioRecebido.size(); i++) {
            media += salarioRecebido.get(i);
        }

        media = media/salarioRecebido.size();
        System.out.println("Media: " + media);
    }

    void calcularBonus(){

        System.out.println("Bonus: " +salarioBase*0.35); 
    }
}
