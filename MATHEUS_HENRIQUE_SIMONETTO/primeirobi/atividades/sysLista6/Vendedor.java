package primeirobi.atividades.sysLista6;

public class Vendedor extends Pessoa {
    protected String loja;
    protected double salarioBase;
    protected double[] salarioRecebido = new double[3];

    public Vendedor(String nome, int idade, String loja, Endereco endereco, double salarioBase, double[] salarioRecebido) {
        super(nome, idade, endereco);
        this.loja = loja;
        this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;
    }

    @Override
    public void apresentarSe() {
        super.apresentarSe();
        System.out.println("Loja: " + loja);
    }

    public double calcularMedia() {
        double soma = 0;
        for (double salario : salarioRecebido) {
            soma += salario;
        }
        return soma / salarioRecebido.length;
    }

    public double calcularBonus() {
        return salarioBase * 0.2;
    }
}
