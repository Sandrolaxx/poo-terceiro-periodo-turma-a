package atividades1B;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
       
        Loja loja = new Loja("Plantão 4:20", "Plantão Ltda.", "123.456.789/0001-00", "São Paulo", "Centro", "Rua Principal");

        
        double[] salarioLancamentosVendedor1 = {3000.0, 3200.0, 3500.0};
        Vendedor vendedor1 = new Vendedor("Pedro Santos", 35, loja, "São Paulo", "Mooca", "Rua 123", salarioLancamentosVendedor1, 3000.0);

        double[] salarioLancamentosVendedor2 = {2500.0, 2800.0, 3000.0};
        Vendedor vendedor2 = new Vendedor("Ana Lima", 28, loja, "São Paulo", "Mooca", "Rua 123", salarioLancamentosVendedor2, 2500.0);

       
        Cliente cliente1 = new Cliente("João Silva", 30, "São Paulo", "Centro", "Rua ABC");
        Cliente cliente2 = new Cliente("Maria Souza", 25, "Rio de Janeiro", "Leblon", "Rua XYZ");

      
        double[] salarioLancamentosGerente = {5000.0, 5500.0, 6000.0};
        Gerente Gerente = new Gerente("José Nunes", 45, loja, "São Paulo", "Mooca", "Rua 456", salarioLancamentosGerente, 5000.0);

        loja.adicionarVendedor(vendedor1);
        loja.adicionarVendedor(vendedor2);

        System.out.println("Informações da Loja:");
        loja.apresentarSe();
        System.out.println("Quantidade de vendedores: " + loja.contarVendedores());

        System.out.println("\nInformações dos Vendedores:");
        vendedor1.apresentarSe();
        System.out.println("Média de salários: " + vendedor1.calcularMedia());
        System.out.println("Bônus: " + vendedor1.calcularBonus());

        vendedor2.apresentarSe();
        System.out.println("Média de salários: " + vendedor2.calcularMedia());
        System.out.println("Bônus: " + vendedor2.calcularBonus());

        System.out.println("\nInformações dos Clientes:");
        cliente1.apresentarSe();
        cliente2.apresentarSe();

        Item[] itensPedido = {new Item(1, "Vaso de Flores", "Jardinagem", 50.0), new Item(2, "Fertilizante", "Jardinagem", 80.0)};
        ProcessaPedido processador = new ProcessaPedido();
        processador.processar(1, new Date(), cliente1, vendedor1, loja, itensPedido);
    }
}
