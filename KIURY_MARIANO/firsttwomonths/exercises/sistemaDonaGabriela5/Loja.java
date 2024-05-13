// 3. Crie uma classe Loja com:
// Atributos, nome fantasia, razão social, cpnj, cidade, bairro, rua, array vendedores, array de clientes.
// contarClientes, mosta a quantidade de clientes
// contarVendedores, mosta a quantidade de vendedores.
// Método apresentarse, printa nomeFantasia, cnpj e endereco.

public class Loja extends Endereco{

    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private Cliente[] clientes;
    private Vendedor[] vendedores;
    
    void contarClientes(){
        System.out.println("Total clientes: " +clientes.length);
    
    }

    void contarVendedores(){
        System.out.println("Total vendedores: " +vendedores.length);
    }

    void apresentarse(){
        System.out.println("Nome fantasia: " +nomeFantasia+ ", CNPJ " +cnpj+ ", endereço: " +getRua() + getBairro() + getCidade());
    }


    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCNPJ(String CNPJ) {
        this.cnpj = CNPJ;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Vendedor[] getVendedores() {
        return vendedores;
    }

    public void setVendedores(Vendedor[] vendedores) {
        this.vendedores = vendedores;
    }

    

    
}
