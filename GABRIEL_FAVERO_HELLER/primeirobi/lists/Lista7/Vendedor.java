package primeirobi.lists.Lista7;

public class Vendedor extends Endereco {
    private String nome;
    private Integer idade;
    private Loja loja;
    private double salarioBase;
    private double[] salarioRecebido = new double[3];

    public Vendedor(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salarioBase = salario;
    }

    public void apresentarSe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade:" + idade);
        System.out.println("Loja: " + this.loja.getNomeFantasia());
    }

    public void calcularMedia() {
        double media = 0;
        for (double preco : salarioRecebido) {
            media += preco;
        }

        System.out.println("Media de salarios: " + (media / 3));
    }

    public void calcularBonus() {
        double bonus = 0;
        bonus = salarioBase * 0.2;
        System.out.println("Bonus salarial: " + bonus);
    }
}