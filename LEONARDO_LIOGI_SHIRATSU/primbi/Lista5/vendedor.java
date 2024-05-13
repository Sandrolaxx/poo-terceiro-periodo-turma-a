package primbi.Lista5;

public class vendedor extends Endereco {

    public vendedor(String estado, String cidade, String bairro, int numero, String complemento, String nome, int idade, String loja
    , double salarioBase) {
        super(estado, cidade, bairro, numero, complemento);


    }

    String nome;
    int idade;
    String loja;
    double salarioBase;
    double[] salarioRecebido = {150,300,150};


    public double[] getSalarioRecebido() {
        return this.salarioRecebido;
    }


    public String getNome() {
        return this.nome;
    }


  

    void apresentarse(){
        System.out.println("Olá meu nome é " + nome + ", tenho " + idade + " anos e trabalho na " + loja);
    }

    public void apresentarLogradouro() {
        System.out.println(this.getNumero() + ", " + this.getComplemento() + ", " + this.getBairro() + ", " + this.getCidade() + " - " + this.getEstado());
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

        double Bonus = salarioBase* 0.2;

        System.out.println("Bonus : " + Bonus);
    }
}
