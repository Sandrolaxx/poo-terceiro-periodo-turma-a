package primeirobi.atividades;
import java.util.ArrayList;

class Vendedor {
    private String nome;
    private int idade;
    private String loja;
    private String cidade;
    private String bairro;
    private String rua;
    private double salarioBase;
    private ArrayList<Double> salarioRecebido = new ArrayList<>();

    public Vendedor(String nome, int idade, String loja, String cidade, String bairro, String rua, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.salarioBase = salarioBase;
    }

    public void addSalarioRecebido(double salario) {
        salarioRecebido.add(salario);
    }

    public void apresentarSe() {
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("loja: " + loja);
    }

    public double calcularMedia() {
        double total = 0;
        for (double salario : salarioRecebido) {
            total += salario;
        }
        return total / salarioRecebido.size();
    }

    public double calcularBonus() {
        return salarioBase * 0.2;
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

    public void apresentarSe() {
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
    }
}

class Loja {
    private String nomefantasia;
    private String Social;
    private String cnpj;
    private String cidade;
    private String bairro;
    private String rua;
    private ArrayList<Vendedor> vendedores = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public Loja(String nomefantasia, String Social, String cnpj, String cidade, String bairro, String rua) {
        this.nomefantasia = nomefantasia;
        this.Social = Social;
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

    public int contarClientes() {
        return clientes.size();
    }

    public int contarVendedores() {
        return vendedores.size();
    }

    public void apresentarSe() {
        System.out.println("nome Social: " + Social);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + cidade + ", " + bairro + ", " + rua);
    }
}

public class Attv {
    public static void main(String[] args) {
        // Exemplo de utilização das classes

        // Criando vendedores
        Vendedor vendedor1 = new Vendedor("lucas", 27, "Myy Plant", "cascavel", "neva", "Rua primeiro de maio", 2100);
        vendedor1.addSalarioRecebido(2200);
        vendedor1.addSalarioRecebido(2300);
        vendedor1.addSalarioRecebido(2400);

        Vendedor vendedor2 = new Vendedor("devid", 25, "Myy Plant", "cascavel", "floresta", "Rua ponta negra", 2000);
        vendedor2.addSalarioRecebido(2300);
        vendedor2.addSalarioRecebido(2200);
        vendedor2.addSalarioRecebido(2150);

        // Criando clientes
        Cliente cliente1 = new Cliente("nathan", 30, "cascavel", "morumbi", "Rua da prata");
        Cliente cliente2 = new Cliente("Ana", 21, "cascavel", "interlagos", "Rua balzak");

        // Criando loja
        Loja loja = new Loja("Myy Plant", "Myy Plant Ltda", "123456789", "cascavel", "Centro", "Rua Erechim");

        // Adicionando vendedores e clientes à loja
        loja.adicionarVendedor(vendedor1);
        loja.adicionarVendedor(vendedor2);
        loja.adicionarCliente(cliente1);
        loja.adicionarCliente(cliente2);

        // Apresentando informações da loja
        loja.apresentarSe();
        System.out.println("Número de vendedores: " + loja.contarVendedores());
        System.out.println("Número de clientes: " + loja.contarClientes()+ "\n");

        // Apresentando informações de um vendedor
        vendedor1.apresentarSe();
        System.out.println("Média dos salários recebidos: " + vendedor1.calcularMedia());
        System.out.println("Bônus: " + vendedor1.calcularBonus() + "\n");

        // Apresentando informações de um cliente
        cliente1.apresentarSe();
    }
}
