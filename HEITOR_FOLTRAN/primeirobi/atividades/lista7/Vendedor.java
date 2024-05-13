package primeirobi.atividades.lista7;

public class Vendedor extends Cidadao {
    protected String loja;
    protected int salarioBase;
    protected double[] salarioRecebido;

    public Vendedor(String nome, String loja, String cidade, String bairro, String rua, int salarioBase, int idade, double[] salarioRecebido) {
        super(nome, cidade, bairro, rua, rua, idade);
        this.loja = loja;
        this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;
    }

    public void apresentarSe() {
        System.out.println("Nome do vendedor: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nLoja: " + this.loja);
    }

    public void calcularMedia() {
        double soma = 0;
        for (double salario : this.salarioRecebido) {
            soma += salario;
        }
        double media = soma / this.salarioRecebido.length;
        System.out.println("Média salarial: " + media);
    }

    public void calcularBonus() {
        double bonus = this.salarioBase * 0.2;
        System.out.println("Bônus: " + bonus);
    }
}