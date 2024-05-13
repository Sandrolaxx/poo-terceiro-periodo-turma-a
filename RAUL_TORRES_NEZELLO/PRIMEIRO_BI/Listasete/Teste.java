package PRIMEIRO_BI.Listasete;

public class Teste {
    public static void main(String[] args){
        //Criando Endereços
        Endereco Enderecocliente1 = new Endereco("Rua General Osorio", "Centro", "Cascavel", "Parana", 1, "Proximo ao Teatro" );
        Endereco Enderecocliente2 = new Endereco("Rua Lorax", "Centro", "Cascavel", "Parana", 2, "Casa Rosa" );

        Endereco Enderecovendedor1 = new Endereco("Rua Curitiba", "Centro", "Cascavel", "Parana", 300, "Casa Laranja");
        Endereco Enderecovendedor2 = new Endereco("Rua Porto Belo", "Santa Cruz", "Cascavel", "Parana", 450, "Casa Azul");

        Endereco EnderecoLoja = new Endereco("Rua Minas Gerais", "Centro", "Cascavel", "Parana", 1000, "Local Verde");

        Endereco Enderecogerente = new Endereco("Rua Minas Gerais", "Centro", "Cascavel", "Parana", 950, "Apto 500");

        // Criando clientes
        Cliente cliente1 = new Cliente("Zé", 30, Enderecocliente1);
        Cliente cliente2 = new Cliente("Paula", 25, Enderecocliente2);

        // Criando vendedores
        Vendedor vendedor1 = new Vendedor("Douglas", 35, "Myy plant", Enderecovendedor1, 2000);
        Vendedor vendedor2 = new Vendedor("Portuga", 20, "Myy plant", Enderecovendedor2, 1800);

        vendedor1.adicionarSalario(2500);
        vendedor1.adicionarSalario(3000);
        vendedor1.adicionarSalario(2800);

        vendedor2.adicionarSalario(2000);
        vendedor2.adicionarSalario(2550);
        vendedor2.adicionarSalario(2800);



        // Criando loja
        Loja loja = new Loja("Myy plant", "MyyPlantvendadeplantasldta", 123456789, EnderecoLoja);

        //Criando Gerente
        Gerente gerente = new Gerente("Ivan", 55, "Myy plant", Enderecogerente, 5000);

        gerente.adicionarSalario(5000);
        gerente.adicionarSalario(5300);
        gerente.adicionarSalario(5250);

        // Adicionando vendedores e clientes à loja
        loja.adicionarVendedor(vendedor1);
        loja.adicionarVendedor(vendedor2);
        loja.adicionarCliente(cliente1);
        loja.adicionarCliente(cliente2);


        // Executando métodos para mostrar informações
        System.out.println("Informações da loja:");
        loja.apresentarse();

        System.out.println("\nInformações Gerente:");
        gerente.apresentarSe();
        gerente.calcularMedia();
        gerente.calcularBonus();

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