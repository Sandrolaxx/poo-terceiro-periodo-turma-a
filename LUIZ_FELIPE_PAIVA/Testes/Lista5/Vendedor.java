package Testes.Lista5;

import java.util.ArrayList;

public class Vendedor {
    private String nome;
    private int idade;
    private String loja;
    private double salarioBase;
    private ArrayList<Double> salarioRecebido = new ArrayList<Double>();
    //private double [] salarioRecebido = {1900.0, 1800.0, 2000.0};


    public Vendedor(String nome, int idade, String loja, double salarioBase ){
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.salarioBase = salarioBase;
        //dai removeria as de baixo e mudaria o calcularMedia pra length em vez de size.
        this.salarioRecebido.add(1900.0);
        this.salarioRecebido.add(1800.0);
        this.salarioRecebido.add(2000.0);
    }

    public void apresentarSe (){
        System.out.println("Nome: "+nome+ "\nIdade: "+idade+ "\nLoja: "+loja);
    }

    public void calcularMedia (){
        double soma = 0;
        for (double salario : salarioRecebido) {
            soma += salario;
        }
        double resultado = soma/salarioRecebido.size();
        System.out.println("A média salarial do vendedor nos ultimos 3 meses foi: "+resultado);
    }

    public void calcularBonus(){
        double bonus = salarioBase *0.20;
        System.out.println("Bonus: "+bonus);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public ArrayList<Double> getSalarioRecebido() {
        return salarioRecebido;
    }

    public void setSalarioRecebido(ArrayList<Double> salarioRecebido) {
        this.salarioRecebido = salarioRecebido;
    }


    
}
