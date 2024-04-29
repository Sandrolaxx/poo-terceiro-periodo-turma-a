package ListaSete;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;
    private double salarioBase;

    public Pessoa(String nome, int idade, Endereco endereco, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.salarioBase = salarioBase;
    }

    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    
    public abstract double calcularBonus();
}