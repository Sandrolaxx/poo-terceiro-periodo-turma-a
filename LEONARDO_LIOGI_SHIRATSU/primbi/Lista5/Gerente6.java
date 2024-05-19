package primbi.Lista5;

public class Gerente6 extends Endereco {
    private String nome;
    private int idade;
    private String loja;
    private double salarioBase;
    private double[] salarioRecebido = {150,300,150};

    public Gerente6(String nome, int idade, String loja, double salarioBase, String estado, String cidade, String bairro, int numero, String complemento){
        super(estado, cidade, bairro, numero, complemento);

        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.salarioBase = salarioBase;
    }
    

    public void apresentarSe() {
        System.out.println("Gerente.java\nNome: " + nome + "\nIdade: " + idade + "\nLoja: " + loja);
        apresentarLogradouro();
    }

    void calcularMedia(){

        int sum = 0;
        
        for (int i = 0; i < salarioRecebido.length; i++){

            sum += salarioRecebido[i];

        }

        Double avg = (double) (sum / salarioRecebido.length);

        System.out.println("Salário recebido : " + sum );
        System.out.println("Média do salário : " + avg);
    }

    void calcularBonus(){

        double Bonus = salarioBase* 0.35;

        System.out.println("Bonus : " + Bonus);
    }

    
}