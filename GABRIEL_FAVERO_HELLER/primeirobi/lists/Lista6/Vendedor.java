package primeirobi.lists.Lista6;

public class Vendedor extends Endereco {
    String nome;
    Integer idade;
    Loja loja;
    double salarioBase;
    double[] salarioRecebido = new double[3];

    public Vendedor(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salarioBase = salario;
    }

    public void apresentarSe() {
        System.out.println("Sou o vendedor " + nome + " tenho " + idade + " anos e trabalho na loja " + this.loja.nomeFantasia);
    }

    public void calcularMedia() {
        double media = 0;
        for (double valor : salarioRecebido) {
            media += valor;
        }

        System.out.println("Media de salarios: " + (media / 3));
    }

    public void calcularBonus() {
        double bonus = 0;
        bonus = salarioBase * 0.2;
        System.out.println("Bonus salarial: " + bonus);
    }
}