package KAUA_MATHEUS.primeiro_bimestre;

public class Vendedor {

    // Criação de Vars

    private String nome;
    private int idade;
    private String cidade;
    private String bairro;
    private String rua;
    private float salarioBase;
    private float salarioRecebido;

    public Vendedor(String nome, int idade, String cidade,
    String bairro, String rua, float salarioBase, float salarioRecebido) {


        // Criação de Propriedades
        this.nome = nome; this.idade = idade; this.cidade = cidade;
        this.bairro = bairro; this.rua = rua; this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;

    }


    // Criação de Métodos

    void apresentar() {
        System.out.println("Olá eu me chamo " + this.nome + " e tenho " + this.idade + " anos!");
        System.out.println("E moro em " + this.cidade);
    }

    //void calcularMedia(){   }

}
