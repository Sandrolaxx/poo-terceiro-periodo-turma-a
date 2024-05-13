package primeirobi.Exercicio7;
import java.util.ArrayList;


public class Loja {
    
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private ArrayList<String> vendedores = new ArrayList<String>();
    private ArrayList<String> clientes = new ArrayList<String>();
    private Endereco endereco;

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

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<String> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<String> vendedores) {
        this.vendedores = vendedores;
    }

    public ArrayList<String> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<String> clientes) {
        this.clientes = clientes;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
 
}
