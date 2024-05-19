package primbi.Lista5;

public class cliente extends Endereco {

    String nome;
    int idade;


    public cliente(String estado, String cidade, String bairro, int numero, String complemento) {
        super(estado, cidade, bairro, numero, complemento);

    }

    void apresentarseCliente() {
        System.out.println("\nOlá meu nome é " + nome + " sou cliente da TrabucoStore e tenho " + idade + " anos");
    }


    public void apresentarLogradouro() {
        System.out.println(this.getNumero() + ", " + this.getComplemento() + ", " + this.getBairro() + ", " + this.getCidade() + " - " + this.getEstado());
    }
 }

