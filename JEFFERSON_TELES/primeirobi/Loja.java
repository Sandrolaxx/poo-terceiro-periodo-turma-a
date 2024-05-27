package primeirobi;

import java.util.ArrayList;

import primeirobi.aulaseis.Endereco;

public class Loja {
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

    public Loja(String string, Endereco enderecoLoja) {

    }

    public void contarClientes() {
        System.out.println("QUANTIDADE DE CLIENTES: " + clientes.size());
    }

    public void contarVendedores() {
        System.out.println("QUANTIDADE DE VENDEDORES: " + vendedores.size());
    }

    public void apresentarse() {
        System.out.println("NOME FANTASIA: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("ENDERECO: " + cidade + ", " + bairro + ", " + rua);
    }

    public String getNome() {
        return bairro;

    }
}

