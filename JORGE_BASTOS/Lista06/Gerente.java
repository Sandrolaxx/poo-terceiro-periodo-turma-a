package Lista06;

import java.util.ArrayList;
import java.util.List;

public class Gerente {
    private String nome;
    private int idade;
    private String loja;
    private double salarioBase;
    private List<Double> historicoSalarios;

    public Gerente(String nome, int idade, String loja, Endereco endereco, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.salarioBase = salarioBase;
        this.historicoSalarios = new ArrayList<>();
    }

    public void apresentarSe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Loja: " + loja);
    }

    public double calcularMediaSalarios() {
        double total = historicoSalarios.stream().mapToDouble(Double::doubleValue).sum();
        return total / historicoSalarios.size();
    }

    public double calcularBonus() {
        return salarioBase * 0.35;
    }
    
}
