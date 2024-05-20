package primeirobi.ListasExc.Lista6Nova;

import java.util.ArrayList;

public class Loja {
    private String nomeLoja;
    private String razaoSocial;
    private String cnpj;
    private String cidade;
    private String bairro;
    private String rua;
    private ArrayList<Vendedor> vendedores = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public Loja(String nomeLoja, String razaoSocial, String cnpj, String cidade, String bairro, String rua) {
        this.nomeLoja = nomeLoja;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
    }

    public void adicionarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void apresentarse() {
        System.out.println(" ");
        System.out.println("/:===Informações da loja===:/");
        System.out.println("Nome da loja: " + nomeLoja);
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + rua + ", " + bairro + ", " + cidade);
        System.out.println(" ");
    }

    public String getnomeLoja() {
        return nomeLoja;
    }

    public int contarClientes() {
        return clientes.size();
    }
}
