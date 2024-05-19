package GerenciadorVeia;

public class Loja 
{   

    private String nomeFantasia;
    @SuppressWarnings("unused")
    private String razaoSocial;
    private int cnpj;
    private String cidadeL;
    private String bairroL;
    private String ruaL;
    @SuppressWarnings("unused")
    private int numeroL;
    @SuppressWarnings("unused")
    private String complementoL;

    public Loja(String nomeFantasia, String razaoSocial, int cnpj, String cidadeL, String bairroL, String ruaL, int numeroL, String complementoL)
    {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.cidadeL = cidadeL;
        this.bairroL = bairroL;
        this.ruaL = ruaL;
        this.numeroL = numeroL;
        this.complementoL = complementoL;
    }
    
    Vendedor[] vendedores;
    Cliente[] clientes;
    Gerente[] gerentes;

    public int contarClientes()
    {
        return clientes.length;
    }

    public int contarVendedores()
    {
        return vendedores.length;
    }

    public int contarGerentes()
    {
        return gerentes.length;
    }

    void apresentarseL()
    {
        System.out.println("Nome fantasia: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + cidadeL + ", " + bairroL + ", " + ruaL);
    }
}
