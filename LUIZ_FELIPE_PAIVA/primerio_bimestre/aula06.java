package primerio_bimestre;

import java.util.ArrayList;
import java.util.Scanner;


public class aula06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Inserir dados do Vendedor:");
        Vendedor vendedor = new Vendedor();
        System.out.print("Nome: ");
        vendedor.nome = scanner.nextLine();
        System.out.print("Idade: ");
        vendedor.idade = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Loja: ");
        vendedor.loja = scanner.nextLine();
        System.out.print("Cidade: ");
        vendedor.cidade = scanner.nextLine();
        System.out.print("Bairro: ");
        vendedor.bairro = scanner.nextLine();
        System.out.print("Rua: ");
        vendedor.rua = scanner.nextLine();
        System.out.print("Salário Base: ");
        vendedor.salarioBase = scanner.nextDouble();
        System.out.print("Salário Recebido 1: ");
        vendedor.salarioRecebido.add(scanner.nextDouble());
        System.out.print("Salário Recebido 2: ");
        vendedor.salarioRecebido.add(scanner.nextDouble());
        System.out.print("Salário Recebido 3: ");
        vendedor.salarioRecebido.add(scanner.nextDouble());

        double mediaSalarios = vendedor.calcularMedia();
       
        System.out.println("\nInserir dados do Cliente:");
        Cliente cliente = new Cliente();
        System.out.print("Nome: ");
        cliente.nome = scanner.next();
        System.out.print("Idade: ");
        cliente.idade = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Cidade: ");
        cliente.cidade = scanner.nextLine();
        System.out.print("Bairro: ");
        cliente.bairro = scanner.nextLine();
        System.out.print("Rua: ");
        cliente.rua = scanner.nextLine();

        
        System.out.println("\nInserir dados da Loja:");
        Loja loja = new Loja();
        System.out.print("Nome Fantasia: ");
        loja.nomeFantasia = scanner.nextLine();
        System.out.print("Razão Social: ");
        loja.razaoSocial = scanner.nextLine();
        System.out.print("CNPJ: ");
        loja.cnpj = scanner.nextLine();
        System.out.print("Cidade: ");
        loja.cidade = scanner.nextLine();
        System.out.print("Bairro: ");
        loja.bairro = scanner.nextLine();
        System.out.print("Rua: ");
        loja.rua = scanner.nextLine();

       
        loja.vendedores.add(vendedor);
        loja.clientes.add(cliente);

        
        System.out.println("\nInformações do Vendedor:");
        vendedor.apresentarSe();
        System.out.println("Média dos Salários Recebidos: R$ " + mediaSalarios);
        System.out.println("Bônus: R$ " + vendedor.calcularBonus());

        

        System.out.println("\nInformações do Cliente:");
        cliente.apresentarSe();

        System.out.println("\nInformações da Loja:");
        loja.apresentarSe();
        System.out.println("Quantidade de Vendedores: " + loja.contarVendedores());
        System.out.println("Quantidade de Clientes: " + loja.contarClientes());

        scanner.close();
    }
}

class Vendedor {
    String nome;
    int idade;
    String loja;
    String cidade;
    String bairro;
    String rua;
    double salarioBase;
    ArrayList<Double> salarioRecebido = new ArrayList<>();

    void apresentarSe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Loja: " + loja);
    }

    double calcularMedia() {
        double totalSalarios = 0;
        for (double salario : salarioRecebido) {
            totalSalarios += salario;
        }
        return totalSalarios / salarioRecebido.size();
    }

    double calcularBonus() {
        return salarioBase * 0.2;
    }
}

class Cliente {
    String nome;
    int idade;
    String cidade;
    String bairro;
    String rua;

    void apresentarSe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Loja {
    String nomeFantasia;
    String razaoSocial;
    String cnpj;
    String cidade;
    String bairro;
    String rua;
    ArrayList<Vendedor> vendedores = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>();

    int contarClientes() {
        return clientes.size();
    }

    int contarVendedores() {
        return vendedores.size();
    }

    void apresentarSe() {
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + cidade + ", " + bairro + ", " + rua);
    }
}

