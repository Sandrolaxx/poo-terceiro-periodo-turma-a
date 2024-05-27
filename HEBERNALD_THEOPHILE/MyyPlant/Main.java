package MyyPlant;
public class Main {
    public static void main(String[] args) {
        
        Vendedor vendedor1 = new Vendedor("João", 13, "Myy Plant", "Cidade A", "Bairro X", "Rua 123", 2000.0);
        Vendedor vendedor2 = new Vendedor("Maria", 10, "Myy Plant", "Cidade A", "Bairro Y", "Rua 456", 1800.0);
        vendedor1.receberSalario(2200.0);
        vendedor1.receberSalario(2400.0);
        vendedor2.receberSalario(2000.0);
        vendedor2.receberSalario(2100.0);

        
        System.out.println("Vendedor 1:"); vendedor1.apresentarSe();
        System.out.println("Média salarial: " + vendedor1.calcularMedia());
        System.out.println("Bônus: " + vendedor1.calcularBonus());
        System.out.println("\nVendedor 2:"); vendedor2.apresentarSe();
        System.out.println("Média salarial: " + vendedor2.calcularMedia());
        System.out.println("Bônus: " + vendedor2.calcularBonus());

        
        Cliente cliente1 = new Cliente("Ana", 11, "Cidade B", "Bairro Z", "Rua 789");
        Cliente cliente2 = new Cliente("Carlos", 14, "Cidade A", "Bairro X", "Rua 321");

        
        System.out.println("\nCliente 1:"); cliente1.apresentarSe();
        System.out.println("\nCliente 2:"); cliente2.apresentarSe();

       
        Loja loja = new Loja("Myy Plant", "Razão Social", "123456789", "Cidade A", "Bairro X", "Rua Principal");
        loja.adicionarVendedor(vendedor1); loja.adicionarVendedor(vendedor2);
        loja.adicionarCliente(cliente1); loja.adicionarCliente(cliente2);

        
        System.out.println("\nInformações da Loja:"); loja.apresentarSe();
        System.out.println("Quantidade de Vendedores: " + loja.contarVendedores());
        System.out.println("Quantidade de Clientes: " + loja.contarClientes());
    }
}
