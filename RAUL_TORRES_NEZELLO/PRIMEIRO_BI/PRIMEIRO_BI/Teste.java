package PRIMEIRO_BI.PRIMEIRO_BI;

public class Teste {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("Zé", 30, "Cascavel", "Neva", "Rua A");
        Cliente cliente2 = new Cliente("Paula", 25, "Cascavel", "Santa Cruz", "Rua B");


        // Criando vendedores
        Vendedor vendedor1 = new Vendedor("Douglas", 35, "Myy plant", "Cascavel", "Centro", "Belo horizonte", 2000,2000);
        Vendedor vendedor2 = new Vendedor("Portuga", 20, "Myy plant", "Cascavel", "Centro", "Belo horizonte", 1800,1800);

        vendedor1.adicionarSalario(2500);
        vendedor1.adicionarSalario(3000);
        vendedor1.adicionarSalario(2800);
        
        vendedor2.adicionarSalario(2000);
        vendedor2.adicionarSalario(2550);
        vendedor2.adicionarSalario(2800);



        // Criando loja
        Loja loja = new Loja("Myy plant", "MyyPlantvendadeplantasldta", 123456789, "Cascavel", "Centro", "Parana");


        // Adicionando vendedores e clientes à loja
        loja.adicionarVendedor(vendedor1);
        loja.adicionarVendedor(vendedor2);
        loja.adicionarCliente(cliente1);
        loja.adicionarCliente(cliente2);


        // Executando métodos para mostrar informações
        System.out.println("Informações da loja:");
        loja.apresentarse();


        System.out.println("\nInformações dos vendedores:");
        for (Vendedor vendedor : loja.getVendedores()) {
            vendedor.apresentarSe();
            vendedor.calcularMedia();
            vendedor.calcularBonus();
            System.out.println();
        }


        System.out.println("\nInformações dos clientes:");
        for (Cliente cliente : loja.getClientes()) {
            cliente.apresentarse();
            System.out.println();
        }
    }
}
