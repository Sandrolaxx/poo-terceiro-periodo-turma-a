package atividades1B;

public class Vendedor {
    private String nome;
    private int idade;
    private Loja loja;
     String cidade;
     String bairro;
     String rua;
    private double[] salarioLancamentos;
    private double salarioBase;
     double salarioRecebido;

    public Vendedor(String nome, int idade, Loja loja, String cidade, String bairro, String rua, double[] salarioLancamentos, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.salarioLancamentos = salarioLancamentos;
        this.salarioBase = salarioBase;
        this.salarioRecebido = 0;
        this.loja.adicionarVendedor(this);
    }

    public void apresentarSe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Loja: " + loja.getNomeFantasia());
    }

    public double calcularMedia() {
        double soma = 0;
        for (double salario : salarioLancamentos) {
            soma += salario;
        }
        return soma / salarioLancamentos.length;
    }

    public double calcularBonus() {
        return salarioBase * 0.2;
    }
}
