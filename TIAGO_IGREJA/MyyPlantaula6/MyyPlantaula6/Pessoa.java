


import java.util.ArrayList;

public abstract class Pessoa {
    String nome;
    int idade;
    Endereco endereco;
    double salarioBase;
    ArrayList<Double> salarioRecebido = new ArrayList<>();

    public Pessoa(String nome, int idade, Endereco endereco, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.salarioBase = salarioBase;
        this.salarioRecebido.add(salarioBase);
        this.salarioRecebido.add(salarioBase * 1.1);
        this.salarioRecebido.add(salarioBase * 1.2);
    }

    public void apresentarSe() {
        System.out.printf("Nome: %s, Idade: %d, Endereço: ", nome, idade);
        endereco.apresentarLogradouro();
    }

    public double calcularMediaSalario() {
        return salarioRecebido.stream().mapToDouble(a -> a).average().orElse(0);
    }

    public abstract double calcularBonus();
}
