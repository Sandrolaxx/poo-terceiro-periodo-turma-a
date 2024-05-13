package MyPlant;

public class Funcionario {
    protected String nome;
    protected int idade;
    protected String loja;
    protected String cidade;
    protected String bairro;
    protected String rua;
    protected double salarioBase;
    protected double[] salarioRecebido = new double[3];

    public Funcionario(String nome, int idade, String loja, String cidade, String bairro, String rua, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.salarioBase = salarioBase;
    }

    public void receberSalario(double salario) {
        // Armazenar o salário recebido no próximo índice disponível
        for (int i = 0; i < salarioRecebido.length; i++) {
            if (salarioRecebido[i] == 0) {
                salarioRecebido[i] = salario;
                break;
            }
        }
    }

    public void apresentarSe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Loja: " + loja);
    }

    public double calcularMedia() {
        double soma = 0;
        int contador = 0;
        for (double salario : salarioRecebido) {
            if (salario != 0) {
                soma += salario;
                contador++;
            }
        }
        return contador == 0 ? 0 : soma / contador;
    }

    public double calcularBonus() {
        return salarioBase * 0.2;
    }
}
