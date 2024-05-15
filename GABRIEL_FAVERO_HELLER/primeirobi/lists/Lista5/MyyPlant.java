package primeirobi.lists.Lista5;

import java.util.ArrayList;

class MyyPlant {
    ArrayList<Vendedor> vendedores = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>();
    Loja loja;

    public MyyPlant(String nomeFantasia, String razaoSocial, String cpnj, String cidade, String bairro, String rua) {
        this.loja = new Loja(nomeFantasia, razaoSocial, cpnj, cidade, bairro, rua);
    }
       
    public static void main(String[] args) {
        MyyPlant myyPlant = new MyyPlant("Myy Plant", "Myy Plant Ltda", "123.456.789/0001-00", "Cascavel", "Centro",
                "Rua dos Bobos");

        myyPlant.adicionarVendedor("Goku", 20, "Cascavel", "Centro", "Rua dos Bobos", 2000);
        myyPlant.adicionarVendedor("Ging", 25, "Cascavel", "Centro", "Rua dos Bobos", 2500);
        myyPlant.adicionarVendedor("Gon", 30, "Cascavel", "Centro", "Rua dos Bobos", 3000);

        myyPlant.adicionarCliente("Gyro", 35, "Cascavel", "Centro", "Rua dos Bobos");
        myyPlant.adicionarCliente("Giorno", 40, "Cascavel", "Centro", "Rua dos Bobos");
        myyPlant.adicionarCliente("Gojo", 45, "Cascavel", "Centro", "Rua dos Bobos");

        System.out.println("\nLoja:");
        myyPlant.exibirLojasDetalhes();

        System.out.println("\nVendedores:");
        myyPlant.exibirVendedoresDetalhes();

        System.out.println("\nClientes:");
        myyPlant.exibirClientesDetalhes();

        System.out.println("\nTotal de clientes: " + myyPlant.contarClientes());
        System.out.println("Total de vendedores: " + myyPlant.contarVendedores() + "\n");
    }

    void adicionarVendedor(String nome, int idade, String cidade, String bairro, String rua, double salarioBase) {
        Vendedor vendedor = new Vendedor(nome, idade, loja, cidade, bairro, rua, salarioBase);
        vendedores.add(vendedor);
    }

    void adicionarCliente(String nome, int idade, String cidade, String bairro, String rua) {
        Cliente cliente = new Cliente(nome, idade, cidade, bairro, rua);
        clientes.add(cliente);
    }

    void exibirLojasDetalhes() {
        loja.apresentarSe();
    }

    void exibirVendedoresDetalhes() {
        for (int i = 0; i < vendedores.size(); i++) {
            Vendedor vendedor = vendedores.get(i);
            vendedor.apresentarSe();
            System.out.println("Salário Base: " + vendedor.salarioBase);
            System.out.println("Média de salários: " + vendedor.calcularMedia());
            System.out.println("Bônus: " + vendedor.calcularBonus());
            if (i < vendedores.size() - 1) {
                System.out.println("\n");
            }
        }
    }

    void exibirClientesDetalhes() {
        for (Cliente cliente : clientes) {
            cliente.apresentarSe();
        }
    }

    int contarClientes() {
        return clientes.size();
    }

    int contarVendedores() {
        return vendedores.size();
    }
}