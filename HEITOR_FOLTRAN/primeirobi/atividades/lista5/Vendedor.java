package primeirobi.atividades.lista5;

public class Vendedor {
    
    String nome, loja, cidade, bairro, rua;
    int salarioBase, idade;
    double [] salarioRecebido = new double[3];

    public Vendedor (String nome, String loja, String cidade, String bairro, String rua, int salarioBase, int idade, double[] salarioRecebido){
        this.nome = nome;
        this.loja = loja;
        this.idade = idade;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;
    }

    public void apresentarSe() {
        System.out.println("Nome do vendedor: " + this.nome + "\nIdade: " + this.idade + "\nLoja: " + this.loja);
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