// Crie uma classe Loja com:
// Atributos, nome fantasia, razão social, cpnj, cidade, bairro, rua, array vendedores, array de clientes.
// contarClientes, mosta a quantidade de clientes
// contarVendedores, mosta a quantidade de vendedores.
// Método apresentarse, printa nomeFantasia, cnpj e endereco.

package exercises.sistemadonagabriela6;

public class Loja{
    
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private Endereco Endereco;
    private Vendedor[] vendedores;
    private Cliente[] clientes;


    // Métodos

    void contarClientes(){
        System.out.println("\n\tTotal clientes: " +clientes.length);
    }

    void contarVendedores(){
        System.out.println("\n\tTotal vendedores: " +vendedores.length);
    }

    void apresentarse(){
        System.out.println("\n*** Loja: " +nomeFantasia+ ". CNPJ " +cnpj+ " ***");
        Endereco.apresentarLogradouro();
    }

    // Getters e Seters

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

    public Vendedor[] getVendedores() {
        return vendedores;
    }

    public void setVendedores(Vendedor[] vendedores) {
        this.vendedores = vendedores;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(Endereco endereco) {
        Endereco = endereco;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}