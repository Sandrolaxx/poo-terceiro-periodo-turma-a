package ListaSete;

public class Vendedor extends Pessoa {
    public Vendedor(String nome, int idade, Endereco endereco, double salarioBase) {
        super(nome, idade, endereco, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.2;
    }
}