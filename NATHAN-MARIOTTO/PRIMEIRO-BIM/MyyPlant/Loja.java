package MyyPlant;

import java.util.ArrayList;
import java.util.List;

class Loja {
    String nomeFantasia;
    String razaoSocial;
    String cnpj;
    String cidade;
    String bairro;
    String rua;
    List<Vendedor> vendedores = new ArrayList<>();
    List<Cliente> clientes = new ArrayList<>();

    public Loja(String nomeFantasia, String razaoSocial, String cnpj, String cidade, String bairro, String rua) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
    }

    public void adicionarVendedor(Vendedor vendedor) {
        if (!vendedores.contains(vendedor)) {
            vendedores.add(vendedor);
        } else {
            System.out.println("Vendedor já registrado.");
        }
    }

    public void adicionarCliente(Cliente cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
        } else {
            System.out.println("Cliente já registrado.");
        }
    }

    public void listarVendedores() {
        System.out.println("Vendedores:");
        vendedores.forEach(vendedor -> System.out.println(vendedor));
    }

    public void listarClientes() {
        System.out.println("Clientes:");
        clientes.forEach(cliente -> System.out.println(cliente));
    }

    public void contarClientes() {
        System.out.println("Total de clientes: " + clientes.size());
    }

    public void contarVendedores() {
        System.out.println("Total de vendedores: " + vendedores.size());
    }

    public void apresentarse() {
        System.out.println("Nome Fantasia: " + nomeFantasia + ", CNPJ: " + cnpj + ", Endereço: " + rua + ", " + bairro + ", " + cidade);
    }
}
