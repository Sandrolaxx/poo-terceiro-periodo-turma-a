package primeirobi.lists.Lista6;

public class Gerente extends Endereco {

    String nome;
    int idade;
    Loja loja;
    double salarioBase;
    double[] salarioRecebido = { 2000, 2250, 2500 };

    public Gerente(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salarioBase = salario;
    }

    public void apresentarSe() {
        System.out.println("Sou o gerente " + nome + " possuo " + idade + " anos e gerencio a loja " + this.loja.nomeFantasia);
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
        bonus = salarioBase * 0.35;
        System.out.println("Bonus salarial: " + bonus);
    }
}