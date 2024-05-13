package ListaSete;

import java.util.ArrayList;

public class Funcionario extends Pessoa {
    
    Double salarioBase;
    ArrayList<Double> salarioRecebido = new ArrayList<>();

    protected Funcionario(int id, String nome, int idade, Double salarioBase) {
        super(id, nome, idade);
        this.salarioBase = salarioBase;
    }

    protected double getSalarioBase() {
        return salarioBase;
    }

    protected void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    protected void adicionarSalario(double salario) {
        salarioRecebido.add(salario);
    }

    protected double calcularMedia() {
        double soma = 0;
        for (double salario : salarioRecebido) {
            soma += salario;
        }
        return soma / salarioRecebido.size();
    }

    protected double calcularBonus() {
        return 0;
    }
}
