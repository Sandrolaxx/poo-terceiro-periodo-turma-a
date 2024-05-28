package primeirobimestre;

public class Teste {
    public static void main(String[] args) {
        // Criando vendedores
        Vendedor vendedor1 = new Vendedor("João", 30, "Loja A", "Cidade A", "Bairro A", "Rua A", 2500.00);
        Vendedor vendedor2 = new Vendedor("Maria", 28, "Loja A", "Cidade A", "Bairro A", "Rua A", 2600.00);
        Vendedor vendedor3 = new Vendedor("Pedro", 35, "Loja A", "Cidade A", "Bairro A", "Rua A", 2700.00);

        Vendedor[] vendedores = {vendedor1, vendedor2, vendedor3};

        // Criando clientes
        Cliente cliente1 = new Cliente("Carlos", 45, "Cidade B", "Bairro B", "Rua B");
        Cliente cliente2 = new Cliente("Ana", 32, "Cidade B", "Bairro B", "Rua B");

        Cliente[] clientes = {cliente1, cliente2};

        // Criando loja
        Loja loja = new Loja("Lojinha", "Razão Social A", "123456789-00", "Medianeira", "Bairro Centro", "Rua Alameda", vendedores, clientes);

        // Testando métodos
        System.out.println("--- Apresentação da Loja ---");
        loja.apresentarSe();
        System.out.println();

        System.out.println("--- Informações dos Vendedores ---");
        for (Vendedor vendedor : vendedores) {
            vendedor.apresentarSe();
            System.out.println("Média de salário recebido: R$" + vendedor.calcularMedia());
            System.out.println("Bônus: R$" + vendedor.calcularBonus());
            System.out.println();
        }

        System.out.println("--- Informações dos Clientes ---");
        for (Cliente cliente : clientes) {
            cliente.apresentarSe();
            System.out.println();
        }

        System.out.println("--- Quantidade de Clientes na Loja ---");
        System.out.println("Total de clientes: " + loja.contarClientes());

        System.out.println("--- Quantidade de Vendedores na Loja ---");
        System.out.println("Total de vendedores: " + loja.contarVendedores());
    }
}