package ListaSeis;

import java.util.ArrayList;

class Loja {
    private String nomeFantasia;
    String razaoSocial;
    private String cnpj;
    private ArrayList<Item> itens;
    private ArrayList<Endereco> enderecos;
    private ArrayList<Gerente> gerente;
    private ArrayList<Vendedor> vendedores;
    private ArrayList<Cliente> clientes;

    public Loja(String nomeFantasia, String razaoSocial, String cnpj) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.itens = new ArrayList<>();
        this.gerente = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.enderecos = new ArrayList<>();
    }

    public void adicionarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarGerente(Gerente gerentes) {
        gerente.add(gerentes);
    }

    public void adicionarEndereco(Endereco endereco) {
        enderecos.add(endereco);
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }
    
    public int contarClientes() {
        return clientes.size();
    }

    public int contarVendedores() {
        return vendedores.size();
    }

    public void apresentarSe() {
        System.out.println("NOME FANTASIA: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        for (Endereco endereco : enderecos) {
            endereco.apresentarLogradouro();
        }
        for (Item itens : itens) {
            itens.gerarDescricao();
        }
    }

}