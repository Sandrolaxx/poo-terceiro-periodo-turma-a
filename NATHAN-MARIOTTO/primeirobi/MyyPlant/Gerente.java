
public class Gerente extends Pessoa {
    public Gerente(String nome, int idade, Endereco endereco, double salarioBase) {
        super(nome, idade, endereco, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.35;
    }
}
