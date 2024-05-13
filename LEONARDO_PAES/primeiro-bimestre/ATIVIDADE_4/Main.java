package ATIVIDADE_4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando vendedores
        Vendedor vendedor1 = new Vendedor("João", 30, "Myy Plant", "São Paulo", "Centro", "Rua A", 2000, List.of(2000.0, 2100.0, 2200.0));
        Vendedor vendedor2 = new Vendedor("Maria", 25, "Myy Plant", "São Paulo", "Centro", "Rua A", 1800, List.of(1800.0, 1900.0, 2000.0));

        // Criando clientes
        Cliente cliente1 = new Cliente("Carlos", 40, "São Paulo", "Centro", "Rua B");
        Cliente cliente2 = new Cliente("Ana", 35, "São Paulo", "Centro", "Rua C");

        // Criando a loja
        Loja lojaMyyPlant = new Loja("Myy Plant", "Myy Plant Ltda", "12345678901234", "São Paulo", "Centro", "Rua A");
        lojaMyyPlant.adicionarVendedor(vendedor1);
        lojaMyyPlant.adicionarVendedor(vendedor2);
        lojaMyyPlant.adicionarCliente(cliente1);
        lojaMyyPlant.adicionarCliente(cliente2);

        // Apresentando informações dos vendedores
        for (Vendedor vendedor : lojaMyyPlant.vendedores) {
            vendedor.apresentarSe();
            System.out.println("Média dos salários recebidos: " + vendedor.calcularMedia());
            System.out.println("Bônus: " + vendedor.calcularBonus());
            System.out.println();
        }

        // Apresentando informações dos clientes
        for (Cliente cliente : lojaMyyPlant.clientes) {
            cliente.apresentarSe();
        }

        // Obtendo a quantidade de clientes e vendedores na loja
        lojaMyyPlant.contarClientes();
        lojaMyyPlant.contarVendedores();
    }
}
