package WILLYAM_GABRIEL.PRIMEIRO_BIMESTRE.ATIVIDADES.ListaCinco;
import java.util.ArrayList;
class Loja {
    String nomeFantasia;
    String razaoSocial;
    String cnpj;
    String cidade;
    String bairro;
    String rua;
    ArrayList<Vendedor> vendedores;
    ArrayList<Cliente> clientes;

    public Loja(String nomeFantasia, String razaoSocial, String cnpj, String cidade, String bairro, String rua) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.vendedores = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void adicionarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    public int contarClientes() {
        return clientes.size();
    }
    public int contarVendedores() {
        return vendedores.size();
    }
    public void apresentarSe() {
        System.out.println("NOME FANTASIA: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("ENDEREÇO: " + cidade + ", " + bairro + ", " + rua);
    }
}
