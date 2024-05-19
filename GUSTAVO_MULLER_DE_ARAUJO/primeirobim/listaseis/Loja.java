package primeirobim.listaseis;

public class Loja extends Endereco{
    
    public String nomeFantasia;

    public String razaoSocial;

    public Vendedor[] vendedores;

    public Cliente[] clientes;

    private int totalClientes;

    private int totalVendedores;

    public void apresentaLoja () {

        setNomeFantasia("My Plantt");
        setCnpj("12345678901234");

        String showLoja = "Loja: " + getNomeFantasia() + "\n" + "CNPJ: "+ getCnpj() + "\n";
        System.out.println(showLoja);
    }

    public Loja () {
        this.totalClientes = 0;
    }
    public void adicionarCliente() {
        totalClientes++;
    }
    public int contarClientes() {
        return totalClientes;
    }

    public void adicionarVendedor () {
        this.totalVendedores = 0;
    }

    public int contarVendedores() {
        return totalVendedores;
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
    
}
