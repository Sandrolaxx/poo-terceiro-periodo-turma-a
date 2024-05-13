package primbi.Lista5;

public class loja extends Endereco {

    String nome;
    String razaoSocial;
    String cnpj;
    String rua;
    String nomeFantasia;
    double[] quantVendedores = { 21, 30, 22 };
    double quantClientes[] = { 2, 3, 3, 3, 3 };
    public String razaosocial;

    public loja(String estado, String cidade, String bairro, int numero, String complemento) {
        super(estado, cidade, bairro, numero, complemento);
    }

    void apresentarSe() {
        System.out.println("\nNome Fantasia: " + nome + "\nCNPJ: " + cnpj +
                "\nEndereço: " + this.getCidade() + ", " + this.getEstado() + ", " + this.getBairro() + ", " + rua);
    }

    void contarClientes() {
        System.out.println("Quantidade de clientes: " + quantClientes.length);
    }

    void contarVendedores() {

        System.out.println("Quantidade de vendedores: " + quantVendedores.length);

    }
}
