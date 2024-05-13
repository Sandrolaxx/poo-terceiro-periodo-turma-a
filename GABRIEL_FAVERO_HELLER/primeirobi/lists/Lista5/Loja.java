package primeirobi.lists.Lista5;

import java.util.ArrayList;

public class Loja {
    String nomeFantasia;
    String razaoSocial;
    String cpnj;
    String cidade;
    String bairro;
    String rua;
    ArrayList<Vendedor> vendedores = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>();

    public Loja(String nomeFantasia, String razaoSocial, String cpnj, String cidade, String bairro, String rua) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cpnj = cpnj;
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

    public void apresentarSe() {
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("CNPJ: " + cpnj);
        System.out.println("Endereço: " + cidade + ", " + bairro + ", " + rua);
    }

    public int contarClientes() {
        return clientes.size();
    }

    public int contarVendedores() {
        return vendedores.size();
    }

    @Override
    public String toString() {
        return razaoSocial;
    }
}