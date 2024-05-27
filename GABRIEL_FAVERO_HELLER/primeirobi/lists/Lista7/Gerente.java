package primeirobi.lists.Lista7;

public class Gerente extends Endereco {

    private String nome;
    private int idade;
    private Loja loja;
    private double salarioBase;
    private double[] salarioRecebido = { 2000, 2250, 2500 };

    public Gerente(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salarioBase = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double[] getSalarioRecebido() {
        return salarioRecebido;
    }

    public void setSalarioRecebido(double[] salarioRecebido) {
        this.salarioRecebido = salarioRecebido;
    }

    public void apresentarSe() {
        System.out.println("Gerente: " + nome);
        System.out.println("Idade: " + idade);
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
        bonus = salarioBase * 0.35;
        System.out.println("Bonus salarial: " + bonus);
    }
}