package primeirobimestre.Myyplants;

class Vendedor {
    String nome, cidade, bairro, rua, loja;
    int idade;
    double salarioBase;
    double[] salarioRecebido = new double[3]; // Armazena três valores 

    //Apresentar o vendedor
    public void apresentarse() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Loja: " + loja);
    }

    // Calcula a média dos salários
    public double calcularMedia() {
        double soma = 0;
        for (double salario : salarioRecebido) {
            soma += salario;
        }
        return soma / salarioRecebido.length;
    }

    // Calcula o bônus
    public double calcularBonus() {
        return salarioBase * 0.2;
    }
}