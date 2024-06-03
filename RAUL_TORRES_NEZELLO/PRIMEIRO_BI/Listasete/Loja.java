package PRIMEIRO_BI.Listasete;

import java.util.ArrayList;
import java.util.List;


public class Loja {
    private String nomefantasia;
    private String razãosocial;
    private int cnpj;
    private Endereco endereco;
    private List<Vendedor> vendedores;
    private List<Cliente> clientes;


    public Loja(String nomefantasia, String razãosocial, int cnpj, Endereco endereco){
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.nomefantasia = nomefantasia;
        this.razãosocial = razãosocial;
        this.vendedores = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
    public void adicionarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }


    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    public int contarClientes(){
        return clientes.size();
    }
    public int contarVendedores(){
        return vendedores.size();
    }
    public List<Vendedor> getVendedores() {
        return vendedores;
    }


    public List<Cliente> getClientes() {
        return clientes;
    }
    public void apresentarse(){
        System.out.println("Nome da loja: "+nomefantasia+" \ncnpj: "+cnpj+"\nEdereço");
        endereco.apresentarLogradouro();
    }
}
