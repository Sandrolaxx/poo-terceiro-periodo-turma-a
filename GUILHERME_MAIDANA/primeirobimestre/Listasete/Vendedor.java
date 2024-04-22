package primeirobimestre.Listasete;
import java.util.ArrayList;
import java.util.Arrays;

public class Vendedor {
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
        this.salarioRecebido = new ArrayList<>(Arrays.asList(1500.0, 1600.0, 1550.0));
    }

    public Vendedor(String string) {

    }

    public void apresentarse() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Loja: " + loja);
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


    public void adicionarSalarioRecebido(double salario) {
        salarioRecebido.add(salario);
    }

    public String getNome() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }
}