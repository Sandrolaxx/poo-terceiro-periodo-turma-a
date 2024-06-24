package Testes.Lista5;

import java.util.ArrayList;

public class Gerente extends Vendedor {
private String nome;
private int idade;
private String loja;
private double salarioBase;
private ArrayList<Double> salarioRecebido = new ArrayList<Double>();

    public Gerente(String nome, int idade, String loja, double salarioBase) {
        super(nome, idade, loja, salarioBase);
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        
        this.salarioBase = salarioBase;
        this.salarioRecebido.add(3500.0);
        this.salarioRecebido.add(3800.0);
        this.salarioRecebido.add(3600.0);
    }
    
    public void apresentarSe(){
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
}
