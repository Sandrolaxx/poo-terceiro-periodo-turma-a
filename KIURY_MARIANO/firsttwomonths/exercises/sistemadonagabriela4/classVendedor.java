// 1. Crie uma classe Vendedor com:
// Com os atributos nome, idade, Loja, cidade, bairro, rua, salarioBase e salarioRecebido.
// Atributo salarioRecebido DEVE armazenar no mínimo três valores de lançamentos de salário.(Pode colocar no código os valores*)
// Métodos apresentarse calcularMedia e calcularBonus.
// Método apresentarse deve printar o nome, idade e Loja.
// calcularMedia deve trazer a média dos salários.
// calcularBonus onde a formulá é [salarioBase * 0.2]


package sistemaDonaGabriela4;
import java.util.ArrayList;
import java.util.List;

public class classVendedor {
    
    String nome;
    int idade;
    String cidade;
    String bairro;
    String rua;
    float salarioBase;
    ArrayList<Float> salarioRecebido = new ArrayList<>();

    classLoja Loja = new classLoja();

    void apresentarse(){
        System.out.println("Cliente: " +nome+ ", idade: " +idade+ ". Loja: " +Loja.nomeFantasia);
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

        System.out.println("Bonus: " +salarioBase*0.2); 
    }

}
