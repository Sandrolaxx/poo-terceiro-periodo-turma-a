package primeirobi.ListasExc.Lista5;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaGestEmpresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome de sua loja:");
        String nomeLoja = scanner.nextLine();
        System.out.println("Qual a razão social?:");
        String razaoSocial = scanner.nextLine();
        System.out.println("Digite o CNPJ de sua loja:");
        String cnpj = scanner.nextLine();
        System.out.println("Digite a cidade onde está a loja:");
        String cidadeLoja = scanner.nextLine();
        System.out.println("Digite o bairro de sua loja:");
        String bairroLoja = scanner.nextLine();
        System.out.println("Digite a rua da loja:");
        String ruaLoja = scanner.nextLine();
        System.out.println(" ");

        Loja loja = new Loja(nomeLoja, razaoSocial, cnpj, cidadeLoja, bairroLoja, ruaLoja);

        
        System.out.println("Quantos vendedores sua loja vai ter?:");
      
        int numVendedores = scanner.nextInt();
        System.out.println(" ");
        scanner.nextLine(); 

        for (int i = 0; i < numVendedores; i++) {
            System.out.println("Vendedor " + (i + 1) + ":");
            System.out.println(" ");
            System.out.println("Digite o nome do vendedor:");
            String nomeVendedor = scanner.nextLine();
            System.out.println("Digite a idade do vendedor:");
            int idadeVendedor = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println("Digite a cidade do vendedor:");
            String cidadeVendedor = scanner.nextLine();
            System.out.println("Digite o bairro de seu vendedor:");
            String bairroVendedor = scanner.nextLine();
            System.out.println("Digite a rua do vendedor:");
            String ruaVendedor = scanner.nextLine();
            System.out.println("Digite o salário base de seu vendedor:");
            double salarioBase = scanner.nextDouble();
            scanner.nextLine();

            Vendedor vendedor = new Vendedor(nomeVendedor, idadeVendedor, loja, cidadeVendedor, bairroVendedor, ruaVendedor, salarioBase);
            loja.adicionarVendedor(vendedor);
        }

        
        System.out.println("Quantos clientes deseja adicionar?:");
        int numClientes = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numClientes; i++) {
            System.out.println(" ");
            System.out.println("Cliente " + (i + 1) + ":");
            System.out.println(" ");
            System.out.println("Digite o nome do cliente:");
            String nomeCliente = scanner.nextLine();
            System.out.println("Digite a idade do cliente:");
            int idadeCliente = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println("Digite a cidade do cliente:");
            String cidadeCliente = scanner.nextLine();
            System.out.println("Digite o bairro do cliente:");
            String bairroCliente = scanner.nextLine();
            System.out.println("Digite a rua do cliente:");
            String ruaCliente = scanner.nextLine();

            Cliente cliente = new Cliente(nomeCliente, idadeCliente, cidadeCliente, bairroCliente, ruaCliente);
            loja.adicionarCliente(cliente);
        }

        scanner.close();

        
        loja.apresentarse();

        
        for (Vendedor vendedor : loja.getVendedores()) {
            vendedor.apresentarse();
        }

        
        for (Cliente cliente : loja.getClientes()) {
            cliente.apresentarse();
        }

        
        System.out.println("Quantidade de clientes em sua loja: " + loja.contarClientes());
    }
}

class Vendedor {
    private String nome;
    private int idade;
    private Loja loja;
    private String cidade;
    private String bairro;
    private String rua;
    private double salarioBase;
    private ArrayList<Double> salarioRecebido = new ArrayList<>();

    public Vendedor(String nome, int idade, Loja loja, String cidade, String bairro, String rua, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.salarioBase = salarioBase;
        //ver como excluir "e:"
        this.salarioRecebido.add(2000.0);
        this.salarioRecebido.add(2100.0);
        this.salarioRecebido.add(2200.0);
    }

    public void apresentarse() {
        System.out.println("/:===Informações dos vendedores===:/");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
        System.out.println("Bairro: " + bairro);
        System.out.println("Rua: " + rua);
        System.out.println("Salário Base: R$" + salarioBase);
        System.out.println("Loja: " + loja.getnomeLoja());
        System.out.println(" ");
    }
}

class Cliente {
    private String nome;
    private int idade;
    private String cidade;
    private String bairro;
    private String rua;

    public Cliente(String nome, int idade, String cidade, String bairro, String rua) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
    }

    public void apresentarse() {
        System.out.println("/:====Informações dos clientes===:/");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
        System.out.println("Bairro: " + bairro);
        System.out.println("Rua: " + rua);
        System.out.println(" ");
    }
}

class Loja {
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