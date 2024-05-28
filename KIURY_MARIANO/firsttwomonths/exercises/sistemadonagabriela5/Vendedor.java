// 1. Crie uma classe Vendedor com:
// Com os atributos nome, idade, Loja, cidade, bairro, rua, salarioBase e salarioRecebido.
// Atributo salarioRecebido DEVE armazenar no mínimo três valores de lançamentos de salário.(Pode colocar no código os valores*)
// Métodos apresentarse calcularMedia e calcularBonus.
// Método apresentarse deve printar o nome, idade e Loja.
// calcularMedia deve trazer a média dos salários.
// calcularBonus onde a formulá é [salarioBase * 0.2]

import java.util.ArrayList;

public class Vendedor extends Pessoa{

    private float salarioBase;
    private double[] salarioRecebido;

    private Loja Loja = new Loja();

    void apresentarse(){
        System.out.println("Vendedor: " +getNome()+ ", idade: " +getIdade()+ ". Loja: " +Loja.getNomeFantasia());
    }

    void calcularMedia(){
        
        float media = 0;

        for (int i = 0; i < salarioRecebido.length; i++) {
            media += salarioRecebido[i];
        }

        media = media/salarioRecebido.length;
        System.out.println("Media: " + media);
    }

    void calcularBonus(){

        System.out.println("Bonus: " +salarioBase*0.2); 
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Loja getLoja() {
        return Loja;
    }

    public void setLoja(Loja loja) {
        Loja = loja;
    }

    public double[] getSalarioRecebido() {
        return salarioRecebido;
    }

    public void setSalarioRecebido(double[] salarioRecebido) {
        this.salarioRecebido = salarioRecebido;
    }

}
