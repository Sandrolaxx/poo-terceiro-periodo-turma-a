package WILLYAM_GABRIEL.PRIMEIRO_BIMESTRE.ATIVIDADES.ListaCinco;
import java.util.ArrayList;
class Vendedor {
    String nome;
    int idade;
    String loja;
    String cidade;
    String bairro;
    String rua;
    double salarioBase;
    ArrayList<Double> salarioRecebido;

    public Vendedor(String nome, int idade, String loja, String cidade, String bairro, String rua, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.salarioBase = salarioBase;
        this.salarioRecebido = new ArrayList<>();
        this.salarioRecebido.add(1260.50);
        this.salarioRecebido.add(2200.70);
        this.salarioRecebido.add(3000.80);
    }
    public void apresentarSe() {
        System.out.println("NOME: " + nome);
        System.out.println("IDADE: " + idade);
        System.out.println("LOJA: " + loja);
    }
    public double calcularMedia() {
        double soma = 0;
        for (double salario : salarioRecebido) {
            soma += salario;
        }
        return soma / salarioRecebido.size();
    }
    public double calcularBonus() {
        return salarioBase * 0.2;
    }
}
