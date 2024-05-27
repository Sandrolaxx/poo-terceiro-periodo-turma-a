
public class Vendedor extends Pessoa {
    public Vendedor(String nome, int idade, Endereco endereco, double salarioBase) {
        super(nome, idade, endereco, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.2;
    }
}
