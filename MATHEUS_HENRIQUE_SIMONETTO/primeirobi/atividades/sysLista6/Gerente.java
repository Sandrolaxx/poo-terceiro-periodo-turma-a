package primeirobi.atividades.sysLista6;

public class Gerente extends Vendedor {
    public Gerente(String nome, int idade, String loja, Endereco endereco, double salarioBase, double[] salarioRecebido) {
        super(nome, idade, loja, endereco, salarioBase, salarioRecebido);
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.35;
    }
}
