package MyPlant;

public class Gerente extends Funcionario {
    public Gerente(String nome, int idade, String loja, String cidade, String bairro, String rua, double salarioBase) {
        super(nome, idade, loja, cidade, bairro, rua, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.35;
    }
}
